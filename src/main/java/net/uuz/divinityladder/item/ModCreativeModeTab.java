package net.uuz.divinityladder.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.uuz.divinityladder.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab DIVINITYLADDER_TAB = new CreativeModeTab("divinityladdertab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FAINT.get());
        }
    };

    public static final CreativeModeTab DIVINITYLADDER_TAB2 = new CreativeModeTab("divinityladdertab2") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CITRINE_BLOCK.get());
        }
    };

    public static final CreativeModeTab DIVINITYLADDER_TAB3 = new CreativeModeTab("divinityladdertab3") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OSIRIS_SWORD.get());
        }
    };
    public static final CreativeModeTab DIVINITYLADDER_TAB4 = new CreativeModeTab("divinityladdertab4") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GOLD_TUSK.get()); }
    };

    public static final CreativeModeTab DIVINITYLADDER_TAB5 = new CreativeModeTab("divinityladdertab5") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GALAXY_SWORD.get());
        }
    };

    public static final CreativeModeTab DIVINITYLADDER_TAB6 = new CreativeModeTab("divinityladdertab6") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ORANGE.get());
        }
    };
}
