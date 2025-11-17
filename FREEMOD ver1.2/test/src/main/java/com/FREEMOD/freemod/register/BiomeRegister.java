package com.FREEMOD.freemod.register;

import com.FREEMOD.freemod.main.FreeMod;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.biome.OverworldBiomes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeRegister {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, FreeMod.MOD_ID);

    public static final ResourceKey<Biome> CRYSTAL_PLAINS = register("crystal_plains");
    public static final ResourceKey<Biome> CRYSTAL_MOOR = register("crystal_moor");
    public static final ResourceKey<Biome> NULLSCAPE_PLAINS = register("nullscape_plains");
    public static final ResourceKey<Biome> AUTUMN_PLAINS = register("autumn_plains");
    public static final ResourceKey<Biome> OBLIVION_PLAINS = register("oblivion_plains");


    public static void toDictionary() {
        BiomeDictionary.addTypes(CRYSTAL_PLAINS, BiomeDictionary.Type.WET, BiomeDictionary.Type.PLAINS);
        BiomeDictionary.addTypes(CRYSTAL_MOOR, BiomeDictionary.Type.WET, BiomeDictionary.Type.PLAINS);
        BiomeDictionary.addTypes(NULLSCAPE_PLAINS, BiomeDictionary.Type.WET, BiomeDictionary.Type.PLAINS);
        BiomeDictionary.addTypes(AUTUMN_PLAINS, BiomeDictionary.Type.WET, BiomeDictionary.Type.PLAINS);
        BiomeDictionary.addTypes(OBLIVION_PLAINS,BiomeDictionary.Type.COLD,BiomeDictionary.Type.PLAINS);
    }

    private static ResourceLocation name(String name) {
        return new ResourceLocation(FreeMod.MOD_ID, name);
    }

    private static ResourceKey<Biome> register(String name) {
        BIOMES.register(name, OverworldBiomes::theVoid);
        return ResourceKey.create(Registry.BIOME_REGISTRY, name(name));
    }

    public static void register(IEventBus eventBus){
        BIOMES.register(eventBus);
    }

}
