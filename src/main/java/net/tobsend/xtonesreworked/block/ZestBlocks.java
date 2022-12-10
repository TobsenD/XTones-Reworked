package net.tobsend.xtonesreworked.block;


import java.util.function.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.item.ModItems;

public class ZestBlocks {

  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
    ForgeRegistries.BLOCKS,
    XtonesReworkedMod.MOD_ID
  );

  public static final RegistryObject<Block> ZEST_BLOCK_0 = registerBlock(
    "zest_block_0",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );

  public static final RegistryObject<Block> ZEST_BLOCK_1 = registerBlock(
    "zest_block_1",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZEST_BLOCK_2 = registerBlock(
    "zest_block_2",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZEST_BLOCK_3 = registerBlock(
    "zest_block_3",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZEST_BLOCK_4 = registerBlock(
    "zest_block_4",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZEST_BLOCK_5 = registerBlock(
    "zest_block_5",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZEST_BLOCK_6 = registerBlock(
    "zest_block_6",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );

  public static final RegistryObject<Block> ZEST_BLOCK_7 = registerBlock(
    "zest_block_7",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZEST_BLOCK_8 = registerBlock(
    "zest_block_8",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZEST_BLOCK_9 = registerBlock(
    "zest_block_9",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZEST_BLOCK_10 = registerBlock(
    "zest_block_10",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZEST_BLOCK_11 = registerBlock(
    "zest_block_11",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZEST_BLOCK_12 = registerBlock(
    "zest_block_12",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZEST_BLOCK_13 = registerBlock(
    "zest_block_13",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZEST_BLOCK_14 = registerBlock(
    "zest_block_14",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZEST_BLOCK_15 = registerBlock(
    "zest_block_15",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
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
