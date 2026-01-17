package com.github.alexporter7.atmaterials.registration;

import com.github.alexporter7.atmaterials.ATechMaterials;
import com.github.alexporter7.atmaterials.api.enums.MaterialForm;
import com.github.alexporter7.atmaterials.api.enums.MaterialQuality;
import com.github.alexporter7.atmaterials.api.material.ATMaterial;
import com.github.alexporter7.atmaterials.api.material.MaterialItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class ATMaterialRegistration {

    public static final HashMap<String, ATMaterial> MATERIALS = new HashMap<>();
    public static final HashMap<String, MaterialItem> ITEMS = new HashMap<>();

    public static void registerMaterials() {
        List<MaterialForm> forms = Arrays.asList(
                MaterialForm.INGOT,
                MaterialForm.BEARING,
                MaterialForm.DUST,
                MaterialForm.RING,
                MaterialForm.ROD,
                MaterialForm.SCREW
        );

        MATERIALS.put(
                "iron",
                new ATMaterial("iron",
                        "Iron",
                        "Fe",
                        forms,
                        2800,
                        55,
                        70,
                        0xa19f99)
        );

        for (String key : MATERIALS.keySet())
            registerMaterial(
                    MATERIALS.get(key),
                    (Item.Properties props) -> new MaterialItem(props, MATERIALS.get(key)),
                    new Item.Properties());

    }

    public static void registerMaterial(ATMaterial material, Function<Item.Properties, MaterialItem> itemFactory, Item.Properties settings) {
        for (MaterialForm materialForm : material.forms()) {
            ATechMaterials.LOGGER.debug("Registering [{}] form for [{}] material",
                    materialForm.toString(),
                    material.name());

            String itemName = getMaterialItemName(material.name(), materialForm);
            ResourceKey<Item> itemKey = ResourceKey.create(
                    Registries.ITEM, Identifier.fromNamespaceAndPath(
                            ATechMaterials.MOD_ID,
                            itemName));

            MaterialItem item = itemFactory.apply(settings.setId(itemKey));
            ITEMS.put(itemName, item);
            Registry.register(
                    BuiltInRegistries.ITEM,
                    itemKey,
                    item
            );
        }
    }

    private static String getMaterialItemName(String materialName, MaterialForm materialForm) {
        return materialName + "_" + materialForm.name().toLowerCase();
    }
}
