package net.tobsend.xtonesreworked;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.tobsend.xtonesreworked.block.AgonBlocks;
import net.tobsend.xtonesreworked.block.AzurBlocks;
import net.tobsend.xtonesreworked.block.BittBlocks;
import net.tobsend.xtonesreworked.block.CrayBlocks;
import net.tobsend.xtonesreworked.block.FortBlocks;
import net.tobsend.xtonesreworked.block.GlaxxBlocks;
import net.tobsend.xtonesreworked.block.IszmBlocks;
import net.tobsend.xtonesreworked.block.JeltBlocks;
import net.tobsend.xtonesreworked.block.KorpBlocks;
import net.tobsend.xtonesreworked.block.KrypBlocks;
import net.tobsend.xtonesreworked.block.LairBlocks;
import net.tobsend.xtonesreworked.block.LaveBlocks;
import net.tobsend.xtonesreworked.block.MintBlocks;
import net.tobsend.xtonesreworked.block.ModBlocks;
import net.tobsend.xtonesreworked.block.RedsBlocks;
import net.tobsend.xtonesreworked.block.ReedBlocks;
import net.tobsend.xtonesreworked.block.RoenBlocks;
import net.tobsend.xtonesreworked.block.SolsBlocks;
import net.tobsend.xtonesreworked.block.SyncBlocks;
import net.tobsend.xtonesreworked.block.TankBlocks;
import net.tobsend.xtonesreworked.block.VectBlocks;
import net.tobsend.xtonesreworked.block.VenaBlocks;
import net.tobsend.xtonesreworked.block.ZtylBlocks;
import net.tobsend.xtonesreworked.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(XtonesReworkedMod.MOD_ID)
public class XtonesReworkedMod {

  public static final String MOD_ID = "xtonesreworked";
  private static final Logger LOGGER = LogUtils.getLogger();

  public XtonesReworkedMod() {
    LOGGER.info("SETUP Xtones Reworked");
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    ModItems.register(modEventBus);
    ModBlocks.register(modEventBus);
    AgonBlocks.register(modEventBus);
    AzurBlocks.register(modEventBus);
    BittBlocks.register(modEventBus);
    CrayBlocks.register(modEventBus);
    FortBlocks.register(modEventBus);
    GlaxxBlocks.register(modEventBus);
    IszmBlocks.register(modEventBus);
    JeltBlocks.register(modEventBus);
    KorpBlocks.register(modEventBus);
    KrypBlocks.register(modEventBus);
    LairBlocks.register(modEventBus);
    LaveBlocks.register(modEventBus);
    MintBlocks.register(modEventBus);
    RedsBlocks.register(modEventBus);
    ReedBlocks.register(modEventBus);
    RoenBlocks.register(modEventBus);
    SolsBlocks.register(modEventBus);
    SyncBlocks.register(modEventBus);
    TankBlocks.register(modEventBus);
    VectBlocks.register(modEventBus);
    VenaBlocks.register(modEventBus);
    ZtylBlocks.register(modEventBus);

    modEventBus.addListener(this::commonSetup);
    MinecraftForge.EVENT_BUS.register(this);
  }

  private void commonSetup(final FMLCommonSetupEvent event) {}

  // You can use EventBusSubscriber to automatically register all static methods
  // in the class annotated with @SubscribeEvent
  @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
  public static class ClientModEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {}
  }
}
