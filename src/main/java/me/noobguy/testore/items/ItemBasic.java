package me.noobguy.testore.items;

import net.minecraft.item.Item;

public class ItemBasic extends Item {

    public ItemBasic(String name) {
        setTranslationKey(name);
        setRegistryName(name);
    }
}
