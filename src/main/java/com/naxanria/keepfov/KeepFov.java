package com.naxanria.keepfov;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
  @author: Naxanria
*/
@SuppressWarnings("Convert2MethodRef")
@Mod(KeepFov.MODID)
public class KeepFov
{
  public static final String MODID = "keepfov";
  public static final Logger LOGGER = LogManager.getLogger(MODID);
  
  public KeepFov()
  {
    DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> EventHandler.init());
    DistExecutor.runWhenOn(Dist.DEDICATED_SERVER, () -> () -> LOGGER.warn("This is a client only mod!"));
  }
}
