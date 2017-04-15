package com.deflatedpickle.justjunk.blocks;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPileofgarbage extends Block{
    public BlockPileofgarbage() {
        super(Material.SPONGE);
        setUnlocalizedName(Reference.JustJunkBlocks.PILEOFGARBAGE.getUnlocalizedName());
        setRegistryName(Reference.JustJunkBlocks.PILEOFGARBAGE.getRegistryName());
        setHardness(0.6F);
        setResistance(0.0F);
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
