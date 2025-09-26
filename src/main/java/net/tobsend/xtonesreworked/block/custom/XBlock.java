package net.tobsend.xtonesreworked.block.custom;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class XBlock extends Block {

    private static final Logger log = LogManager.getLogger(XBlock.class);

    public XBlock(String name, MapColor color) {
        super(
            BlockBehaviour.Properties
            .of()
            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(XtonesReworkedMod.MODID, name)))
            .strength(6f)
            .requiresCorrectToolForDrops()
            .mapColor(color));

    }
        
}
