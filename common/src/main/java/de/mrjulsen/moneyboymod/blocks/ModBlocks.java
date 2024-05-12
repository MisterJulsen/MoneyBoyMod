package de.mrjulsen.moneyboymod.blocks;

import java.util.function.Supplier;

import de.mrjulsen.moneyboymod.MoneyBoyMod;
import de.mrjulsen.moneyboymod.items.ModCreativeModeTab;
import de.mrjulsen.moneyboymod.items.ModItems;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MoneyBoyMod.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> MONEY_5 = register("moneyblock_5", () -> new Block(BlockBehaviour.Properties.of().strength(0.5f)));
    public static final RegistrySupplier<Block> MONEY_10 = register("moneyblock_10", () -> new Block(BlockBehaviour.Properties.of().strength(0.5f)));
    public static final RegistrySupplier<Block> MONEY_20 = register("moneyblock_20", () -> new Block(BlockBehaviour.Properties.of().strength(0.5f)));
    public static final RegistrySupplier<Block> MONEY_50 = register("moneyblock_50", () -> new Block(BlockBehaviour.Properties.of().strength(0.5f)));
    public static final RegistrySupplier<Block> MONEY_100 = register("moneyblock_100", () -> new Block(BlockBehaviour.Properties.of().strength(0.5f)));

    public static final RegistrySupplier<Block> register(String name, Supplier<Block> blockSupplier) {
        RegistrySupplier<Block> block = BLOCKS.register(name, blockSupplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Properties().arch$tab(ModCreativeModeTab.MOD_TAB)));
        return block;
    }

    public static void register() {
        BLOCKS.register();
    }
}
