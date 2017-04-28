package com.deflatedpickle.justjunk;

import com.deflatedpickle.justjunk.init.ModBlocks;
import com.deflatedpickle.justjunk.init.ModCrafting;
import com.deflatedpickle.justjunk.init.ModItems;
import com.deflatedpickle.justjunk.proxy.CommonProxy;

import com.deflatedpickle.justjunk.world.ModWorldGeneration;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class JustJunk {
    @Instance
    public static JustJunk instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModItems.init();
        ModItems.register();

        ModBlocks.init();
        ModBlocks.register();

        GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
    }

    @EventHandler
    public void Init(FMLInitializationEvent event){
        proxy.init();
        ModCrafting.register();
    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event){

    }

    public static CreativeTabs tabJustJunk = new CreativeTabs("tab_justjunk"){
        @Override
        public ItemStack getTabIconItem(){
            return new ItemStack(ModBlocks.pileofgarbage);
        }
    };
}
