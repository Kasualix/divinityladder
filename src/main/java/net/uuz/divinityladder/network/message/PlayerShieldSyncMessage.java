package net.uuz.divinityladder.network.message;

import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.network.NetworkEvent;
import net.uuz.divinityladder.Registry.CapabilityRegistry;

import java.util.function.Supplier;

public class PlayerShieldSyncMessage {
    public int shield;
    public int maxShield;

    public PlayerShieldSyncMessage(int shield, int maxShield) {
        this.shield = shield;
        this.maxShield = maxShield;
    }

    public static void encode(PlayerShieldSyncMessage message, FriendlyByteBuf buffer)
    {
        buffer.writeInt(message.shield);
        buffer.writeInt(message.maxShield);
    }

    public static PlayerShieldSyncMessage decode(FriendlyByteBuf buffer)
    {
        return new PlayerShieldSyncMessage(buffer.readInt(), buffer.readInt());
    }

    public static void handle(PlayerShieldSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier)
    {
        NetworkEvent.Context context = contextSupplier.get();

        if (context.getDirection().getReceptionSide().isClient())
        {
            context.enqueueWork(() -> DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> ClientShieldSyncMessage.handlePacket(message, contextSupplier)));
        }

        context.setPacketHandled(true);
    }
}
@OnlyIn(Dist.CLIENT)
class ClientShieldSyncMessage
{
    public static void handlePacket(PlayerShieldSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
        Player player = Minecraft.getInstance().player;

        if (player != null) {
            player.getCapability(CapabilityRegistry.SHIELD).ifPresent(cap -> {
                cap.setShield(message.shield);
                cap.setMaxShield(message.maxShield);
            });
        }
    }
}
