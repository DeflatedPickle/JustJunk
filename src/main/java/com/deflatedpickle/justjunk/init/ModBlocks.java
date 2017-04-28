package com.deflatedpickle.justjunk.init;

import com.deflatedpickle.justjunk.blocks.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static Block pileofgarbage;

    public static Block tinore;
    public static Block copperore;

    public static Block tinblock;
    public static Block copperblock;

    public static void init(){
        pileofgarbage = new BlockPileofgarbage();

        tinore = new BlockTinore();
        copperore = new BlockCopperore();

        tinblock = new BlockTinblock();
        copperblock = new BlockCopperblock();
    }

    public static void register(){
        registerBlock(pileofgarbage);

        registerBlock(tinore);
        registerBlock(copperore);

        registerBlock(tinblock);
        registerBlock(copperblock);
    }

    private static void registerBlock(Block block){
        GameRegistry.register(block);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
    }

    public static void registerRenders(){
        registerRender(pileofgarbage);

        registerRender(tinore);
        registerRender(copperore);

        registerRender(tinblock);
        registerRender(copperblock);
    }

    private static void registerRender(Block block){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
