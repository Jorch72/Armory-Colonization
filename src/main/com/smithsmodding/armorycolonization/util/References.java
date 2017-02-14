package com.smithsmodding.armorycolonization.util;

import net.minecraft.util.ResourceLocation;

/**
 * Created by marcf on 2/13/2017.
 */
public class References {

    public static class General {
        public static final String MOD_ID = "armory-colonization";
        public static final String MC_VERSION = "@MCVERSION@";
        public static final String VERSION = "@VERSION@";
    }

    public static class InternalNames {
        public static class Blocks {
            public static final ResourceLocation BN_HUT_BLACKSMITH = new ResourceLocation(General.MOD_ID, "blocks.huts.blacksmith");
        }

        public static class Jobs {
            public static final ResourceLocation JN_JOB_BLACKSMITH = new ResourceLocation(General.MOD_ID, "jobs.blacksmith");
        }
    }
}
