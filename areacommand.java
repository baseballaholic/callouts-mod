package com.baseballaholic.CalloutsMod;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.client.Minecraft;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class areacommand extends CommandBase{
	@Override
    public String getCommandName() {
        return "testcommand";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/testcommand";
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if (!(sender instanceof EntityPlayerSP)) {
            return;
        }
        getScoreboardObjectives();
    }
	
    public static void getScoreboardObjectives() {
        Minecraft mc = Minecraft.getMinecraft();
		EntityPlayerSP player = mc.thePlayer;
        Scoreboard scoreboard = mc.theWorld.getScoreboard();
        for (ScoreObjective objective : scoreboard.getScoreObjectives()) {
            String objectiveName = objective.getDisplayName();
            player.addChatComponentMessage(new ChatComponentText("Scoreboard Objective: " + objectiveName));
        }
        for (Score score : scoreboard.getScores()) {
        	String scoreName = score.getPlayerName();
        	ScorePlayerTeam team = getScoreboardTeams(scoreboard, scoreName);
        	if(team == null) continue;
        	String prefixName = EnumChatFormatting.getTextWithoutFormattingCodes(team.getColorPrefix() + team.getColorSuffix());
        	if(prefixName.contains("Map:")) {
        		String[] split = prefixName.split(" ");
        		String mapName = "";
        		for(int i = 1;i < split.length;i++) {
        			mapName += (mapName.isEmpty() ? "" : " ") + split[i];
        		}
        		player.addChatComponentMessage(new ChatComponentText("Map Name: " + mapName));
        	}
        	else {
        		player.addChatComponentMessage(new ChatComponentText("prefix" + prefixName));
        	}
        	player.addChatComponentMessage(new ChatComponentText("Scoreboard Score: " + team.getColorPrefix() + " " + team.getColorSuffix()));
        	
        }
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


