package io.github.sefiraat.networks.utils;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;

import javax.annotation.Nullable;

public class EnchantmentUtils {

    private EnchantmentUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Gets an enchantment by its key name in a version-safe manner.
     *
     * @param key The enchantment key (e.g., "power", "luck_of_the_sea")
     * @return The Enchantment, or null if not found
     */
    @Nullable
    public static Enchantment getEnchantment(String key) {
        return Enchantment.getByKey(NamespacedKey.minecraft(key.toLowerCase()));
    }
}
