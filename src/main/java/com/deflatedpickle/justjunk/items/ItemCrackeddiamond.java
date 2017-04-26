package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.Item;

public class ItemCrackeddiamond extends Item{
    public ItemCrackeddiamond(){
        setUnlocalizedName(Reference.JustJunkItems.CRACKEDDIAMOND.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.CRACKEDDIAMOND.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
