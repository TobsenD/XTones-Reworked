package net.tobsend.xtonesreworked.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.tobsend.xtonesreworked.block.ModBlocks;

public class ModCreativeModeTab {

  public static final CreativeModeTab XTONE_REWORK_TAB = new CreativeModeTab(
    "xtonestab"
  ) {
    @Override
    public ItemStack makeIcon() {
      return new ItemStack(ModBlocks.XTONE_TILE.get());
    }
  };
}
