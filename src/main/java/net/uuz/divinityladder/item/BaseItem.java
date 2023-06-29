package net.uuz.divinityladder.item;

import net.minecraft.world.item.Item;
import net.uuz.divinityladder.Divinityladder;

public class BaseItem extends Item {
    public BaseItem(String name, Properties properties) {
        super(properties.tab(Divinityladder.DIVINITYLADDER_TAB));
    }
}
