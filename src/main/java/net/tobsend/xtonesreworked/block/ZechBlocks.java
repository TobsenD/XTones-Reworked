package net.tobsend.xtonesreworked.block;


import java.util.function.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.item.ModCreativeModeTab;
import net.tobsend.xtonesreworked.item.ModItems;

public class ZechBlocks {

  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
    ForgeRegistries.BLOCKS,
    XtonesReworkedMod.MOD_ID
  );

  public static final RegistryObject<Block> ZECH_BLOCK_0 = registerBlock(
    "zech_block_0",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );

  public static final RegistryObject<Block> ZECH_BLOCK_1 = registerBlock(
    "zech_block_1",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZECH_BLOCK_2 = registerBlock(
    "zech_block_2",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZECH_BLOCK_3 = registerBlock(
    "zech_block_3",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZECH_BLOCK_4 = registerBlock(
    "zech_block_4",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZECH_BLOCK_5 = registerBlock(
    "zech_block_5",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZECH_BLOCK_6 = registerBlock(
    "zech_block_6",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );

  public static final RegistryObject<Block> ZECH_BLOCK_7 = registerBlock(
    "zech_block_7",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZECH_BLOCK_8 = registerBlock(
    "zech_block_8",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZECH_BLOCK_9 = registerBlock(
    "zech_block_9",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZECH_BLOCK_10 = registerBlock(
    "zech_block_10",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZECH_BLOCK_11 = registerBlock(
    "zech_block_11",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZECH_BLOCK_12 = registerBlock(
    "zech_block_12",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZECH_BLOCK_13 = registerBlock(
    "zech_block_13",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZECH_BLOCK_14 = registerBlock(
    "zech_block_14",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZECH_BLOCK_15 = registerBlock(
    "zech_block_15",
    () ->
      new Block(
        AbstractBlock.Properties
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
      () -> new BlockItem(block.get(), new Item.Properties().tab(ModCreativeModeTab.XTONE_REWORK_TAB))
    );
  }

  public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
  }

}
