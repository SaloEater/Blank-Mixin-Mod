package com.author.blank_mixin_mod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(BlankMixinMod.MODID)
public class BlankMixinMod
{
    public static final String MODID = "blank_mixin_mod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BlankMixinMod()
    {
        var forgeBus = MinecraftForge.EVENT_BUS;
        forgeBus.register(this);
    }
}
