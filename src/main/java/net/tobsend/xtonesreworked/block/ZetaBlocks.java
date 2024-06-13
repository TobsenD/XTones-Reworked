package net.tobsend.xtonesreworked.block;

import java.util.function.Supplier;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.block.custom.XBlock;
import net.tobsend.xtonesreworked.item.ModItems;

public class ZetaBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
    XtonesReworkedMod.MODID
  );

  public static final DeferredBlock<Block> ZETA_BLOCK_0 = registerBlock(
    "zeta_block_0",
    XBlock::new
  );

  public static final DeferredBlock<Block> ZETA_BLOCK_1 = registerBlock(
    "zeta_block_1",
    XBlock::new
  );
  public static final DeferredBlock<Block> ZETA_BLOCK_2 = registerBlock(
    "zeta_block_2",
    XBlock::new
  );
  public static final DeferredBlock<Block> ZETA_BLOCK_3 = registerBlock(
    "zeta_block_3",
    XBlock::new
  );
  public static final DeferredBlock<Block> ZETA_BLOCK_4 = registerBlock(
    "zeta_block_4",
    XBlock::new
  );
  public static final DeferredBlock<Block> ZETA_BLOCK_5 = registerBlock(
    "zeta_block_5",
    XBlock::new
  );
  public static final DeferredBlock<Block> ZETA_BLOCK_6 = registerBlock(
    "zeta_block_6",
    XBlock::new
  );

  public static final DeferredBlock<Block> ZETA_BLOCK_7 = registerBlock(
    "zeta_block_7",
    XBlock::new
  );
  public static final DeferredBlock<Block> ZETA_BLOCK_8 = registerBlock(
    "zeta_block_8",
    XBlock::new
  );
  public static final DeferredBlock<Block> ZETA_BLOCK_9 = registerBlock(
    "zeta_block_9",
    XBlock::new
  );
  public static final DeferredBlock<Block> ZETA_BLOCK_10 = registerBlock(
    "zeta_block_10",
    XBlock::new
  );
  public static final DeferredBlock<Block> ZETA_BLOCK_11 = registerBlock(
    "zeta_block_11",
    XBlock::new
  );
  public static final DeferredBlock<Block> ZETA_BLOCK_12 = registerBlock(
    "zeta_block_12",
    XBlock::new
  );
  public static final DeferredBlock<Block> ZETA_BLOCK_13 = registerBlock(
    "zeta_block_13",
    XBlock::new
  );
  public static final DeferredBlock<Block> ZETA_BLOCK_14 = registerBlock(
    "zeta_block_14",
    XBlock::new
  );
  public static final DeferredBlock<Block> ZETA_BLOCK_15 = registerBlock(
    "zeta_block_15",
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
