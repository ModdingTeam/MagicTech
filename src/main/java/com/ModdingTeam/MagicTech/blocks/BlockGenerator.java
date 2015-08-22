package com.ModdingTeam.MagicTech.blocks;

import com.ModdingTeam.MagicTech.reference.Names;
import com.ModdingTeam.MagicTech.reference.References;
import com.ModdingTeam.MagicTech.reference.Textures;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockGenerator extends Block {

    public IIcon Bottom;
    public IIcon Top;
    public IIcon Front;
    public IIcon Back;
    public IIcon Left;
    public IIcon Right;

    public BlockGenerator() {
        super(Material.iron);
        this.setBlockName(Names.Blocks.GENERATOR);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        Bottom = iconRegister.registerIcon(Textures.Blocks.GENBOTTOM);
        Top = iconRegister.registerIcon(Textures.Blocks.GENTOP);
        Front = iconRegister.registerIcon(Textures.Blocks.GENFRONT);
        Back = iconRegister.registerIcon(Textures.Blocks.GENBACK);
        Left = iconRegister.registerIcon(Textures.Blocks.GENLEFT);
        Right = iconRegister.registerIcon(Textures.Blocks.GENRIGHT);

    }

    @Override
    public IIcon getIcon(int side, int meta) {
        if(side == 0){
            return Bottom;
        }else if(side == 1){
            return Top;
        }else if(side == 2){
            return Front;
        }else if(side == 3){
            return Back;
        }else if(side == 4){
            return Left;
        }else if(side == 5){
            return Right;
        }
        return null;
    }

}
