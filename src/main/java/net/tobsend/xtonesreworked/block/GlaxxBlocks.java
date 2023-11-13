package net.tobsend.xtonesreworked.block;

import java.util.function.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.ForgeRegistries;
import net.neoforged.neoforge.registries.RegistryObject;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.block.custom.XGlass;
import net.tobsend.xtonesreworked.item.ModItems;

public class GlaxxBlocks {

  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
    ForgeRegistries.BLOCKS,
    XtonesReworkedMod.MODID
  );

  public static final RegistryObject<Block> GLAXX_BLOCK_0 = registerBlock(
    "glaxx_block_0",
    XGlass::new
  );

  public static final RegistryObject<Block> GLAXX_BLOCK_1 = registerBlock(
    "glaxx_block_1",
    XGlass::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_2 = registerBlock(
    "glaxx_block_2",
    XGlass::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_3 = registerBlock(
    "glaxx_block_3",
    XGlass::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_4 = registerBlock(
    "glaxx_block_4",
    XGlass::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_5 = registerBlock(
    "glaxx_block_5",
    XGlass::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_6 = registerBlock(
    "glaxx_block_6",
    XGlass::new
  );

  public static final RegistryObject<Block> GLAXX_BLOCK_7 = registerBlock(
    "glaxx_block_7",
    XGlass::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_8 = registerBlock(
    "glaxx_block_8",
    XGlass::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_9 = registerBlock(
    "glaxx_block_9",
    XGlass::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_10 = registerBlock(
    "glaxx_block_10",
    XGlass::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_11 = registerBlock(
    "glaxx_block_11",
    XGlass::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_12 = registerBlock(
    "glaxx_block_12",
    XGlass::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_13 = registerBlock(
    "glaxx_block_13",
    XGlass::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_14 = registerBlock(
    "glaxx_block_14",
    XGlass::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_15 = registerBlock(
    "glaxx_block_15",
    XGlass::new
  );

  private static <T extends Block> RegistryObject<T> registerBlock(
    String name,
    Supplier<T> block
  ) {
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn);
    return toReturn;
  }

  private static <T extends Block> RegistryObject<Item> registerBlockItem(
    String name,
    RegistryObject<T> block
  ) {
    return ModItems.ITEMS.register(
      name,
      () -> new BlockItem(block.get(), new Item.Properties())
    );
  }

  public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
  }
}
