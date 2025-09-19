package com.dante.holamundo;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod(HolamundoMod.MODID)
public class HolaMundoMod {

    public static final String MODID = "holamundo";

    public HolamundoMod() {
        // Register the setup method for modloading
        Mod.EventBusSubscriber.Bus.MOD.bus().register(this);
    }

    @SubscribeEvent
    public static void setup(FMLCommonSetupEvent event) {
        // Common setup code here
        System.out.println("Hola Mundo mod is loading!");
    }

    @SubscribeEvent
    public static void doClientStuff(FMLClientSetupEvent event) {
        // Client setup code here
    }
}
