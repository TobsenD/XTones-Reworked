package net.tobsend.xtonesreworked.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

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

  public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
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
    BlockGetter blockGetter,
    BlockPos blockPos,
    CollisionContext collisionContext
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

  public void neighborChanged(
    BlockState blockState,
    Level level,
    BlockPos blockPos,
    Block block,
    BlockPos fromPos,
    boolean isMoving
  ) {
    if (!level.isClientSide) {
      boolean flag = blockState.getValue(LIT);
      if (flag != level.hasNeighborSignal(blockPos)) {
        if (flag) {
          level.scheduleTick(blockPos, this, 4);
        } else {
          level.setBlock(blockPos, blockState.cycle(LIT), 2);
        }
      }
    }
  }

  public void tick(
    BlockState blockState,
    ServerLevel serverLevel,
    BlockPos blockPostition,
    RandomSource randomSource
  ) {
    if (
      blockState.getValue(LIT) && !serverLevel.hasNeighborSignal(blockPostition)
    ) {
      serverLevel.setBlock(blockPostition, blockState.cycle(LIT), 2);
    }
  }

  @Override
  protected void createBlockStateDefinition(
    StateDefinition.Builder<Block, BlockState> builder
  ) {
    builder.add(FACING, LIT);
  }
}
