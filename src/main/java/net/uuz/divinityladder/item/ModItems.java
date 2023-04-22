package net.uuz.divinityladder.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.uuz.divinityladder.DivinityLadder;
import net.uuz.divinityladder.block.ModBlocks;
import net.uuz.divinityladder.item.custom.LevitationSwordItem;
import net.uuz.divinityladder.sound.ModSounds;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DivinityLadder.MOD_ID);

    //矿物
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB)));

    public static final RegistryObject<Item> LITTLE_CITRINE = ITEMS.register("little_citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB)));

    public static final RegistryObject<Item> OSIRIS_INGOT = ITEMS.register("osiris_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB)));

    public static final RegistryObject<Item> FAINT = ITEMS.register("faint",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB)));

    public static final RegistryObject<Item> LITTLE_FAINT = ITEMS.register("little_faint",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB)));

    public static final RegistryObject<Item> PRASIOLITE = ITEMS.register("prasiolite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB)));

    public static final RegistryObject<Item> LITTLE_PRASIOLITE = ITEMS.register("little_prasiolite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB)));

    public static final RegistryObject<Item> DIOPSIDE = ITEMS.register("diopside",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB)));

    public static final RegistryObject<Item> LITTLE_DIOPSIDE = ITEMS.register("little_diopside",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB)));

    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB)));

    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB)));




    //饰品
    public static final RegistryObject<Item> ENDER_DRAGON_EYES = ITEMS.register("ender_dragon_eyes",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB)));

    //武器工具
    public static final RegistryObject<Item> OSIRIS_SWORD = ITEMS.register("osiris_sword",
            () -> new LevitationSwordItem(ModTiers.OSIRIS_INGOT,17,-1f,
                    new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB3)));

    public static final RegistryObject<Item> VALHALLA_SWORD = ITEMS.register("valhalla_sword",
            () -> new LevitationSwordItem(ModTiers.OSIRIS_INGOT,24,-2.5f,
                    new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB3)));

    public static final RegistryObject<Item> FAINT_SWORD = ITEMS.register("faint_sword",
            () -> new SwordItem(ModTiers.FAINT,7,-2f,
                    new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB3)));

    public static final RegistryObject<Item> FAINT_PICKAXE = ITEMS.register("faint_pickaxe",
            () -> new PickaxeItem(ModTiers.FAINT,2,-2f,
                    new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB3)));

    public static final RegistryObject<Item> FAINT_SHOVEL = ITEMS.register("faint_shovel",
            () -> new ShovelItem(ModTiers.FAINT,2,-2f,
                    new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB3)));

    public static final RegistryObject<Item> FAINT_AXE = ITEMS.register("faint_axe",
            () -> new AxeItem(ModTiers.FAINT,9,-3f,
                    new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB3)));

    public static final RegistryObject<Item> FAINT_HOE = ITEMS.register("faint_hoe",
            () -> new HoeItem(ModTiers.FAINT,2,-2f,
                    new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB3)));

    //开发者物品
    public static final RegistryObject<Item> GOLD_TUSK = ITEMS.register("gold_tusk",
            () -> new SwordItem(ModTiers.FAINT,54,76f,
                    new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB4)));

    public static final RegistryObject<Item> THE_OTHER_HALF = ITEMS.register("the_other_half",
            () -> new SwordItem(ModTiers.FAINT,54,36f,
                    new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB4)));

    public static final RegistryObject<Item> GALAXY_SWORD = ITEMS.register("galaxy_sword",
            () -> new SwordItem(ModTiers.OSIRIS_INGOT,194,4f,
                    new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB5)));

    public static final RegistryObject<Item> GALAXY_AXE = ITEMS.register("galaxy_axe",
            () -> new AxeItem(ModTiers.OSIRIS_INGOT,194,4f,
                    new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB5)));


    public static final RegistryObject<Item> GALAXY_HELMET = ITEMS.register("galaxy_helmet",
            () -> new ArmorItem(ModArmorMaterials.OSIRIS_INGOT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB5)));

    //食物
    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB6).food(ModFoods.ORANGE)));

    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB6).food(ModFoods.LEMON)));

    public static final RegistryObject<Item> PEAR = ITEMS.register("pear",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB6).food(ModFoods.PEAR)));

    public static final RegistryObject<Item> PEACH = ITEMS.register("peach",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB6).food(ModFoods.PEACH)));

    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_BUSH.get(),
                    (new Item.Properties()).tab(ModCreativeModeTab.DIVINITYLADDER_TAB6).food(ModFoods.BLUEBERRY)));

    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB6).food(ModFoods.CORN)));

    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB6).food(ModFoods.CUCUMBER)));

    public static final RegistryObject<Item> EGGPLANT = ITEMS.register("eggplant",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB6).food(ModFoods.EGGPLANT)));

    public static final RegistryObject<Item> SOYBEAN = ITEMS.register("soybean",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB6).food(ModFoods.SOYBEAN)));

    public static final RegistryObject<Item> SWEET_POTATO = ITEMS.register("sweet_potato",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB6).food(ModFoods.SWEET_POTATO)));

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB6).food(ModFoods.TOMATO)));

    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB6).food(ModFoods.LETTUCE)));

    public static final RegistryObject<Item> PICKLE = ITEMS.register("pickle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB6).food(ModFoods.PICKLE)));

    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB6).food(ModFoods.HAMBURGER)));

    //作物
    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_seeds",
            () -> new ItemNameBlockItem(ModBlocks.RICE.get(),
                   new Item.Properties().tab(ModCreativeModeTab.DIVINITYLADDER_TAB)));


    public static void register(IEventBus eventBus) {
      ITEMS.register(eventBus);
  }
}
