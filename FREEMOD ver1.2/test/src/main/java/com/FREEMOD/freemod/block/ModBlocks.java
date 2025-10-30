package com.FREEMOD.freemod.block;

import com.FREEMOD.freemod.FreeMod;
import com.FREEMOD.freemod.block.custom.AcidTank;
import com.FREEMOD.freemod.block.custom.ModFlammableRotatedPillarBlock;
import com.FREEMOD.freemod.block.custom.OblivionPortalBlock;
import com.FREEMOD.freemod.item.FreeModTab;
import com.FREEMOD.freemod.item.ModItems;
import com.FREEMOD.freemod.world.feature.tree.OblivionTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FreeMod.MOD_ID);
    
    //これ以降に登録
    public static final RegistryObject<Block> OBLIVION_LOG = registerBlock("oblivion_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            FreeModTab.FREEMOD_TAB);
    public static final RegistryObject<Block> OBLIVION_WOOD = registerBlock("oblivion_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            FreeModTab.FREEMOD_TAB);
    public static final RegistryObject<Block> STRIPPED_OBLIVION_LOG = registerBlock("stripped_oblivion_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            FreeModTab.FREEMOD_TAB);
    public static final RegistryObject<Block> STRIPPED_OBLIVION_WOOD = registerBlock("stripped_oblivion_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            FreeModTab.FREEMOD_TAB);


    public static final RegistryObject<Block> ACID_TANK = registerBlock("acid_tank",
            () -> new AcidTank(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),FreeModTab.FREEMOD_TAB);
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE) //part 40 UniformInt.of(3,7)の追加　経験値ドロップ
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), FreeModTab.FREEMOD_TAB);
    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE) //part 40 UniformInt.of(3,7)の追加　経験値ドロップ
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), FreeModTab.FREEMOD_TAB);

    public static final RegistryObject<Block> OBLIVION_PORTAL_GATE_BLOCK = registerBlock("oblivion_portal_gate_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)),FreeModTab.FREEMOD_TAB);

    public static final RegistryObject<Block> OBLIVION_PORTAL = registerBlockWithoutBlockItem("oblivion_portal", OblivionPortalBlock::new);


    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE) //part 40 UniformInt.of(3,7)の追加　経験値ドロップ
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), FreeModTab.FREEMOD_TAB);
    public static final RegistryObject<Block> DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), FreeModTab.FREEMOD_TAB);

    //part 31 木の延焼
    public static final RegistryObject<Block> OBLIVION_PLANKS = registerBlock("oblivion_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            },FreeModTab.FREEMOD_TAB);

    //part 32 葉の延焼
    public static final RegistryObject<Block> OBLIVION_LEAVES = registerBlock("oblivion_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            },FreeModTab.FREEMOD_TAB);

    //part 32 苗木ブロック
    public static final RegistryObject<Block> OBLIVION_SAPLING = registerBlock("oblivion_sapling",
            () -> new SaplingBlock(new OblivionTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), FreeModTab.FREEMOD_TAB);


    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    //part 12 25-2-19 8:17
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab,String tooltipkey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipkey);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab, String tooltipkey){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)){
            @Override
            public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
                list.add(new TranslatableComponent(tooltipkey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}