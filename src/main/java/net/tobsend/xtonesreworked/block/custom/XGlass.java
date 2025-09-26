package net.tobsend.xtonesreworked.block.custom;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TransparentBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.tobsend.xtonesreworked.XtonesReworkedMod;

public class XGlass extends TransparentBlock{

    public XGlass(String name) {
        super(
            BlockBehaviour.Properties
            .of()
            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(XtonesReworkedMod.MODID, name)))
            .strength(0.3f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.GLASS)
            .noOcclusion()
            );
    }
    
}
