package com.emicb.thehuntermod.block;

import net.minecraft.block.material.Material;

import com.emicb.thehuntermod.creativetab.CreativeTabTHM;

public class BlockFoliage extends BlockTHM
{
	public BlockFoliage()
	{
		super(Material.leaves);
		this.setBlockName("foliage");
		this.setHardness(.3f);
	}
}
