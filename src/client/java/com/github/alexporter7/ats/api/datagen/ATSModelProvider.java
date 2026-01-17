package com.github.alexporter7.ats.api.datagen;

import com.github.alexporter7.atmaterials.registration.ATMaterialRegistration;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.renderer.block.model.ItemModelGenerator;


public class ATSModelProvider extends FabricModelProvider {

    public ATSModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        ATMaterialRegistration.ITEMS.forEach(((s, materialItem) -> {
            itemModelGenerators.generateFlatItem(materialItem, ModelTemplates.FLAT_ITEM);
        }));
    }

    @Override
    public String getName() {
        return "ATSModelProvider";
    }
}
