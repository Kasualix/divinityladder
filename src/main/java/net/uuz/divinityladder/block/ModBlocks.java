package net.uuz.divinityladder.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.uuz.divinityladder.DivinityLadder;
import net.uuz.divinityladder.block.custom.RiceBlock;
import net.uuz.divinityladder.item.ModCreativeModeTab;
import net.uuz.divinityladder.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DivinityLadder.MOD_ID);

    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()),ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()),ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> OSIRIS_BLOCK = registerBlock("osiris_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()),ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> FAINT_BLOCK = registerBlock("faint_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()),ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> FAINT_ORE = registerBlock("faint_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()),ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> DEEPSLATE_FAINT_ORE = registerBlock("deepslate_faint_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()),ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> PRASIOLITE_BLOCK = registerBlock("prasiolite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()),ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> PRASIOLITE_ORE = registerBlock("prasiolite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()),ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> DEEPSLATE_PRASIOLITE_ORE = registerBlock("deepslate_prasiolite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()),ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> DIOPSIDE_BLOCK = registerBlock("diopside_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()),ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> DIOPSIDE_ORE = registerBlock("diopside_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()),ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> DEEPSLATE_DIOPSIDE_ORE = registerBlock("deepslate_diopside_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()),ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> SALT_ORE = registerBlock("salt_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()),ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> DEEPSLATE_SALT_ORE = registerBlock("deepslate_salt_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()),ModCreativeModeTab.DIVINITYLADDER_TAB2);

    public static final RegistryObject<Block> RICE = registerBlockWithoutBlockItem("rice",
            () -> new RiceBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> BLUEBERRY_BUSH = registerBlockWithoutBlockItem("blueberry_bush",
            () -> new RiceBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));


    private  static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private  static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn,tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return ModItems.ITEMS.register(name,() -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));

}
    public  static  void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
