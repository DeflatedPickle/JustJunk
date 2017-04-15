package com.deflatedpickle.justjunk.init;

import com.deflatedpickle.justjunk.blocks.BlockPileofgarbage;
import com.deflatedpickle.justjunk.blocks.BlockTinblock;
import com.deflatedpickle.justjunk.blocks.BlockTinore;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static Block pileofgarbage;
    public static Block tinore;
    public static Block tinblock;

    public static void init(){
        pileofgarbage = new BlockPileofgarbage();
        tinore = new BlockTinore();
        tinblock = new BlockTinblock();
    }

    public static void register(){
        registerBlock(pileofgarbage);
        registerBlock(tinore);
        registerBlock(tinblock);
    }

    private static void registerBlock(Block block){
        GameRegistry.register(pileofgarbage);
        GameRegistry.register(tinore);
        GameRegistry.register(tinblock);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
    }

    public static void registerRenders(){
        registerRender(pileofgarbage);
        registerRender(tinore);
        registerRender(tinblock);
    }

    private static void registerRender(Block block){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
