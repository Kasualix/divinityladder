package net.uuz.divinityladder.painting;

import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.uuz.divinityladder.DivinityLadder;

public class ModPaintings {
    public static final DeferredRegister<Motive> PAINTING_MOVTIES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, DivinityLadder.MOD_ID);

    public static final RegistryObject<Motive> UNDEAD_DRAGON =
            PAINTING_MOVTIES.register("undead_dragon", () -> new Motive(32,32));

    public static final RegistryObject<Motive> CUSTOM_PAINTING1 =
            PAINTING_MOVTIES.register("custom_painting1", () -> new Motive(16,16));

    public static final RegistryObject<Motive> CUSTOM_PAINTING2 =
            PAINTING_MOVTIES.register("custom_painting2", () -> new Motive(16,16));

    public static final RegistryObject<Motive> CUSTOM_PAINTING3 =
            PAINTING_MOVTIES.register("custom_painting3", () -> new Motive(16,16));

    public static final RegistryObject<Motive> CUSTOM_PAINTING4 =
            PAINTING_MOVTIES.register("custom_painting4", () -> new Motive(16,16));

    public static final RegistryObject<Motive> CUSTOM_PAINTING5 =
            PAINTING_MOVTIES.register("custom_painting5", () -> new Motive(32,32));

    public static final RegistryObject<Motive> CUSTOM_PAINTING6 =
            PAINTING_MOVTIES.register("custom_painting6", () -> new Motive(16,16));

    public static final RegistryObject<Motive> YUN =
            PAINTING_MOVTIES.register("yun", () -> new Motive(64,64));

    public static final RegistryObject<Motive> UUZ =
            PAINTING_MOVTIES.register("uuz", () -> new Motive(32,32));

    public static void register(IEventBus eventBus){
        PAINTING_MOVTIES.register(eventBus);
    }
}
