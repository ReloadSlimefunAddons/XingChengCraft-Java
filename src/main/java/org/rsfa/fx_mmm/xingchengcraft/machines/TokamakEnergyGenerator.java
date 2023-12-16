package org.rsfa.fx_mmm.xingchengcraft.machines;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineProcessHolder;
import io.github.thebusybiscuit.slimefun4.core.machines.MachineProcessor;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.AbstractEnergyProvider;
import io.github.thebusybiscuit.slimefun4.implementation.operations.FuelOperation;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.XingChengCraft;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCGroups;
import org.rsfa.fx_mmm.xingchengcraft.objects.XCItems;

import javax.annotation.Nonnull;

public class TokamakEnergyGenerator extends AbstractEnergyProvider implements MachineProcessHolder<FuelOperation> {
    public TokamakEnergyGenerator(SlimefunItemStack item) {
        super(XCGroups.XC_MACHINE_GROUP, item, RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                XCItems.STARDUST_INGOT.getItem(), SlimefunItems.NUCLEAR_REACTOR, XCItems.STARDUST.getItem(),
                XCItems.STARDUST_ARTIFACT.getItem(), P, XCItems.STARDUST_ARTIFACT.getItem(),
                XCItems.STARDUST_PLATE.getItem(), XCItems.STARDUST_INGOT.getItem(), XCItems.STARDUST_PLATE.getItem()
        });

        super.register(XingChengCraft.instance);
    }

    @Nonnull
    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.GLOWSTONE);
    }

    @Override
    public int getEnergyProduction() {
        return 498000;
    }

    @Override
    protected void registerDefaultFuelTypes() {
        registerFuel();
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public int[] getInputSlots() {
        return new int[0];
    }

    @Override
    public int[] getOutputSlots() {
        return new int[0];
    }

    @Nonnull
    @Override
    public MachineProcessor<FuelOperation> getMachineProcessor() {
        return null;
    }
}
