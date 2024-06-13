package net.tobsend.xtonesreworked.block;

import java.util.function.Supplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.item.ModItems;

public class ZechBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
    XtonesReworkedMod.MODID
  );

  public static final DeferredBlock<Block> ZECH_BLOCK_0 = registerBlock(
    "zech_block_0",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );

  public static final DeferredBlock<Block> ZECH_BLOCK_1 = registerBlock(
    "zech_block_1",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> ZECH_BLOCK_2 = registerBlock(
    "zech_block_2",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> ZECH_BLOCK_3 = registerBlock(
    "zech_block_3",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> ZECH_BLOCK_4 = registerBlock(
    "zech_block_4",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> ZECH_BLOCK_5 = registerBlock(
    "zech_block_5",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> ZECH_BLOCK_6 = registerBlock(
    "zech_block_6",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );

  public static final DeferredBlock<Block> ZECH_BLOCK_7 = registerBlock(
    "zech_block_7",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> ZECH_BLOCK_8 = registerBlock(
    "zech_block_8",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> ZECH_BLOCK_9 = registerBlock(
    "zech_block_9",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> ZECH_BLOCK_10 = registerBlock(
    "zech_block_10",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> ZECH_BLOCK_11 = registerBlock(
    "zech_block_11",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> ZECH_BLOCK_12 = registerBlock(
    "zech_block_12",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> ZECH_BLOCK_13 = registerBlock(
    "zech_block_13",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> ZECH_BLOCK_14 = registerBlock(
    "zech_block_14",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final DeferredBlock<Block> ZECH_BLOCK_15 = registerBlock(
    "zech_block_15",
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
