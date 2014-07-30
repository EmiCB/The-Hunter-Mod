package com.emicb.thehuntermod.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityPoisonArrow extends EntityArrow implements IProjectile
{
	public EntityPoisonArrow(World world)
    {
		super (world);
    }

    public EntityPoisonArrow(World world, double x, double y, double z)
    {
        super(world, x, y, z);
    }

    public EntityPoisonArrow(World world, EntityLivingBase shooter, EntityLivingBase target, float velocity, float wobble)
    {
        super(world, shooter, target, velocity, wobble);
        
    }

    public EntityPoisonArrow(World world, EntityLivingBase shooter, float velocity)
    {
        super(world, shooter, velocity);
    }
}