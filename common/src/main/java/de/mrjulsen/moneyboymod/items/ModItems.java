package de.mrjulsen.moneyboymod.items;

import de.mrjulsen.moneyboymod.MoneyBoyMod;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MoneyBoyMod.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> MONEY_5 = ITEMS.register("money_5", () -> new Item(new Properties().rarity(Rarity.COMMON).arch$tab(ModCreativeModeTab.MOD_TAB)));
    public static final RegistrySupplier<Item> MONEY_10 = ITEMS.register("money_10", () -> new Item(new Properties().rarity(Rarity.COMMON).arch$tab(ModCreativeModeTab.MOD_TAB)));
    public static final RegistrySupplier<Item> MONEY_20 = ITEMS.register("money_20", () -> new Item(new Properties().rarity(Rarity.UNCOMMON).arch$tab(ModCreativeModeTab.MOD_TAB)));
    public static final RegistrySupplier<Item> MONEY_50 = ITEMS.register("money_50", () -> new Item(new Properties().rarity(Rarity.RARE).arch$tab(ModCreativeModeTab.MOD_TAB)));
    public static final RegistrySupplier<Item> MONEY_100 = ITEMS.register("money_100", () -> new Item(new Properties().rarity(Rarity.EPIC).arch$tab(ModCreativeModeTab.MOD_TAB)));

    public static void register() {
        ITEMS.register();
    }
}
