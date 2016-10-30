package com.icupz.testMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid="testMod", name="Test Mod", version="1.7.2-1.0")
public class testMod {

    @Mod.Instance("testMod")
    public static testMod instance;

    @Mod.EventHandler
    public void preInit(FMLPostInitializationEvent event){ //items and blocks

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){ //guis and tile entities and recipes

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){ //wrap things up or things after mods are done

    }
}
