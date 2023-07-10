package net.n1korasu.pruebamod.item;


import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.n1korasu.pruebamod.PruebaMod;
import net.n1korasu.pruebamod.item.custom.Oathbringer;
import net.n1korasu.pruebamod.item.custom.Tiers;

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

    //ESPADAS
    public static final RegistryObject<SwordItem> SWORD2 = ITEMS.register("sword", () -> new Oathbringer(net.n1korasu.pruebamod.item.custom.Tiers.Esquirlada,0,-3.8f, new Item.Properties().tab(ModCreativeModeTab.PRUEBA_TAB)));


    //ARMADURA
    public static final RegistryObject<Item> SHARD_HELMET = ITEMS.register("shardHelmet", () -> new ArmorItem(ModArmorMaterials.ESQUIRLADA, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.PRUEBA_TAB)));
    public static final RegistryObject<Item> SHARD_CHEST = ITEMS.register("shardChest", () -> new ArmorItem(ModArmorMaterials.ESQUIRLADA, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.PRUEBA_TAB)));
    public static final RegistryObject<Item> SHARD_LEGGINGS = ITEMS.register("shardLeggings", () -> new ArmorItem(ModArmorMaterials.ESQUIRLADA, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.PRUEBA_TAB)));
    public static final RegistryObject<Item> SHARD_BOOTS = ITEMS.register("shardBoots", () -> new ArmorItem(ModArmorMaterials.ESQUIRLADA, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.PRUEBA_TAB)));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
