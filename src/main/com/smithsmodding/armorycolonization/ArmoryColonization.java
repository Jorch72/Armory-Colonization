package com.smithsmodding.armorycolonization;

import com.smithsmodding.armorycolonization.block.BlockHutBlackSmith;
import com.smithsmodding.armorycolonization.util.ModBlocks;
import com.smithsmodding.armorycolonization.util.References;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

/**
 * Created by marcf on 2/13/2017.
 */
@Mod(modid = References.General.MOD_ID, name = "Armory", version = References.General.VERSION,
        dependencies = "required-after:Forge@[11.15,);required-after:SmithsCore;required-after:Armory;")
@Mod.EventBusSubscriber
public class ArmoryColonization {


    @SubscribeEvent
    public void registerBlocksEvent(RegistryEvent.Register<Block> blockRegisterEvent) {
        IForgeRegistry<Block> register = blockRegisterEvent.getRegistry();

        ModBlocks.BL_HUT_BLACKSMITHS = new BlockHutBlackSmith();

        register.register(ModBlocks.BL_HUT_BLACKSMITHS);
    }
}
