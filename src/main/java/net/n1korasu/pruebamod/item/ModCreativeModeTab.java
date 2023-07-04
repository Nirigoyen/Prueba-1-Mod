package net.n1korasu.pruebamod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PRUEBA_TAB = new CreativeModeTab("tabprueba") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHIP.get());
        }
    };
}
