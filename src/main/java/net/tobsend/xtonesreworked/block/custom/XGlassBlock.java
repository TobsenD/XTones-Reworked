package net.tobsend.xtonesreworked.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class XGlassBlock extends GlassBlock {
    public XGlassBlock() {
        super(AbstractBlock.Properties
                .of(Material.GLASS)
                .strength(1f)
                .sound(SoundType.GLASS)
                .noOcclusion());
    }

    @Override
    public boolean propagatesSkylightDown(BlockState p_200123_1_, IBlockReader p_200123_2_, BlockPos p_200123_3_) {
        return true;
    }
}
