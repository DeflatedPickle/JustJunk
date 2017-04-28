package com.deflatedpickle.justjunk.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
    public static void register(){
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.emptytincan), ModItems.tiningot, ModItems.tiningot);
        GameRegistry.addSmelting(ModItems.emptytincan, new ItemStack(ModItems.tiningot), 0.5F);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tinfoil, 2), ModItems.tiningot);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.toothbrushshiv), ModItems.toothbrush, Items.FLINT);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tiningot), ModItems.tinfoil, ModItems.tinfoil, ModItems.tinfoil, ModItems.tinfoil);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodenchunk, 2), ModItems.brokenstick);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS), ModItems.woodenchunk, ModItems.woodenchunk, ModItems.woodenchunk, ModItems.woodenchunk);

        GameRegistry.addSmelting(ModBlocks.tinore, new ItemStack(ModItems.tiningot), 1.0F);
        GameRegistry.addSmelting(ModBlocks.copperore, new ItemStack(ModItems.copperingot), 1.0F);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tinblock), "TTT", "TTT", "TTT", 'T', ModItems.tiningot);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tiningot, 9), ModBlocks.tinblock);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.copperblock), "CCC", "CCC", "CCC", 'C', ModItems.copperingot);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperingot, 9), ModBlocks.copperblock);

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.tinfoilhelmet), "TTT", "TXT", "XXX", 'T', ModItems.tinfoil);
    }
}
