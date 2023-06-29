package net.uuz.divinityladder.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.uuz.divinityladder.Registry.EnchantmentRegistry;


@Mod.EventBusSubscriber
public class LifeTreeEnchantment extends AttributeEnchantment {
    public LifeTreeEnchantment(String name, Rarity rarity, EnchantmentCategory category, EquipmentSlot[] equipmentSlots) {
        super(name, rarity, category, equipmentSlots);
    }

    @SubscribeEvent
    public static void onTickPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        int enchantmentLevel = EnchantmentHelper.getEnchantmentLevel(EnchantmentRegistry.LIFE_TREE.get(), player);
        if (player.getHealth() > player.getMaxHealth()) {
            player.setHealth(player.getMaxHealth());
        }
        double value = player.getMaxHealth() * 0.1 * enchantmentLevel;
        onTickPlayerTick(event, (AttributeEnchantment) EnchantmentRegistry.LIFE_TREE.get(), value, AttributeModifier.Operation.ADDITION);
    }

    @Override
    Attribute getAttribute() {
        return Attributes.MAX_HEALTH;
    }

    @Override
    public int getMaxLevel() {
        return 4;
    }

    public int getMinCost(int p_45092_) {
        return 15 + (p_45092_ - 1) * 9;
    }

    public int getMaxCost(int p_45096_) {
        return super.getMinCost(p_45096_) + 50;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return stack.getItem() instanceof ArmorItem;
    }
}
