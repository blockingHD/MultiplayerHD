package com.blockingHD.MultiplayerHD.blocks;

import com.blockingHD.MultiplayerHD.creativetab.CreativeTabMultiplayerHD;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockCheese extends BlockMHD{

    public BlockCheese(){
        super();
        GameRegistry.registerBlock(this, "Cheese");
        this.setBlockName("Cheese");
        this.setCreativeTab(CreativeTabMultiplayerHD.MHD_TAB);
    }


}
