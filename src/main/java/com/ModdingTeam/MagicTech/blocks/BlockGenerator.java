package com.ModdingTeam.MagicTech.blocks;

import com.ModdingTeam.MagicTech.reference.Names;
import com.ModdingTeam.MagicTech.reference.References;
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

    }
}
