package net.uuz.divinityladder.network;

import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import net.uuz.divinityladder.Divinityladder;
import net.uuz.divinityladder.network.message.PlayerShieldSyncMessage;

public class DivinityladderPacketHandler {
    private static final String PROTOCOL_VERSION = "0.0.1";
    public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
            Divinityladder.asResource("main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );

    public static void init()
    {
        INSTANCE.registerMessage(0, PlayerShieldSyncMessage.class, PlayerShieldSyncMessage::encode, PlayerShieldSyncMessage::decode, PlayerShieldSyncMessage::handle);
    }
}
