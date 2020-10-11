package com.crashniels.obsidiantools.registry;

import com.crashniels.obsidiantools.ObsidianTools;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public final static Item ObsidianIngot = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier(ObsidianTools.MOD_ID, "ingot_obsidian"), ObsidianIngot);
    }
}

