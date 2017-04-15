package com.deflatedpickle.justjunk.init;

import com.deflatedpickle.justjunk.Reference;
import com.deflatedpickle.justjunk.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static Item emptytincan;
    public static Item tiningot;
    public static Item tincan;
    public static Item toothbrush;
    public static Item brokentoothbrush;
    public static Item toothbrushshiv;

    public static Item rottingfish;

    public static void init(){
        emptytincan = new ItemEmptytincan();
        tiningot = new ItemTiningot();
        tincan = new ItemTincan();
        toothbrush = new ItemToothbrush();
        brokentoothbrush = new ItemBrokentoothbrush();
        toothbrushshiv = new ItemToothbrushshiv();

        rottingfish = new ItemRottingfish();
    }

    public static void register(){
        GameRegistry.register(emptytincan);
        GameRegistry.register(tiningot);
        GameRegistry.register(tincan);
        GameRegistry.register(toothbrush);
        GameRegistry.register(brokentoothbrush);
        GameRegistry.register(toothbrushshiv);

        GameRegistry.register(rottingfish);
    }

    public static void registerRenders(){
        registerRender(emptytincan);
        registerRender(tiningot);
        registerRender(tincan);
        registerRender(toothbrush);
        registerRender(brokentoothbrush);
        registerRender(toothbrushshiv);

        registerRender(rottingfish);
    }

    private static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
