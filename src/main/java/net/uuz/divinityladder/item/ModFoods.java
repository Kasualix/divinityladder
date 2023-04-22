package net.uuz.divinityladder.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ORANGE = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).build();
    public static final FoodProperties LEMON = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.1F).
            effect(new MobEffectInstance(MobEffects.HUNGER, 100, 0), 0.2F).build();
    public static final FoodProperties PEAR = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).build();
    public static final FoodProperties PEACH = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).build();
    public static final FoodProperties BLUEBERRY = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.1F).build();
    public static final FoodProperties CORN = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).build();
    public static final FoodProperties CUCUMBER = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).build();
    public static final FoodProperties EGGPLANT = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties SOYBEAN = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.1F).
            effect(new MobEffectInstance(MobEffects.CONFUSION, 120, 0), 0.2F).
            effect(new MobEffectInstance(MobEffects.POISON, 120, 0), 0.2F).build();
    public static final FoodProperties SWEET_POTATO = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).build();
    public static final FoodProperties TOMATO = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties LETTUCE = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).build();
    public static final FoodProperties PICKLE = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).
            effect(new MobEffectInstance(MobEffects.HUNGER, 60, 0), 0.5F).build();
    public static final FoodProperties HAMBURGER = (new FoodProperties.Builder()).nutrition(16).saturationMod(1.5F).
            effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 1.0F).
            effect(new MobEffectInstance(MobEffects.REGENERATION, 140, 0), 1.0F).
            effect(new MobEffectInstance(MobEffects.SATURATION, 400, 0), 1.0F).build();
}
