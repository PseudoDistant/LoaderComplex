package com.enderzombi102.loadercomplex.forge;

import me.shedaniel.architectury.platform.forge.EventBuses;
import com.enderzombi102.loadercomplex.arch.LoaderComplexArch;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LoaderComplexArch.MOD_ID)
public class LoaderComplexForge {
    public LoaderComplexForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(LoaderComplexArch.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        LoaderComplexArch.init();
    }
}
