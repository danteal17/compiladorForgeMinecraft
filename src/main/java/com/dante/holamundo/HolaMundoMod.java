package com.dante.holamundo;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;

@Mod(HolaMundoMod.MODID)
public class HolaMundoMod {
    public static final String MODID = "holamundo";

    public HolaMundoMod() {
        // El constructor queda vacío en Forge 1.21.8
        // No se usa más getModEventBus()
    }

    // Suscribimos métodos estáticos al bus con @EventBusSubscriber
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents {
        @SubscribeEvent
        public static void onClientSetup(RegisterClientReloadListenersEvent event) {
            System.out.println("Hola mundo desde Forge 1.21.8!");
        }
    }
}
