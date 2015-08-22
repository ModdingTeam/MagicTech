package com.ModdingTeam.MagicTech;

import com.ModdingTeam.MagicTech.init.ModBlocks;
import com.ModdingTeam.MagicTech.init.ModItems;
import com.ModdingTeam.MagicTech.proxy.IProxy;
import com.ModdingTeam.MagicTech.reference.References;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.VERSION)
public class MagicTech {

    @Mod.Instance(References.MOD_ID)
    public static MagicTech Instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        ModItems.init();

        ModBlocks.init();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

        proxy.initRenderingAndTextures();

        proxy.registerEventHandlers();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }


}
