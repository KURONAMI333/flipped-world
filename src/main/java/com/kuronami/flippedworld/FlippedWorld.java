package com.kuronami.flippedworld;

import com.kuronami.isekaiapi.api.Isekai;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(FlippedWorld.MODID)
public final class FlippedWorld {
    public static final String MODID = "flipped_world";
    public static final String VERSION = "0.1.0";
    public static final Logger LOGGER = LogUtils.getLogger();

    public FlippedWorld(IEventBus modBus) {
        LOGGER.info("Flipped World v{} loading", VERSION);
        LOGGER.info("Flipped World: Isekai API facade ready (query={}, remap={})",
                Isekai.query().getClass().getSimpleName(),
                Isekai.remap().getClass().getSimpleName());
    }
}
