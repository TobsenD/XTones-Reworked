package net.tobsend.xtonesreworked.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.tobsend.xtonesreworked.block.ModBlocks;

public class ModCreativeModeTab {

  public static final ItemGroup XTONE_REWORK_TAB = new ItemGroup("xtonestab")
  {
    @Override
    public ItemStack makeIcon() {
      return new ItemStack(ModBlocks.XTONE_TILE.get());
    }

//    @Override
//    public ItemStack m_6976_() {
//      return new ItemStack(ModBlocks.XTONE_TILE.get());
//    }
  };
}
