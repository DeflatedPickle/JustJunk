package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.ItemFood;

public class ItemApplecore extends ItemFood{
    public ItemApplecore() {
        super(1, 0.0F, true);
        setUnlocalizedName(Reference.JustJunkItems.APPLECORE.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.APPLECORE.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
