package com.baseballaholic.CalloutsMod.callouts;

import java.util.ArrayList;
import java.util.List;

import com.baseballaholic.CalloutsMod.Callouts;
import com.baseballaholic.CalloutsMod.Position;
import com.baseballaholic.CalloutsMod.Region;


public class Temple {
	public static List <Callouts> createCallouts() {
		List <Callouts> list = new ArrayList <Callouts> ();
		
		Region tSpawn1 = new Region(
				new Position(-816, 73, -250.7),
				new Position(-803, 76.5, -238.3)
				);
		list.add(new Callouts("T Spawn", new Region[] {tSpawn1})); // T Spawn
		Region tRamp1 = new Region(
				new Position(-803, 73, -246.7),
				new Position(-797.3, 77.5, -233)
				);
		list.add(new Callouts("T Ramp", new Region[] {tRamp1})); // T Ramp
		Region tEntrance1 = new Region(
				new Position(-797.3, 76, -233),
				new Position(-814.7, 77.5, -227)
				);
		list.add(new Callouts("T Entrance", new Region[] {tEntrance1})); // Entrance
		Region fork1 = new Region(
				new Position(-814.7, 76, -224.7),
				new Position(-806.3, 79.5, -208)
				);
		Region fork2 = new Region(
				new Position(-815.7, 76, -208),
				new Position(-808.3, 78, -200.3)
				);
		list.add(new Callouts("Fork", new Region[] {fork1, fork2})); // Fork
		Region sewers1 = new Region(
				new Position(-827, 67, -232.7),
				new Position(-836.950, 68.5, -228.3)
				);
		list.add(new Callouts("Sewers", new Region[] {sewers1})); // Sewers
		Region snake1 = new Region(
				new Position(-825, 68.5, -236.3),
				new Position(-835.7, 71.5, -243)
				);
		Region snake2 = new Region(
				new Position(-836.7, 71, -243.3),
				new Position(-817, 73, -246.7)
				);
		list.add(new Callouts("Snake", new Region[] {snake1, snake2})); // Snake
		Region midDoors1 = new Region(
				new Position(-808, 76, -202.3),
				new Position(-803, 77.5, -208.7)
				);
		list.add(new Callouts("Mid Doors", new Region[] {midDoors1})); // Mid Doors
		Region bottomMid1 = new Region(
				new Position(-794, 76, -209.7),
				new Position(-803.7, 77.5, -200.3)
				);
		list.add(new Callouts("Bottom Mid", new Region[] {bottomMid1})); // Bottom Mid
		Region mid1 = new Region(
				new Position(-797.3, 76, -199.7),
				new Position(-802.7, 78.5, -173)
				);
		list.add(new Callouts("Mid", new Region[] {mid1})); // Mid
		Region topMid1 = new Region(
				new Position(-804.7, 76, -172.7),
				new Position(-796, 79.5, -142.3)
				);
		Region topMid2 = new Region(
				new Position(-796, 79.5, -142.3),
				new Position(-793.3, 76, -155.7)
				);
		Region topMid3 = new Region(
				new Position(-805, 76, -165.7),
				new Position(-806.7, 77.5, -156)
				);
		Region topMid4 = new Region(
				new Position(-805, 76, -156),
				new Position(-809.7, 77.5, -142.3)
				);
		list.add(new Callouts("Top Mid", new Region[] {topMid1, topMid2, topMid3, topMid4})); // Top Mid
		Region stairs1 = new Region(
				new Position(-796, 77.5, -165.3),
				new Position(-793.3, 68, -176.3)
				);
		list.add(new Callouts("Stairs", new Region[] {stairs1})); // Stairs
		Region ramp1 = new Region(
				new Position(-797.3, 68.5, -198.7),
				new Position(-773, 79, -192)
				);
		list.add(new Callouts("Ramp", new Region[] {ramp1})); // Ramp
		Region bLong1 = new Region(
				new Position(-794, 76, -209.7),
				new Position(-779, 79.5, -199)
				);
		list.add(new Callouts("B Long", new Region[] {bLong1})); // B Long
		Region elbow1 = new Region(
				new Position(-779, 76, -199),
				new Position(-763.3, 79, -206.7)
				);
		Region elbow2 = new Region(
				new Position(-772.7, 76, -200),
				new Position(-766.3, 78.5, -192)
				);
		list.add(new Callouts("Elbow", new Region[] {elbow1, elbow2})); // Elbow
		Region bSite1 = new Region(
				new Position(-774, 79, -192),
				new Position(-762.3, 76, -177.3)
				);
		Region bSite2 = new Region(
				new Position(-764.3, 76, -177),
				new Position(-772.7, 76.5, -175.3)
				);
		list.add(new Callouts("B Site", new Region[] {bSite1, bSite2})); // B Site
		Region ctSpawn1 = new Region(
				new Position(-802, 73, -129),
				new Position(-817, 74.5, -119)
				);
		list.add(new Callouts("CT Spawn", new Region[] {ctSpawn1})); // CT Spawn
		Region ct1 = new Region(
				new Position(-801, 73, -135),
				new Position(-774, 80, -119)
				);
		Region ct2 = new Region(
				new Position(-818, 73, -119),
				new Position(-833, 77.5, -137)
				);
		list.add(new Callouts("CT", new Region[] {ct1, ct2})); // CT
		Region aSite1 = new Region(
				new Position(-833, 76, -138),
				new Position(-819, 77.5, -151)
				);
		Region aSite2 = new Region(
				new Position(-819, 77.5, -152),
				new Position(-826, 76, -155)
				);
		list.add(new Callouts("A Site", new Region[] {aSite1, aSite2})); // A Site
		Region ninja1 = new Region(
				new Position(-831, 76, -152),
				new Position(-833, 77.5, -155)
				);
		list.add(new Callouts("Ninja", new Region[] {ninja1})); // Ninja
		Region ctBridge1 = new Region(
				new Position(-828, 76, -172),
				new Position(-808, 77.5, -159)
				);
		list.add(new Callouts("CT Bridge", new Region[] {ctBridge1})); // CT Bridge
		Region ctTunnels1 = new Region(
				new Position(-773, 76, -136),
				new Position(-780, 77.5, -161)
				);
		list.add(new Callouts("CT Tunnels", new Region[] {ctTunnels1})); // CT Tunnels
		Region tuns1 = new Region(
				new Position(-765, 76, -171),
				new Position(-780, 77.5, -162)
				);
		list.add(new Callouts("Tuns", new Region[] {tuns1})); // Tuns
		Region z1 = new Region(
				new Position(-795, 76, -158),
				new Position(-781, 77.5, -168)
				);
		list.add(new Callouts("Z", new Region[] {z1})); // Z
		Region arches1 = new Region(
				new Position(-818, 76, -152),
				new Position(810, 77.5, -147)
				);
		list.add(new Callouts("Arches", new Region[] {arches1})); // Arches
		Region bridge1 = new Region(
				new Position(-823, 75.5, -177),
				new Position(-827, 77.5, -194)
				);
		list.add(new Callouts("Bridge", new Region[] {bridge1})); // Bridge
		Region tBridge1 = new Region(
				new Position(-828.7, 80.5, -195.3),
				new Position(-820.3, 76, -206.7)
				);
		list.add(new Callouts("T Bridge", new Region[] {tBridge1})); // T Bridge
		Region tStairs1 = new Region(
				new Position(-813.3, 68.5, -216.3),
				new Position(-815.7, 77.5, -209)
				);
		list.add(new Callouts("T Stairs", new Region[] {tStairs1})); // T Stairs
		Region under1 = new Region(
				new Position(-819.3, 67, -239.7),
				new Position(-826, 69.5, -177.3)
				);
		Region under2 = new Region(
				new Position(-827, 67, -219.7),
				new Position(-828.7, 69.5, -176.3)
				);
		Region under3 = new Region(
				new Position(-819, 67, -208.3),
				new Position(-816, 69.5, -220.7)
				);
		Region under4 = new Region(
				new Position(-816, 69.5, -220.7),
				new Position(-813.3, 68, -216.3)
				);
		Region under5 = new Region(
				new Position(-819, 67, -178.3),
				new Position(-804, 69.5, -109.7)
				);
		Region under6 = new Region(
				new Position(-804, 68, -187),
				new Position(-797.3, 70, -198.7)
				);
		Region under7 = new Region(
				new Position(-797, 67, -176.3),
				new Position(-773.3, 71, -191.7)
				);
		Region under8 = new Region(
				new Position(-793.3, 68, -176.3),
				new Position(-804, 69.5, -180)
				);
		list.add(new Callouts("Under", new Region[] {under1, under2, under3, under4, under5, under6, under7, under8})); // Under
		Region pillar1 = new Region(
				new Position(-804, 68, -180),
				new Position(-797, 69.5, -187)
				);
		list.add(new Callouts("Pillar", new Region[] {pillar1})); // Pillar
		return list;
	}
}
