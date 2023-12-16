package org.rsfa.fx_mmm.xingchengcraft.materials.starlight;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.materials.AbstractXingChengItemNotPlaceable;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCItems;

public class StarlightIngot extends AbstractXingChengItemNotPlaceable {
    public StarlightIngot() {
        super(new SlimefunItemStack("XC_XH_INGOT", Material.COPPER_INGOT, "&1星辉锭",
                "&o闪耀着星光的锭", "", "&3星辰工艺材料"), new ItemStack[]{
                XCItems.DRACONIUM_DUST.getItem(), XCItems.MOLYBDENUM_DUST.getItem(), XCItems.DRACONIUM_DUST.getItem(),
                XCItems.STARDUST.getItem(), XCItems.STARDUST_INGOT.getItem(), XCItems.STARDUST.getItem(),
                XCItems.DRACONIUM_DUST.getItem(), XCItems.MOLYBDENUM_DUST.getItem(), XCItems.DRACONIUM_DUST.getItem()
        });
    }
}
