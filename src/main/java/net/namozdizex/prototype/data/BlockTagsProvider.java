package net.namozdizex.prototype.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.tags.BlockTags;
import net.namozdizex.prototype.registry.PTBlocks;

public class BlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public BlockTagsProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(PTBlocks.BLACKLIGHT_VIRUS_BLOCK);
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(PTBlocks.BLOODY_LIGHTNING_ROD);
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(PTBlocks.EXPOSED_BLACKLIGHT_LIGHTNING_ROD);
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(PTBlocks.WEATHERED_BLACKLIGHT_LIGHTNING_ROD);
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(PTBlocks.OXIDIZED_BLACKLIGHT_LIGHTNING_ROD);
    }
}
