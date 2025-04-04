package mom.kebab.xxx;

import mom.kebab.xxx.Blocks.ModBlocks;
import mom.kebab.xxx.Items.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Xxx implements ModInitializer {
	public static final String MOD_ID = "xxx";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Started loading Items");
		ModItems.initialize();
		LOGGER.info("Started loading Blocks");
		ModBlocks.initialize();
	}
}