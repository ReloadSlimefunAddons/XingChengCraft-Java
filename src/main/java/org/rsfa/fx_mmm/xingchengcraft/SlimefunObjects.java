package org.rsfa.fx_mmm.xingchengcraft;

import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.rsfa.fx_mmm.xingchengcraft.machines.TokamakEnergyGenerator;
import org.rsfa.fx_mmm.xingchengcraft.utils.ItemStackCreator;

public class SlimefunObjects {
    //categories-keys
    public static final NamespacedKey INFORMATION = new NamespacedKey(XingChengCraft.instance, "xc_information");
    public static final NamespacedKey MATERIALS = new NamespacedKey(XingChengCraft.instance, "xc_materials");
    public static final NamespacedKey TOOLS = new NamespacedKey(XingChengCraft.instance, "xc_tools");
    public static final NamespacedKey MACHINE_FRAME = new NamespacedKey(XingChengCraft.instance, "xc_machine_frame");
    public static final NamespacedKey XC_MACHINE = new NamespacedKey(XingChengCraft.instance, "xc_xc_machine");
    public static final NamespacedKey XH_MACHINE = new NamespacedKey(XingChengCraft.instance, "xc_xh_machine");
    public static final NamespacedKey INTEGRATED_MACHINE = new NamespacedKey(XingChengCraft.instance, "xc_integrated_machine");

    //categories
    public static final NestedItemGroup MAIN_GROUP = new NestedItemGroup(new NamespacedKey(XingChengCraft.instance, "xingcheng_craft"), new CustomItemStack(Material.FLINT, "&8星辰工艺"));
    public static final SubItemGroup INFORMATION_GROUP = new SubItemGroup(INFORMATION, MAIN_GROUP, new CustomItemStack(ItemStackCreator.createSkullItem(""), "&4信息"));
    public static final SubItemGroup MATERIALS_GROUP = new SubItemGroup(MATERIALS, MAIN_GROUP, new CustomItemStack(Material.BRICK, "&a材料"));
    public static final SubItemGroup TOOLS_GROUP = new SubItemGroup(TOOLS, MAIN_GROUP, new CustomItemStack(Material.NETHERITE_PICKAXE, "&b工具"));
    public static final SubItemGroup MACHINE_FRAME_GROUP = new SubItemGroup(MACHINE_FRAME, MAIN_GROUP, new CustomItemStack(Material.IRON_BLOCK, "&d机器框架"));
    public static final SubItemGroup XC_MACHINE_GROUP = new SubItemGroup(XC_MACHINE, MAIN_GROUP, new CustomItemStack(Material.TERRACOTTA, "&9星尘&f机器"));
    public static final SubItemGroup XH_MACHINE_GROUP = new SubItemGroup(XH_MACHINE, MAIN_GROUP, new CustomItemStack(Material.WAXED_COPPER_BLOCK, "&1星辉&f机器"));
    public static final SubItemGroup INTEGRATED_MACHINE_GROUP = new SubItemGroup(INTEGRATED_MACHINE, MAIN_GROUP, new CustomItemStack(Material.REDSTONE_LAMP, "&6一体机"));

    //machines
    public static final TokamakEnergyGenerator TOKAMAK_ENERGY_GENERATOR = new TokamakEnergyGenerator();
}
