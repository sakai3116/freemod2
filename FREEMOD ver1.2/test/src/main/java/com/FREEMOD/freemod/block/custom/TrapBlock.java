package com.FREEMOD.freemod.block.custom;
import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import org.jetbrains.annotations.Nullable;

public class TrapBlock extends Block {

    public static final IntegerProperty CAMO_TYPE = IntegerProperty.create("camo_type", 0, 3);

    public TrapBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(CAMO_TYPE, 0));
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.isSteppingCarefully() && entity instanceof LivingEntity && !level.isClientSide) {
            entity.hurt(DamageSource.HOT_FLOOR, 1.0F);
        }
        super.stepOn(level, pos, state, entity);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();

        BlockState blockBelow = level.getBlockState(pos.below());

        int type = 0;

        // 真下のブロックが何か判定して type を変更
        if (blockBelow.is(Blocks.STONE)) {
            type = 1; // 石に擬態
        } else if (blockBelow.is(Blocks.DIRT)) {
            type = 2; // 土に擬態
        } else if (blockBelow.is(Blocks.GRASS_BLOCK)) {
            type = 3; // 草ブロックに擬態
        }
        return this.defaultBlockState().setValue(CAMO_TYPE, type);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(CAMO_TYPE);
    }
}