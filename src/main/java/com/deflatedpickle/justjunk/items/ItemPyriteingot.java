package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.Item;

public class ItemPyriteingot extends Item{
    public ItemPyriteingot(){
        setUnlocalizedName(Reference.JustJunkItems.PYRITEINGOT.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.PYRITEINGOT.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
