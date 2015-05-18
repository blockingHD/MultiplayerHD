package com.blockingHD.MultiplayerHD.blocks;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockOreNickel extends BlockMHD {

	public BlockOreNickel() {

		super();
		GameRegistry.registerBlock(this, "Nickel_ore");
		this.setBlockName("Nickel_ore");
		this.setHardness(3F);
		this.setResistance(10F);
		this.setHarvestLevel("pickaxe", 2);
	}

}
