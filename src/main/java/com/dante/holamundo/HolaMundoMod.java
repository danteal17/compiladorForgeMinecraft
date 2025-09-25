package com.dante.holamundo;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import org.slf4j.Logger;

@Mod(HolaMundoMod.MODID)
public class HolaMundoMod {
    public static final String MODID = "holamundo";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HolaMundoMod() {
        // No uses getModEventBus() aquí
    }

    // Usa un EventBusSubscriber estático para registrar listeners
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
    public static class ModEventBusSubscriber {
        @SubscribeEvent
        public static void commonSetup(FMLCommonSetupEvent event) {
            LOGGER.info("¡Hola mundo desde commonSetup!");
        }

        @SubscribeEvent
        public static void clientSetup(FMLClientSetupEvent event) {
            LOGGER.info("¡Hola mundo desde clientSetup!");
        }
    }
}
