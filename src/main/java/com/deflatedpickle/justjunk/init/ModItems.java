package com.deflatedpickle.justjunk.init;

import com.deflatedpickle.justjunk.armor.ArmorTinfoil;
import com.deflatedpickle.justjunk.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static Item emptytincan;
    public static Item tiningot;
    public static Item tincan;
    public static Item toothbrush;
    public static Item brokentoothbrush;
    public static ItemSword toothbrushshiv;
    public static Item tinfoil;

    public static ItemFood rottingfish;

    public static ItemArmor tinfoilhelmet;

    public static ArmorMaterial tinfoilArmorMaterial = EnumHelper.addArmorMaterial("tinfoil", "dpjjm:tinfoil", 15, new int[]{2,6,5,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    public static void init(){
        emptytincan = new ItemEmptytincan();
        tiningot = new ItemTiningot();
        tincan = new ItemTincan();
        toothbrush = new ItemToothbrush();
        brokentoothbrush = new ItemBrokentoothbrush();
        toothbrushshiv = new ItemToothbrushshiv();
        tinfoil = new ItemTinfoil();

        rottingfish = new ItemRottingfish();

        tinfoilhelmet = new ArmorTinfoil("tinfoilhelmet", "ItemTinfoilhelmet", 1, EntityEquipmentSlot.HEAD);
    }

    public static void register(){
        GameRegistry.register(emptytincan);
        GameRegistry.register(tiningot);
        GameRegistry.register(tincan);
        GameRegistry.register(toothbrush);
        GameRegistry.register(brokentoothbrush);
        GameRegistry.register(toothbrushshiv);
        GameRegistry.register(tinfoil);

        GameRegistry.register(rottingfish);

        GameRegistry.register(tinfoilhelmet);
    }

    public static void registerRenders(){
        registerRender(emptytincan);
        registerRender(tiningot);
        registerRender(tincan);
        registerRender(toothbrush);
        registerRender(brokentoothbrush);
        registerRender(toothbrushshiv);
        registerRender(tinfoil);

        registerRender(rottingfish);

        registerRender(tinfoilhelmet);
    }

    private static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
