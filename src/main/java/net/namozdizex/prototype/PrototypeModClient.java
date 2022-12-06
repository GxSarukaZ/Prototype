package net.namozdizex.prototype;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.namozdizex.prototype.registry.PTBlocks;

public class PrototypeModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        var cutout = RenderType.cutout();
        var translucnet = RenderType.translucent();

        BlockRenderLayerMap.INSTANCE.putBlocks(translucnet, PTBlocks.BLACKLIGHT_VIRUS_BLOCK);
        BlockRenderLayerMap.INSTANCE.putBlocks(translucnet, PTBlocks.BLOODY_LIGHTNING_ROD);
        BlockRenderLayerMap.INSTANCE.putBlocks(translucnet, PTBlocks.EXPOSED_BLACKLIGHT_LIGHTNING_ROD);
        BlockRenderLayerMap.INSTANCE.putBlocks(translucnet, PTBlocks.OXIDIZED_BLACKLIGHT_LIGHTNING_ROD);
        BlockRenderLayerMap.INSTANCE.putBlocks(translucnet, PTBlocks.WEATHERED_BLACKLIGHT_LIGHTNING_ROD);
    }
}
