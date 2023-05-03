package net.uuz.divinityladder.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.uuz.divinityladder.Registry.EnchantmentRegistry;

import java.util.UUID;

@Mod.EventBusSubscriber
public class FranticEnchantment extends AttributeEnchantment {
    public FranticEnchantment(String name, Rarity rarity, EnchantmentCategory category, EquipmentSlot[] equipmentSlots) {
        super(name, rarity, category, equipmentSlots);
    }

    @Override
    Attribute getAttribute() {
        return Attributes.ATTACK_DAMAGE;
    }

    @SubscribeEvent
    public static void onTickPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        float health = player.getHealth();
        float maxHealth = player.getMaxHealth();
        float healthPercentage = 1 - health / maxHealth;
        UUID uuid1 = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
        AttributeInstance attribute = player.getAttribute(Attributes.ATTACK_DAMAGE);
        if (attribute == null) return;
        AttributeModifier modifier = attribute.getModifier(uuid1);
        if (modifier == null) return;
        if (healthPercentage != 0){
            double amount = modifier.getAmount();
            float magnification = 0.05f;
            float value = (float) (healthPercentage * 10 * magnification * amount);
            onTickPlayerTick(event, (AttributeEnchantment) EnchantmentRegistry.FRANTIC, value, AttributeModifier.Operation.MULTIPLY_TOTAL);
        }
    }
}
