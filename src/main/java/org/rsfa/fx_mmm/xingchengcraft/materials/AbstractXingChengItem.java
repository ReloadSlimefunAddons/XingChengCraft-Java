package org.rsfa.fx_mmm.xingchengcraft.materials;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.XingChengCraft;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCGroups;

public abstract class AbstractXingChengItem extends SlimefunItem {
    public AbstractXingChengItem(SlimefunItemStack item, ItemStack[] recipe) {
        this(item, RecipeType.NULL, recipe);
    }

    public AbstractXingChengItem(SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        this(XCGroups.MATERIALS_GROUP, item, recipeType, recipe);
    }

    public AbstractXingChengItem(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);

        super.register(XingChengCraft.instance);
    }
}
