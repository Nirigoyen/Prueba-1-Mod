package net.n1korasu.pruebamod.event;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.n1korasu.pruebamod.PruebaMod;
import net.n1korasu.pruebamod.networking.ModMessages;
import net.n1korasu.pruebamod.networking.packet.SummonSwordC2SPacket;
import net.n1korasu.pruebamod.util.Keybinding;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = PruebaMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents{

        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event){
            if (Keybinding.SUMMON_SHARDBLADE.consumeClick()){
                ModMessages.sendToServer(new SummonSwordC2SPacket());
            }
        }
    }
    @Mod.EventBusSubscriber(modid = PruebaMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents{
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event){
            event.register(Keybinding.SUMMON_SHARDBLADE);
        }
    }
}
