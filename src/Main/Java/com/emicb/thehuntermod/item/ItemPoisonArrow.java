package com.emicb.thehuntermod.item;

import com.emicb.thehuntermod.creativetab.CreativeTabTHM;
import com.emicb.thehuntermod.proxy.utility.LogHelper;

public class ItemPoisonArrow extends ItemTHM
{
	public ItemPoisonArrow()
	{
		super();
		this.setUnlocalizedName("poisonArrow");
		//As it says, this is the max stack size
		this.maxStackSize=32;
		LogHelper.info("ItemPoisonArrow");
	}

}
