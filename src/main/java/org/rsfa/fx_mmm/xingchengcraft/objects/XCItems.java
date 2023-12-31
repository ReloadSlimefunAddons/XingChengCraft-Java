package org.rsfa.fx_mmm.xingchengcraft.objects;

import io.github.mooy1.infinityexpansion.items.materials.Materials;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.materials.Stardust;
import org.rsfa.fx_mmm.xingchengcraft.materials.XCInfoItems;

import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.ENDER_LUMP_3;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.MAGIC_LUMP_3;

public class XCItems {
    public static final UnplaceableBlock MAGIC_ESSENCE = new UnplaceableBlock(XCGroups.MATERIALS_GROUP,
            XCItemStacks.MAGIC_ESSENCE, RecipeType.ANCIENT_ALTAR, 
            new ItemStack[]{
                    ENDER_LUMP_3, MAGIC_LUMP_3, ENDER_LUMP_3,
                    MAGIC_LUMP_3, Materials.MAGIC_SINGULARITY, MAGIC_LUMP_3,
                    ENDER_LUMP_3, MAGIC_LUMP_3, ENDER_LUMP_3
            }
    );

    public static final UnplaceableBlock STARDUST = new Stardust();

    public static final UnplaceableBlock STARDUST_INGOT = new UnplaceableBlock(XCGroups.MATERIALS_GROUP, 
            XCItemStacks.STARDUST_INGOT, RecipeType.ANCIENT_ALTAR, 
            new ItemStack[]{
                    XCItemStacks.STARDUST, Materials.VOID_INGOT, XCItemStacks.STARDUST,
                    Materials.VOID_INGOT, XCItems.MAGIC_ESSENCE.getItem(), Materials.VOID_INGOT,
                    XCItemStacks.STARDUST, Materials.INFINITE_INGOT, XCItemStacks.STARDUST
            }
    );

    public static final UnplaceableBlock STARDUST_PLATE = new UnplaceableBlock(XCGroups.MATERIALS_GROUP, XCItemStacks.STARDUST_PLATE, RecipeType.COMPRESSOR, new ItemStack[]{XCItemStacks.STARDUST});

    public static final UnplaceableBlock STARDUST_ARTIFACT = new UnplaceableBlock(XCGroups.MATERIALS_GROUP,
            XCItemStacks.STARDUST_ARTIFACT, RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                    Materials.TITANIUM, XCItems.STARDUST_INGOT.getItem(), Materials.MYTHRIL,
                    XCItems.STARDUST_INGOT.getItem(), Materials.MACHINE_CIRCUIT, XCItems.STARDUST_INGOT.getItem(),
                    Materials.ADAMANTITE, XCItems.STARDUST_INGOT.getItem(), Materials.MAGNONIUM
            }
    );

    public static final UnplaceableBlock DRACONIUM_DUST = new UnplaceableBlock(XCGroups.MATERIALS_GROUP, XCItemStacks.DRACONIUM_DUST, RecipeType.NULL, new ItemStack[]{XCInfoItems.CENTRIFUGE_TIPS});

    public static final UnplaceableBlock MOLYBDENUM_DUST = new UnplaceableBlock(XCGroups.MATERIALS_GROUP, XCItemStacks.MOLYBDENUM_DUST, RecipeType.NULL, new ItemStack[]{XCInfoItems.CENTRIFUGE_TIPS});

    public static final UnplaceableBlock STARLIGHT_INGOT = new UnplaceableBlock(XCGroups.MATERIALS_GROUP, 
            XCItemStacks.STARLIGHT_INGOT, RecipeType.ANCIENT_ALTAR, 
            new ItemStack[]{
                    XCItems.DRACONIUM_DUST.getItem(), XCItems.MOLYBDENUM_DUST.getItem(), XCItems.DRACONIUM_DUST.getItem(),
                    XCItemStacks.STARDUST, XCItemStacks.STARDUST_INGOT, XCItemStacks.STARDUST,
                    XCItems.DRACONIUM_DUST.getItem(), XCItems.MOLYBDENUM_DUST.getItem(), XCItems.DRACONIUM_DUST.getItem()
            }
    );

    public static final UnplaceableBlock STARLIGHT_PLATE = new UnplaceableBlock(XCGroups.MATERIALS_GROUP,
            XCItemStacks.STARLIGHT_PLATE, RecipeType.COMPRESSOR,
            new ItemStack[]{XCItemStacks.STARLIGHT_INGOT}
    );

    public static final UnplaceableBlock STARLIGHT_ARTIFACT = new UnplaceableBlock(XCGroups.MATERIALS_GROUP,
            XCItemStacks.STARLIGHT_ARTIFACT, RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                    XCItemStacks.STARDUST, XCItemStacks.STARLIGHT_INGOT, XCItemStacks.STARDUST,
                    XCItemStacks.STARLIGHT_INGOT, XCItemStacks.STARDUST_ARTIFACT, XCItemStacks.STARLIGHT_INGOT,
                    XCItemStacks.STARDUST, XCItemStacks.STARLIGHT_INGOT, XCItemStacks.STARDUST
           }
    );

    public static final UnplaceableBlock CRUSHED_INFINITE_MACHINE_CORE = new UnplaceableBlock(XCGroups.MATERIALS_GROUP, XCItemStacks.CRUSHED_INFINITE_MACHINE_CORE, RecipeType.COMPRESSOR, new ItemStack[]{Materials.INFINITE_CORE});

    public static final UnplaceableBlock STARDUST_ROTOR = new UnplaceableBlock(XCGroups.MATERIALS_GROUP,
            XCItemStacks.STARDUST_ROTOR, RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                    XCItemStacks.STARDUST_INGOT, XCItemStacks.STARDUST_INGOT, XCItemStacks.STARDUST_INGOT,
                    XCItemStacks.STARDUST_INGOT, XCItemStacks.STARDUST_ARTIFACT, XCItemStacks.STARDUST_INGOT,
                    XCItemStacks.STARDUST_INGOT, XCItemStacks.STARDUST_INGOT, XCItemStacks.STARDUST_INGOT
            }
    );

    public static final UnplaceableBlock PURE_URANIUM = new UnplaceableBlock(XCGroups.MATERIALS_GROUP, XCItemStacks.PURE_URANIUM, RecipeType.NULL, new ItemStack[]{XCInfoItems.CENTRIFUGE_TIPS});

    public static final UnplaceableBlock IMPURITY = new UnplaceableBlock(XCGroups.MATERIALS_GROUP, XCItemStacks.IMPURITY, RecipeType.NULL, new ItemStack[]{XCInfoItems.CENTRIFUGE_TIPS});

    //奇点
    public static final UnplaceableBlock REDSTONE_ALLOY_SINGULARITY = new UnplaceableBlock(XCGroups.MATERIALS_GROUP, XCItemStacks.REDSTONE_ALLOY_SINGULARITY, RecipeType.NULL, new ItemStack[]{XCInfoItems.SINGULARITY_CONSTRUCTOR_TIPS});

    public static final UnplaceableBlock CARBONADO_SINGULARITY = new UnplaceableBlock(XCGroups.MATERIALS_GROUP, XCItemStacks.CARBONADO_SINGULARITY, RecipeType.NULL, new ItemStack[]{XCInfoItems.SINGULARITY_CONSTRUCTOR_TIPS});

    public static final UnplaceableBlock SYNTHETIC_EMERALD_SINGULARITY = new UnplaceableBlock(XCGroups.MATERIALS_GROUP, XCItemStacks.SYNTHETIC_EMERALD_SINGULARITY, RecipeType.NULL, new ItemStack[]{XCInfoItems.SINGULARITY_CONSTRUCTOR_TIPS});

    public static final UnplaceableBlock ELECTRO_MAGNET_SINGULARITY = new UnplaceableBlock(XCGroups.MATERIALS_GROUP, XCItemStacks.ELECTRO_MAGNET_SINGULARITY, RecipeType.NULL, new ItemStack[]{XCInfoItems.SINGULARITY_CONSTRUCTOR_TIPS});


}
