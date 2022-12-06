package net.namozdizex.prototype;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.namozdizex.prototype.registry.PTBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrototypeMod implements ModInitializer {
	public static final String MOD_ID = "prototype";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final CreativeModeTab TAB = FabricItemGroupBuilder.build(new ResourceLocation(PrototypeMod.MOD_ID, "main"), () -> new ItemStack(PTBlocks.BLACKLIGHT_VIRUS_BLOCK));

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		PTBlocks.init();
	}
}
