package de.mrjulsen.moneyboymod;

import de.mrjulsen.moneyboymod.blocks.ModBlocks;
import de.mrjulsen.moneyboymod.items.ModCreativeModeTab;
import de.mrjulsen.moneyboymod.items.ModItems;

public final class MoneyBoyMod {
    public static final String MOD_ID = "moneyboymod";

    public static void init() {
        ModBlocks.register();
        ModItems.register();
        ModCreativeModeTab.register();
    }
}
