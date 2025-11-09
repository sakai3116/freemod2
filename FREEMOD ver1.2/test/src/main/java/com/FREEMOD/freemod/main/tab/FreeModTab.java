package com.FREEMOD.freemod.main.tab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class FreeModTab {
    public static final CreativeModeTab FREEMOD_TAB = new CreativeModeTab("freemodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.DIAMOND_PICKAXE);
        }
    };

    //このようにクリエイティブタブを追加することもできる
    public static final CreativeModeTab FREEMODBLOCK_TAB = new CreativeModeTab("freemodblocktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.BEDROCK);
        }
    };
}
