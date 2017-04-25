package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.Item;

public class ItemWoodenchunk extends Item{
    public ItemWoodenchunk(){
        setUnlocalizedName(Reference.JustJunkItems.WOODENCHUNK.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.WOODENCHUNK.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
