package net.n1korasu.pruebamod.event;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;
import net.n1korasu.pruebamod.PruebaMod;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = PruebaMod.MOD_ID)
    public static class ForgeEvents{
        public static void  onPlayerTick (TickEvent.PlayerTickEvent event){
            if (event.side == LogicalSide.SERVER){
                for (int i = 9; i > 0; i--){
                if(event.player.getRandom().nextFloat() < 0.005f)
                    Minecraft.getInstance().player.sendSystemMessage(Component.literal(i + "..."));
                }
            }
        }
    }

        //RIGHT CLICK EMPTY EVENT

}
