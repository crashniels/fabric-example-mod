package com.crashniels.obsidiantools;

import com.crashniels.obsidiantools.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ObsidianTools implements ModInitializer
{
    public static final String MOD_ID = "obstools";

    @Override
    public void onInitialize()
    {
        ModItems.registerItems();
    }

    public static final ItemGroup ObsidianTools = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "obsidiantools"))
            .icon(() -> new ItemStack(ModItems.ObsidianIngot))
            .appendItems(stacks ->
            {
                stacks.add(new ItemStack(ModItems.ObsidianIngot));
                stacks.add(new ItemStack(ModItems.ObsidianSword));
                stacks.add(new ItemStack(ModItems.ObsidianPickaxe));
                stacks.add(new ItemStack(ModItems.ObsidianShovel));
                stacks.add(new ItemStack(ModItems.ObsidianHoe));
            })
            .build();
}
