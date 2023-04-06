package net.uuz.divinityladder.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.uuz.divinityladder.DivinityLadder;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DivinityLadder.MOD_ID);

    public static final RegistryObject<SoundEvent> DOWSING_ROD_FOUND_ORE =
            registerSoundEvent("dowsing_rod_found_ore");

    public static RegistryObject<SoundEvent> BAR_BRAWL = registerSoundEvent("bar_brawl");


    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
       return  SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(DivinityLadder.MOD_ID, name))) ;
    }

    public static  void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
