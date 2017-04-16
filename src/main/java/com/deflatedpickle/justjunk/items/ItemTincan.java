package com.deflatedpickle.justjunk.items;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import com.deflatedpickle.justjunk.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemTincan extends Item{
    public ItemTincan(){
        setUnlocalizedName(Reference.JustJunkItems.TINCAN.getUnlocalizedName());
        setRegistryName(Reference.JustJunkItems.TINCAN.getRegistryName());
        setMaxStackSize(6);
        setMaxDamage(1);
        setCreativeTab(JustJunk.tabJustJunk);
    }

    private static final Item[] loot_table = new Item[] {
            Items.PAPER,
            Items.ROTTEN_FLESH,
            Items.RABBIT,
            Items.RECORD_CAT,
            Items.REDSTONE,

            ModItems.rottingfish,
            ModItems.toothbrush,
            ModItems.brokentoothbrush,
            ModItems.tinfoil,
            ModItems.tinfoilhelmet
    };

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
        playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.emptytincan,1));
        playerIn.addExperience(1);
        // playerIn.inventory.deleteStack(playerIn.getHeldItem(handIn));
        playerIn.getHeldItem(handIn).shrink(1);
        ItemStack random_item = new ItemStack(loot_table[(int) (Math.random() * loot_table.length)], 1);
        playerIn.inventory.addItemStackToInventory(random_item);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}