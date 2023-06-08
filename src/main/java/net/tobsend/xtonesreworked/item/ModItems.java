package net.tobsend.xtonesreworked.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tobsend.xtonesreworked.XtonesReworkedMod;

public class ModItems {

  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
    ForgeRegistries.ITEMS,
    XtonesReworkedMod.MODID
  );

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }
}
