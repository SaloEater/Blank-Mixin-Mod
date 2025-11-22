package com.author.blank_mixin_mod;

import com.mojang.logging.LogUtils;
import com.author.blank_mixin_mod.client.BulkTradeExecutor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(BlankMixinMod.MODID)
public class BlankMixinMod
{
    public static final String MODID = "lc_bulk_purchase";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BlankMixinMod()
    {
        var forgeBus = MinecraftForge.EVENT_BUS;
        forgeBus.register(this);

        // Register the bulk trade executor for client tick events
        forgeBus.register(BulkTradeExecutor.class);

        LOGGER.info("LC Bulk Purchase mod initialized");
    }
}
