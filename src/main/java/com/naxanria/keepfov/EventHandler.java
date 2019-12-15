package com.naxanria.keepfov;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.common.MinecraftForge;

/*
  @author: Naxanria
*/
public class EventHandler
{
  private static Minecraft minecraft = Minecraft.getInstance();
  
  public static void init()
  {
    MinecraftForge.EVENT_BUS.addListener(EventHandler::fovModifier);
  }
  
  public static void fovModifier(final EntityViewRenderEvent.FOVModifier event)
  {
    event.setFOV(minecraft.gameSettings.fov);
  }
}
