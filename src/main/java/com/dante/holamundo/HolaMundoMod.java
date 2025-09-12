package com.dante.holamundo;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod("holamundo")
public class HolaMundoMod {
    public HolaMundoMod() {
        System.out.println(">>> [HolaMundo] El mod se ha cargado correctamente!");
    }

    @EventBusSubscriber(modid = "holamundo")
    public static class Events {
        @SubscribeEvent
        public static void onServerStarting(ServerStartingEvent event) {
            System.out.println(">>> [HolaMundo] Hola mundo desde el servidor de Minecraft!");
        }
    }
}
