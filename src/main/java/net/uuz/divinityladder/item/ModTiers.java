package net.uuz.divinityladder.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

//ËØ²Ä±êÇ©
public class ModTiers {
    public static final ForgeTier FAINT = new ForgeTier(4,2000,12f,
            5f,22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.FAINT.get()));

    public static final ForgeTier OSIRIS_INGOT = new ForgeTier(5,4000,15f,
            8f,30, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.OSIRIS_INGOT.get()));
}
