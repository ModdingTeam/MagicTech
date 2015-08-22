package com.ModdingTeam.MagicTech.util;

import com.ModdingTeam.MagicTech.reference.References;
import net.minecraft.util.ResourceLocation;

public class ResourceLocationHelper {

    public static ResourceLocation getResourceLocation(String modId, String path){
        return new ResourceLocation(modId, path);
    }

    public static ResourceLocation getResourceLocation(String path){
        return getResourceLocation(References.LOWERCASE_MOD_ID, path);
    }

}
