package com.github.alexporter7.ats;

import com.github.alexporter7.ats.api.plugin.ATSPlugin;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ATechSuite implements ModInitializer {

	public static final String MOD_ID = "atechsuite";

	public static final ATSPlugin AT_CORE = new ATSPlugin(
			"ATechSuite",
			"atechsuite",
			"0.1.0a",
			"ATCore Plugin");

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loaded ATechSuite [{}] plugin with ID [{}] version [{}]",
				AT_CORE.label(), AT_CORE.modId(), AT_CORE.version());
	}
}