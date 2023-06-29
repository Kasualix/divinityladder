package net.uuz.divinityladder.Registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.uuz.divinityladder.Divinityladder;
import net.uuz.divinityladder.item.BaseFood;
import net.uuz.divinityladder.item.BaseItem;

import java.util.ArrayList;
import java.util.List;

public class ItemRegistry {
    public static List<BlockItem> BLOCK_ITEMS = new ArrayList<>();

    //I don't really know what I'm writing
    public static void registerBlockItems() {
        for (BlockItem blockItem : BLOCK_ITEMS) {
            ResourceLocation blockItemResourceLocation = ForgeRegistries.BLOCKS.getKey(blockItem.getBlock());
            if (blockItemResourceLocation == null) continue;
            ITEMS.register(blockItemResourceLocation.getPath(), () -> new BlockItem(blockItem.getBlock(), new Item.Properties().tab(Divinityladder.DIVINITYLADDER_TAB)));
        }
    }

    private static final Item.Properties properties = new Item.Properties();

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Divinityladder.MOD_ID);

    public static final RegistryObject<Item> ENDER_DRAGON_EYES = ITEMS.register("ender_dragon_eyes", () -> new BaseItem("ender_dragon_eyes", properties));

    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange", () -> new BaseFood("orange", BaseFood.ORANGE));
    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon", () -> new BaseFood("lemon", BaseFood.LEMON));
    public static final RegistryObject<Item> PEAR = ITEMS.register("pear", () -> new BaseFood("pear", BaseFood.PEAR));
    public static final RegistryObject<Item> PEACH = ITEMS.register("peach", () -> new BaseFood("peach", BaseFood.PEACH));
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry", () -> new BaseFood("blueberry", BaseFood.BLUEBERRY));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn", () ->  new BaseFood("corn", BaseFood.CORN));
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber", () -> new BaseFood("cucumber", BaseFood.CUCUMBER));
    public static final RegistryObject<Item> EGGPLANT = ITEMS.register("eggplant", () -> new BaseFood("eggplant", BaseFood.EGGPLANT));
    public static final RegistryObject<Item> SOYBEAN = ITEMS.register("soybean", () -> new BaseFood("soybean", BaseFood.SOYBEAN));
    public static final RegistryObject<Item> SWEET_POT = ITEMS.register("sweet_pot", () -> new BaseFood("sweet_pot", BaseFood.SWEET_POTATO));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new BaseFood("tomato", BaseFood.TOMATO));
    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce", () -> new BaseFood("lettuce", BaseFood.LETTUCE));
    public static final RegistryObject<Item> PICKLE = ITEMS.register("pickle", () -> new BaseFood("pickle", BaseFood.PICKLE));
    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger", () -> new BaseFood("hamburger", BaseFood.HAMBURGER));

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", () -> new BaseItem("citrine",properties));
    public static final RegistryObject<Item> LITTLE_CITRINE = ITEMS.register("little_citrine", () -> new BaseItem("little_citrine",properties));
    public static final RegistryObject<Item> OSIRIS_INGOT = ITEMS.register("osiris_ingot", () -> new BaseItem("osiris_ingot",properties));
    public static final RegistryObject<Item> FAINT = ITEMS.register("faint", () -> new BaseItem("faint",properties));
    public static final RegistryObject<Item> LITTLE_FAINT = ITEMS.register("little_faint", () -> new BaseItem("little_faint",properties));
    public static final RegistryObject<Item> PRASIOLITE = ITEMS.register("prasiolite", () -> new BaseItem("prasiolite",properties));
    public static final RegistryObject<Item> LITTLE_PRASIOLITE = ITEMS.register("little_prasiolite", () -> new BaseItem("little_prasiolite",properties));
    public static final RegistryObject<Item> DIOPSIDE = ITEMS.register("diopside", () -> new BaseItem("diopside",properties));
    public static final RegistryObject<Item> LITTLE_DIOPSIDE = ITEMS.register("little_diopside", () -> new BaseItem("little_diopside",properties));
    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new BaseItem("rice",properties));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt", () -> new BaseItem("salt",properties));
}
