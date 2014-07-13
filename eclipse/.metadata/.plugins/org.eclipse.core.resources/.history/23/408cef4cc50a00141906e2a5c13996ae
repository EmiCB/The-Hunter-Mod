package com.emicb.thehuntermod.item;

import com.emicb.thehuntermod.proxy.reference.Reference;
import com.emicb.thehuntermod.proxy.utility.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTHM extends Item
{
	public ItemTHM()
	{
		super();
		LogHelper.info("Item wrapper");
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName (super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName (super.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalizedName (String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+ 1);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}
