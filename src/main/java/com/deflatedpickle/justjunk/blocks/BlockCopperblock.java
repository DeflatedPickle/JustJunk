package com.deflatedpickle.justjunk.blocks;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCopperblock extends Block{
    public BlockCopperblock() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.JustJunkBlocks.COPPERBLOCK.getUnlocalizedName());
        setRegistryName(Reference.JustJunkBlocks.COPPERBLOCK.getRegistryName());
        setHardness(5.0F);
        setResistance(30.0F);
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
