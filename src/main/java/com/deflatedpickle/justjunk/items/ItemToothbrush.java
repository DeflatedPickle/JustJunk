package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.Item;

public class ItemToothbrush extends Item{
    public ItemToothbrush(){
        setUnlocalizedName(Reference.JustJunkItems.TOOTHBRUSH.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.TOOTHBRUSH.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
