package de.mrjulsen.moneyboymod.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import de.mrjulsen.moneyboymod.MoneyBoyMod;

@Mod(MoneyBoyMod.MOD_ID)
public final class MoneyBoyModForge {
    public MoneyBoyModForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(MoneyBoyMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        MoneyBoyMod.init();
    }
}
