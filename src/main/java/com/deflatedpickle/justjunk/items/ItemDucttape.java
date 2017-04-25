package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemDucttape extends Item{
    public ItemDucttape(){
        setUnlocalizedName(Reference.JustJunkItems.DUCTTAPE.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.DUCTTAPE.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced){
        tooltip.add("One of many rolls in Tencao's toolkit.");
    }
}
