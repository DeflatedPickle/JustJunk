package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.Item;

public class ItemTiningot extends Item{
    public ItemTiningot(){
        setUnlocalizedName(Reference.JustJunkItems.TININGOT.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.TININGOT.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
