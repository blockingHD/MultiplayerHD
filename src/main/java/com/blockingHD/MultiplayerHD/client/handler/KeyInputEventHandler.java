package com.blockingHD.MultiplayerHD.client.handler;

import com.blockingHD.MultiplayerHD.client.settings.Keybindings;
import com.blockingHD.MultiplayerHD.network.NetworkHandler;
import com.blockingHD.MultiplayerHD.reference.Key;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {

	private static Key getPressedKeybinding() {

		if (Keybindings.charge.isPressed()) {

			return Key.CHARGE;
		} else if (Keybindings.release.isPressed()) {

			return Key.RELEASE;
		}

		return Key.UNKNOWN;
	}

	@SubscribeEvent
	public void handleKeyImputEvent(InputEvent.KeyInputEvent event) {

    }
}

