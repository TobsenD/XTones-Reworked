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

public class ZaneBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
    XtonesReworkedMod.MODID
  );

  public static final DeferredBlock<Block> ZANE_BLOCK_0 = registerBlock(
    "zane_block_0",
    () -> new XBlock("zane_block_0",MapColor.TERRACOTTA_WHITE)
  );

  public static final DeferredBlock<Block> ZANE_BLOCK_1 = registerBlock(
    "zane_block_1",
    () -> new XBlock("zane_block_1",MapColor.TERRACOTTA_YELLOW)
  );
  public static final DeferredBlock<Block> ZANE_BLOCK_2 = registerBlock(
    "zane_block_2",
    () -> new XBlock("zane_block_2",MapColor.TERRACOTTA_LIGHT_GREEN)
  );
  public static final DeferredBlock<Block> ZANE_BLOCK_3 = registerBlock(
    "zane_block_3",
    () -> new XBlock("zane_block_3",MapColor.TERRACOTTA_GREEN)
  );
  public static final DeferredBlock<Block> ZANE_BLOCK_4 = registerBlock(
    "zane_block_4",
    () -> new XBlock("zane_block_4",MapColor.TERRACOTTA_GREEN)
  );
  public static final DeferredBlock<Block> ZANE_BLOCK_5 = registerBlock(
    "zane_block_5",
    () -> new XBlock("zane_block_5",MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> ZANE_BLOCK_6 = registerBlock(
    "zane_block_6",
    () -> new XBlock("zane_block_6",MapColor.COLOR_BLUE)
  );

  public static final DeferredBlock<Block> ZANE_BLOCK_7 = registerBlock(
    "zane_block_7",
    () -> new XBlock("zane_block_7",MapColor.COLOR_BLUE)
  );
  public static final DeferredBlock<Block> ZANE_BLOCK_8 = registerBlock(
    "zane_block_8",
    () -> new XBlock("zane_block_8",MapColor.COLOR_BLUE)
  );
  public static final DeferredBlock<Block> ZANE_BLOCK_9 = registerBlock(
    "zane_block_9",
    () -> new XBlock("zane_block_9",MapColor.COLOR_PURPLE)
  );
  public static final DeferredBlock<Block> ZANE_BLOCK_10 = registerBlock(
    "zane_block_10",
    () -> new XBlock("zane_block_10",MapColor.COLOR_PURPLE)
  );
  public static final DeferredBlock<Block> ZANE_BLOCK_12 = registerBlock(
    "zane_block_12",
    () -> new XBlock("zane_block_12",MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> ZANE_BLOCK_13 = registerBlock(
    "zane_block_13",
    () -> new XBlock("zane_block_13",MapColor.COLOR_ORANGE)
  );
  public static final DeferredBlock<Block> ZANE_BLOCK_14 = registerBlock(
    "zane_block_14",
    () -> new XBlock("zane_block_14",MapColor.COLOR_BROWN)
  );
  public static final DeferredBlock<Block> ZANE_BLOCK_15 = registerBlock(
    "zane_block_15",
    () -> new XBlock("zane_block_15",MapColor.COLOR_BLACK)
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
