package com.github.alexporter7.atmaterials.api.material;

import com.github.alexporter7.atmaterials.api.enums.MaterialForm;
import com.github.alexporter7.atmaterials.api.enums.MaterialState;
import net.minecraft.world.item.Item;

public class MaterialItem extends Item {

    public MaterialState state;
    public MaterialForm form;

    public int meltingPoint;
    public int weight;
    public int temperature;

    public MaterialItem(Properties properties) {
        super(properties);
    }
}
