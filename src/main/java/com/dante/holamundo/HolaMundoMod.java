package com.dante.holamundo;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(HolaMundoMod.MODID)
@EventBusSubscriber(modid = HolaMundoMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class HolaMundoMod {
    public static final String MODID = "holamundo";

    public HolaMundoMod() {
        // Constructor del mod
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        System.out.println("¡Hola mundo desde Forge!");
    }
}
