package net.uuz.divinityladder.capability;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.network.PacketDistributor;
import net.uuz.divinityladder.Registry.CapabilityRegistry;
import net.uuz.divinityladder.network.DivinityladderPacketHandler;
import net.uuz.divinityladder.network.message.PlayerShieldSyncMessage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Shield implements IShield, ICapabilitySerializable<CompoundTag>, ICapabilityProvider {
    private int maxShield = 4;
    private int shield = 4;

    @Override
    public int getMaxShield() {
        return maxShield;
    }

    @Override
    public void setMaxShield(int maxShield) {
        this.maxShield = maxShield;
    }

    @Override
    public int getShield() {
        return shield;
    }

    @Override
    public void setShield(int shield) {
        this.shield = shield;
    }

    @Override
    public float receiveShield(Player player,float maxReceive) {
        float receive = Math.min(maxReceive, maxShield - shield);
        shield += receive;
        updateShieldData(player);
        return receive;
    }

    @Override
    public float extractShield(Player player,float maxExtract) {
        float extract = Math.min(maxExtract, shield);
        shield -= extract;
        updateShieldData(player);
        return extract;
    }


    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        return CapabilityRegistry.SHIELD.orEmpty(cap, LazyOptional.of(() -> this));
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag compoundTag = new CompoundTag();
        compoundTag.putInt("maxShield", maxShield);
        compoundTag.putInt("shield", shield);
        return compoundTag;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        maxShield = nbt.getInt("maxShield");
        shield = nbt.getInt("shield");
    }

    public void updateShieldData(Player player)
    {
        DivinityladderPacketHandler.INSTANCE.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) player), new PlayerShieldSyncMessage(shield, maxShield));
    }
}
