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

public class CrayBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
    XtonesReworkedMod.MODID
  );

  public static final DeferredBlock<Block> CRAY_BLOCK_0 = registerBlock(
    "cray_block_0",
    () -> new XBlock(MapColor.COLOR_LIGHT_GRAY)
  );

  public static final DeferredBlock<Block> CRAY_BLOCK_1 = registerBlock(
    "cray_block_1",
    () -> new XBlock(MapColor.COLOR_YELLOW)
  );
  public static final DeferredBlock<Block> CRAY_BLOCK_2 = registerBlock(
    "cray_block_2",
    () -> new XBlock(MapColor.COLOR_GREEN)
  );
  public static final DeferredBlock<Block> CRAY_BLOCK_3 = registerBlock(
    "cray_block_3",
    () -> new XBlock(MapColor.COLOR_GREEN)
  );
  public static final DeferredBlock<Block> CRAY_BLOCK_4 = registerBlock(
    "cray_block_4",
    () -> new XBlock(MapColor.COLOR_GREEN)
  );
  public static final DeferredBlock<Block> CRAY_BLOCK_5 = registerBlock(
    "cray_block_5",
    () -> new XBlock(MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> CRAY_BLOCK_6 = registerBlock(
    "cray_block_6",
    () -> new XBlock(MapColor.COLOR_CYAN)
  );

  public static final DeferredBlock<Block> CRAY_BLOCK_7 = registerBlock(
    "cray_block_7",
    () -> new XBlock(MapColor.COLOR_BLUE)
  );
  public static final DeferredBlock<Block> CRAY_BLOCK_8 = registerBlock(
    "cray_block_8",
    () -> new XBlock(MapColor.COLOR_PURPLE)
  );
  public static final DeferredBlock<Block> CRAY_BLOCK_9 = registerBlock(
    "cray_block_9",
    () -> new XBlock(MapColor.COLOR_PURPLE)
  );
  public static final DeferredBlock<Block> CRAY_BLOCK_10 = registerBlock(
    "cray_block_10",
    () -> new XBlock(MapColor.COLOR_MAGENTA)
  );
  public static final DeferredBlock<Block> CRAY_BLOCK_11 = registerBlock(
    "cray_block_11",
    () -> new XBlock(MapColor.COLOR_PINK)
  );
  public static final DeferredBlock<Block> CRAY_BLOCK_12 = registerBlock(
    "cray_block_12",
    () -> new XBlock(MapColor.COLOR_BROWN)
  );
  public static final DeferredBlock<Block> CRAY_BLOCK_13 = registerBlock(
    "cray_block_13",
    () -> new XBlock(MapColor.COLOR_BROWN)
  );
  public static final DeferredBlock<Block> CRAY_BLOCK_14 = registerBlock(
    "cray_block_14",
    () -> new XBlock(MapColor.COLOR_BROWN)
  );
  public static final DeferredBlock<Block> CRAY_BLOCK_15 = registerBlock(
    "cray_block_15",
    () -> new XBlock(MapColor.COLOR_GRAY)
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
