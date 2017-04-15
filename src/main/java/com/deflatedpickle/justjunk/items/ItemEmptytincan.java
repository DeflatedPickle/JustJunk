package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.Item;

public class ItemEmptytincan extends Item{
    public ItemEmptytincan(){
        setUnlocalizedName(Reference.JustJunkItems.EMPTYTINCAN.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.EMPTYTINCAN.getRegistryName());
        setMaxStackSize(16);
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
