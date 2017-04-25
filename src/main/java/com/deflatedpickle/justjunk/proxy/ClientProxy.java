package com.deflatedpickle.justjunk.proxy;

import com.deflatedpickle.justjunk.event.EventHandlerCommon;
import com.deflatedpickle.justjunk.event.FMLEventHandlerCommon;
import com.deflatedpickle.justjunk.init.ModBlocks;
import com.deflatedpickle.justjunk.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class ClientProxy implements CommonProxy{
    @Override
    public void init() {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
        MinecraftForge.EVENT_BUS.register(new EventHandlerCommon());
        FMLCommonHandler.instance().bus().register(new FMLEventHandlerCommon());
    }
}
