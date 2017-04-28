package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.Item;

public class ItemCopperingot extends Item{
    public ItemCopperingot(){
        setUnlocalizedName(Reference.JustJunkItems.COPPERINGOT.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.COPPERINGOT.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
