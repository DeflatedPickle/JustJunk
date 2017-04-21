package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import com.deflatedpickle.justjunk.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemSurstromming extends ItemFood{
    public ItemSurstromming() {
        super(1, 0.0F, false);
        setUnlocalizedName(Reference.JustJunkItems.SURSTROMMING.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.SURSTROMMING.getRegistryName());
        setMaxStackSize(1);
        setCreativeTab(JustJunk.tabJustJunk);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced){
        tooltip.add("Raw, fermented fish with just enough salt too keep from rotting. Might not be a good idea to eat this.");
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        entityLiving.addPotionEffect((new PotionEffect(Potion.getPotionById(30), 50, 0)));
        return new ItemStack(ModItems.emptysurstrommingcan);
    }
}
