package net.tobsend.xtonesreworked.block.custom;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TransparentBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class XGlass extends TransparentBlock{

    public XGlass() {
        super(
            BlockBehaviour.Properties
            .of()
            .strength(0.3f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.GLASS)
            .noOcclusion()
            );
    }
    
}
