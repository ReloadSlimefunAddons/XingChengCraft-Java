package org.rsfa.fx_mmm.xingchengcraft.objects;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.rsfa.fx_mmm.xingchengcraft.XingChengCraft;
import org.rsfa.fx_mmm.xingchengcraft.materials.info.XCCentrifugeTips;
import org.rsfa.fx_mmm.xingchengcraft.materials.info.XCGithubLink;
import org.rsfa.fx_mmm.xingchengcraft.materials.info.XCSingularityConstructorTips;
import org.rsfa.fx_mmm.xingchengcraft.materials.info.XCVersionNumber;

public class XCGroups {
    @SuppressWarnings("unused")
    public static void setup(XingChengCraft plugin) {
        //information
        INFORMATION_GROUP.add(XCVersionNumber.INSTANCE);
        INFORMATION_GROUP.add(XCGithubLink.INSTANCE);
        INFORMATION_GROUP.add(XCCentrifugeTips.INSTANCE);
        INFORMATION_GROUP.add(XCSingularityConstructorTips.INSTANCE);

        //materials
        MATERIALS_GROUP.add(XCItems.STARDUST);
        MATERIALS_GROUP.add(XCItems.MAGIC_ESSENCE);
        MATERIALS_GROUP.add(XCItems.STARDUST_INGOT);
        MATERIALS_GROUP.add(XCItems.STARDUST_PLATE);
        MATERIALS_GROUP.add(XCItems.STARDUST_ARTIFACT);
        MATERIALS_GROUP.add(XCItems.IMPURITY);
        MATERIALS_GROUP.add(XCItems.DRACONIUM_DUST);
    }

    //categories-keys
    public static final NamespacedKey INFORMATION = new NamespacedKey(XingChengCraft.instance, "xc_information");
    public static final NamespacedKey MATERIALS = new NamespacedKey(XingChengCraft.instance, "xc_materials");
    public static final NamespacedKey TOOLS = new NamespacedKey(XingChengCraft.instance, "xc_tools");
    public static final NamespacedKey XC_MACHINE = new NamespacedKey(XingChengCraft.instance, "xc_xc_machine");
    public static final NamespacedKey XH_MACHINE = new NamespacedKey(XingChengCraft.instance, "xc_xh_machine");

    //categories
    public static final NestedItemGroup MAIN_GROUP = new NestedItemGroup(new NamespacedKey(XingChengCraft.instance, "xingcheng_craft"), new CustomItemStack(Material.FLINT, "&8星辰工艺"));
    public static final SubItemGroup INFORMATION_GROUP = new SubItemGroup(INFORMATION, MAIN_GROUP, new SlimefunItemStack("XC_INFORMATION_B", "16439d2e306b225516aa9a6d007a7e75edd2d5015d113b42f44be62a517e574f", "&4信息"));
    public static final SubItemGroup MATERIALS_GROUP = new SubItemGroup(MATERIALS, MAIN_GROUP, new CustomItemStack(Material.BRICK, "&a材料"));
    public static final SubItemGroup TOOLS_GROUP = new SubItemGroup(TOOLS, MAIN_GROUP, new CustomItemStack(Material.NETHERITE_PICKAXE, "&b工具"));
    public static final SubItemGroup XC_MACHINE_GROUP = new SubItemGroup(XC_MACHINE, MAIN_GROUP, new CustomItemStack(Material.TERRACOTTA, "&9星尘&f机器"));
    public static final SubItemGroup XH_MACHINE_GROUP = new SubItemGroup(XH_MACHINE, MAIN_GROUP, new CustomItemStack(Material.WAXED_COPPER_BLOCK, "&1星辉&f机器"));
}
