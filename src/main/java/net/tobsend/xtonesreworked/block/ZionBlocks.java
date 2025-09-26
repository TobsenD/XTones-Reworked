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

public class ZionBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
    XtonesReworkedMod.MODID
  );

    public static final DeferredBlock<Block> ZION_BLOCK_0 = registerBlock(
      "zion_block_0",
      () -> new XBlock("zion_block_0",MapColor.COLOR_BLACK)
    );
    public static final DeferredBlock<Block> ZION_BLOCK_1 = registerBlock(
            "zion_block_1",
     () -> new XBlock("zion_block_1",MapColor.COLOR_BLACK)
    );
  public static final DeferredBlock<Block> ZION_BLOCK_2 = registerBlock(
    "zion_block_2",
    () -> new XBlock("zion_block_2",MapColor.COLOR_BLACK)
  );
  public static final DeferredBlock<Block> ZION_BLOCK_3 = registerBlock(
    "zion_block_3",
    () -> new XBlock("zion_block_3",MapColor.COLOR_BLACK)
  );
  public static final DeferredBlock<Block> ZION_BLOCK_4 = registerBlock(
    "zion_block_4",
    () -> new XBlock("zion_block_4",MapColor.COLOR_BLACK)
  );
  public static final DeferredBlock<Block> ZION_BLOCK_5 = registerBlock(
    "zion_block_5",
    () -> new XBlock("zion_block_5",MapColor.COLOR_BLACK)
  );
  public static final DeferredBlock<Block> ZION_BLOCK_6 = registerBlock(
    "zion_block_6",
    () -> new XBlock("zion_block_6",MapColor.COLOR_BLACK)
  );

  public static final DeferredBlock<Block> ZION_BLOCK_7 = registerBlock(
    "zion_block_7",
    () -> new XBlock("zion_block_7",MapColor.COLOR_BLACK)
  );
  public static final DeferredBlock<Block> ZION_BLOCK_8 = registerBlock(
    "zion_block_8",
    () -> new XBlock("zion_block_8",MapColor.COLOR_BLACK)
  );
  public static final DeferredBlock<Block> ZION_BLOCK_9 = registerBlock(
    "zion_block_9",
    () -> new XBlock("zion_block_9",MapColor.COLOR_BLACK)
  );
  public static final DeferredBlock<Block> ZION_BLOCK_10 = registerBlock(
    "zion_block_10",
    () -> new XBlock("zion_block_10",MapColor.COLOR_BLACK)
  );
  public static final DeferredBlock<Block> ZION_BLOCK_11 = registerBlock(
    "zion_block_11",
    () -> new XBlock("zion_block_11",MapColor.COLOR_BLACK)
  );
  public static final DeferredBlock<Block> ZION_BLOCK_12 = registerBlock(
    "zion_block_12",
    () -> new XBlock("zion_block_12",MapColor.COLOR_BLACK)
  );
  public static final DeferredBlock<Block> ZION_BLOCK_13 = registerBlock(
    "zion_block_13",
    () -> new XBlock("zion_block_13",MapColor.COLOR_BLACK)
  );
  public static final DeferredBlock<Block> ZION_BLOCK_14 = registerBlock(
    "zion_block_14",
    () -> new XBlock("zion_block_14",MapColor.COLOR_BLACK)
  );
  public static final DeferredBlock<Block> ZION_BLOCK_15 = registerBlock(
    "zion_block_15",
    () -> new XBlock("zion_block_15",MapColor.COLOR_BLACK)
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
