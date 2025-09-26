package net.tobsend.xtonesreworked.block;

import java.util.function.Supplier;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.block.custom.XGlass;
import net.tobsend.xtonesreworked.item.ModItems;

public class GlaxxBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
    XtonesReworkedMod.MODID
  );

  public static final DeferredBlock<Block> GLAXX_BLOCK_0 = registerBlock(
    "glaxx_block_0",
    () -> new XGlass("glaxx_block_0")
  );

  public static final DeferredBlock<Block> GLAXX_BLOCK_1 = registerBlock(
    "glaxx_block_1",
    () -> new XGlass("glaxx_block_1")
  );
  public static final DeferredBlock<Block> GLAXX_BLOCK_2 = registerBlock(
    "glaxx_block_2",
    () -> new XGlass("glaxx_block_2")
  );
  public static final DeferredBlock<Block> GLAXX_BLOCK_3 = registerBlock(
    "glaxx_block_3",
    () -> new XGlass("glaxx_block_3")
  );
  public static final DeferredBlock<Block> GLAXX_BLOCK_4 = registerBlock(
    "glaxx_block_4",
    () -> new XGlass("glaxx_block_4")
  );
  public static final DeferredBlock<Block> GLAXX_BLOCK_5 = registerBlock(
    "glaxx_block_5",
    () -> new XGlass("glaxx_block_5")
  );
  public static final DeferredBlock<Block> GLAXX_BLOCK_6 = registerBlock(
    "glaxx_block_6",
    () -> new XGlass("glaxx_block_6")
  );

  public static final DeferredBlock<Block> GLAXX_BLOCK_7 = registerBlock(
    "glaxx_block_7",
    () -> new XGlass("glaxx_block_7")
  );
  public static final DeferredBlock<Block> GLAXX_BLOCK_8 = registerBlock(
    "glaxx_block_8",
    () -> new XGlass("glaxx_block_8")
  );
  public static final DeferredBlock<Block> GLAXX_BLOCK_9 = registerBlock(
    "glaxx_block_9",
    () -> new XGlass("glaxx_block_9")
  );
  public static final DeferredBlock<Block> GLAXX_BLOCK_10 = registerBlock(
    "glaxx_block_10",
    () -> new XGlass("glaxx_block_10")
  );
  public static final DeferredBlock<Block> GLAXX_BLOCK_11 = registerBlock(
    "glaxx_block_11",
    () -> new XGlass("glaxx_block_11")
  );
  public static final DeferredBlock<Block> GLAXX_BLOCK_12 = registerBlock(
    "glaxx_block_12",
    () -> new XGlass("glaxx_block_12")
  );
  public static final DeferredBlock<Block> GLAXX_BLOCK_13 = registerBlock(
    "glaxx_block_13",
    () -> new XGlass("glaxx_block_13")
  );
  public static final DeferredBlock<Block> GLAXX_BLOCK_14 = registerBlock(
    "glaxx_block_14",
    () -> new XGlass("glaxx_block_14")
  );
  public static final DeferredBlock<Block> GLAXX_BLOCK_15 = registerBlock(
    "glaxx_block_15",
    () -> new XGlass("glaxx_block_15")
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
