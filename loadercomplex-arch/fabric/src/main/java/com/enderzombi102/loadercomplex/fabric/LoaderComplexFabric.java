package com.enderzombi102.loadercomplex.fabric;

import com.enderzombi102.loadercomplex.arch.LoaderComplexArch;
import net.fabricmc.api.ModInitializer;

public class LoaderComplexFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        LoaderComplexArch.init();
    }
}
