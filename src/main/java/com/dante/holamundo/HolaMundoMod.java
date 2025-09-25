package com.dante.holamundo;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(HolaMundoMod.MODID)
public class HolaMundoMod {
    public static final String MODID = "holamundo";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HolaMundoMod() {
        // Registramos los setups
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("¡Hola mundo desde commonSetup!");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("¡Hola mundo desde clientSetup!");
    }
}
