package de.mrjulsen.moneyboymod.items;

import de.mrjulsen.moneyboymod.MoneyBoyMod;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MoneyBoyMod.MOD_ID, Registries.CREATIVE_MODE_TAB);
 
    public static final RegistrySupplier<CreativeModeTab> MOD_TAB = TABS.register(
            "mod_tab", // Tab ID
            () -> CreativeTabRegistry.create(
                    Component.translatable("itemGroup.moneyboymod.mod_tab"), // Tab Name
                    () -> new ItemStack(ModItems.MONEY_20.get()) // Icon

            )

    );

    public static void register() {
        TABS.register();
    }
}
