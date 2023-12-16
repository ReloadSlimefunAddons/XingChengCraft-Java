package org.rsfa.fx_mmm.xingchengcraft.materials.dust;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.materials.AbstractXingChengItemNotPlaceable;
import org.rsfa.fx_mmm.xingchengcraft.materials.info.XCCentrifugeTips;

public class DraconiumDust extends AbstractXingChengItemNotPlaceable {
    public DraconiumDust() {
        super(new SlimefunItemStack("XC_DRACONIUM_DUST", Material.GUNPOWDER, "&5龙尘", "&3星辰工艺材料"), new ItemStack[]{XCCentrifugeTips.INSTANCE.getItem()});
    }
}
