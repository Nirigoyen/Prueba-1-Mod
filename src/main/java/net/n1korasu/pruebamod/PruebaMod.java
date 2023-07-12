package net.n1korasu.pruebamod;

import com.mojang.logging.LogUtils;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkEvent;
import net.n1korasu.pruebamod.block.ModBlocks;
import net.n1korasu.pruebamod.item.ModItems;
import net.n1korasu.pruebamod.item.custom.Oathbringer;
import net.n1korasu.pruebamod.networking.ModMessages;
import org.slf4j.Logger;

import java.util.function.Supplier;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PruebaMod.MOD_ID)
public class PruebaMod {
    public static final String MOD_ID = "pruebamod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public PruebaMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);


        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

        ModMessages.register();
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }

//    public boolean handle (Supplier<NetworkEvent.Context> supplier){
//        NetworkEvent.Context context = supplier.get();
//
//        ServerPlayer player = context.getSender();
//
//        assert player != null;
//        player.getMainHandItem().getClass().equals(Oathbringer.class);
//
//        return true;
//    }


}
