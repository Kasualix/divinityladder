package net.uuz.divinityladder.Registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.uuz.divinityladder.Divinityladder;
import net.uuz.divinityladder.block.BaseBlock;

public class BlockRegistry {
    private static final BlockBehaviour.Properties properties_Stone = BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops();
    private static final BlockBehaviour.Properties properties_Metal = BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops();

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Divinityladder.MOD_ID);

    public static final RegistryObject<Block> CITRINE_BLOCK = BLOCKS.register("citrine_block", () -> new BaseBlock(properties_Metal.strength(9)));
    public static final RegistryObject<Block> CITRINE_ORE = BLOCKS.register("citrine_ore", () -> new BaseBlock(properties_Metal.strength(3)));
    public static final RegistryObject<Block> DEEPSLATE_CITRINE_ORE = BLOCKS.register("deepslate_citrine_ore", () -> new BaseBlock(properties_Stone.strength(4)));
    public static final RegistryObject<Block> OSIRIS_BLOCK = BLOCKS.register("osiris_block", () -> new BaseBlock(properties_Metal.strength(9)));
    public static final RegistryObject<Block> FAINT_BLOCK = BLOCKS.register("faint_block", () -> new BaseBlock(properties_Metal.strength(9)));
    public static final RegistryObject<Block> FAINT_ORE = BLOCKS.register("faint_ore", () -> new BaseBlock(properties_Stone.strength(3)));
    public static final RegistryObject<Block> DEEPSLATE_FAINT_ORE = BLOCKS.register("deepslate_faint_ore", () -> new BaseBlock(properties_Stone.strength(4)));
    public static final RegistryObject<Block> PRASIOLITE_BLOCK = BLOCKS.register("prasiolite_block", () -> new BaseBlock(properties_Metal.strength(9)));
    public static final RegistryObject<Block> PRASIOLITE_ORE = BLOCKS.register("prasiolite_ore", () -> new BaseBlock(properties_Stone.strength(3)));
    public static final RegistryObject<Block> DEEPSLATE_PRASIOLITE_ORE = BLOCKS.register("deepslate_prasiolite_ore", () -> new BaseBlock(properties_Stone.strength(4)));
    public static final RegistryObject<Block> DIOPSIDE_BLOCK = BLOCKS.register("diopside_block", () -> new BaseBlock(properties_Metal.strength(9)));
    public static final RegistryObject<Block> DIOPSIDE_ORE = BLOCKS.register("diopside_ore", () -> new BaseBlock(properties_Stone.strength(3)));
    public static final RegistryObject<Block> DEEPSLATE_DIOPSIDE_ORE = BLOCKS.register("deepslate_diopside_ore", () -> new BaseBlock(properties_Stone.strength(4)));
    public static final RegistryObject<Block> SALT_ORE = BLOCKS.register("salt_ore", () -> new BaseBlock(properties_Stone.strength(3)));
    public static final RegistryObject<Block> DEEPSLATE_SALT_ORE = BLOCKS.register("deepslate_salt_ore", () -> new BaseBlock(properties_Stone.strength(4)));
}
