package net.tobsend.xtonesreworked.block;

import com.google.common.base.Supplier;

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
import net.tobsend.xtonesreworked.block.custom.FlatLamp;
import net.tobsend.xtonesreworked.item.ModCreativeModeTab;
import net.tobsend.xtonesreworked.item.ModItems;

public class ModBlocks {

  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
    ForgeRegistries.BLOCKS,
    XtonesReworkedMod.MOD_ID
  );

  public static final RegistryObject<Block> XTONE_TILE = registerBlock(
    "xtone_tile",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(3f)
          .requiresCorrectToolForDrops()
      )
  );

  public static final RegistryObject<Block> FLAT_LAMP = registerBlock(
    "flat_lamp",
    () ->
      new FlatLamp(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(3f)
          .requiresCorrectToolForDrops()
          .lightLevel(state -> state.getValue(FlatLamp.LIT) ? 15 : 0)
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
