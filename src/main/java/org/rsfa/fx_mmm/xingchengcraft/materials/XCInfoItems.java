package org.rsfa.fx_mmm.xingchengcraft.materials;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.rsfa.fx_mmm.xingchengcraft.XingChengCraft;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCGroups;

public class XCInfoItems {
    public static final SlimefunItemStack CENTRIFUGE_TIPS = new SlimefunItemStack("XC_CENTRIFUGE_TIPS",Material.PAPER, "&o该物品在星尘极高速离心机中获取", "&o星辰工艺提示");

    public static final SlimefunItemStack GITHUB_LINK = new SlimefunItemStack("XC_GITHUB", Material.PAPER, "&3原附属GitHub仓库：",
            "&ohttps://github.com/FengXiang2233/XingCheng_Craft",
            "&3本附属Github仓库：",
            "&ohttps://github.com/ReloadSlimefunAddons/XingChengCraft-Java",
            "&o版本更新日志请到原附属GitHub仓库对应版本的Releases页面查看");

    public static final SlimefunItemStack SINGULARITY_CONSTRUCTOR_TIPS = new SlimefunItemStack("XC_SINGULARITY_CONSTRUCTOR_TIPS", Material.PAPER, "&o该物品在星尘坍塌引构机中获取", "&o星辰工艺提示");

    public static final SlimefunItemStack VERSION_NUMBER = new SlimefunItemStack("XC_VESIONNUMBER", Material.PAPER, "&4版本号:", "&o" + XingChengCraft.instance.getPluginVersion() + "[对于1.18的兼容性更新]");
}
