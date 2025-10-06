package com.FREEMOD.freemod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier PLATINUM = new ForgeTier(4,1800,6.5F,
            2F,22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.PLATINUM.get()));
}
