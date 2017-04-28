package com.deflatedpickle.justjunk.blocks;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCopperore extends Block{
    public BlockCopperore() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.JustJunkBlocks.COPPERORE.getUnlocalizedName());
        setRegistryName(Reference.JustJunkBlocks.COPPERORE.getRegistryName());
        setHardness(3.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 1);
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
