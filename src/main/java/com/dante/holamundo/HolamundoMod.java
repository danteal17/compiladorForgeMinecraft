package com.dante.holamundo;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod(HolamundoMod.MODID)
@Mod.EventBusSubscriber(modid = HolamundoMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HolaMundoMod {

    public static final String MODID = "holamundo";

    public HolamundoMod() {
        // No need to register manually
    }

    @SubscribeEvent
    public static void setup(FMLCommonSetupEvent event) {
        System.out.println("Hola Mundo mod is loading!");
    }

    @SubscribeEvent
    public static void doClientStuff(FMLClientSetupEvent event) {
        System.out.println("Client setup");
    }
}
