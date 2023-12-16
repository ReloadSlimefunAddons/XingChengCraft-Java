package org.rsfa.fx_mmm.xingchengcraft.materials.info;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.materials.AbstractXingChengItemNotPlaceable;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCGroups;

public class XCGithubLink extends AbstractXingChengItemNotPlaceable {
    public static final XCGithubLink INSTANCE = new XCGithubLink();

    private XCGithubLink() {
        super(XCGroups.INFORMATION_GROUP, new SlimefunItemStack("XC_GITHUB", Material.PAPER, "&3原附属GitHub仓库：",
                        "&ohttps://github.com/FengXiang2233/XingCheng_Craft",
                        "&3本附属Github仓库：",
                        "&ohttps://github.com/ReloadSlimefunAddons/XingChengCraft-Java",
                        "&o版本更新日志请到原附属GitHub仓库对应版本的Releases页面查看"),
                new ItemStack[]{});
    }
}
