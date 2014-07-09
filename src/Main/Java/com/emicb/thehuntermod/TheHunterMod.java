package com.emicb.thehuntermod;

import com.emicb.thehuntermod.proxy.IProxy;
import com.emicb.thehuntermod.proxy.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TheHunterMod
{
	@Mod.Instance(Reference.MOD_ID)
	public static TheHunterMod instance;
	
	@SidedProxy(clientSide="com.emicb.thehuntermod.proxy.ClientProxy", serverSide="com.emicb.thehuntermod.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
