package com.blockingHD.MultiplayerHD.creativetab;

import com.blockingHD.MultiplayerHD.init.ModItems;
import com.blockingHD.MultiplayerHD.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMultiplayerHD {

	public static final CreativeTabs MHD_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
	
	@Override
	public Item getTabIconItem(){
		return ModItems.DryStick;
		}
	
	};
}
