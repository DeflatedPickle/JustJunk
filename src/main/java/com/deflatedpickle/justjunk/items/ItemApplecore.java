package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import com.deflatedpickle.justjunk.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemApplecore extends ItemFood{
    public ItemApplecore() {
        super(1, 0.0F, true);
        setUnlocalizedName(Reference.JustJunkItems.APPLECORE.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.APPLECORE.getRegistryName());
        setCreativeTab(JustJunk.tabJustJunk);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        if (!entityLiving.world.isRemote) {
            int random_number = (int) (Math.random() * 4);
            EntityItem item = new EntityItem(entityLiving.world, entityLiving.posX, entityLiving.posY, entityLiving.posZ, new ItemStack(ModItems.appleseeds, random_number));
            entityLiving.world.spawnEntity(item);
        }
        return stack;
    }
}
