package com.baseballaholic.CalloutsMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class ModInputHandler extends CommandBase{
	
	private CalloutHUD calloutHUD;

    @SuppressWarnings("deprecation")
	public ModInputHandler(CalloutHUD calloutHUD) {
        this.calloutHUD = calloutHUD;
        FMLCommonHandler.instance().bus().register(this);
    }
    
    @Override
    public String getCommandName() {
        return "moveHUD";
    }
    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/moveHUD";
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
        Minecraft mc = Minecraft.getMinecraft();
		EntityPlayerSP player = mc.thePlayer;
        if(args.length != 2) {
        	player.addChatComponentMessage(new ChatComponentText("Incorrect Amount of Arguments Provided. Please Provide an X and Y Position"));
        }
        else {
	        try {
	        	calloutHUD.setPosition(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	        	WriteToFile.Write();
	        }
	        catch(Exception e) {
	        	player.addChatComponentMessage(new ChatComponentText("Invalid Argument Type. Example Usage: /moveHUD 230 150"));
	        }
        }
    }
}