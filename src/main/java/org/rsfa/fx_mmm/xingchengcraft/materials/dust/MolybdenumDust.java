package org.rsfa.fx_mmm.xingchengcraft.materials.dust;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.materials.AbstractXingChengItemNotPlaceable;
import org.rsfa.fx_mmm.xingchengcraft.materials.info.XCCentrifugeTips;

public class MolybdenumDust extends AbstractXingChengItemNotPlaceable {
    public MolybdenumDust() {
        super(new SlimefunItemStack("XC_MOLYBDENUM_DUST", Material.GUNPOWDER, "&7钼粉",
                "&o杂质出奇迹", "", "&3星辰工艺材料"), new ItemStack[]{XCCentrifugeTips.INSTANCE.getItem()});
    }
}
