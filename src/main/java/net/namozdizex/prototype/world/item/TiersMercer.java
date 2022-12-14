package net.namozdizex.prototype.world.item;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.namozdizex.prototype.registry.PTItems;

import java.util.function.Supplier;

public enum TiersMercer implements Tier {

    BLACKLIGHT(2, 375, 6.5F, 2.5F, 14, () -> Ingredient.of(PTItems.BLACKLIGHT));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    TiersMercer(int level, int uses, float speed, float damage, int enchantment, Supplier<Ingredient> supplier)
    {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantment;
        this.repairIngredient = new LazyLoadedValue<>(supplier);
    }
    @Override
    public int getUses() {
        return 0;
    }

    @Override
    public float getSpeed() {
        return 0;
    }

    @Override
    public float getAttackDamageBonus() {
        return 0;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
