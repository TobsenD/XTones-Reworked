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

public class ZtylBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
    XtonesReworkedMod.MODID
  );

  public static final DeferredBlock<Block> ZTYL_BLOCK_0 = registerBlock(
    "ztyl_block_0",
    () -> new XBlock("ztyl_block_0",MapColor.STONE)
  );

  public static final DeferredBlock<Block> ZTYL_BLOCK_1 = registerBlock(
    "ztyl_block_1",
    () -> new XBlock("ztyl_block_1",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZTYL_BLOCK_2 = registerBlock(
    "ztyl_block_2",
    () -> new XBlock("ztyl_block_2",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZTYL_BLOCK_3 = registerBlock(
    "ztyl_block_3",
    () -> new XBlock("ztyl_block_3",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZTYL_BLOCK_4 = registerBlock(
    "ztyl_block_4",
    () -> new XBlock("ztyl_block_4",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZTYL_BLOCK_5 = registerBlock(
    "ztyl_block_5",
    () -> new XBlock("ztyl_block_5",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZTYL_BLOCK_6 = registerBlock(
    "ztyl_block_6",
    () -> new XBlock("ztyl_block_6",MapColor.STONE)
  );

  public static final DeferredBlock<Block> ZTYL_BLOCK_7 = registerBlock(
    "ztyl_block_7",
    () -> new XBlock("ztyl_block_7",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZTYL_BLOCK_8 = registerBlock(
    "ztyl_block_8",
    () -> new XBlock("ztyl_block_8",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZTYL_BLOCK_9 = registerBlock(
    "ztyl_block_9",
    () -> new XBlock("ztyl_block_9",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZTYL_BLOCK_10 = registerBlock(
    "ztyl_block_10",
    () -> new XBlock("ztyl_block_10",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZTYL_BLOCK_11 = registerBlock(
    "ztyl_block_11",
    () -> new XBlock("ztyl_block_11",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZTYL_BLOCK_12 = registerBlock(
    "ztyl_block_12",
    () -> new XBlock("ztyl_block_12",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZTYL_BLOCK_13 = registerBlock(
    "ztyl_block_13",
    () -> new XBlock("ztyl_block_13",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZTYL_BLOCK_14 = registerBlock(
    "ztyl_block_14",
    () -> new XBlock("ztyl_block_14",MapColor.STONE)
  );
  public static final DeferredBlock<Block> ZTYL_BLOCK_15 = registerBlock(
    "ztyl_block_15",
    () -> new XBlock("ztyl_block_15",MapColor.STONE)
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
