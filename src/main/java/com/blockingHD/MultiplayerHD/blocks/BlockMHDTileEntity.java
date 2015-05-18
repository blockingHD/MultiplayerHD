package com.blockingHD.MultiplayerHD.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public abstract class BlockMHDTileEntity extends BlockContainer {

    public BlockMHDTileEntity(Material material){
        super (material);
    }

    public BlockMHDTileEntity(){
        this(Material.rock);
    }
}
