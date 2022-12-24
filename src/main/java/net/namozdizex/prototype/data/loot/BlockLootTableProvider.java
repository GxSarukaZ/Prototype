package net.namozdizex.prototype.data.loot;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.namozdizex.prototype.registry.PTBlocks;

public class BlockLootTableProvider extends FabricBlockLootTableProvider {
    public BlockLootTableProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateBlockLootTables() {
        this.dropSelf(PTBlocks.BLACKLIGHT_VIRUS_BLOCK);
        this.dropSelf(PTBlocks.BLOODY_LIGHTNING_ROD);
        this.dropSelf(PTBlocks.EXPOSED_BLACKLIGHT_LIGHTNING_ROD);
        this.dropSelf(PTBlocks.WEATHERED_BLACKLIGHT_LIGHTNING_ROD);
        this.dropSelf(PTBlocks.OXIDIZED_BLACKLIGHT_LIGHTNING_ROD);
    }
}
