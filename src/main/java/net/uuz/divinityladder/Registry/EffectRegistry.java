package net.uuz.divinityladder.Registry;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.uuz.divinityladder.Divinityladder;
import net.uuz.divinityladder.effect.BaseEffect;

public class EffectRegistry {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Divinityladder.MOD_ID);

    public static final RegistryObject<MobEffect> BROKEN = MOB_EFFECTS.register("broken", () -> new BaseEffect(MobEffectCategory.BENEFICIAL, 0x00FF00));

}
