package org.rsfa.fx_mmm.xingchengcraft.utils;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.SneakyThrows;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.profile.PlayerProfile;
import org.bukkit.profile.PlayerTextures;

import javax.annotation.Nullable;
import java.net.URL;
import java.util.List;

public class ItemStackCreator {
    private ItemStackCreator() {}

    @SneakyThrows
    public static ItemStack createSkullItem(String url) {
        ItemStack itemStack = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta meta = (SkullMeta) itemStack.getItemMeta();
        PlayerProfile profile = Bukkit.createPlayerProfile("fake");
        PlayerTextures textures = profile.getTextures();

        textures.setSkin(new URL(url));
        meta.setOwnerProfile(profile);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack createCustom(Material material, String name, @Nullable List<String> lore) {
        CustomItemStack itemStack = new CustomItemStack(material, name);
        if (lore != null) {
            ItemMeta meta = itemStack.getItemMeta();
            meta.setLore(lore);
            itemStack.setItemMeta(meta);
        }
        return itemStack;
    }
}
