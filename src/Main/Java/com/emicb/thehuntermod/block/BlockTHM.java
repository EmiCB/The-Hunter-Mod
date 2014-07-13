package com.emicb.thehuntermod.block;

import com.emicb.thehuntermod.creativetab.CreativeTabTHM;
import com.emicb.thehuntermod.proxy.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockTHM extends Block
{
	public BlockTHM(Material material)
	{
		super(material);
		//This sets the creative tab
		this.setCreativeTab(CreativeTabTHM.THM_TAB);
	}
	
	// Makes the general block out of rock
	public BlockTHM ()
	{
		this(Material.rock);
	}
	// Ends here
	
	@Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        //tile.modid:blockname.name is the format
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
