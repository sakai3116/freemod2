package com.FREEMOD.freemod.item;

import com.FREEMOD.freemod.FreeMod;
import com.FREEMOD.freemod.fluid.AcidFluid;
import com.FREEMOD.freemod.item.custom.ChorusFlyFruit;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreeMod.MOD_ID);

    //これ以降に登録
    public static final RegistryObject<Item> ACID_BUCKET = ITEMS.register("acid_bucket",
            () -> new BucketItem(AcidFluid.ACID_FLUID,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PLATINUM = ITEMS.register("platinum",
            () -> new Item(new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    //プラチナツール系
    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword",
            () -> new SwordItem(ModTiers.PLATINUM,3,2F,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(ModTiers.PLATINUM,3,2F,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(ModTiers.PLATINUM,3,2F,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(ModTiers.PLATINUM,3,2F,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe",
            () -> new HoeItem(ModTiers.PLATINUM,3,2F,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));


    public static final RegistryObject<Item> CHORUS_FLY_FRUIT = ITEMS.register("chorus_fly_fluit", ChorusFlyFruit::new);

    //public static final RegistryObject<SwordItem> BIG_AXE = ITEMS.register("big_axe", BigAxeItem::new);


//仮作成　保管タンク
//    public static final RegistryObject<Item> TANK = ITEMS.register("tank",
//            () -> new BucketItem(Fluids.EMPTY,
//                    new Item.Properties().tab(FreeModTab.TUTORIAL_TAB).stacksTo(1)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}