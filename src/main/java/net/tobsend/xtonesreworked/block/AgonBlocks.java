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

public class AgonBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );

  public static final DeferredBlock<Block> AGON_BLOCK_0 = registerBlock(
    "agon_block_0",
          () -> new XBlock(MapColor.TERRACOTTA_WHITE)
  );

  public static final DeferredBlock<Block> AGON_BLOCK_1 = registerBlock(
    "agon_block_1",
          () -> new XBlock(MapColor.COLOR_YELLOW)
  );
  public static final DeferredBlock<Block> AGON_BLOCK_2 = registerBlock(
    "agon_block_2",
          () -> new XBlock(MapColor.COLOR_LIGHT_GREEN)
  );
  public static final DeferredBlock<Block> AGON_BLOCK_3 = registerBlock(
    "agon_block_3",
          () -> new XBlock(MapColor.COLOR_GREEN)
  );
  public static final DeferredBlock<Block> AGON_BLOCK_4 = registerBlock(
    "agon_block_4",
          () -> new XBlock(MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> AGON_BLOCK_5 = registerBlock(
    "agon_block_5",
          () -> new XBlock(MapColor.COLOR_LIGHT_BLUE)
  );
  public static final DeferredBlock<Block> AGON_BLOCK_6 = registerBlock(
    "agon_block_6",
          () -> new XBlock(MapColor.COLOR_BLUE)
  );

  public static final DeferredBlock<Block> AGON_BLOCK_7 = registerBlock(
    "agon_block_7",
          () -> new XBlock(MapColor.COLOR_PURPLE)
  );
  public static final DeferredBlock<Block> AGON_BLOCK_8 = registerBlock(
    "agon_block_8",
          () -> new XBlock(MapColor.COLOR_MAGENTA)
  );
  public static final DeferredBlock<Block> AGON_BLOCK_9 = registerBlock(
    "agon_block_9",
          () -> new XBlock(MapColor.COLOR_PINK)
  );
  public static final DeferredBlock<Block> AGON_BLOCK_10 = registerBlock(
    "agon_block_10",
          () -> new XBlock(MapColor.COLOR_RED)
  );
  public static final DeferredBlock<Block> AGON_BLOCK_11 = registerBlock(
    "agon_block_11",
          () -> new XBlock(MapColor.COLOR_ORANGE)
  );
  public static final DeferredBlock<Block> AGON_BLOCK_12 = registerBlock(
    "agon_block_12",
          () -> new XBlock(MapColor.COLOR_BROWN)
  );
  public static final DeferredBlock<Block> AGON_BLOCK_13 = registerBlock(
    "agon_block_13",
          () -> new XBlock(MapColor.COLOR_BLACK)
  );
  public static final DeferredBlock<Block> AGON_BLOCK_14 = registerBlock(
    "agon_block_14",
          () -> new XBlock(MapColor.COLOR_GRAY)
  );
  public static final DeferredBlock<Block> AGON_BLOCK_15 = registerBlock(
    "agon_block_15",
          () -> new XBlock(MapColor.COLOR_LIGHT_GRAY)
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
