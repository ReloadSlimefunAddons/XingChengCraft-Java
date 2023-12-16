package org.rsfa.fx_mmm.xingchengcraft.materials.info;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.materials.AbstractXingChengItemNotPlaceable;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCGroups;

public class XCCentrifugeTips extends AbstractXingChengItemNotPlaceable {
    public static final XCCentrifugeTips INSTANCE = new XCCentrifugeTips();

    private XCCentrifugeTips() {
        super(XCGroups.INFORMATION_GROUP, new SlimefunItemStack("XC_CENTRIFUGE_TIPS", Material.PAPER, "&o该物品在星尘极高速离心机中获取", "&o星辰工艺提示"), new ItemStack[]{});
    }
}
