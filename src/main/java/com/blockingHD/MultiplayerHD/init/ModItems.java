package com.blockingHD.MultiplayerHD.init;

import com.blockingHD.MultiplayerHD.item.ItemMHD;
import com.blockingHD.MultiplayerHD.item.ItemWok;
import cpw.mods.fml.common.registry.GameRegistry;

import com.blockingHD.MultiplayerHD.item.ItemDryStick;
import com.blockingHD.MultiplayerHD.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final ItemMHD DryStick = new ItemDryStick();
	public static final ItemMHD Wok = new ItemWok();



	public static void init(){
		GameRegistry.registerItem(DryStick, "DryStick");
        GameRegistry.registerItem(Wok, "Wok");
	}
}
