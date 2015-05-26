package com.blockingHD.MultiplayerHD.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.blockingHD.MultiplayerHD.init.ModBlocks.*;
import static com.blockingHD.MultiplayerHD.init.ModBlocks.Cheese_Block;
import static com.blockingHD.MultiplayerHD.init.ModItems.*;
import static com.blockingHD.MultiplayerHD.init.ModItems.Cheese_Ingot;
import static cpw.mods.fml.common.registry.GameRegistry.addRecipe;
import static cpw.mods.fml.common.registry.GameRegistry.addSmelting;

public class Recipes {
	public static void init() {
        //Shaped
        addRecipe(new ShapedOreRecipe(new ItemStack(WoodLamp), "sgs", "gsg", "srs", 's', new ItemStack(DryStick), 'g', new ItemStack(Blocks.glass), 'r', new ItemStack(Items.redstone)));
        addRecipe(new ShapedOreRecipe(new ItemStack(Cheese_Block), "ccc", "ccc", "ccc", 'c', new ItemStack(Cheese_Ingot)));

        //Shapeless
        addRecipe(new ShapelessOreRecipe(new ItemStack(Cheese_Ingot, 9), new ItemStack(Cheese_Block)));
        addRecipe(new ShapelessOreRecipe(new ItemStack(Wok, 1), new ItemStack(Items.bowl), new ItemStack(DryStick)));

        //Smelting
        addSmelting(new ItemStack(ModBlocks.Nickel_ore), new ItemStack(ModItems.Nickel_Ingot), 10);
    }
}
