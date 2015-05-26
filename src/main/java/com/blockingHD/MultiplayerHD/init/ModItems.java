package com.blockingHD.MultiplayerHD.init;

import com.blockingHD.MultiplayerHD.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

import com.blockingHD.MultiplayerHD.reference.Reference;
import net.minecraft.item.ItemFood;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final ItemMHD DryStick = new ItemDryStick();
	public static final ItemMHD Wok = new ItemWok();

	//Ingots
	public static final ItemMHD Nickel_Ingot = new ItemNickelIngot();

    //Food
	public static final ItemFood Cheese_Ingot = new ItemCheese_Ingot();



	public static void init(){
		GameRegistry.registerItem(DryStick, "DryStick");
        GameRegistry.registerItem(Wok, "Wok");

		//Ingots
		GameRegistry.registerItem(Nickel_Ingot, "Nickel_Ingot");

        //Food
		GameRegistry.registerItem(Cheese_Ingot, "Cheese_Ingot");
	}
}
