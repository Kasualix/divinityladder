package net.uuz.divinityladder.capability;

import net.minecraft.world.entity.player.Player;

public interface IShield {
    float receiveShield(Player player,float maxReceive);
    float extractShield(Player player,float maxExtract);

    int getShield();
    int getMaxShield();
    void setShield(int shield);
    void setMaxShield(int maxShield);
}