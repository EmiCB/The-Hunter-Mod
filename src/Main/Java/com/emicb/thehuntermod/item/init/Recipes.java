package com.emicb.thehuntermod.item.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes 
{
	public static void init ()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.poisonArrow), new Object[]
				{
					new ItemStack(Items.potionitem,1,8196), Items.arrow
				});
	}
}
