package com.blockingHD.MultiplayerHD.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.blockingHD.MultiplayerHD.init.ModBlocks.Cheese_Block;
import static com.blockingHD.MultiplayerHD.init.ModItems.Cheese_Ingot;
import static cpw.mods.fml.common.registry.GameRegistry.addRecipe;

public class Recipes {
	public static void init(){
		//Shaped
		addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.WoodLamp), "sgs", "gsg", "srs", 's', new ItemStack(ModItems.DryStick), 'g', new ItemStack(Blocks.glass), 'r', new ItemStack(Items.redstone)));
        addRecipe(new ShapedOreRecipe(new ItemStack(Cheese_Block), "ccc","ccc","ccc", 'c', new ItemStack(Cheese_Ingot)));
		
		//Shapeless
        addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.Cheese_Ingot, 9), new ItemStack(ModBlocks.Cheese_Block)));
		//Smelting 
	}
}
