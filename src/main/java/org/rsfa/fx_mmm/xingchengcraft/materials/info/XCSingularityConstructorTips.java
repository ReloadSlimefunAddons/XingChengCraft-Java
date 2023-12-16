package org.rsfa.fx_mmm.xingchengcraft.materials.info;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.materials.AbstractXingChengItemNotPlaceable;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCGroups;

public class XCSingularityConstructorTips extends AbstractXingChengItemNotPlaceable {
    public static final XCSingularityConstructorTips INSTANCE = new XCSingularityConstructorTips();

    private XCSingularityConstructorTips() {
        super(XCGroups.INFORMATION_GROUP, new SlimefunItemStack("XC_SINGULARITY_CONSTRUCTOR_TIPS", Material.PAPER, "&o该物品在星尘坍塌引构机中获取", "&o星辰工艺提示"), new ItemStack[]{});
    }
}
