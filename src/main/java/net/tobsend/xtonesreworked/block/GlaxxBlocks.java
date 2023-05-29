package net.tobsend.xtonesreworked.block;


import java.util.function.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.block.custom.XGlassBlock;
import net.tobsend.xtonesreworked.item.ModCreativeModeTab;
import net.tobsend.xtonesreworked.item.ModItems;

public class GlaxxBlocks {

  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
    ForgeRegistries.BLOCKS,
    XtonesReworkedMod.MOD_ID
  );

  public static final RegistryObject<Block> GLAXX_BLOCK_0 = registerBlock(
    "glaxx_block_0", XGlassBlock::new
  );

  public static final RegistryObject<Block> GLAXX_BLOCK_1 = registerBlock(
    "glaxx_block_1", XGlassBlock::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_2 = registerBlock(
    "glaxx_block_2", XGlassBlock::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_3 = registerBlock(
    "glaxx_block_3", XGlassBlock::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_4 = registerBlock(
    "glaxx_block_4", XGlassBlock::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_5 = registerBlock(
    "glaxx_block_5", XGlassBlock::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_6 = registerBlock(
    "glaxx_block_6", XGlassBlock::new
  );

  public static final RegistryObject<Block> GLAXX_BLOCK_7 = registerBlock(
    "glaxx_block_7", XGlassBlock::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_8 = registerBlock(
    "glaxx_block_8", XGlassBlock::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_9 = registerBlock(
    "glaxx_block_9", XGlassBlock::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_10 = registerBlock(
    "glaxx_block_10", XGlassBlock::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_11 = registerBlock(
    "glaxx_block_11", XGlassBlock::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_12 = registerBlock(
    "glaxx_block_12", XGlassBlock::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_13 = registerBlock(
    "glaxx_block_13", XGlassBlock::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_14 = registerBlock(
    "glaxx_block_14", XGlassBlock::new
  );
  public static final RegistryObject<Block> GLAXX_BLOCK_15 = registerBlock(
    "glaxx_block_15", XGlassBlock::new
    
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
