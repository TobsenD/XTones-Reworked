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

public class LairBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
    XtonesReworkedMod.MODID
  );

  public static final DeferredBlock<Block> LAIR_BLOCK_0 = registerBlock(
    "lair_block_0",
    () -> new XBlock("lair_block_0",MapColor.COLOR_RED)
  );

  public static final DeferredBlock<Block> LAIR_BLOCK_1 = registerBlock(
    "lair_block_1",
    () -> new XBlock("lair_block_1",MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> LAIR_BLOCK_2 = registerBlock(
    "lair_block_2",
    () -> new XBlock("lair_block_2",MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> LAIR_BLOCK_3 = registerBlock(
    "lair_block_3",
    () -> new XBlock("lair_block_3",MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> LAIR_BLOCK_4 = registerBlock(
    "lair_block_4",
    () -> new XBlock("lair_block_4",MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> LAIR_BLOCK_5 = registerBlock(
    "lair_block_5",
    () -> new XBlock("lair_block_5",MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> LAIR_BLOCK_6 = registerBlock(
    "lair_block_6",
    () -> new XBlock("lair_block_6",MapColor.COLOR_RED)
  );

  public static final DeferredBlock<Block> LAIR_BLOCK_7 = registerBlock(
    "lair_block_7",
    () -> new XBlock("lair_block_7",MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> LAIR_BLOCK_8 = registerBlock(
    "lair_block_8",
    () -> new XBlock("lair_block_8",MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> LAIR_BLOCK_9 = registerBlock(
    "lair_block_9",
    () -> new XBlock("lair_block_9",MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> LAIR_BLOCK_10 = registerBlock(
    "lair_block_10",
    () -> new XBlock("lair_block_10",MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> LAIR_BLOCK_11 = registerBlock(
    "lair_block_11",
    () -> new XBlock("lair_block_11",MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> LAIR_BLOCK_12 = registerBlock(
    "lair_block_12",
    () -> new XBlock("lair_block_12",MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> LAIR_BLOCK_13 = registerBlock(
    "lair_block_13",
    () -> new XBlock("lair_block_13",MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> LAIR_BLOCK_14 = registerBlock(
    "lair_block_14",
    () -> new XBlock("lair_block_14",MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> LAIR_BLOCK_15 = registerBlock(
    "lair_block_15",
    () -> new XBlock("lair_block_15",MapColor.COLOR_RED)
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
