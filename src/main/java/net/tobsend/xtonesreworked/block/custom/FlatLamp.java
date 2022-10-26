package net.tobsend.xtonesreworked.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FlatLamp extends RedstoneLampBlock {

  private static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 3, 16);

  public FlatLamp(Properties properties) {
    super(properties);
  }

  @Override
  public VoxelShape getShape(
    BlockState blockState,
    BlockGetter blockGetter,
    BlockPos blockPos,
    CollisionContext collisionContext
  ) {
    return SHAPE;
  }
}
