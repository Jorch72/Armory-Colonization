package com.smithsmodding.armorycolonization.job;

import com.minecolonies.coremod.colony.CitizenData;
import com.minecolonies.coremod.colony.jobs.AbstractJob;
import com.minecolonies.coremod.entity.ai.basic.AbstractAISkeleton;
import com.smithsmodding.armorycolonization.util.References;
import net.minecraft.nbt.NBTTagCompound;
import org.jetbrains.annotations.NotNull;

/**
 * Created by marcf on 2/14/2017.
 */
public class JobBlackSmith extends AbstractJob {

    public JobBlackSmith(CitizenData entity) {
        super(entity);
    }

    @Override
    public void readFromNBT(@NotNull NBTTagCompound compound) {
        super.readFromNBT(compound);
    }

    @Override
    public void writeToNBT(@NotNull NBTTagCompound compound) {
        super.writeToNBT(compound);
    }

    @Override
    public String getName() {
        return References.InternalNames.Jobs.JN_JOB_BLACKSMITH.toString();
    }

    @Override
    public AbstractAISkeleton<? extends AbstractJob> generateAI() {
        return null;
    }
}
