package com.blockingHD.MultiplayerHD.init;

import com.blockingHD.MultiplayerHD.reference.Names;
import com.blockingHD.MultiplayerHD.tileentity.TileEntityCamoMine;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities {

    public static void init(){
        GameRegistry.registerTileEntity(TileEntityCamoMine.class, Names.TileEntities.CAMO_MINE);
    }
}
