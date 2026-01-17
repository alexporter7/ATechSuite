package com.github.alexporter7.atmaterials.api.material;

import com.github.alexporter7.atmaterials.api.enums.MaterialForm;
import com.github.alexporter7.atmaterials.api.enums.MaterialState;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;



public class MaterialItem extends Item {

    public ATMaterial atMaterial;
    public MaterialState state;
    public MaterialForm form;

    public MaterialItem(Properties properties, ATMaterial material) {
        super(properties);
        this.atMaterial = material;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, TooltipDisplay tooltipDisplay, Consumer<Component> consumer, TooltipFlag tooltipFlag) {
        consumer.accept(Component.literal("Weight: " + atMaterial.weight()));
        consumer.accept(Component.literal("Temp: " + atMaterial.temperature()));
        consumer.accept(Component.literal("Melting Point: " + atMaterial.meltingPoint()));
        super.appendHoverText(itemStack, tooltipContext, tooltipDisplay, consumer, tooltipFlag);
    }


}
