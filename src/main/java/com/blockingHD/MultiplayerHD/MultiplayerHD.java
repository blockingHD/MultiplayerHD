package com.blockingHD.MultiplayerHD;

import com.blockingHD.MultiplayerHD.client.handler.KeyInputEventHandler;
import com.blockingHD.MultiplayerHD.handler.ConfigHandler;
import com.blockingHD.MultiplayerHD.init.ModBlocks;
import com.blockingHD.MultiplayerHD.init.ModItems;
import com.blockingHD.MultiplayerHD.init.ModTileEntities;
import com.blockingHD.MultiplayerHD.init.Recipes;
import com.blockingHD.MultiplayerHD.network.NetworkHandler;
import com.blockingHD.MultiplayerHD.proxy.IProxy;
import com.blockingHD.MultiplayerHD.reference.Reference;
import com.blockingHD.MultiplayerHD.utility.logHelper;
import com.blockingHD.MultiplayerHD.world.gen.WorldGeneratorLamp;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MultiplayerHD {

	@Mod.Instance(Reference.MOD_ID)
	public static MultiplayerHD instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());

		proxy.registerKeyBindings();

		// world generators registration
		GameRegistry.registerWorldGenerator(new WorldGeneratorLamp(), 0);
        ModTileEntities.init();
		NetworkHandler.init();
		logHelper.info("PreInit Complete!");

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

		ModItems.init();
		ModBlocks.init();
		Recipes.init();

		logHelper.info("Init Complete!");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		logHelper.info("PostInit Complete!");
	}
}
