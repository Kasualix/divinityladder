package net.uuz.divinityladder.enchantment;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.uuz.divinityladder.Divinityladder;

import java.util.UUID;

public abstract class AttributeEnchantment extends BaseEnchantment {
    static UUID uuid = UUID.randomUUID();

    public AttributeEnchantment(String name, Rarity rarity, EnchantmentCategory category, EquipmentSlot[] equipmentSlots) {
        super(name, rarity, category, equipmentSlots);
    }

    static UUID getUUID() {
        return uuid;
    }

    public static void onTickPlayerTick(TickEvent.PlayerTickEvent event, AttributeEnchantment enchantment, double value, AttributeModifier.Operation operation) {
        Player player = event.player;
        Attribute(player, enchantment, value, operation);

    }

    private static void Attribute(Player player, AttributeEnchantment enchantment, double value, AttributeModifier.Operation operation) {
        int enchantmentLevel = EnchantmentHelper.getEnchantmentLevel(enchantment, player);
        AttributeInstance instance = player.getAttributes().getInstance(enchantment.getAttribute());
        AttributeModifier modifier = null;
        if (instance != null) {
            modifier = instance.getModifier(getUUID());
        }
        removeAttribute(instance, modifier);
        addAttribute(enchantment, value, operation, enchantmentLevel, instance);
    }

    private static void removeAttribute(AttributeInstance instance, AttributeModifier modifier) {
        if (modifier != null) {
            instance.removeModifier(modifier);
        }
    }

    private static void addAttribute(AttributeEnchantment enchantment, double value, AttributeModifier.Operation operation, int enchantmentLevel, AttributeInstance instance) {
        ResourceLocation enchantmentResourceLocation = ForgeRegistries.ENCHANTMENTS.getKey(enchantment);
        if (enchantmentLevel > 0 && enchantmentResourceLocation != null) {
            AttributeModifier attributeModifier = new AttributeModifier(getUUID(), Divinityladder.MOD_ID + enchantmentResourceLocation.getPath(), value, operation);
            instance.addTransientModifier(attributeModifier);
        }
    }

    abstract Attribute getAttribute();
}
