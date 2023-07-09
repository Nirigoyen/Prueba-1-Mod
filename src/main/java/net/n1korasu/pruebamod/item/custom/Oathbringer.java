package net.n1korasu.pruebamod.item.custom;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class Oathbringer extends SwordItem {
    public Oathbringer(Tier tier, int dmg, float spd, Properties prop) {
        super(tier, dmg, spd, prop);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        target.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 200), attacker);
        target.addEffect(new MobEffectInstance(MobEffects.WITHER, 200), attacker);

        return super.hurtEnemy(stack, target, attacker);
    }
}
