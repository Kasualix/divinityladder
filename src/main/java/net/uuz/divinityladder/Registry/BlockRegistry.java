package net.uuz.divinityladder.Registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.uuz.divinityladder.block.BaseBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistry {
    public static BaseBlock CITRINE_BLOCK,CITRINE_ORE,DEEPSLATE_CITRINE_ORE,OSIRIS_BLOCK,FAINT_BLOCK,FAINT_ORE,DEEPSLATE_FAINT_ORE,PRASIOLITE_BLOCK,PRASIOLITE_ORE,
            DEEPSLATE_PRASIOLITE_ORE,DIOPSIDE_BLOCK,DIOPSIDE_ORE,DEEPSLATE_DIOPSIDE_ORE,SALT_ORE,DEEPSLATE_SALT_ORE;


    private static BlockBehaviour.Properties properties_Stone = BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops();
    private static BlockBehaviour.Properties properties_Metal = BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops();

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                CITRINE_BLOCK = new BaseBlock("citrine_block",properties_Metal.strength(9)),
                CITRINE_ORE = new BaseBlock("citrine_ore",properties_Stone.strength(3)),
                DEEPSLATE_CITRINE_ORE = new BaseBlock("deepslate_citrine_ore",properties_Stone.strength(4)),
                OSIRIS_BLOCK = new BaseBlock("osiris_block",properties_Metal.strength(9)),
                FAINT_BLOCK = new BaseBlock("faint_block",properties_Metal.strength(9)),
                FAINT_ORE = new BaseBlock("faint_ore",properties_Stone.strength(3)),
                DEEPSLATE_FAINT_ORE = new BaseBlock("deepslate_faint_ore",properties_Stone.strength(4)),
                PRASIOLITE_BLOCK = new BaseBlock("prasiolite_block",properties_Metal.strength(9)),
                PRASIOLITE_ORE = new BaseBlock("prasiolite_ore",properties_Stone.strength(3)),
                DEEPSLATE_PRASIOLITE_ORE = new BaseBlock("deepslate_prasiolite_ore",properties_Stone.strength(4)),
                DIOPSIDE_BLOCK = new BaseBlock("diopside_block",properties_Metal.strength(9)),
                DIOPSIDE_ORE = new BaseBlock("diopside_ore",properties_Stone.strength(3)),
                DEEPSLATE_DIOPSIDE_ORE = new BaseBlock("deepslate_diopside_ore",properties_Stone.strength(4)),
                SALT_ORE = new BaseBlock("salt_ore",properties_Stone.strength(3)),
                DEEPSLATE_SALT_ORE = new BaseBlock("deepslate_salt_ore",properties_Stone.strength(4))
        );
    }
}
