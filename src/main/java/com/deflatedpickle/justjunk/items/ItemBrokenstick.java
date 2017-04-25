package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.Item;

public class ItemBrokenstick extends Item{
    public ItemBrokenstick(){
        setUnlocalizedName(Reference.JustJunkItems.BROKENSTICK.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.BROKENSTICK.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
