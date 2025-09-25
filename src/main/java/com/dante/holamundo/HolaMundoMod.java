package com.dante.holamundo;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HolaMundoMod.MODID)
public class HolaMundoMod {
    public static final String MODID = "holamundo";

    public HolaMundoMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
    }

    private void onClientSetup(final FMLClientSetupEvent event) {
        System.out.println("¡Hola mundo desde Forge 1.21!");
    }
}
