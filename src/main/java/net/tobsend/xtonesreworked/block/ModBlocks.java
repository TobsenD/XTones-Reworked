package net.tobsend.xtonesreworked.block;

import com.google.common.base.Supplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.block.custom.FlatLamp;
import net.tobsend.xtonesreworked.item.ModItems;

public class ModBlocks {

  private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
    XtonesReworkedMod.MODID
  );

  public static final DeferredBlock<Block> XTONE_TILE = registerBlock(
    "xtone_tile",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(3f)
          .requiresCorrectToolForDrops()
      )
  );

  public static final DeferredBlock<Block> FLAT_LAMP = registerBlock(
    "flat_lamp",
    () ->
      new FlatLamp(
        BlockBehaviour.Properties
          .of()
          .strength(3f)
          .requiresCorrectToolForDrops()
          .lightLevel(state -> state.getValue(FlatLamp.LIT) ? 15 : 0)
          .sound(SoundType.LANTERN)
      )
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
