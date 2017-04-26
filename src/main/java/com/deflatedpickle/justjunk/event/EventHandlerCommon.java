package com.deflatedpickle.justjunk.event;

import com.deflatedpickle.justjunk.init.ModItems;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

public class EventHandlerCommon {
    public static String the_item;

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onLivingEntityUseItemEventStart(LivingEntityUseItemEvent.Start event){
        // System.out.println("Item: " + event.getItem().getUnlocalizedName());
        the_item = event.getItem().getUnlocalizedName();
    }

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onLivingEntityUseItemEventFinish(LivingEntityUseItemEvent.Finish event) {
        if (the_item.equals("item.apple")){
            if (!event.getEntityLiving().world.isRemote) {
                EntityItem item = new EntityItem(event.getEntityLiving().world, event.getEntityLiving().posX, event.getEntityLiving().posY, event.getEntityLiving().posZ, new ItemStack(ModItems.applecore, 1));
                event.getEntityLiving().world.spawnEntity(item);
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onHarvestDropsEvent(HarvestDropsEvent event){
        // System.out.println("Block: " + event.getState().getBlock().getUnlocalizedName());
        if (event.getState().getBlock() == Blocks.DIAMOND_ORE){
            int random_number = (int) (Math.random() * 5);
            System.out.println(random_number);
            if (random_number == 4) {
                event.getDrops().clear();
                event.getDrops().add(new ItemStack(ModItems.crackeddiamond));
            }
        }
    }
}
