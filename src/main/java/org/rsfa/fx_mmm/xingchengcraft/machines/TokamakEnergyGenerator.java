package org.rsfa.fx_mmm.xingchengcraft.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineProcessHolder;
import io.github.thebusybiscuit.slimefun4.core.machines.MachineProcessor;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.AbstractEnergyProvider;
import io.github.thebusybiscuit.slimefun4.implementation.operations.FuelOperation;
import org.bukkit.inventory.ItemStack;
import org.rsfa.fx_mmm.xingchengcraft.SlimefunObjects;

import javax.annotation.Nonnull;

public class TokamakEnergyGenerator extends AbstractEnergyProvider implements MachineProcessHolder<FuelOperation> {
    public TokamakEnergyGenerator(SlimefunItemStack item) {
        super(SlimefunObjects.XC_MACHINE_GROUP, item, RecipeType.ANCIENT_ALTAR, new ItemStack[]{

        });
    }

    @Nonnull
    @Override
    public ItemStack getProgressBar() {
        return null;
    }

    @Override
    public int getEnergyProduction() {
        return 0;
    }

    @Override
    protected void registerDefaultFuelTypes() {

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
