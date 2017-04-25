package com.deflatedpickle.justjunk.event;

import com.deflatedpickle.justjunk.init.ModItems;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

public class EventHandlerCommon {
    public static String the_item;

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onLivingEntityUseItemEventStart(LivingEntityUseItemEvent.Start event){
        //System.out.println(event.getItem().getUnlocalizedName());
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
}
