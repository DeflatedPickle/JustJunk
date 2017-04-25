package com.deflatedpickle.justjunk.event;

import com.deflatedpickle.justjunk.init.ModItems;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class FMLEventHandlerCommon {
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onItemCraftedEvent(ItemCraftedEvent event){
        //System.out.println(event.crafting.getUnlocalizedName());
        if (event.crafting.getUnlocalizedName().equals("item.stick")){
            int random_number = (int) (Math.random() * 4);
            if (!event.player.world.isRemote) {
                event.player.inventory.addItemStackToInventory(new ItemStack(ModItems.brokenstick, random_number));
                event.crafting.shrink(random_number);
                if (event.player instanceof EntityPlayerMP){
                    ((EntityPlayerMP) event.player).sendContainerToPlayer(event.player.inventoryContainer);
                }
            }
        }
    }
}
