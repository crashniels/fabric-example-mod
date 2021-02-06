package com.crashniels.obsidiantools.registry;

import com.crashniels.obsidiantools.ObsidianTools;
import com.crashniels.obsidiantools.items.CustomPickaxeItem;
import com.crashniels.obsidiantools.items.CustomSwordItem;
import com.crashniels.obsidiantools.items.ObsidianToolMaterial;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public final static Item     ObsidianIngot      = new Item(new Item.Settings().group(ObsidianTools.ObsidianTools));
    public final static ToolItem ObsidianPickaxe    = new CustomPickaxeItem(ObsidianToolMaterial.INSTANCE, 0, -2.8F, new Item.Settings().group(ObsidianTools.ObsidianTools).maxCount(1));
    public final static ToolItem ObsidianSword      = new CustomSwordItem(ObsidianToolMaterial.INSTANCE, 1, -2.4F, new Item.Settings().group(ObsidianTools.ObsidianTools).maxCount(1));

    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier(ObsidianTools.MOD_ID, "obsidian_ingot"),    ObsidianIngot);
        Registry.register(Registry.ITEM, new Identifier(ObsidianTools.MOD_ID, "obsidian_pickaxe"),  ObsidianPickaxe);
        Registry.register(Registry.ITEM, new Identifier(ObsidianTools.MOD_ID, "obsidian_sword"),    ObsidianSword);
    }
}

