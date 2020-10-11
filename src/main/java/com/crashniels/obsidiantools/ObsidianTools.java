package com.crashniels.obsidiantools;

import com.crashniels.obsidiantools.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class ObsidianTools implements ModInitializer
{
    public static final String MOD_ID = "obstools";

    @Override
    public void onInitialize()
    {
        ModItems.registerItems();
    }
}
