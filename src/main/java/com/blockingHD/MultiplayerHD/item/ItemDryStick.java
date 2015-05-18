package com.blockingHD.MultiplayerHD.item;

import com.blockingHD.MultiplayerHD.creativetab.CreativeTabMultiplayerHD;

import net.minecraftforge.oredict.OreDictionary;

public class ItemDryStick extends ItemMHD {
	public ItemDryStick(){
		super();
		OreDictionary.registerOre("stickWood", this);
		this.setUnlocalizedName("DryStick");
		this.setCreativeTab(CreativeTabMultiplayerHD.MHD_TAB);

	}
}
