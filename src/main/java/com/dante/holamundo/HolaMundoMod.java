package com.dante.holamundo;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.eventbus.api.IEventBus;

@Mod(HolaMundoMod.MODID)
public class HolaMundoMod {
    public static final String MODID = "holamundo";

    public HolaMundoMod() {
        // Obtenemos el EventBus de Forge
        IEventBus modEventBus = net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext.get().getModEventBus();

        // Registramos nuestro listener para el ciclo de vida del cliente
        modEventBus.addListener(this::onClientSetup);
    }

    private void onClientSetup(final FMLClientSetupEvent event) {
        System.out.println("¡Hola mundo desde Forge 1.21!");
    }
}
