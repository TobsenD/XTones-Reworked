package net.tobsend.xtonesreworked.block;

import java.util.function.Supplier;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.block.custom.XBlock;
import net.tobsend.xtonesreworked.item.ModItems;

public class SolsBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
    XtonesReworkedMod.MODID
  );

  public static final DeferredBlock<Block> SOLS_BLOCK_0 = registerBlock(
    "sols_block_0",
    XBlock::new
  );

  public static final DeferredBlock<Block> SOLS_BLOCK_1 = registerBlock(
    "sols_block_1",
    XBlock::new
  );
  public static final DeferredBlock<Block> SOLS_BLOCK_2 = registerBlock(
    "sols_block_2",
    XBlock::new
  );
  public static final DeferredBlock<Block> SOLS_BLOCK_3 = registerBlock(
    "sols_block_3",
    XBlock::new
  );
  public static final DeferredBlock<Block> SOLS_BLOCK_4 = registerBlock(
    "sols_block_4",
    XBlock::new
  );
  public static final DeferredBlock<Block> SOLS_BLOCK_5 = registerBlock(
    "sols_block_5",
    XBlock::new
  );
  public static final DeferredBlock<Block> SOLS_BLOCK_6 = registerBlock(
    "sols_block_6",
    XBlock::new
  );

  public static final DeferredBlock<Block> SOLS_BLOCK_7 = registerBlock(
    "sols_block_7",
    XBlock::new
  );
  public static final DeferredBlock<Block> SOLS_BLOCK_8 = registerBlock(
    "sols_block_8",
    XBlock::new
  );
  public static final DeferredBlock<Block> SOLS_BLOCK_9 = registerBlock(
    "sols_block_9",
    XBlock::new
  );
  public static final DeferredBlock<Block> SOLS_BLOCK_10 = registerBlock(
    "sols_block_10",
    XBlock::new
  );
  public static final DeferredBlock<Block> SOLS_BLOCK_11 = registerBlock(
    "sols_block_11",
    XBlock::new
  );
  public static final DeferredBlock<Block> SOLS_BLOCK_12 = registerBlock(
    "sols_block_12",
    XBlock::new
  );
  public static final DeferredBlock<Block> SOLS_BLOCK_13 = registerBlock(
    "sols_block_13",
    XBlock::new
  );
  public static final DeferredBlock<Block> SOLS_BLOCK_14 = registerBlock(
    "sols_block_14",
    XBlock::new
  );
  public static final DeferredBlock<Block> SOLS_BLOCK_15 = registerBlock(
    "sols_block_15",
    XBlock::new
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
