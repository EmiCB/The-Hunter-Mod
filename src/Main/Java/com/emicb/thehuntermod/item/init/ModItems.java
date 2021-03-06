package com.emicb.thehuntermod.item.init;

import com.emicb.thehuntermod.item.ItemCamoHelmet;
import com.emicb.thehuntermod.item.ItemPoisonArrow;
import com.emicb.thehuntermod.item.ItemTHM;
import com.emicb.thehuntermod.proxy.reference.Reference;
import com.emicb.thehuntermod.proxy.utility.LogHelper;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems 
{
	
	public static final ItemTHM poisonArrow = new ItemPoisonArrow();
	public static final ItemTHM camoHelmet = new ItemCamoHelmet();
	public static void init()
	{
		GameRegistry.registerItem(poisonArrow, "Poison_Arrow");
		LogHelper.info("Registered poisonArrow");
		GameRegistry.registerItem(camoHelmet, "Camo_Helmet");
		LogHelper.info("Registered camoHelmet");
	}
}
