package com.ModdingTeam.MagicTech.reference;

import com.ModdingTeam.MagicTech.util.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

/**
 * Created by jalle_000 on 8/22/2015.
 */
public class Textures {

    public static final String RESOURCE_PREFIX = References.LOWERCASE_MOD_ID + ":";


    public static final class Items{
        private static final String ITEM_TEXTURE_LOCATION = RESOURCE_PREFIX + "textures/items/";


    }

    public static final class Blocks{

        private static final String BLOCK_TEXTURE_LOCATION = RESOURCE_PREFIX + "textures/blocks";

        public static final String GENBOTTOM = References.LOWERCASE_MOD_ID + ":GenBottom";
        public static final String GENTOP = References.LOWERCASE_MOD_ID + ":GenTop";
        public static final String GENFRONT = References.LOWERCASE_MOD_ID + ":GenFront";
        public static final String GENBACK = References.LOWERCASE_MOD_ID + ":GenBack";
        public static final String GENLEFT = References.LOWERCASE_MOD_ID + ":GenLeft";
        public static final String GENRIGHT = References.LOWERCASE_MOD_ID + ":GenRight";



    }

    public static final class Armor
    {

    }

    public static final class Model
    {
        private static final String MODEL_TEXTURE_LOCATION = "textures/models/";

    }

    public static final class Gui
    {

        protected static final String GUI_TEXTURE_LOCATION = "textures/gui/";


    }

}
