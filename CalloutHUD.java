package com.baseballaholic.CalloutsMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;

public class CalloutHUD extends Gui {
	
	public static CalloutHUD instance;
	private int posX, posY;

    public CalloutHUD(int initialX, int initialY) {
        this.posX = initialX;
        this.posY = initialY;
        instance = this;
    }
    
    public void renderCalloutHUD(String str) {
        drawString(Minecraft.getMinecraft().fontRendererObj, str, posX, posY, 0xFFFFFF);
    }

    public void setPosition(int x, int y) {
        this.posX = x;
        this.posY = y;
    }
    
    public int getX() {
    	return posX;
    }
    
    public int getY() {
    	return posY;
    }
}
