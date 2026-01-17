package com.github.alexporter7.atmaterials;

import com.github.alexporter7.atmaterials.registration.ATMaterialRegistration;
import com.github.alexporter7.ats.api.plugin.ATSPlugin;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ATechMaterials implements ModInitializer {

    public static final String MOD_ID = "atechmaterials";

    public static final ATSPlugin AT_MATERIALS = new ATSPlugin(
            "ATechMaterials",
            "atmaterials",
            "0.1.0a",
            "ATMaterials Plugin");

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    //TODO: Creative Items Tab

    @Override
    public void onInitialize() {
        LOGGER.info("Loaded ATechSuite [{}] plugin with ID [{}] version [{}]",
                AT_MATERIALS.label(), AT_MATERIALS.modId(), AT_MATERIALS.version());

        ATMaterialRegistration.registerMaterials();
    }
}
