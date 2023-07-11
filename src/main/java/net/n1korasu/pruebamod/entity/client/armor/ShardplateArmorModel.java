package net.n1korasu.pruebamod.entity.client.armor;

import net.minecraft.resources.ResourceLocation;
import net.n1korasu.pruebamod.PruebaMod;
import net.n1korasu.pruebamod.item.custom.ShardplateArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ShardplateArmorModel extends AnimatedGeoModel<ShardplateArmorItem> {
    @Override
    public ResourceLocation getModelResource(ShardplateArmorItem object) {
        return new ResourceLocation(PruebaMod.MOD_ID, "geo/shardplate_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ShardplateArmorItem object) {
        return new ResourceLocation(PruebaMod.MOD_ID, "textures/models/armor/shardplate_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ShardplateArmorItem animatable) {
        return new ResourceLocation(PruebaMod.MOD_ID, "animations/armor_animation.json");
    }
}
