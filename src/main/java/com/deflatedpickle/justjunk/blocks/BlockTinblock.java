package com.deflatedpickle.justjunk.blocks;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTinblock extends Block{
    public BlockTinblock() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.JustJunkBlocks.TINBLOCK.getUnlocalizedName());
        setRegistryName(Reference.JustJunkBlocks.TINBLOCK.getRegistryName());
        setHardness(5.0F);
        setResistance(30.0F);
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
