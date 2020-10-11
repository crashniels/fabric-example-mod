package com.crashniels.obsidiantools.items;

import com.crashniels.obsidiantools.ObsidianTools;
import com.crashniels.obsidiantools.registry.ModItems;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;

public class ObsidianToolMaterial implements ToolMaterial
{
    public static final ObsidianToolMaterial INSTANCE = new ObsidianToolMaterial();

    @Override
    public int getDurability()
    {
        return 420;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return 7.0F;
    }

    @Override
    public float getAttackDamage()
    {
        return 3.0F;
    }

    @Override
    public int getMiningLevel()
    {
        return 3;
    }

    @Override
    public int getEnchantability()
    {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(ModItems.ObsidianIngot);
    }
}

