package net.uuz.divinityladder.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.uuz.divinityladder.Divinityladder;
import net.uuz.divinityladder.Registry.ItemRegistry;

public class BaseBlock extends Block {
    public BaseBlock(Properties p_49795_) {
        super(p_49795_);
        registerBlockItem();
    }

    public void registerBlockItem() {
        BlockItem blockItem = new BlockItem(this, new Item.Properties().tab(Divinityladder.DIVINITYLADDER_TAB));
        ItemRegistry.BLOCK_ITEMS.add(blockItem);
    }
}
