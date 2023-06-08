package net.tobsend.xtonesreworked.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class XBlock extends Block {

    public XBlock() {
        super(
            BlockBehaviour.Properties
            .of()
            .strength(6f)
            .requiresCorrectToolForDrops());
    }
        
}
