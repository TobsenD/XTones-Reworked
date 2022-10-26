package net.tobsend.xtonesreworked.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
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
  private static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 3, 16);

  public FlatLamp(Properties properties) {
    super(properties);
    this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
  }

  @Override
  public BlockState rotate(BlockState blockState, Rotation rotation) {
    return blockState.setValue(FACING, rotation.rotate(blockState.getValue(FACING)));
 }

 public BlockState mirror(BlockState blockState, Mirror mirror) {
    return blockState.rotate(mirror.getRotation(blockState.getValue(FACING)));
 }


 public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
    return this.defaultBlockState().setValue(FACING, blockPlaceContext.getNearestLookingDirection().getOpposite());
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

  @Override
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
      builder.add(FACING, LIT);
  }
}
