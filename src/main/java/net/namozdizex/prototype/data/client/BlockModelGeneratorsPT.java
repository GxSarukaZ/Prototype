package net.namozdizex.prototype.data.client;

import com.google.gson.JsonElement;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.blockstates.BlockStateGenerator;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BlockModelGeneratorsPT extends BlockModelGenerators {
    public BlockModelGeneratorsPT(Consumer<BlockStateGenerator> blockStateOutput, BiConsumer<ResourceLocation, Supplier<JsonElement>> modelOutput, Consumer<Item> skippedAutoModelsOutput)
    {
            super(blockStateOutput, modelOutput, skippedAutoModelsOutput);
            }

    public void createRod(Block block)
    {
        var resourceLocation = ModelLocationUtils.getModelLocation(block, "_on");
        var resourceLocation2 = ModelLocationUtils.getModelLocation(block);
        this.blockStateOutput.accept(MultiVariantGenerator.multiVariant(block, Variant.variant().with(VariantProperties.MODEL, resourceLocation2)).with(this.createColumnWithFacing()).with(BlockModelGenerators.createBooleanModelDispatch(BlockStateProperties.POWERED, resourceLocation, resourceLocation2)));
    }
}
