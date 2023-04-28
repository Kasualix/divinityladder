package net.uuz.divinityladder.Registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.uuz.divinityladder.item.BaseFood;
import net.uuz.divinityladder.item.BaseItem;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemRegistry {
    public static List<BlockItem> BLOCK_ITEMS = new ArrayList<>();

    public static BaseItem CITRINE,LITTLE_CITRINE,OSIRIS_INGOT,FAINT,LITTLE_FAINT,PRASIOLITE,LITTLE_PRASIOLITE,DIOPSIDE,LITTLE_DIOPSIDE,RICE,SALT;

    public static BaseItem ENDER_DRAGON_EYES;
    public static  BaseFood ORANGE,LEMON,PEAR,PEACH,BLUEBERRY,CORN,CUCUMBER,EGGPLANT,SOYBEAN,SWEET_POT,TOMATO,LETTUCE,PICKLE,HAMBURGER;
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        Item.Properties properties = new Item.Properties();
        //食物
        event.getRegistry().registerAll(
                ORANGE = new BaseFood("orange", BaseFood.ORANGE),
                LEMON = new BaseFood("lemon", BaseFood.LEMON),
                PEACH = new BaseFood("peach", BaseFood.PEACH),
                PEAR = new BaseFood("pear", BaseFood.PEAR),
                BLUEBERRY = new BaseFood("blueberry", BaseFood.BLUEBERRY),
                CORN = new BaseFood("corn", BaseFood.CORN),
                CUCUMBER = new BaseFood("cucumber", BaseFood.CUCUMBER),
                EGGPLANT = new BaseFood("eggplant", BaseFood.EGGPLANT),
                SOYBEAN = new BaseFood("soybean", BaseFood.SOYBEAN),
                SWEET_POT = new BaseFood("sweet_pot", BaseFood.SWEET_POTATO),
                TOMATO = new BaseFood("tomato", BaseFood.TOMATO),
                LETTUCE = new BaseFood("lettuce", BaseFood.LETTUCE),
                PICKLE = new BaseFood("pickle", BaseFood.PICKLE),
                HAMBURGER = new BaseFood("hamburger", BaseFood.HAMBURGER)
        );
        //方块物品
        event.getRegistry().registerAll(
                BLOCK_ITEMS.toArray(new BlockItem[0])
        );
        //材料
        event.getRegistry().registerAll(

                CITRINE = new BaseItem("citrine",properties),
                LITTLE_CITRINE = new BaseItem("little_citrine",properties),
                OSIRIS_INGOT = new BaseItem("osiris_ingot",properties),
                FAINT = new BaseItem("faint",properties),
                LITTLE_FAINT = new BaseItem("little_faint",properties),
                PRASIOLITE = new BaseItem("prasiolite",properties),
                LITTLE_PRASIOLITE = new BaseItem("little_prasiolite",properties),
                DIOPSIDE = new BaseItem("diopside",properties),
                LITTLE_DIOPSIDE = new BaseItem("little_diopside",properties),
                RICE = new BaseItem("rice",properties),
                SALT = new BaseItem("salt",properties)
        );
        //饰品
        event.getRegistry().registerAll(
                ENDER_DRAGON_EYES = new BaseItem("ender_dragon_eyes",properties)
        );
    }
}
