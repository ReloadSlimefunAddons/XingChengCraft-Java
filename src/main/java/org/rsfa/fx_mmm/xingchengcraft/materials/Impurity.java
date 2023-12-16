package org.rsfa.fx_mmm.xingchengcraft.materials;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.materials.info.XCCentrifugeTips;

public class Impurity extends AbstractXingChengItemNotPlaceable {
    public Impurity() {
        super(new SlimefunItemStack("XC_IMPURITY", Material.GUNPOWDER, "&8杂质",
                "&o就一些杂质没什么好说的", "", "&3星辰工艺材料"), new ItemStack[]{XCCentrifugeTips.INSTANCE.getItem()});
    }
}
