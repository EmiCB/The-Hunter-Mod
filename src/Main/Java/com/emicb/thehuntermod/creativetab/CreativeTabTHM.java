package com.emicb.thehuntermod.creativetab;

import com.emicb.thehuntermod.item.init.ModBlocks;
import com.emicb.thehuntermod.item.init.ModItems;
import com.emicb.thehuntermod.proxy.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTHM 
{
	public static final CreativeTabs THM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			//sets icon for creative tab
			return ModItems.poisonArrow;
		}
		
	};
}
