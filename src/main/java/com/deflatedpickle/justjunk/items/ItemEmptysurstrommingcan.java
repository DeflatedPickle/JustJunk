package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.Item;

public class ItemEmptysurstrommingcan extends Item{
    public ItemEmptysurstrommingcan(){
        setUnlocalizedName(Reference.JustJunkItems.EMPTYSURSTROMMINGCAN.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.EMPTYSURSTROMMINGCAN.getRegistryName());
        setMaxStackSize(16);
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
