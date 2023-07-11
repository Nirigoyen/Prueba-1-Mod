package net.n1korasu.pruebamod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.n1korasu.pruebamod.PruebaMod;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.n1korasu.pruebamod.entity.client.armor.ShardplateArmorRenderer;
import net.n1korasu.pruebamod.item.custom.ShardplateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = PruebaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {


    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(ShardplateArmorItem.class, new ShardplateArmorRenderer());
    }
}
