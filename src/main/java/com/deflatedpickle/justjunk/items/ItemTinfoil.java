package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.Item;

public class ItemTinfoil extends Item{
    public ItemTinfoil(){
        setUnlocalizedName(Reference.JustJunkItems.TINFOIL.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.TINFOIL.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
