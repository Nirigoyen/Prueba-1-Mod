package net.n1korasu.pruebamod.networking.packet;

import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.Tags;
import net.minecraftforge.network.NetworkEvent;
import net.n1korasu.pruebamod.event.ModEvents;
import net.n1korasu.pruebamod.item.ModCreativeModeTab;
import net.n1korasu.pruebamod.item.ModItems;
import net.n1korasu.pruebamod.item.custom.Oathbringer;

import java.util.function.Supplier;

public class SummonSwordC2SPacket {

    public SummonSwordC2SPacket(){

    }

    public SummonSwordC2SPacket(FriendlyByteBuf buf){

    }

    public void toBytes (FriendlyByteBuf buf){

    }

    public boolean handle (Supplier<NetworkEvent.Context> supplier){
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() ->{

            ServerPlayer player = context.getSender();
            ServerLevel level = player.getLevel();

            //CHECKEAR QUE EL PLAYER TENGA LA MANO VACIA


            if (player.getMainHandItem().isEmpty()){
                summon(player);

                //player.getInventory().add(new ItemStack(Items.STICK));

                player.getInventory().add(new ItemStack(ModItems.OATHBRINGER.get()));

//                player.addItem(new ItemStack(Items.STICK)); //ME DA EL ITEM PERO NO EN FORMATO DE ESPADA, SOLAMENTE COMO UN ITEM CUALQUIERA




            }


        });
        return true;
    }

    public void summon(ServerPlayer player){
        player.sendSystemMessage(Component.literal("10 heartbeats..."));
        for (int i = 9; i > 0; i-- ){
            Minecraft.getInstance().player.sendSystemMessage(Component.literal(i + "..."));
        }
    }

}
