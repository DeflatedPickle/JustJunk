package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemToothbrushshiv extends ItemSword{
    public ItemToothbrushshiv(){
        super(Item.ToolMaterial.WOOD);
        setUnlocalizedName(Reference.JustJunkItems.TOOTHBRUSHSHIV.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.TOOTHBRUSHSHIV.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
