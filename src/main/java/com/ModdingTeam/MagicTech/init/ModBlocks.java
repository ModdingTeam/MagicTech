package com.ModdingTeam.MagicTech.init;

import com.ModdingTeam.MagicTech.blocks.BlockGenerator;
import com.ModdingTeam.MagicTech.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {

    public static final Block blockGenerator = new BlockGenerator();


    public static void init(){

        GameRegistry.registerBlock(blockGenerator, Names.Blocks.GENERATOR);

    }

}
