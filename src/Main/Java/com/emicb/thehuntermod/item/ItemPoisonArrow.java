package com.emicb.thehuntermod.item;

import com.emicb.thehuntermod.proxy.utility.LogHelper;

public class ItemPoisonArrow extends ItemTHM
{
	public ItemPoisonArrow()
	{
		super();
		this.setUnlocalizedName("poisonArrow");
		this.maxStackSize=16;
		LogHelper.info("ItemPoisonArrow");
	}

}
