package net.tobsend.xtonesreworked.block;


import java.util.function.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.item.ModCreativeModeTab;
import net.tobsend.xtonesreworked.item.ModItems;

public class ZaneBlocks {

  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
    ForgeRegistries.BLOCKS,
    XtonesReworkedMod.MOD_ID
  );

  public static final RegistryObject<Block> ZANE_BLOCK_0 = registerBlock(
    "zane_block_0",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );

  public static final RegistryObject<Block> ZANE_BLOCK_1 = registerBlock(
    "zane_block_1",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );
  public static final RegistryObject<Block> ZANE_BLOCK_2 = registerBlock(
    "zane_block_2",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );
  public static final RegistryObject<Block> ZANE_BLOCK_3 = registerBlock(
    "zane_block_3",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );
  public static final RegistryObject<Block> ZANE_BLOCK_4 = registerBlock(
    "zane_block_4",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );
  public static final RegistryObject<Block> ZANE_BLOCK_5 = registerBlock(
    "zane_block_5",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );
  public static final RegistryObject<Block> ZANE_BLOCK_6 = registerBlock(
    "zane_block_6",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );

  public static final RegistryObject<Block> ZANE_BLOCK_7 = registerBlock(
    "zane_block_7",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );
  public static final RegistryObject<Block> ZANE_BLOCK_8 = registerBlock(
    "zane_block_8",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );
  public static final RegistryObject<Block> ZANE_BLOCK_9 = registerBlock(
    "zane_block_9",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );
  public static final RegistryObject<Block> ZANE_BLOCK_10 = registerBlock(
    "zane_block_10",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );
  public static final RegistryObject<Block> ZANE_BLOCK_11 = registerBlock(
    "zane_block_11",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );
  public static final RegistryObject<Block> ZANE_BLOCK_12 = registerBlock(
    "zane_block_12",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );
  public static final RegistryObject<Block> ZANE_BLOCK_13 = registerBlock(
    "zane_block_13",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );
  public static final RegistryObject<Block> ZANE_BLOCK_14 = registerBlock(
    "zane_block_14",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );
  public static final RegistryObject<Block> ZANE_BLOCK_15 = registerBlock(
    "zane_block_15",
    () ->
      new Block(
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      ),
    ModCreativeModeTab.XTONE_REWORK_TAB
  );

  private static <T extends Block> RegistryObject<T> registerBlock(
    String name,
    Supplier<T> block,
    CreativeModeTab tab
  ) {
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn, tab);
    return toReturn;
  }

  private static <T extends Block> RegistryObject<Item> registerBlockItem(
    String name,
    RegistryObject<T> block,
    CreativeModeTab tab
  ) {
    return ModItems.ITEMS.register(
      name,
      () -> new BlockItem(block.get(), new Item.Properties().tab(tab))
    );
  }

  public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
  }

}
