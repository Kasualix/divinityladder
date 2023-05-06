package net.uuz.divinityladder.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.uuz.divinityladder.Divinityladder;

public class BaseEffect extends MobEffect {
    public BaseEffect(String name ,MobEffectCategory p_19451_, int p_19452_) {
        super(p_19451_, p_19452_);
        this.setRegistryName(Divinityladder.MOD_ID,name);
    }
}
