package org.rsfa.fx_mmm.xingchengcraft.materials;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.SlimefunObjects;

public class XCIngot extends SlimefunItem {
    public XCIngot(SlimefunItemStack item, ItemStack[] recipe) {
        super(SlimefunObjects.MATERIALS_GROUP, item, RecipeType.ANCIENT_ALTAR, new ItemStack[]{

        });
    }
}
