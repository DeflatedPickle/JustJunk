package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import com.deflatedpickle.justjunk.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemToothbrush extends Item{
    public ItemToothbrush(){
        setUnlocalizedName(Reference.JustJunkItems.TOOTHBRUSH.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.TOOTHBRUSH.getRegistryName());
        setMaxStackSize(2);
        setCreativeTab(JustJunk.tabJustJunk);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand handIn, EnumFacing facing, float hitX, float hitY, float hitZ){
        playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.brokentoothbrush,1));
        playerIn.addExperience(1);
        playerIn.getHeldItem(handIn).shrink(1);
        return super.onItemUse(playerIn, worldIn, pos, handIn, facing, hitX, hitY, hitZ);
    }
}
