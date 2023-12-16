package org.rsfa.fx_mmm.xingchengcraft.materials.stardust;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.materials.AbstractXingChengItemNotPlaceable;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCItems;

public class StardustPlate extends AbstractXingChengItemNotPlaceable {
    public StardustPlate() {
        super(new SlimefunItemStack("XC_PLATE", Material.PAPER, "&9星尘板",
                "&o隐隐约约渗出星际之间的某种神秘力量", "", "&3星辰工艺材料"), RecipeType.COMPRESSOR, new ItemStack[]{
                XCItems.STARDUST.getItem()
        });
    }
}
