package org.rsfa.fx_mmm.xingchengcraft.materials;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCGroups;

public abstract class AbstractXingChengItemNotPlaceable extends UnplaceableBlock implements NotPlaceable {
    public AbstractXingChengItemNotPlaceable(SlimefunItemStack item, ItemStack[] recipe) {
        this(item, RecipeType.NULL, recipe);
    }

    public AbstractXingChengItemNotPlaceable(SlimefunItemStack item, RecipeType type, ItemStack[] recipe) {
        this(XCGroups.MATERIALS_GROUP, item, type, recipe);
    }

    public AbstractXingChengItemNotPlaceable(ItemGroup group, SlimefunItemStack item, ItemStack[] recipe) {
        this(group, item, RecipeType.NULL, recipe);
    }

    public AbstractXingChengItemNotPlaceable(ItemGroup group, SlimefunItemStack item, RecipeType type, ItemStack[] recipe) {
        super(group, item, type, recipe);
    }
}
