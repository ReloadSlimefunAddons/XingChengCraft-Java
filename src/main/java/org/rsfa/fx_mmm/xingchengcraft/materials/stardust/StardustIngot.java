package org.rsfa.fx_mmm.xingchengcraft.materials.stardust;

import io.github.mooy1.infinityexpansion.items.materials.Materials;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.materials.AbstractXingChengItemNotPlaceable;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCItems;

public class StardustIngot extends AbstractXingChengItemNotPlaceable {
    public StardustIngot() {
        super(new SlimefunItemStack("XC_STARDUST_INGOT", Material.BRICK, "&9星尘锭", "&o由星际中的尘埃凝聚成的锭", "", "&3星辰工艺材料"),
                RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                XCItems.STARDUST.getItem(), Materials.VOID_INGOT, XCItems.STARDUST.getItem(),
                Materials.VOID_INGOT, XCItems.MAGIC_ESSENCE.getItem(), Materials.VOID_INGOT,
                XCItems.STARDUST.getItem(), Materials.INFINITE_INGOT, XCItems.STARDUST.getItem()
        });
    }
}
