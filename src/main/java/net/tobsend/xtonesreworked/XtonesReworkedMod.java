package net.tobsend.xtonesreworked;

import java.util.ArrayList;
import java.util.Collection;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
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
import net.tobsend.xtonesreworked.block.MystBlocks;
import net.tobsend.xtonesreworked.block.RedsBlocks;
import net.tobsend.xtonesreworked.block.ReedBlocks;
import net.tobsend.xtonesreworked.block.RoenBlocks;
import net.tobsend.xtonesreworked.block.SolsBlocks;
import net.tobsend.xtonesreworked.block.SyncBlocks;
import net.tobsend.xtonesreworked.block.TankBlocks;
import net.tobsend.xtonesreworked.block.VectBlocks;
import net.tobsend.xtonesreworked.block.VenaBlocks;
import net.tobsend.xtonesreworked.block.ZaneBlocks;
import net.tobsend.xtonesreworked.block.ZechBlocks;
import net.tobsend.xtonesreworked.block.ZestBlocks;
import net.tobsend.xtonesreworked.block.ZetaBlocks;
import net.tobsend.xtonesreworked.block.ZionBlocks;
import net.tobsend.xtonesreworked.block.ZkulBlocks;
import net.tobsend.xtonesreworked.block.ZoeaBlocks;
import net.tobsend.xtonesreworked.block.ZomeBlocks;
import net.tobsend.xtonesreworked.block.ZoneBlocks;
import net.tobsend.xtonesreworked.block.ZorgBlocks;
import net.tobsend.xtonesreworked.block.ZtylBlocks;
import net.tobsend.xtonesreworked.block.ZythBlocks;
import net.tobsend.xtonesreworked.item.ModItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(XtonesReworkedMod.MODID)
public class XtonesReworkedMod {

  public static final String MODID = "xtonesreworked";
  private static final Logger LOGGER = LogUtils.getLogger();

  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(MODID);
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(MODID);
  public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

  public XtonesReworkedMod(IEventBus modEventBus, ModContainer modContainer) {
    LOGGER.info("SETUP Xtones Reworked");
    modEventBus.addListener(this::commonSetup);


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
    MystBlocks.register(modEventBus);
    RedsBlocks.register(modEventBus);
    ReedBlocks.register(modEventBus);
    RoenBlocks.register(modEventBus);
    SolsBlocks.register(modEventBus);
    SyncBlocks.register(modEventBus);
    TankBlocks.register(modEventBus);
    VectBlocks.register(modEventBus);
    VenaBlocks.register(modEventBus);
    ZaneBlocks.register(modEventBus);
    ZechBlocks.register(modEventBus);
    ZestBlocks.register(modEventBus);
    ZetaBlocks.register(modEventBus);
    ZionBlocks.register(modEventBus);
    ZkulBlocks.register(modEventBus);
    ZoeaBlocks.register(modEventBus);
    ZomeBlocks.register(modEventBus);
    ZoneBlocks.register(modEventBus);
    ZorgBlocks.register(modEventBus);
    ZtylBlocks.register(modEventBus);
    ZythBlocks.register(modEventBus);

    CREATIVE_MODE_TABS.register(modEventBus);

    NeoForge.EVENT_BUS.register(this);
  }

  public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREACTIVE_TAB = CREATIVE_MODE_TABS.register(
    "xtonestab",
    () ->
      CreativeModeTab
        .builder()
        .withTabsBefore(CreativeModeTabs.COMBAT)
        .icon(() -> new ItemStack(ModBlocks.XTONE_TILE.get()))
        .displayItems((parameters, output) -> {
          output.acceptAll(buildCreativeTabList()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
        })
        .title(Component.translatable("itemGroup.xtonesreworked"))
        .build()
  );

  private void commonSetup(final FMLCommonSetupEvent event) {}

  private static final Collection<ItemStack> buildCreativeTabList() {
    Collection<ItemStack> tabEntries = new ArrayList<ItemStack>();
    ModItems.ITEMS
      .getEntries()
      .forEach(item -> tabEntries.add(new ItemStack(item.get())));
    return tabEntries;
  }

  // You can use EventBusSubscriber to automatically register all static methods
  // in the class annotated with @SubscribeEvent
  @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
  public static class ClientModEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {}
  }

  // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {}


}
