package org.rsfa.fx_mmm.xingchengcraft.materials.stardust;

import io.github.mooy1.infinityexpansion.items.materials.Materials;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.materials.AbstractXingChengItemNotPlaceable;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCItems;

public class StardustArtifact extends AbstractXingChengItemNotPlaceable {
    public StardustArtifact() {
        super(new SlimefunItemStack("XC_ARTIFACT", Material.POLISHED_BLACKSTONE_BUTTON, "&9星尘构件",
                "&o隐隐约约透出星际之间的某种神秘力量", "", "&3星辰工艺材料") ,RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                Materials.TITANIUM, XCItems.STARDUST_INGOT.getItem(), Materials.MYTHRIL,
                XCItems.STARDUST_INGOT.getItem(), Materials.MACHINE_CIRCUIT, XCItems.STARDUST_INGOT.getItem(),
                Materials.ADAMANTITE, XCItems.STARDUST_INGOT.getItem(), Materials.MAGNONIUM
        });
    }
}
