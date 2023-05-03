package net.uuz.divinityladder.enchantment;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.uuz.divinityladder.Registry.EnchantmentRegistry;

@Mod.EventBusSubscriber
public class MoonEnchantment extends AttributeEnchantment{
    public MoonEnchantment(String name, Rarity rarity, EnchantmentCategory category, EquipmentSlot[] equipmentSlots) {
        super(name, rarity, category, equipmentSlots);
    }

    @Override
    Attribute getAttribute() {
        return Attributes.ATTACK_DAMAGE;
    }

    @SubscribeEvent
    public void onTickPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        int enchantmentLevel = EnchantmentHelper.getEnchantmentLevel(EnchantmentRegistry.MOON, player);
        if (enchantmentLevel > 0 && Minecraft.getInstance().level != null){
            boolean day = Minecraft.getInstance().level.isDay();
            if(!day){
                AttributeInstance attribute = player.getAttribute(Attributes.ATTACK_DAMAGE);
                double value = attribute.getValue() * 0.1;
                onTickPlayerTick(event, (AttributeEnchantment) EnchantmentRegistry.MOON, value, AttributeModifier.Operation.MULTIPLY_TOTAL);

            }
        }
    }
}
