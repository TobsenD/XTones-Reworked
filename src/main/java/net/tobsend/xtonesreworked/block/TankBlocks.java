package net.tobsend.xtonesreworked.block;

import java.util.function.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.item.ModItems;

public class TankBlocks {

  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
    ForgeRegistries.BLOCKS,
    XtonesReworkedMod.MODID
  );

  public static final RegistryObject<Block> TANK_BLOCK_0 = registerBlock(
    "tank_block_0",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );

  public static final RegistryObject<Block> TANK_BLOCK_1 = registerBlock(
    "tank_block_1",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> TANK_BLOCK_2 = registerBlock(
    "tank_block_2",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> TANK_BLOCK_3 = registerBlock(
    "tank_block_3",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> TANK_BLOCK_4 = registerBlock(
    "tank_block_4",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> TANK_BLOCK_5 = registerBlock(
    "tank_block_5",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> TANK_BLOCK_6 = registerBlock(
    "tank_block_6",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );

  public static final RegistryObject<Block> TANK_BLOCK_7 = registerBlock(
    "tank_block_7",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> TANK_BLOCK_8 = registerBlock(
    "tank_block_8",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> TANK_BLOCK_9 = registerBlock(
    "tank_block_9",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> TANK_BLOCK_10 = registerBlock(
    "tank_block_10",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> TANK_BLOCK_11 = registerBlock(
    "tank_block_11",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> TANK_BLOCK_12 = registerBlock(
    "tank_block_12",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> TANK_BLOCK_13 = registerBlock(
    "tank_block_13",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> TANK_BLOCK_14 = registerBlock(
    "tank_block_14",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> TANK_BLOCK_15 = registerBlock(
    "tank_block_15",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of()
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
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
