package net.namozdizex.prototype.world.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class MercerSwordItem extends SwordItem {
    public MercerSwordItem(Item.Properties properties)
    {
        super(TiersMercer.BLACKLIGHT, 3, -2.4F, properties);
    }
}

