package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.Item;

public class ItemTincan extends Item{
    public ItemTincan(){
        setUnlocalizedName(Reference.JustJunkItems.TINCAN.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.TINCAN.getRegistryName());
        setMaxStackSize(1);
        setCreativeTab(JustJunk.tabJustJunk);
    }
}