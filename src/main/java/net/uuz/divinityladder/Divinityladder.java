package net.uuz.divinityladder;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.uuz.divinityladder.Registry.BlockRegistry;
import net.uuz.divinityladder.Registry.EffectRegistry;
import net.uuz.divinityladder.Registry.EnchantmentRegistry;
import net.uuz.divinityladder.Registry.ItemRegistry;
import net.uuz.divinityladder.network.DivinityladderPacketHandler;
import org.jetbrains.annotations.NotNull;

@Mod(Divinityladder.MOD_ID)
public class Divinityladder {

    public static final String MOD_ID = "divinityladder";

    public static final CreativeModeTab DIVINITYLADDER_TAB = new CreativeModeTab("divinityladder_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return ItemRegistry.CORN.get().getDefaultInstance();
        }
    };

    public Divinityladder() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);
        BlockRegistry.BLOCKS.register(eventBus);
        EffectRegistry.MOB_EFFECTS.register(eventBus);
        EnchantmentRegistry.ENCHANTMENTS.register(eventBus);
        ItemRegistry.registerBlockItems();
        ItemRegistry.ITEMS.register(eventBus);
    }

    private void setup(final FMLCommonSetupEvent event) {
        DivinityladderPacketHandler.init();
    }

    public static ResourceLocation asResource(String path)
    {
        return new ResourceLocation(MOD_ID, path);
    }
}
