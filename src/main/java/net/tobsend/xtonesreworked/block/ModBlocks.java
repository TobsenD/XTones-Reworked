package net.tobsend.xtonesreworked.block;

import com.google.common.base.Supplier;

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
import net.tobsend.xtonesreworked.block.custom.FlatLamp;
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
        BlockBehaviour.Properties
          .of(Material.STONE)
          .strength(3f)
          .requiresCorrectToolForDrops()
      )
  );

  public static final RegistryObject<Block> FLAT_LAMP = registerBlock(
    "flat_lamp",
    () ->
      new FlatLamp(
        BlockBehaviour.Properties
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
      () -> new BlockItem(block.get(), new Item.Properties())
    );
  }

  public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
    
  }
}
