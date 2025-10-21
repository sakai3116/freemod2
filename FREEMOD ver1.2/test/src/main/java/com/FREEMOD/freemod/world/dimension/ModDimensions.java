package com.FREEMOD.freemod.world.dimension;

import com.FREEMOD.freemod.FreeMod;
import cpw.mods.modlauncher.api.ITransformationService;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

import java.awt.*;

public class ModDimensions {
    public static final ResourceKey<Level> KJDIM_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(FreeMod.MOD_ID,"kjdim"));

    public static final ResourceKey<DimensionType> KJDIM_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY,KJDIM_KEY.getRegistryName());

    public static void register(){
        System.out.println("Registering ModDimensions for " + FreeMod.MOD_ID);
    }
}
