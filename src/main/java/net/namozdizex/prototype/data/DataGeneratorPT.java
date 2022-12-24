package net.namozdizex.prototype.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.namozdizex.prototype.data.loot.BlockLootTableProvider;

public class DataGeneratorPT implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
        dataGenerator.addProvider(BlockTagsProvider::new);

        dataGenerator.addProvider(BlockLootTableProvider::new);
    }
}
