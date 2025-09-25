package net.tobsend.xtonesreworked.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class XBlock extends Block {

    private static final Logger log = LogManager.getLogger(XBlock.class);

    public XBlock(MapColor color) {
        super(
            BlockBehaviour.Properties
            .of()
            .strength(6f)
            .requiresCorrectToolForDrops()
            .mapColor(color));

    }
        
}
