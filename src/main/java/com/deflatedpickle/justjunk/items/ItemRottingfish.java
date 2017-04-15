package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.ItemFood;

public class ItemRottingfish extends ItemFood{
    public ItemRottingfish() {
        super(1, 0.0F, true);
        setUnlocalizedName(Reference.JustJunkItems.ROTTINGFISH.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.ROTTINGFISH.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
