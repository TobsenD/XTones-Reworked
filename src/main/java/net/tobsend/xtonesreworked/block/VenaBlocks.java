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

public class VenaBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
    XtonesReworkedMod.MODID
  );

  public static final DeferredBlock<Block> VENA_BLOCK_0 = registerBlock(
    "vena_block_0",
    () -> new XBlock("vena_block_0",MapColor.COLOR_CYAN)
  );

  public static final DeferredBlock<Block> VENA_BLOCK_1 = registerBlock(
    "vena_block_1",
    () -> new XBlock("vena_block_1",MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> VENA_BLOCK_2 = registerBlock(
    "vena_block_2",
    () -> new XBlock("vena_block_2",MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> VENA_BLOCK_3 = registerBlock(
    "vena_block_3",
    () -> new XBlock("vena_block_3",MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> VENA_BLOCK_4 = registerBlock(
    "vena_block_4",
    () -> new XBlock("vena_block_4",MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> VENA_BLOCK_5 = registerBlock(
    "vena_block_5",
    () -> new XBlock("vena_block_5",MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> VENA_BLOCK_6 = registerBlock(
    "vena_block_6",
    () -> new XBlock("vena_block_6",MapColor.COLOR_CYAN)
  );

  public static final DeferredBlock<Block> VENA_BLOCK_7 = registerBlock(
    "vena_block_7",
    () -> new XBlock("vena_block_7",MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> VENA_BLOCK_8 = registerBlock(
    "vena_block_8",
    () -> new XBlock("vena_block_8",MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> VENA_BLOCK_9 = registerBlock(
    "vena_block_9",
    () -> new XBlock("vena_block_9",MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> VENA_BLOCK_10 = registerBlock(
    "vena_block_10",
    () -> new XBlock("vena_block_10",MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> VENA_BLOCK_11 = registerBlock(
    "vena_block_11",
    () -> new XBlock("vena_block_11",MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> VENA_BLOCK_12 = registerBlock(
    "vena_block_12",
    () -> new XBlock("vena_block_12",MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> VENA_BLOCK_13 = registerBlock(
    "vena_block_13",
    () -> new XBlock("vena_block_13",MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> VENA_BLOCK_14 = registerBlock(
    "vena_block_14",
    () -> new XBlock("vena_block_14",MapColor.COLOR_CYAN)
  );
  public static final DeferredBlock<Block> VENA_BLOCK_15 = registerBlock(
    "vena_block_15",
    () -> new XBlock("vena_block_15",MapColor.COLOR_CYAN)
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
