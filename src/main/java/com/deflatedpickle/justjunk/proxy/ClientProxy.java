package com.deflatedpickle.justjunk.proxy;

import com.deflatedpickle.justjunk.init.ModBlocks;
import com.deflatedpickle.justjunk.init.ModItems;

public class ClientProxy implements CommonProxy{
    @Override
    public void init() {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }
}
