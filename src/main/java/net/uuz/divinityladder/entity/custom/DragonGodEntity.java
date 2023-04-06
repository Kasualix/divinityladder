package net.uuz.divinityladder.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.level.Level;

public class DragonGodEntity extends EnderDragon {

    public DragonGodEntity(EntityType<? extends EnderDragon> entityType, Level level) {
        super(entityType, level);
    }
}
