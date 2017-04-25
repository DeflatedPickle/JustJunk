package com.deflatedpickle.justjunk.proxy;

import com.deflatedpickle.justjunk.event.EventHandlerCommon;
import com.deflatedpickle.justjunk.event.FMLEventHandlerCommon;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class ServerProxy implements CommonProxy{
    @Override
    public void init() {
        MinecraftForge.EVENT_BUS.register(new EventHandlerCommon());
        FMLCommonHandler.instance().bus().register(new FMLEventHandlerCommon());
    }
}
