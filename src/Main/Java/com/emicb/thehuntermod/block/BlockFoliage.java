package com.emicb.thehuntermod.block;

import java.util.ArrayList;

import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IShearable;

import com.emicb.thehuntermod.creativetab.CreativeTabTHM;
import com.emicb.thehuntermod.proxy.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFoliage extends BlockLeavesBase implements IShearable
{
	public BlockFoliage()
	{
		super(Material.leaves,true);
		this.setBlockName("foliage");
		this.setHardness(.8f);
		this.setLightOpacity(1);
        this.setStepSound(soundTypeGrass);
        this.setCreativeTab(CreativeTabTHM.THM_TAB);
	}

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
    
	

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, int x,
			int y, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world,
			int x, int y, int z, int fortune) {
		// TODO Auto-generated method stub
		return null;
	}
}
