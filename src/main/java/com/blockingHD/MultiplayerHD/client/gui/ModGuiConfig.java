package com.blockingHD.MultiplayerHD.client.gui;

import com.blockingHD.MultiplayerHD.handler.ConfigHandler;
import com.blockingHD.MultiplayerHD.reference.Reference;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig {

	public ModGuiConfig(GuiScreen guiScreen) {
		super(guiScreen, new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), 
				Reference.MOD_ID, 
				false,
				false, 
				GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString()));
		// TODO Auto-generated constructor stub
	}


}