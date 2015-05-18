package com.blockingHD.MultiplayerHD.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public class BlockWoodLamp extends BlockMHD {

	public BlockWoodLamp() {

		super(Material.wood);
		GameRegistry.registerBlock(this, "WoodLamp");
		this.setBlockName("WoodLamp");
		this.setHardness(2);
		this.setResistance(5);
		this.setLightLevel(1);

	}
}
