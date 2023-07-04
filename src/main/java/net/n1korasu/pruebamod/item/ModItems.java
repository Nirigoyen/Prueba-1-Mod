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


    //GEMAS
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRUEBA_TAB)));
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRUEBA_TAB)));
    public static final RegistryObject<Item> GARNET = ITEMS.register("garnet", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRUEBA_TAB)));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRUEBA_TAB)));
    public static final RegistryObject<Item> SMOKESTONE = ITEMS.register("smokestone", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRUEBA_TAB)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRUEBA_TAB)));
    public static final RegistryObject<Item> HELIODOR = ITEMS.register("heliodor", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRUEBA_TAB)));


    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
