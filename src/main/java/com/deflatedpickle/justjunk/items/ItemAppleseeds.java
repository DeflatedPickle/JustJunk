package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.ItemFood;

public class ItemAppleseeds extends ItemFood{
    public ItemAppleseeds() {
        super(1, 0.0F, true);
        setUnlocalizedName(Reference.JustJunkItems.APPLESEEDS.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.APPLESEEDS.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
