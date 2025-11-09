package com.FREEMOD.freemod.register;

import com.FREEMOD.freemod.main.FreeMod;
import com.FREEMOD.freemod.fluid.AcidFluid;
import com.FREEMOD.freemod.item.ModArmorMaterials;
import com.FREEMOD.freemod.item.ModTiers;
import com.FREEMOD.freemod.item.custom.ChorusFlyFruit;
import com.FREEMOD.freemod.item.custom.WorldLineItem;
import com.FREEMOD.freemod.main.tab.FreeModTab;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegister {
    // レジストリを作成
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FreeMod.MOD_ID);

    // レジストリに作成したアイテムを追加

    // tool
    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword",
            () -> new SwordItem(ModTiers.PLATINUM,3,2F,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(ModTiers.PLATINUM,5,1.5F,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(ModTiers.PLATINUM,1,0F,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(ModTiers.PLATINUM,1.5F,0F,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe",
            () -> new HoeItem(ModTiers.PLATINUM,1,0F,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));

    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    // item
    public static final RegistryObject<Item> ACID_BUCKET = ITEMS.register("acid_bucket",
            () -> new BucketItem(AcidFluid.ACID_FLUID, new Item.Properties().tab(FreeModTab.FREEMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PLATINUM = ITEMS.register("platinum",
            () -> new Item(new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties().tab(FreeModTab.FREEMOD_TAB)));
    public static final RegistryObject<Item> WORLD_LINE = ITEMS.register("world_line", WorldLineItem::new);
    // food
    public static final RegistryObject<Item> CHORUS_FLY_FRUIT = ITEMS.register("chorus_fly_fruit", ChorusFlyFruit::new);


    public static void register(IEventBus eventBus){
        // レジストリをイベントバスに登録
        ITEMS.register(eventBus);
    }
}
