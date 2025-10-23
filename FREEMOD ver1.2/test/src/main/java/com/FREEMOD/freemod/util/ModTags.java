package com.FREEMOD.freemod.util;

import com.FREEMOD.freemod.FreeMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> OBLIVION_PORTAL_FLAME_BLOCKS
                = tag("oblivion_portal_flame_blocks");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(FreeMod.MOD_ID,name));
        }
    }
}