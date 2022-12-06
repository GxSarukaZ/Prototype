package net.namozdizex.prototype.registry;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.namozdizex.prototype.PrototypeMod;
import net.namozdizex.prototype.world.item.MercerSwordItem;

public class PTItems {

    public static final Item MERCER_BLADE = new MercerSwordItem(new Item.Properties().tab(PrototypeMod.TAB));
    public static final Item MERCER_CLAW = new MercerSwordItem(new Item.Properties().tab(PrototypeMod.TAB));
    public static final Item MERCER_CHAIN = new MercerSwordItem(new Item.Properties().tab(PrototypeMod.TAB));
    public static final Item BLACKLIGHT = new Item(new Item.Properties().tab(PrototypeMod.TAB));

    public static void init()
    {
        register("mercer_blade", MERCER_BLADE);
        register("mercer_claw", MERCER_CLAW);
        register("mercer_chain", MERCER_CHAIN);
    }

    private static void register(String key, Item item)
    {
        Registry.register(Registry.ITEM, new ResourceLocation(PrototypeMod.MOD_ID, key), item);
    }
}
