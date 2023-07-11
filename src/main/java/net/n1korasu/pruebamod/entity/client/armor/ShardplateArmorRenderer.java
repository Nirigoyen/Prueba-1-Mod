package net.n1korasu.pruebamod.entity.client.armor;

import net.n1korasu.pruebamod.item.custom.ShardplateArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ShardplateArmorRenderer extends GeoArmorRenderer<ShardplateArmorItem> {


    public ShardplateArmorRenderer() {
        super(new ShardplateArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorLeftArm";
        this.leftArmBone = "armorRightArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";

    }
}
