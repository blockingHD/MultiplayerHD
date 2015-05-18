package com.blockingHD.MultiplayerHD.world.gen;

import com.blockingHD.MultiplayerHD.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class WorldGeneratorLamp implements IWorldGenerator {

    private WorldGenMinable Nickelgen = new WorldGenMinable(ModBlocks.Nickel_ore, 4);

    @Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.dimensionId == 0) {
//            if (random.nextInt(10) == 0) {
//                int x = chunkX * 16 + random.nextInt(16);
//                int z = chunkZ * 16 + random.nextInt(16);
//                int y = world.getHeightValue(x, z);
//                generateFlag(world, x, y, z);
//            }
            for(int i = 0; i < 5; i ++){
                int randX = chunkX * 16 + random.nextInt(16);
                int randZ = chunkZ * 16 + random.nextInt(16);
                int randY = random.nextInt(20 + random.nextInt(10));
                Nickelgen.generate(world, random, randX, randY, randZ);
            }
        }
    }


//    private void generateFlag(World world, int x, int y, int z) {
//        for (int i = 0; i < 10; i++) {
//            world.setBlock(x, y + i, z, Blocks.fence, 0, 2);
//        }
//        for (int dx = 0; dx < 3; dx++) {
//            for (int dy = 0; dy < 3; dy++) {
//                world.setBlock(x + dx + 1, y + dy + 7, z, ModBlocks.WoodLamp);
//            }
//        }
//    }

}
