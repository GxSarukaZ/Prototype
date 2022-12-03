package net.namozdizex.prototype.registry;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.namozdizex.prototype.PrototypeMod;

public class PTBlocks {

    public static final Block BLACKLIGHT_VIRUS_BLOCK = new Block(BlockBehaviour.Properties.of(Material.WEB).sound(SoundType.SLIME_BLOCK).lightLevel(state -> 5).requiresCorrectToolForDrops().strength(25.5F, 45.5F));

    public static void init()
    {
        register("blacklight_virus_block", BLACKLIGHT_VIRUS_BLOCK, new Item.Properties().tab(PrototypeMod.TAB));
    }

    public static void register(String key, Block block, Object o)
    {
        register(key, block, null);
    }

    public static void register(String key, Block block, Item.Properties properties)
    {
        Registry.register(Registry.BLOCK, new ResourceLocation(PrototypeMod.MOD_ID, key), block);

        if (properties != null);
        {
            Registry.register(Registry.ITEM, new ResourceLocation(PrototypeMod.MOD_ID, key), new BlockItem(block, properties));
        }
    }
    private static Boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType entityType)
    {
        return false;
    }

    private static Boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos)
    {
        return false;
    }
}
