package com.blockingHD.MultiplayerHD.blocks;

import com.blockingHD.MultiplayerHD.creativetab.CreativeTabMultiplayerHD;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public class BlockCheese extends BlockMHD{

    public BlockCheese(){
        super(Material.cactus);
        GameRegistry.registerBlock(this, "Cheese_Block");
        this.setBlockName("Cheese_Block");
        this.setHardness(0.4F);
        this.setCreativeTab(CreativeTabMultiplayerHD.MHD_TAB);
    }


}
