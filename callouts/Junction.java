package com.baseballaholic.CalloutsMod.callouts;

import java.util.ArrayList;
import java.util.List;

import com.baseballaholic.CalloutsMod.Callouts;
import com.baseballaholic.CalloutsMod.Position;
import com.baseballaholic.CalloutsMod.Region;


public class Junction {
	public static List <Callouts> createCallouts() {
		List <Callouts> list = new ArrayList <Callouts> ();
		Region tSpawn1 = new Region(
				new Position(5.7, 75.5, -55.7),
				new Position(-22.7, 73, -31.3)
			);
		Region tSpawn2 = new Region(
				new Position(-9.3, 73, -31),
				new Position(-28.7, 75.5, -21.3)
			);
		list.add(new Callouts("T Spawn", new Region[] {tSpawn1, tSpawn2})); // T Spawn
		Region alley1 = new Region(
				new Position(-11.3, 73, -20),
				new Position(-19, 74.5, -8)
				);
		list.add(new Callouts("Alley", new Region[] {alley1})); // Alley
		Region outsideMonster1 = new Region(
				new Position(-17.3, 70, -12.7),
				new Position(-26.7, 71.5, 5.7)
				);
		list.add(new Callouts("Outside Monster", new Region[] {outsideMonster1})); // Outside Monster
		Region shortTunnels1 = new Region(
				new Position(-16, 70, -0.7),
				new Position(-6, 71.5, 2.7)
				);
		list.add(new Callouts("Short Tunnels", new Region[] {shortTunnels1})); // Short Tunnels
		Region monster1 = new Region(
				new Position(-17.3, 70, 6),
				new Position(-20.7, 71.5, 13)
				);
		list.add(new Callouts("Monster", new Region[] {monster1})); // Monster
		Region sewers1 = new Region(
				new Position(-17.3, 70, 13.01),
				new Position(-27.7, 71.5, 32.7)
				);
		list.add(new Callouts("Sewers", new Region[] {sewers1})); // Sewers
		Region barrels1 = new Region(
				new Position(-11, 73, 31.3),
				new Position(-12.7, 74.5, 34.7)
				);
		list.add(new Callouts("Barrels", new Region[] {barrels1})); // Barrels
		Region b1 = new Region(
				new Position(-17.001, 70.5, 29.7),
				new Position(-12.3, 74, 17.3)
				);
		Region b2 = new Region(
				new Position(-6.001, 73, 26.001),
				new Position(-10.99, 74.5, 34.7)
				);
		Region b3 = new Region(
				new Position(-15.7, 75.5, 16.863),
				new Position(-5.99, 73, 19.99)
				);
		Region b4 = new Region(
				new Position(-7, 73, 16),
				new Position(-4.001, 74.5, 13.3)
				);
		list.add(new Callouts("B", new Region[] {b1, b2, b3, b4})); // B
		Region pillar1 = new Region(
				new Position(-12, 73, 20),
				new Position(-6, 74.5, 26)
				);
		list.add(new Callouts("Pillar", new Region[] {pillar1})); // Pillar
		Region bSite1 = new Region(
				new Position(-1, 77, 16),
				new Position(-6, 73, 28)
				);
		list.add(new Callouts("B Site", new Region[] {bSite1})); // B Site
		Region ramp1 = new Region(
				new Position(-5.7, 74, 34.7),
				new Position(-2, 71, 28.3)
				);
		list.add(new Callouts("Ramp", new Region[] {ramp1})); // Ramp
		Region short1 = new Region(
				new Position(-11.137, 75.5, 17),
				new Position(-7.001, 73, 6.3)
				);
		Region short2 = new Region(
				new Position(-6.7, 74, 6.3),
				new Position(-3.7, 71.5, 8.7)
				);
		list.add(new Callouts("Short", new Region[] {short1, short2})); // Short
		Region water1 = new Region(
				new Position(-5.99, 70, -1.7),
				new Position(3.7, 73.5, 11.7)
				);
		list.add(new Callouts("Water", new Region[] {water1})); // Water
		Region platform1 = new Region(
				new Position(4, 73, -0.7),
				new Position(8.7, 75.5, 11.7)
				);
		list.add(new Callouts("Platform", new Region[] {platform1})); // Platform
		Region graffiti1 = new Region(
				new Position(9.3, 73, 7.3),
				new Position(13.7, 76, 25.7)
				);
		list.add(new Callouts("Graffiti", new Region[] {graffiti1})); // Graffiti
		Region walkway1 = new Region(
				new Position(14, 74.5, 21.3),
				new Position(18.7, 72, 36.7)
				);
		Region walkway2 = new Region(
				new Position(12.3, 72, 37),
				new Position(15.7, 74.5, 48.699)
				);
		list.add(new Callouts("Walkway", new Region[] {walkway1, walkway2})); // Walkway
		Region dumpster1 = new Region(
				new Position(12.3, 82.5, 47),
				new Position(19.7, 73.5, 54.7)
				);
		list.add(new Callouts("Dumpster", new Region[] {dumpster1})); // Dumpster
		Region heaven1 = new Region(
				new Position(15.7, 73, 43.7),
				new Position(26.7, 78.5, 38.3)
				);
		Region heaven2 = new Region(
				new Position(15.3, 77, 38.7),
				new Position(4, 78.5, 26)
				);
		Region heaven3 = new Region(
				new Position(26.7, 77, 44),
				new Position(22, 78.5, 54)
				);
		list.add(new Callouts("Heaven", new Region[] {heaven1, heaven2, heaven3})); // Heaven
		Region storage1 = new Region(
				new Position(31.7, 77, 54.3),
				new Position(22.3, 78.7, 59.7)
				);
		list.add(new Callouts("Storage", new Region[] {storage1})); // Storage
		Region bank1 = new Region(
				new Position(31.7, 77.5, 54.3),
				new Position(29.300, 79.5, 47.3)
				);
		Region bank2 = new Region(
				new Position(29.300, 79.5, 47.3),
				new Position(21.3, 81, 49.7)
				);
		Region bank3 = new Region(
				new Position(22.3, 81, 44),
				new Position(26.7, 82.5, 47)
				);
		list.add(new Callouts("Bank", new Region[] {bank1, bank2, bank3})); // Bank
		Region van1 = new Region(
				new Position(27, 81, 42),
				new Position(31.7, 82.5, 46.7)
				);
		list.add(new Callouts("Van", new Region[] {van1})); // Van
		Region aSite1 = new Region(
				new Position(37.7, 81, 33),
				new Position(14.3, 82.5, 43)
				);
		Region aSite2 = new Region(
				new Position(17.3, 80, 33),
				new Position(29.7, 83, 28)
				);
		list.add(new Callouts("A Site", new Region[] {aSite1, aSite2})); // A Site
		Region truck1 = new Region(
				new Position(14.299, 81, 39.7),
				new Position(10.3, 84, 27.3)
				);
		list.add(new Callouts("Truck", new Region[] {truck1})); // Truck
		Region aShort1 = new Region(
				new Position(16.3, 79, 18.001),
				new Position(30.7, 83, 27.7)
				);
		list.add(new Callouts("A Short", new Region[] {aShort1})); // A Short
		Region ladder1 = new Region(
				new Position(3.3, 73, -23),
				new Position(5.575, 78.7, -25.7)
				);
		list.add(new Callouts("Ladder", new Region[] {ladder1})); // Ladder
		Region lowerTunnels1 = new Region(
				new Position(3.3, 73, -22.99),
				new Position(11.7, 74.5, -14.3)
				);
		Region lowerTunnels2 = new Region(
				new Position(9.7, 73, -14.3),
				new Position(7.3, 74.5, 1)
				);
		list.add(new Callouts("Lower Tunnels", new Region[] {lowerTunnels1, lowerTunnels2})); // Lower TUnnels
		Region connector1 = new Region(
				new Position(8.7, 73.5, 2.7),
				new Position(18, 81.5, -8.7)
				);
		Region connector2 = new Region(
				new Position(8.3, 76, -9.137),
				new Position(9.3, 78.5, -6.3)
				);
		list.add(new Callouts("Connector", new Region[] {connector1, connector2})); // Connector
		Region party1 = new Region(
				new Position(36.7, 81.5, -19.5),
				new Position(31, 84, -1.3)
				);
		list.add(new Callouts("Party", new Region[] {party1})); // Party
		Region highway1 = new Region(
				new Position(19.5, 79, -2.5),
				new Position(16.3, 80.5, 20.4)
				);
		list.add(new Callouts("Highway", new Region[] {highway1})); // Highway
		Region longToilets1 = new Region(
				new Position(35.3, 81, 1.3),
				new Position(44.7, 82.5, 10.7)
				);
		list.add(new Callouts("Long Toilets", new Region[] {longToilets1})); // Long Toilets
		Region toilets1 = new Region(
				new Position(34, 82.5, 1.3),
				new Position(22.7, 80, 19.3)
				);
		list.add(new Callouts("Toilets", new Region[] {toilets1})); // Toilets
		Region mid1 = new Region(
				new Position(19.3, 80, -1.3),
				new Position(30.7, 81.5, -13.7)
				);
		list.add(new Callouts("Mid", new Region[] {mid1})); // Mid
		Region long1 = new Region(
				new Position(33, 81, 33),
				new Position(58, 90, 15)
				);
		Region long2 = new Region(
				new Position(50, 81, 10),
				new Position(58, 90, 14)
				);
		Region long3 = new Region(
				new Position(57, 81, 10),
				new Position(46, 90, 4)
				);
		Region long4 = new Region(
				new Position(53, 81, -4),
				new Position(46, 90, 3)
				);
		Region long5 = new Region(
				new Position(45, 81, 0),
				new Position(54, 90, -6)
				);
		Region long6 = new Region(
				new Position(57, 81, -6),
				new Position(42, 81, -10)
				);
		Region long7 = new Region(
				new Position(42, 81, -11),
				new Position(47, 90, -15)
				);
		Region long8 = new Region(
				new Position(48, 81, -15),
				new Position(58, 90, -12)
				);
		Region long9 = new Region(
				new Position(42, 81, -16),
				new Position(58, 90, -28)
				);
		list.add(new Callouts("Long", new Region[] {long1, long2, long3, long4, long5, long6, long7, long8, long9})); // Long
		Region longBoost1 = new Region(
				new Position(46, 81, 14),
				new Position(49, 90, 10)
				);
		list.add(new Callouts("Long Boost", new Region[] {longBoost1})); // Long Boost
		Region tree1 = new Region(
				new Position(54, 81, 3),
				new Position(58, 90, -5)
				);
		list.add(new Callouts("Tree", new Region[] {tree1})); // Tree
		Region playground1 = new Region(
				new Position(16, 85, -29),
				new Position(35, 81, -42)
				);
		list.add(new Callouts("Playground", new Region[] {playground1})); // Playground
		Region fountain1 = new Region(
				new Position(37, 81, -20),
				new Position(9, 85, -27)
				);
		Region fountain2 = new Region(
				new Position(29, 81, -15),
				new Position(17, 85, -19)
				);
		list.add(new Callouts("Fountain", new Region[] {fountain1, fountain2})); // Fountain
		Region tConnStairs1 = new Region(
				new Position(10, 83, -31),
				new Position(7, 78, -29)
				);
		list.add(new Callouts("T Conn Stairs", new Region[] {tConnStairs1})); // T Conn Stairs
		Region tConn1 = new Region(
				new Position(6, 78, -29),
				new Position(-4, 83, -31)
				);
		Region tConn2 = new Region(
				new Position(5, 78, -27),
				new Position(-8, 83, -25)
				);
		list.add(new Callouts("T Conn", new Region[] {tConn1, tConn2})); // T Conn
		Region pit1 = new Region(
				new Position(-1.99, 70, 34.7),
				new Position(7.7, 74.5, 18)
				);
		Region pit2 = new Region(
				new Position(2.7, 71, 18),
				new Position(-0.7, 72.5, 16.3)
				);
		list.add(new Callouts("Pit", new Region[] {pit1, pit2})); // Pit
		Region bridge1 = new Region(
				new Position(-3.99, 72.5, 13.3),
				new Position(8, 74.5, 16)
				);
		list.add(new Callouts("Bridge", new Region[] {bridge1})); // Bridge
		return list;
	}
}
