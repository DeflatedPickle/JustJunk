package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.Item;

public class ItemBrokentoothbrush extends Item{
    public ItemBrokentoothbrush(){
        setUnlocalizedName(Reference.JustJunkItems.BROKENTOOTHBRUSH.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.BROKENTOOTHBRUSH.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
