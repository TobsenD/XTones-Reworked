package net.tobsend.xtonesreworked.item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tobsend.xtonesreworked.XtonesReworkedMod;

public class ModItems {

  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(XtonesReworkedMod.MODID);

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }
}
