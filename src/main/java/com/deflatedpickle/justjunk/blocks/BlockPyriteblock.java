package com.deflatedpickle.justjunk.blocks;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPyriteblock extends Block{
    public BlockPyriteblock() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.JustJunkBlocks.PYRITEBLOCK.getUnlocalizedName());
        setRegistryName(Reference.JustJunkBlocks.PYRITEBLOCK.getRegistryName());
        setHardness(5.0F);
        setResistance(30.0F);
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
