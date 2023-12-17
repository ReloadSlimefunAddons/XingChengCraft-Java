package org.rsfa.fx_mmm.xingchengcraft.materials;

import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.materials.AbstractXingChengItemNotPlaceable;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCGroups;
import org.rsfa.fx_mmm.xingchengcraft.XingChengCraft;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCItemStacks;

import javax.annotation.Nonnull;

public class Stardust extends UnplaceableBlock implements GEOResource {
    public Stardust() {
        super(XCGroups.MATERIALS_GROUP, XCItemStacks.STARDUST, RecipeType.GEO_MINER, new ItemStack[]{});

        super.register(XingChengCraft.instance);
        register();
    }

    @Override
    public int getDefaultSupply(@Nonnull World.Environment environment, @Nonnull Biome biome) {
        return switch (environment) {
            case NORMAL, NETHER, CUSTOM -> 1;
            case THE_END -> 2;
        };
    }

    @Override
    public int getMaxDeviation() {
        return 1;
    }

    @Nonnull
    @Override
    public String getName() {
        return "&9星尘";
    }

    @Nonnull
    @Override
    public ItemStack getItem() {
        return new CustomItemStack(Material.GUNPOWDER, "&9星尘", "&o星际中的尘埃", "", "&3星辰工艺材料");
    }

    @Override
    public boolean isObtainableFromGEOMiner() {
        return true;
    }

    @Nonnull
    @Override
    public NamespacedKey getKey() {
        return new NamespacedKey(XingChengCraft.instance,"XC_Stardust");
    }
}
