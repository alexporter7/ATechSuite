package com.github.alexporter7.atmaterials;

import com.github.alexporter7.ats.api.plugin.ATPlugin;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ATechMaterials implements ModInitializer {

    public static final String MOD_ID = "atechsuite";

    public static final ATPlugin AT_MATERIALS = new ATPlugin(
            "ATechMaterials",
            "atmaterials",
            "0.1.0a",
            "ATMaterials Plugin");

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Loaded ATechSuite [{}] plugin with ID [{}] version [{}]",
                AT_MATERIALS.label(), AT_MATERIALS.modId(), AT_MATERIALS.version());
    }
}
