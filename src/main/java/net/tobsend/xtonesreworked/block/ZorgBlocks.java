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

public class ZorgBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
    XtonesReworkedMod.MODID
  );

  public static final DeferredBlock<Block> ZORG_BLOCK_0 = registerBlock(
    "zorg_block_0",
    () -> new XBlock("zorg_block_0",MapColor.STONE)
  );

  public static final DeferredBlock<Block> ZORG_BLOCK_1 = registerBlock(
    "zorg_block_1",
    () -> new XBlock("zorg_block_1",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZORG_BLOCK_2 = registerBlock(
    "zorg_block_2",
    () -> new XBlock("zorg_block_2",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZORG_BLOCK_3 = registerBlock(
    "zorg_block_3",
    () -> new XBlock("zorg_block_3",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZORG_BLOCK_4 = registerBlock(
    "zorg_block_4",
    () -> new XBlock("zorg_block_4",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZORG_BLOCK_5 = registerBlock(
    "zorg_block_5",
    () -> new XBlock("zorg_block_5",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZORG_BLOCK_6 = registerBlock(
    "zorg_block_6",
    () -> new XBlock("zorg_block_6",MapColor.STONE)
  );

  public static final DeferredBlock<Block> ZORG_BLOCK_7 = registerBlock(
    "zorg_block_7",
    () -> new XBlock("zorg_block_7",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZORG_BLOCK_8 = registerBlock(
    "zorg_block_8",
    () -> new XBlock("zorg_block_8",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZORG_BLOCK_9 = registerBlock(
    "zorg_block_9",
    () -> new XBlock("zorg_block_9",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZORG_BLOCK_10 = registerBlock(
    "zorg_block_10",
    () -> new XBlock("zorg_block_10",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZORG_BLOCK_11 = registerBlock(
    "zorg_block_11",
    () -> new XBlock("zorg_block_11",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZORG_BLOCK_12 = registerBlock(
    "zorg_block_12",
    () -> new XBlock("zorg_block_12",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZORG_BLOCK_13 = registerBlock(
    "zorg_block_13",
    () -> new XBlock("zorg_block_13",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZORG_BLOCK_14 = registerBlock(
    "zorg_block_14",
    () -> new XBlock("zorg_block_14",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZORG_BLOCK_15 = registerBlock(
    "zorg_block_15",
    () -> new XBlock("zorg_block_15",MapColor.STONE)
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
