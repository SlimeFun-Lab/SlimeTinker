package io.github.sefiraat.slimetinker.utils;

import org.bukkit.inventory.ItemStack;

public class Utils {
    public static ItemStack withAmount(ItemStack base, int amount) {
        if (base == null) return null;
        ItemStack copy = base.clone();
        copy.setAmount(amount);
        return copy;
    }
}
