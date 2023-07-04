package net.n1korasu.pruebamod.item;


import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.n1korasu.pruebamod.PruebaMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PruebaMod.MOD_ID);

    public static final RegistryObject<Item> CHIP = ITEMS.register("chip", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRUEBA_TAB)));
    public static final RegistryObject<Item> CHIPGRANDE = ITEMS.register("chipgrande", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRUEBA_TAB)));



    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
