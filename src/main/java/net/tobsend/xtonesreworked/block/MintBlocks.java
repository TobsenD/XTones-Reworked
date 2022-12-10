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

public class MintBlocks {

  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
    ForgeRegistries.BLOCKS,
    XtonesReworkedMod.MOD_ID
  );

  public static final RegistryObject<Block> MINT_BLOCK_0 = registerBlock(
    "mint_block_0",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );

  public static final RegistryObject<Block> MINT_BLOCK_1 = registerBlock(
    "mint_block_1",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> MINT_BLOCK_2 = registerBlock(
    "mint_block_2",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> MINT_BLOCK_3 = registerBlock(
    "mint_block_3",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> MINT_BLOCK_4 = registerBlock(
    "mint_block_4",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> MINT_BLOCK_5 = registerBlock(
    "mint_block_5",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> MINT_BLOCK_6 = registerBlock(
    "mint_block_6",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );

  public static final RegistryObject<Block> MINT_BLOCK_7 = registerBlock(
    "mint_block_7",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> MINT_BLOCK_8 = registerBlock(
    "mint_block_8",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> MINT_BLOCK_9 = registerBlock(
    "mint_block_9",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> MINT_BLOCK_10 = registerBlock(
    "mint_block_10",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> MINT_BLOCK_11 = registerBlock(
    "mint_block_11",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> MINT_BLOCK_12 = registerBlock(
    "mint_block_12",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> MINT_BLOCK_13 = registerBlock(
    "mint_block_13",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> MINT_BLOCK_14 = registerBlock(
    "mint_block_14",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> MINT_BLOCK_15 = registerBlock(
    "mint_block_15",
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
