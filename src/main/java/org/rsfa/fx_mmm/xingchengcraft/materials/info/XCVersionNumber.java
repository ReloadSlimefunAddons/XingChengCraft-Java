package org.rsfa.fx_mmm.xingchengcraft.materials.info;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.XingChengCraft;
import org.rsfa.fx_mmm.xingchengcraft.materials.AbstractXingChengItemNotPlaceable;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCGroups;

public class XCVersionNumber extends AbstractXingChengItemNotPlaceable {
    public static final XCVersionNumber INSTANCE = new XCVersionNumber();

    private XCVersionNumber() {
        super(XCGroups.INFORMATION_GROUP, new SlimefunItemStack("XC_VESIONNUMBER", Material.PAPER, "&4版本号:",
                "&o" + XingChengCraft.instance.getPluginVersion() + "[对于1.18的兼容性更新]"), new ItemStack[]{});
    }
}
