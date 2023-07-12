package net.n1korasu.pruebamod.networking;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;
import net.n1korasu.pruebamod.PruebaMod;
import net.n1korasu.pruebamod.networking.packet.SummonSwordC2SPacket;

public class ModMessages {

    private static SimpleChannel INSTANCE;

    private  static int packetId = 0;

    private static int id(){
        return packetId++;
    }

    public static void register(){
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(PruebaMod.MOD_ID, "messages"))
                .networkProtocolVersion(() -> "1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();

        INSTANCE = net;
        net.messageBuilder(SummonSwordC2SPacket.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(SummonSwordC2SPacket::new)
                .encoder(SummonSwordC2SPacket::toBytes)
                .consumerMainThread(SummonSwordC2SPacket::handle)
                .add();
    }

    public static <MSG> void sendToServer(MSG message){
        INSTANCE.sendToServer(message);
    }

    public static <MSG> void sendToPlayer(MSG message, ServerPlayer player){
        INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), message);
    }
}
