package com.baseballaholic.CalloutsMod;

import java.util.List;


import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.HashMap;
import java.util.Map;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

// Update Ideas: Resize/ReColor HUD
// Changeable Tick Setting
@Mod(modid = "CalloutsMod", name = "Callouts Mod", version = "0.1", clientSideOnly = true, acceptedMinecraftVersions = "1.8.9")
public class CalloutsMod {
	public static CalloutsMod instance;
	
	Map<String, List <Callouts>> mapList = new HashMap<String,List <Callouts>>();
	String mapName;
	private CalloutHUD calloutHUD;
	
	@SuppressWarnings("deprecation")
	@EventHandler
    public void init(FMLInitializationEvent event) {
		instance = this;
		mapList = CalloutCreator.getAllCallouts();
		ClientCommandHandler.instance.registerCommand(new areacommand());
		ClientCommandHandler.instance.registerCommand(new ModInputHandler(calloutHUD));
		FMLCommonHandler.instance().bus().register(this);
		CreateFile.Create();
	}
	private int tickCounter = 0;
	private String n = "";
	private Callouts last = null;
	private boolean same = false;
	private Callouts c;
	
	
    public CalloutsMod() {
    	String[] data = ReadFile.Read();
    	if(data.length > 1) {
    		calloutHUD = new CalloutHUD(Integer.parseInt(data[0]), Integer.parseInt(data[1])); // Initial position
    	}
    	else {
    		calloutHUD = new CalloutHUD(0, 0);
    	}
    }
    
	@SubscribeEvent
	public void onClientTick(TickEvent.ClientTickEvent event) {
	    if (event.phase == TickEvent.Phase.START) {
	        tickCounter++;

	        if (tickCounter >= 5) {
	            tickCounter = 0;
	            Minecraft mc = Minecraft.getMinecraft();
	    		EntityPlayerSP player = mc.thePlayer;
	    		if(player == null) return;
	    		Position coords = CalloutsMod.instance.updateCoordinates();
	    		if(mapList.containsKey(mapName)) {
	    			if(last != null) {
	    				same = false;
		    			for (Region region : last.regions) {
		    				if(region.isInside(coords)) {
			    				c = last;
			    				same = true;
			    			}
		    			}
	    			}
	    			if(!same) {
	    				c = findCallout(coords);
	    			}
		            if(c != null) {
		            	n = c.getName();
		            }
	    		}
	        }
	    }
	}
	
	@SubscribeEvent
    public void onRenderGameOverlay(RenderGameOverlayEvent.Text event) {
        if (event.type == RenderGameOverlayEvent.ElementType.TEXT) {
            calloutHUD.renderCalloutHUD(n);
        }
    }
	
	private boolean worldJustLoaded = false;
	
	@SubscribeEvent
	public void onWorldLoad(WorldEvent.Load event) {
	  this.worldJustLoaded = true;
	}

	@SubscribeEvent
	public void onTick(TickEvent.PlayerTickEvent event) {
	  if(this.worldJustLoaded) {
	    this.worldJustLoaded = false;
	    Minecraft mc = Minecraft.getMinecraft();
        Scoreboard scoreboard = mc.theWorld.getScoreboard();
        boolean inMap = false;
        for (Score score : scoreboard.getScores()) {
        	String scoreName = score.getPlayerName();
        	ScorePlayerTeam team = getScoreboardTeams(scoreboard, scoreName);
        	String prefixName = EnumChatFormatting.getTextWithoutFormattingCodes(team.getColorPrefix() + team.getColorSuffix());
        	if(prefixName.contains("Map:")) {
        		String[] split = prefixName.split(" ");
        		String mapName = "";
        		inMap = true;
        		for(int i = 1;i < split.length;i++) {
        			mapName += (mapName.isEmpty() ? "" : " ") + split[i];
        		}
        		this.mapName = mapName;
        	}
       
        }
        if(!inMap) {
        	n = " ";
        	this.mapName = "N/A";
        }
	  }
	}
	
	public Position updateCoordinates() {
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayerSP player = mc.thePlayer;
		double posX = player.posX;
		double posY = player.posY;
		double posZ = player.posZ;
		return new Position(posX, posY, posZ);
		
	}
	
	public Callouts findCallout(Position coords) {
		for(Callouts callout : mapList.get(mapName) ) {
			for(Region region : callout.regions) {
				if (region.isInside(coords)) {
					last = callout;
					return callout;
				}
			}
		}
		return null;
	}

	public static ScorePlayerTeam getScoreboardTeams(Scoreboard sb, String playerName) {
    	for (ScorePlayerTeam team : sb.getTeams()) {
            if (team.getMembershipCollection().contains(playerName)) {
            	return team;
            }
    	}
    	return null;
    }
}
	
