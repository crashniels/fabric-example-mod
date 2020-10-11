package com.crashniels.obsidiantools.registry;

import com.crashniels.obsidiantools.ObsidianTools;
import com.crashniels.obsidiantools.items.CustomPickaxeItem;
import com.crashniels.obsidiantools.items.ObsidianToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public final static Item ObsidianIngot = new Item(new Item.Settings().group(ObsidianTools.ObsidianTools));
    public final static ToolItem ObsidianPickaxe =
            new CustomPickaxeItem(ObsidianToolMaterial.INSTANCE,
            0,
            -2.8F,
            new Item.Settings().group(ObsidianTools.ObsidianTools).maxCount(1));

    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier(ObsidianTools.MOD_ID, "ingot_obsidian"), ObsidianIngot);
        Registry.register(Registry.ITEM, new Identifier(ObsidianTools.MOD_ID, "pickaxe_obsidian"), ObsidianPickaxe);
    }

}

