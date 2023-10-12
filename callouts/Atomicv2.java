package com.baseballaholic.CalloutsMod.callouts;

import java.util.ArrayList;
import java.util.List;

import com.baseballaholic.CalloutsMod.Callouts;
import com.baseballaholic.CalloutsMod.Position;
import com.baseballaholic.CalloutsMod.Region;

public class Atomicv2 {
	public static List <Callouts> createCallouts() {
		List <Callouts> list = new ArrayList <Callouts> ();
		Region deepT1 = new Region(
				new Position(-888.7, 102, -210.7),
				new Position(-829.3, 106.5, -196.3)
				);
		Region deepT2 = new Region(
				new Position(-890.7, 103, -208.7),
				new Position(-890.7, 104.5, -206.3)
				);
		Region deepT3 = new Region(
				new Position(-843.7, 103, -195.3),
				new Position(-833.3, 104.5, -195.3)
				);
		list.add(new Callouts("Deep T", new Region[] {deepT1, deepT2, deepT3})); // Deep T	
		Region cage1 = new Region(
				new Position(-823.1, 103, -209.7),
				new Position(-813.3, 105.5, -218.7)
				);
		list.add(new Callouts("Cage", new Region[] {cage1})); // Cage
		Region outside1 = new Region(
				new Position(-818.3, 103, -208.7),
				new Position(-827.7, 104.5, -192.7)
				);
		Region outside2 = new Region(
				new Position(-813.6, 103, -197.7),
				new Position(-813.6, 104.5, -192.5)
				);
		Region outside3 = new Region(
				new Position(-809.5, 104.5, -168.3),
				new Position(-827.7, 103, -191.3)
				);
		Region outside4 = new Region(
				new Position(-808.7, 103, -168.3),
				new Position(-803.6, 104.5, -173.4)
				);
		Region outside5 = new Region(
				new Position(-798.3, 103, -164.3),
				new Position(-802.7, 104.5, -173.5)
				);
		Region outside6 = new Region(
				new Position(-795.7, 103, -182.7),
				new Position(-772.6, 104.5, -172.6)
				);
		list.add(new Callouts("Outside", new Region[] {outside1, outside2, outside3, outside4, outside5, outside6})); // Outside
		Region underSilo1 = new Region(
				new Position(-808.5, 103, -174.5),
				new Position(-796.3, 107, -188.7)
				);
		list.add(new Callouts("Under Silo", new Region[] {underSilo1})); // Under Silo
		Region green1 = new Region(
				new Position(-795.6, 103, -173.5),
				new Position(-783.6, 107.5, -162.3)
				);
		list.add(new Callouts("Green", new Region[] {green1})); // Green
		Region outsideSecret1 = new Region(
				new Position(-783, 103, -170.8),
				new Position(-772.3, 104.5, -161.9)
				);
		list.add(new Callouts("Outside Secret", new Region[] {outsideSecret1})); // Outside Secret
		Region miniRoof1 = new Region(
				new Position(-795.6, 108, -188.7),
				new Position(-784, 111, -183.4)
				);
		Region miniRoof2 = new Region(
				new Position(-792.7, 107, -182.7),
				new Position(-787.4, 108.5, -182.7)
				);
		list.add(new Callouts("Mini Roof", new Region[] {miniRoof1, miniRoof2})); // Mini Roof
		Region outsideMini1 = new Region(
				new Position(-779.4, 104.5, -188.7),
				new Position(-783.7, 103, -183.4)
				);
		Region outsideMini2 = new Region(
				new Position(-772.8, 103, -183.4),
				new Position(-778.7, 104.5, -190.2)
				);
		list.add(new Callouts("Outside Mini", new Region[] {outsideMini1, outsideMini2})); // Outside Mini
		Region garage1 = new Region(
				new Position(-771.4, 103, -172.4),
				new Position(-753.3, 104.5, -181.3)
				);
		Region garage2 = new Region(
				new Position(-753.3, 103, -182.5),
				new Position(-764.7, 104.5, -183.7)
				);
		Region garage3 = new Region(
				new Position(-762.7, 103, -184.4),
				new Position(-755.3, 104.5, -185.7)
				);
		Region garage4 = new Region(
				new Position(-771.6, 103, -183.6),
				new Position(-770.3, 104.5, -182.6)
				);
		list.add(new Callouts("Garage", new Region[] {garage1, garage2, garage3, garage4})); // Garage
		Region creditCard1 = new Region(
				new Position(-770.6, 103, -184.7),
				new Position(-766.3, 104.5, -184.3)
				);
		list.add(new Callouts("Credit Card", new Region[] {creditCard1})); // Credit Card
		Region red1 = new Region(
				new Position(-771.3, 103, -185.3),
				new Position(-754.3, 108.5, -193.5)
				);
		list.add(new Callouts("Red", new Region[] {red1})); // Red
		Region topGarage1 = new Region(
				new Position(-766.3, 108, -184.6),
				new Position(-770.6, 110.5, -172.3)
				);
		list.add(new Callouts("Top Garage", new Region[] {topGarage1})); // Top Garage
		Region ctSpawn1 = new Region(
				new Position(-754.3, 103, -194.4),
				new Position(-758.4, 104.5, -197.7)
				);
		Region ctSpawn2 = new Region(
				new Position(-759.3, 103, -205.7),
				new Position(-768.6, 106.5, -196.8)
				);
		Region ctSpawn3 = new Region(
				new Position(-762.1, 105, -209.4),
				new Position(-745.7, 107.5, -219.7)
				);
		list.add(new Callouts("CT Spawn", new Region[] {ctSpawn1, ctSpawn2, ctSpawn3})); // CT Spawn
		Region blueBox1 = new Region(
				new Position(-778.7, 103, -191.1),
				new Position(-772.4, 106.5, -200.5)
				);
		list.add(new Callouts("Blue Box", new Region[] {blueBox1})); // Blue Box
		Region outsideHell1 = new Region(
				new Position(-778.7, 103, -202.6),
				new Position(-769.2, 107.5, -206.7)
				);
		list.add(new Callouts("Outside Hell", new Region[] {outsideHell1})); // Outside Hell
		Region ctBox1 = new Region(
				new Position(-758.7, 105, -208.3),
				new Position(-756.3, 106.5, -204.3)
				);
		list.add(new Callouts("CT Box", new Region[] {ctBox1})); // CT Box
		Region ctStairs1 = new Region(
				new Position(-768.7, 103, -207.5),
				new Position(-763.3, 105.5, -219.7)
				);
		list.add(new Callouts("CT Stairs", new Region[] {ctStairs1})); // CT Stairs
		Region deepCT1 = new Region(
				new Position(-744.3, 105, -219.7),
				new Position(-731.6, 107.5, 205.3)
				);
		Region deepCT2= new Region(
				new Position(-730.3, 105, -205.3),
				new Position(-727.3, 107.5, -220.1)
				);
		list.add(new Callouts("Deep CT", new Region[] {deepCT1, deepCT2})); // Deep CT
		Region airCooler1 = new Region(
				new Position(-778.7, 107, -207.6),
				new Position(-769.4, 109.5, -219.7)
				);
		list.add(new Callouts("Air Cooler", new Region[] {airCooler1})); // Air Cooler
		Region heaven1 = new Region(
				new Position(-774.2, 110, -212.1),
				new Position(-769.1, 113.5, -219.7)
				);
		Region heaven2 = new Region(
				new Position(-775.4, 111, -215.3),
				new Position(-779.4, 112.5, -217.7)
				);
		list.add(new Callouts("Heaven", new Region[] {heaven1, heaven2})); // Heaven
		Region lockers1 = new Region(
				new Position(-770.3, 103, -211.7),
				new Position(-777.7, 104.5, -207.9)
				);
		list.add(new Callouts("Lockers", new Region[] {lockers1})); // Lockers
		Region hell1 = new Region(
				new Position(-770.4, 103, -213.3),
				new Position(-777.7, 104.5, -219.6)
				);
		list.add(new Callouts("Hell", new Region[] {hell1})); // Hell
		Region turnpike1 = new Region(
				new Position(-774.3, 103, -220.3),
				new Position(-779.6, 104.5, -228.7)
				);
		list.add(new Callouts("Turnpike", new Region[] {turnpike1})); // Turnpike
		Region stack1 = new Region(
				new Position(-783.5, 103, -225.5),
				new Position(-780.3, 104.5, -220.3)
				);
		list.add(new Callouts("Stack", new Region[] {stack1})); // Stack
		Region boost1 = new Region(
				new Position(-791.7, 103, -220.3),
				new Position(-799.7, 104.5, -225.5)
				);
		list.add(new Callouts("Boost", new Region[] {boost1})); // Boost
		Region ramp1 = new Region(
				new Position(-799.7, 103, -233.5),
				new Position(-780.7, 106.5, -226.5)
				);
		Region ramp2 = new Region(
				new Position(-799.7, 104, -234.6),
				new Position(-780.3, 100, -241.7)
				);
		list.add(new Callouts("Ramp", new Region[] {ramp1, ramp2})); // Ramp
		Region headshot1 = new Region(
				new Position(-785.3, 100, -242.4),
				new Position(-794.7, 101.5, -245.7)
				);
		Region headshot2 = new Region(
				new Position(-792.7, 100, -246.7),
				new Position(-787.3, 101.5, -246.7)
				);
		list.add(new Callouts("Headshot", new Region[] {headshot1, headshot2})); // Headshot
		Region bottomRamp1 = new Region(
				new Position(-786.5, 99.5, -237.8),
				new Position(-796.7, 96, -224.6)
				);
		Region bottomRamp2 = new Region(
				new Position(-785.4, 96, -224.3),
				new Position(-783.3, 97.5, -226.7)
				);
		Region bottomRamp3 = new Region(
				new Position(-796.7, 96, -220.4),
				new Position(-783.4, 97.5, -221.4)
				);
		Region bottomRamp4 = new Region(
				new Position(-782.3, 96, -219.7),
				new Position(-797.7, 97.5, -219.7)
				);
		list.add(new Callouts("Bottom Ramp", new Region[] {bottomRamp1, bottomRamp2, bottomRamp3, bottomRamp4})); // Bottom Ramp
		Region toxic1 = new Region(
				new Position(-798.7, 96, -218.7),
				new Position(-793.2, 97.5, -212.6)
				);
		list.add(new Callouts("Toxic", new Region[] {toxic1})); // Toxic
		Region bTopsite1 = new Region(
				new Position(-797.1, 96, -211.6),
				new Position(-798.7, 98.5, -194.3)
				);
		Region bTopsite2 = new Region(
				new Position(-796.9, 96, -194.3),
				new Position(-781.3, 98.5, -195.5)
				);
		Region bTopsite3 = new Region(
				new Position(-782.9, 96, -197.4),
				new Position(-780.3, 98.5, -208.3)
				);
		list.add(new Callouts("B Topsite", new Region[] {bTopsite1, bTopsite2, bTopsite3})); // B Topsite
		Region control1 = new Region(
				new Position(-781.3, 96, -218.7),
				new Position(-770.4, 96, -209.4)
				);
		Region control2 = new Region(
				new Position(-770.3, 97, -208.2),
				new Position(-772.7, 92, -204.4)
				);
		list.add(new Callouts("Control", new Region[] {control1, control2})); // Control
		Region bSilo1 = new Region(
				new Position(-788.7, 93, -197.7),
				new Position(-791.3, 99.5, -200.3)
				);
		list.add(new Callouts("B Silo", new Region[] {bSilo1})); // B Silo
		Region bCubby1 = new Region(
				new Position(-787.7, 92, -199.4),
				new Position(-781.3, 96.5, -194.3)
				);
		list.add(new Callouts("B Cubby", new Region[] {bCubby1})); // B Cubby
		Region bSite1 = new Region(
				new Position(-781.5, 92, -200.6),
				new Position(-787.4, 93.5, -211.4)
				);
		Region bSite2 = new Region(
				new Position(-788.4, 92, -211.7),
				new Position(-798.7, 93.5, -201.6)
				);
		Region bSite3 = new Region(
				new Position(-788.4, 92, -194.3),
				new Position(-798.4, 93.5, -197.6)
				);
		list.add(new Callouts("B Site", new Region[] {bSite1, bSite2, bSite3})); // B Site
		Region single1 = new Region(
				new Position(-800.5, 92, -195.3),
				new Position(-799.3, 93.5, -197.7)
				);
		list.add(new Callouts("Single", new Region[] {single1})); // Single
		Region deCon1 = new Region(
				new Position(-805.7, 92, -188.3),
				new Position(-801.5, 94, -197.7)
				);
		list.add(new Callouts("De Con", new Region[] {deCon1})); // De Con
		Region backVents1 = new Region(
				new Position(-807.7, 92, -183.3),
				new Position(-777.6, 97.5, -186.7)
				);
		list.add(new Callouts("Back Vents", new Region[] {backVents1})); // Back Vents
		Region vents1 = new Region(
				new Position(-798.7, 103, -194.7),
				new Position(-793.7, 104.5, -191.3)
				);
		Region vents2 = new Region(
				new Position(-789.3, 97, -187.4),
				new Position(-790.7, 98, -188.6)
				);
		Region vents3 = new Region(
				new Position(-781.3, 97, -189.3),
				new Position(-796.6, 102.5, -190.3)
				);
		Region vents4 = new Region(
				new Position(-777.4, 97, -191.3),
				new Position(-782.7, 98, -192.7)
				);
		list.add(new Callouts("Vents", new Region[] {vents1, vents2, vents3, vents4})); // Vents
		Region double1 = new Region(
				new Position(-769.3, 92, -203.7),
				new Position(-780.3, 93.5, -200.3)
				);
		Region double2 = new Region(
				new Position(-780.3, 92, -204.7),
				new Position(-774.3, 93.5, -204.7)
				);
		list.add(new Callouts("Double", new Region[] {double1, double2})); // Double
		Region tuns1 = new Region(
				new Position(-776.7, 92, -200.5),
				new Position(-773.5, 97.5, -172.3)
				);
		list.add(new Callouts("Tuns", new Region[] {tuns1})); // Tuns
		Region secret1 = new Region(
				new Position(-772.3, 96, -172.3),
				new Position(-760.3, 97.5, -176.7)
				);
		Region secret2 = new Region(
				new Position(-759.3, 96, -175.7),
				new Position(-759.3, 97.5, -172.3)
				);
		Region secret3 = new Region(
				new Position(-770.9, 96, -177.7),
				new Position(-770.3, 97.5, -177.7)
				);
		Region secret4 = new Region(
				new Position(-766.7, 96, -171.6),
				new Position(-763.3, 100.5, -163.3)
				);
		Region secret5 = new Region(
				new Position(-767.3, 100, -163.3),
				new Position(-771.6, 104.5, -165.4)
				);
		Region secret6 = new Region(
				new Position(-771.6, 103, -166.4),
				new Position(-766.3, 106.5, -170.7)
				);
		list.add(new Callouts("Secret", new Region[] {secret1, secret2, secret3, secret4, secret5, secret6})); // Secret
		Region trophy1 = new Region(
				new Position(-800.5, 103, -228.7),
				new Position(-805.7, 104.5, -221.3)
				);
		list.add(new Callouts("Trophy", new Region[] {trophy1})); // Trophy
		Region radio1 = new Region(
				new Position(-801.3, 103, -219.7),
				new Position(-810.7, 105.5, -211.5)
				);
		list.add(new Callouts("Radio", new Region[] {radio1})); // Radio
		Region lobbyEntrance1 = new Region(
				new Position(-812.4, 103, -199.3),
				new Position(-816.7, 104.5, -207.7)
				);
		Region lobbyEntrance2 = new Region(
				new Position(-816.7, 103, -208.4),
				new Position(-813.3, 104, -208.6)
				);
		list.add(new Callouts("Lobby Entrance", new Region[] {lobbyEntrance1, lobbyEntrance2})); // Lobby Entrance
		Region lobby1 = new Region(
				new Position(-811.6, 103, -199.3),
				new Position(-804.4, 104.5, -210.7)
				);
		Region lobby2 = new Region(
				new Position(-801.5, 103, -201.3),
				new Position(-802.4, 104, -210.7)
				);
		list.add(new Callouts("Lobby", new Region[] {lobby1, lobby2})); // Lobby
		Region topLobby1 = new Region(
				new Position(-803.3, 106, -199.3),
				new Position(-801.3, 107.5, -210.7)
				);
		list.add(new Callouts("Top Lobby", new Region[] {topLobby1})); // Top Lobby
		Region tRoof1 = new Region(
				new Position(-801.4, 110, -218.7),
				new Position(-812.5, 113.5, -198.2)
				);
		Region tRoof2 = new Region(
				new Position(-813.5, 110, -198.2),
				new Position(-818.8, 113.5, -208.4)
				);
		Region tRoof3 = new Region(
				new Position(-818.6, 107, -197.7),
				new Position(-806.3, 110, -192.5)
				);
		Region tRoof4 = new Region(
				new Position(-805.4, 107, -193.3),
				new Position(-801.3, 111.5, -197.7)
				);
		list.add(new Callouts("T Roof", new Region[] {tRoof1, tRoof2, tRoof3, tRoof4})); // T Roof
		Region silo1 = new Region(
				new Position(-801.3, 110, -192.6),
				new Position(-808.7, 113.5, -183.4)
				);
		Region silo2 = new Region(
				new Position(-809.5, 111, -185.4),
				new Position(-809.5, 112.5, -187.4)
				);
		Region silo3 = new Region(
				new Position(-800.4, 111, -188.7),
				new Position(-800.4, 112.5, -183.5)
				);
		Region silo4 = new Region(
				new Position(-799.3, 111, -185.3),
				new Position(-799.3, 112.5, -187.5)
				);
		list.add(new Callouts("Silo", new Region[] {silo1, silo2, silo3, silo4})); // Silo
		Region squeaky1 = new Region(
				new Position(-811.7, 103, -197.7),
				new Position(-801.3, 104.5, -194.3)
				);
		Region squeaky2 = new Region(
				new Position(-800.6, 104, -195.3),
				new Position(-799.5, 103, -196.7)
				);
		list.add(new Callouts("Squeaky", new Region[] {squeaky1, squeaky2})); // Squeaky
		Region yellow1 = new Region(
				new Position(-800.5, 103, -201.3),
				new Position(-796.3, 104.5, -206.4)
				);
		Region yellow2 = new Region(
				new Position(-798.7, 104, -200.3),
				new Position(-796.3, 104.5, -200.3)
				);
		list.add(new Callouts("Yellow", new Region[] {yellow1, yellow2})); // Yellow
		Region topYellow1 = new Region(
				new Position(-798.7, 107, -206.5),
				new Position(-795.4, 108.5, -199.4)
				);
		list.add(new Callouts("Top Yellow", new Region[] {topYellow1})); // Top Yellow
		Region tetris1 = new Region(
				new Position(-792.3, 103, -199.7),
				new Position( -794.7, 107.5, -203.3)
				);
		list.add(new Callouts("Tetris", new Region[] {tetris1})); // Tetris
		Region aSite1 = new Region(
				new Position(-794.7, 103, -204.7),
				new Position(-781.3, 104.5, -217.7)
				);
		Region aSite2 = new Region(
				new Position(-795.5, 103, -207.3),
				new Position(-798.7, 106.5, -217.7)
				);
		Region aSite3 = new Region(
				new Position(-791.5, 103, -203.6),
				new Position(-781.3, 104.5, -195.6)
				);
		Region aSite4 = new Region(
				new Position(-792.6, 103, -195.4),
				new Position(-798.7, 104.5, -198.7)
				);
		list.add(new Callouts("A Site", new Region[] {aSite1, aSite2, aSite3, aSite4})); // A Site
		Region ctVent1 = new Region(
				new Position(-786.3, 103, -191.3),
				new Position(-781.3, 104.5, -194.4)
				);
		list.add(new Callouts("CT Vent", new Region[] {ctVent1})); // CT Vent
		Region mini1 = new Region(
				new Position(-792.7, 103, -190.5),
				new Position(-787.3, 104.5, -190.6)
				);
		Region mini2 = new Region(
				new Position(-784.5, 103, -187.7),
				new Position(-785.7, 104.5, -185.3)
				);
		Region mini3 = new Region(
				new Position(-793.7, 103, -189.7),
				new Position(-786.3, 104.5, -184.3)
				);
		list.add(new Callouts("Mini", new Region[] {mini1, mini2, mini3})); // Mini
		Region aSilo1 = new Region(
				new Position(-791.3, 103, -208.7),
				new Position(-784.7, 111, -211.3)
				);
		list.add(new Callouts("A Silo", new Region[] {aSilo1})); // A Silo
		Region rafters1 = new Region(
				new Position(-781.3, 111, -205.3),
				new Position(-780.3, 112.5, -218.7)
				);
		Region rafters2 = new Region(
				new Position(-781.5, 111, -205.3),
				new Position(-799.7, 112.5, -218.7)
				);
		list.add(new Callouts("Rafters", new Region[] {rafters1, rafters2})); // Rafters
		Region mustang1 = new Region(
				new Position(-799.7, 111, -217.5),
				new Position(-799.7, 112.5, -205.3)
				);
		list.add(new Callouts("Mustang", new Region[] {mustang1})); // Mustang
		Region dark1 = new Region(
				new Position(-781.3, 92, -212.6),
				new Position(-784.7, 93.5, -216.7)
				);
		list.add(new Callouts("Dark", new Region[] {dark1})); // Dark

		return list;
	}
}
