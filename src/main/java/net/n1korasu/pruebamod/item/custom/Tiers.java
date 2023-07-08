package net.n1korasu.pruebamod.item.custom;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class Tiers {
    public static final Tier Esquirlada = new ForgeTier(0, -1, -3, 20, 0, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.EMPTY);

}
