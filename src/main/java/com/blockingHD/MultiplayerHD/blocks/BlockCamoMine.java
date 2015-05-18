package com.blockingHD.MultiplayerHD.blocks;

import com.blockingHD.MultiplayerHD.tileentity.TileEntityCamoMine;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCamoMine extends BlockMHDTileEntity{

    public BlockCamoMine() {

        super();
        GameRegistry.registerBlock(this, "CamoMine");
        this.setBlockName("CamoMine");

    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_){
        return new TileEntityCamoMine();
    }

}
