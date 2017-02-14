package com.smithsmodding.armorycolonization.building;

import com.minecolonies.blockout.views.Window;
import com.minecolonies.coremod.client.gui.WindowHutWorkerPlaceholder;
import com.minecolonies.coremod.colony.CitizenData;
import com.minecolonies.coremod.colony.Colony;
import com.minecolonies.coremod.colony.ColonyView;
import com.minecolonies.coremod.colony.buildings.AbstractBuildingWorker;
import com.minecolonies.coremod.colony.jobs.AbstractJob;
import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

/**
 * Created by marcf on 2/14/2017.
 */
public class BuildingBlackSmith extends AbstractBuildingWorker {

    public BuildingBlackSmith(@NotNull Colony c, BlockPos l) {
        super(c, l);
    }

    @Override
    public @NotNull String getJobName() {
        return null;
    }

    @NotNull
    @Override
    public AbstractJob createJob(CitizenData citizenData) {
        return null;
    }

    @Override
    public String getSchematicName() {
        return null;
    }

    @Override
    public int getMaxBuildingLevel() {
        return 0;
    }

    public static class View extends com.minecolonies.coremod.colony.buildings.AbstractBuildingWorker.View {
        public View(ColonyView c, BlockPos l) {
            super(c, l);
        }

        @NotNull
        public Window getWindow() {
            return new WindowHutWorkerPlaceholder(this, "Deliveryman");
        }

        public void deserialize(@NotNull ByteBuf buf) {
            super.deserialize(buf);
        }

        @NotNull
        public Skill getPrimarySkill() {
            return Skill.INTELLIGENCE;
        }

        @NotNull
        public Skill getSecondarySkill() {
            return Skill.ENDURANCE;
        }
    }
}
