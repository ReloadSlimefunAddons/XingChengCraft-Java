package org.rsfa.fx_mmm.xingchengcraft.materials;

import io.github.mooy1.infinityexpansion.items.materials.Materials;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.ENDER_LUMP_3;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.MAGIC_LUMP_3;

public class MagicEssence extends AbstractXingChengItemNotPlaceable {
    public MagicEssence() {
        super(new SlimefunItemStack("XC_MagicEssence", Material.GOLD_INGOT,
                "&6魔法精华", "&o由纯净魔法凝聚而成", "", "&3星辰工艺材料"
        ), RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                ENDER_LUMP_3, MAGIC_LUMP_3, ENDER_LUMP_3,
                MAGIC_LUMP_3, Materials.MAGIC_SINGULARITY, MAGIC_LUMP_3,
                ENDER_LUMP_3, MAGIC_LUMP_3, ENDER_LUMP_3
        });
    }
}
