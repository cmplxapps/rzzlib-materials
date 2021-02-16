package com.cmplx.cmplxcore_materials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MetalBlockIron extends Block
{

	public MetalBlockIron()
	{
		
		super(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 6.0f).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE));
		
		
		
		
		
	}
	
	
	
	
	
}
