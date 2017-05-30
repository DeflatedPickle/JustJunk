package com.deflatedpickle.justjunk.blocks;

import com.deflatedpickle.justjunk.JustJunk;
import com.deflatedpickle.justjunk.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPyriteore extends Block{
    public BlockPyriteore() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.JustJunkBlocks.PYRITEORE.getUnlocalizedName());
        setRegistryName(Reference.JustJunkBlocks.PYRITEORE.getRegistryName());
        setHardness(3.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 1);
        setCreativeTab(JustJunk.tabJustJunk);
    }
}
