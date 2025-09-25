package com.dante.holamundo;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// Este ID debe coincidir con el de mods.toml
@Mod(HolaMundoMod.MODID)
public class HolaMundoMod {
    public static final String MODID = "holamundo";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HolaMundoMod() {
        // Obtenemos el EventBus del mod
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registramos el setup común
        modEventBus.addListener(this::commonSetup);

        // Registramos eventos generales del juego
        MinecraftForge.EVENT_BUS.register(this);

        // Registramos eventos del cliente
        modEventBus.addListener(this::clientSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("¡Hola mundo desde commonSetup!");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("¡Hola mundo desde clientSetup!");
    }

    // Ejemplo de uso de @SubscribeEvent para eventos generales
    @SubscribeEvent
    public void exampleEvent(net.minecraftforge.event.server.ServerStartingEvent event) {
        LOGGER.info("Servidor iniciando, Hola Mundo!");
    }

    // Registrar eventos estáticos del cliente
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("¡Hola mundo desde ClientModEvents!");
        }
    }
}
