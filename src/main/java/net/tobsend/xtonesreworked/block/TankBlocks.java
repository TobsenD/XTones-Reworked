package net.tobsend.xtonesreworked.block;

import java.util.function.Supplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.item.ModItems;

public class TankBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
    XtonesReworkedMod.MODID
  );

  public static final DeferredBlock<Block> TANK_BLOCK_0 = registerBlock(
    "tank_block_0",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );

  public static final DeferredBlock<Block> TANK_BLOCK_1 = registerBlock(
    "tank_block_1",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> TANK_BLOCK_2 = registerBlock(
    "tank_block_2",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> TANK_BLOCK_3 = registerBlock(
    "tank_block_3",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> TANK_BLOCK_4 = registerBlock(
    "tank_block_4",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> TANK_BLOCK_5 = registerBlock(
    "tank_block_5",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> TANK_BLOCK_6 = registerBlock(
    "tank_block_6",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );

  public static final DeferredBlock<Block> TANK_BLOCK_7 = registerBlock(
    "tank_block_7",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> TANK_BLOCK_8 = registerBlock(
    "tank_block_8",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> TANK_BLOCK_9 = registerBlock(
    "tank_block_9",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> TANK_BLOCK_10 = registerBlock(
    "tank_block_10",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> TANK_BLOCK_11 = registerBlock(
    "tank_block_11",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> TANK_BLOCK_12 = registerBlock(
    "tank_block_12",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> TANK_BLOCK_13 = registerBlock(
    "tank_block_13",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> TANK_BLOCK_14 = registerBlock(
    "tank_block_14",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> TANK_BLOCK_15 = registerBlock(
    "tank_block_15",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );

  private static final <R, T> DeferredBlock<Block> registerBlock(
    String name,
    Supplier<Block> block
  ) {
    DeferredBlock<Block> toReturn = BLOCKS.register(
      name,
      block
    );
    ModItems.ITEMS.registerSimpleBlockItem(toReturn);
    return toReturn;
  }

  public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
  }
}
