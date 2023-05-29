package net.tobsend.xtonesreworked.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class FlatLamp extends Block {

  public static final BooleanProperty LIT = BooleanProperty.create("lit");
  private static final DirectionProperty FACING = BlockStateProperties.FACING;
  /*
  METHOD box (DDDDDD)Lnet/minecraft/world/phys/shapes/VoxelShape;
		ARG 0 x1
		ARG 2 y1
		ARG 4 z1
		ARG 6 x2
		ARG 8 y2
		ARG 10 z2
  */
  private static final VoxelShape SHAPE_DOWN = Block.box(0, 13, 0, 16, 16, 16);
  private static final VoxelShape SHAPE_UP = Block.box(0, 0, 0, 16, 3, 16);
  private static final VoxelShape SHAPE_WEST = Block.box(13, 0, 0, 16, 16, 16);
  private static final VoxelShape SHAPE_EAST = Block.box(0, 0, 0, 3, 16, 16);
  private static final VoxelShape SHAPE_NORTH = Block.box(0, 0, 13, 16, 16, 16);
  private static final VoxelShape SHAPE_SOUTH = Block.box(0, 0, 0, 16, 16, 3);

  public FlatLamp(Properties properties) {
    super(properties);
    this.registerDefaultState(
        this.defaultBlockState().setValue(LIT, Boolean.valueOf(false))
      );
  }

  @Override
  public BlockState rotate(BlockState blockState, Rotation rotation) {
    return blockState.setValue(
      FACING,
      rotation.rotate(blockState.getValue(FACING))
    );
  }

  public BlockState mirror(BlockState blockState, Mirror mirror) {
    return blockState.rotate(mirror.getRotation(blockState.getValue(FACING)));
  }

  public BlockState getStateForPlacement(BlockItemUseContext blockPlaceContext) {
    return this.defaultBlockState()
      .setValue(
        FACING,
        blockPlaceContext.getNearestLookingDirection().getOpposite()
      )
      .setValue(
        LIT,
        Boolean.valueOf(
          blockPlaceContext
            .getLevel()
            .hasNeighborSignal(blockPlaceContext.getClickedPos())
        )
      );
  }

  @Override
  public VoxelShape getShape(
    BlockState blockState,
    IBlockReader blockGetter,
    BlockPos blockPos,
    ISelectionContext collisionContext
  ) {
    switch (blockState.getValue(FACING)) {
      case DOWN:
        return SHAPE_DOWN;
      case EAST:
        return SHAPE_EAST;
      case WEST:
        return SHAPE_WEST;
      case NORTH:
        return SHAPE_NORTH;
      case SOUTH:
        return SHAPE_SOUTH;
      default:
        return SHAPE_UP;
    }
  }

  public void neighborChanged_old(BlockState currentState, World world, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
    final boolean active = currentState.getValue(LIT);
  }

  @Override
  public void neighborChanged (
    BlockState blockState,
    World level,
    BlockPos blockPos,
    Block block,
    BlockPos fromPos,
    boolean isMoving
  ) {
    if (!level.isClientSide) {
      boolean flag = blockState.getValue(LIT);
      if (flag != level.hasNeighborSignal(blockPos)) {
        if (flag) {
          level.getBlockTicks().scheduleTick(blockPos, this, 4);
        } else {
          level.setBlock(blockPos, blockState.cycle(LIT), 2);
        }
      }
    }
  }

  @Override
  public void tick(
    BlockState blockState,
    ServerWorld serverLevel,
    BlockPos blockPostition,
    Random randomSource
  ) {
    if (
      blockState.getValue(LIT) && !serverLevel.hasNeighborSignal(blockPostition)
    ) {
      serverLevel.setBlock(blockPostition, blockState.cycle(LIT), 2);
    }
  }

  @Override
  protected void createBlockStateDefinition(
    StateContainer.Builder<Block, BlockState> builder
  ) {
    builder.add(FACING, LIT);
  }
}
