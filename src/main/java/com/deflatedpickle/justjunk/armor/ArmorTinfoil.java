package com.deflatedpickle.justjunk.armor;

import com.deflatedpickle.justjunk.JustJunk;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import static com.deflatedpickle.justjunk.init.ModItems.tinfoilArmorMaterial;

public class ArmorTinfoil extends ItemArmor {
    public ArmorTinfoil(String unlocalizedName, String registryName, int renderIndex, EntityEquipmentSlot armorType){
        super(tinfoilArmorMaterial, renderIndex, armorType);
        setUnlocalizedName(unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
