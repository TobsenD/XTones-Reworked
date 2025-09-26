package net.tobsend.xtonesreworked.block;

import java.util.function.Supplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.block.custom.XBlock;
import net.tobsend.xtonesreworked.item.ModItems;

public class RoenBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
    XtonesReworkedMod.MODID
  );

  public static final DeferredBlock<Block> ROEN_BLOCK_0 = registerBlock(
    "roen_block_0",
    () -> new XBlock("roen_block_0",MapColor.SAND)
  );

  public static final DeferredBlock<Block> ROEN_BLOCK_1 = registerBlock(
    "roen_block_1",
    () -> new XBlock("roen_block_1",MapColor.SAND)
  );
  public static final DeferredBlock<Block> ROEN_BLOCK_2 = registerBlock(
    "roen_block_2",
    () -> new XBlock("roen_block_2",MapColor.SAND)
  );
  public static final DeferredBlock<Block> ROEN_BLOCK_3 = registerBlock(
    "roen_block_3",
    () -> new XBlock("roen_block_3",MapColor.SAND)
  );
  public static final DeferredBlock<Block> ROEN_BLOCK_4 = registerBlock(
    "roen_block_4",
    () -> new XBlock("roen_block_4",MapColor.SAND)
  );
  public static final DeferredBlock<Block> ROEN_BLOCK_5 = registerBlock(
    "roen_block_5",
    () -> new XBlock("roen_block_5",MapColor.SAND)
  );
  public static final DeferredBlock<Block> ROEN_BLOCK_6 = registerBlock(
    "roen_block_6",
    () -> new XBlock("roen_block_6",MapColor.SAND)
  );

  public static final DeferredBlock<Block> ROEN_BLOCK_7 = registerBlock(
    "roen_block_7",
    () -> new XBlock("roen_block_7",MapColor.SAND)
  );
  public static final DeferredBlock<Block> ROEN_BLOCK_8 = registerBlock(
    "roen_block_8",
    () -> new XBlock("roen_block_8",MapColor.SAND)
  );
  public static final DeferredBlock<Block> ROEN_BLOCK_9 = registerBlock(
    "roen_block_9",
    () -> new XBlock("roen_block_9",MapColor.SAND)
  );
  public static final DeferredBlock<Block> ROEN_BLOCK_10 = registerBlock(
    "roen_block_10",
    () -> new XBlock("roen_block_10",MapColor.SAND)
  );
  public static final DeferredBlock<Block> ROEN_BLOCK_11 = registerBlock(
    "roen_block_11",
    () -> new XBlock("roen_block_11",MapColor.SAND)
  );
  public static final DeferredBlock<Block> ROEN_BLOCK_12 = registerBlock(
    "roen_block_12",
    () -> new XBlock("roen_block_12",MapColor.SAND)
  );
  public static final DeferredBlock<Block> ROEN_BLOCK_13 = registerBlock(
    "roen_block_13",
    () -> new XBlock("roen_block_13",MapColor.SAND)
  );
  public static final DeferredBlock<Block> ROEN_BLOCK_14 = registerBlock(
    "roen_block_14",
    () -> new XBlock("roen_block_14",MapColor.SAND)
  );
  public static final DeferredBlock<Block> ROEN_BLOCK_15 = registerBlock(
    "roen_block_15",
    () -> new XBlock("roen_block_15",MapColor.SAND)
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
