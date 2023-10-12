package com.baseballaholic.CalloutsMod.callouts;

import java.util.ArrayList;
import java.util.List;

import com.baseballaholic.CalloutsMod.Callouts;
import com.baseballaholic.CalloutsMod.Position;
import com.baseballaholic.CalloutsMod.Region;

public class Carrier {
	public static List <Callouts> createCallouts() {
		List <Callouts> list = new ArrayList <Callouts> ();
		// Pallet, Speeedway, A Plat, Window, Small, Storage, Generator, Gen Stairs, Boiler, Plane, Carpet, T Main, Long Cubby, CT Bridge
		// Under CT Bridge, Square, Long, Banana, Short, Breakables, Blue, Triple, Center, East, West, Ninja, Z, B Default, Toothpaste
		Region ctStairs1 = new Region(
				new Position(43.7, 2, 45.3),
				new Position(39.3, 7.5, 41)
				);
		list.add(new Callouts("CT Stairs", new Region[] {ctStairs1})); // CT Stairs
		Region ctBox1 = new Region(
				new Position(36, 7, 47),
				new Position(39, 8.5, 44.3)
				);
		list.add(new Callouts("CT Box", new Region[] {ctBox1})); // CT Box
		Region storage1 = new Region(
				new Position(37.3, 6, 41.7),
				new Position(47.7, 9.5, 26.3)
				);
		list.add(new Callouts("Storage", new Region[] {storage1})); // Storage
		Region small1 = new Region(
				new Position(49.3, 6, 32.7),
				new Position(59.7, 9.5, 18)
				);
		list.add(new Callouts("Small", new Region[] {small1})); // Small
		Region window1 = new Region(
				new Position(62, 6, 26.7),
				new Position(69.7, 7.5, 12.3)
				);
		list.add(new Callouts("Window", new Region[] {window1})); // Window
		Region aStairs1 = new Region(
				new Position(54.3, 2, 13.7),
				new Position(57.7, 7.5, 17.3)
				);
		list.add(new Callouts("A Stairs", new Region[] {aStairs1})); // A Stairs
		Region aSite1 = new Region(
				new Position(54.3, 2, 13),
				new Position(63, 6.5, -5.7)
				);
		list.add(new Callouts("A Site", new Region[] {aSite1})); // A Site
		Region underCTBridge1 = new Region(
				new Position(63.001, 2, -5.7),
				new Position(69.7, 3.5, 10.7)
				);
		list.add(new Callouts("Under CT Bridge", new Region[] {underCTBridge1})); // Under CT Bridgg
		Region ctBridge1 = new Region(
				new Position(68, 6, 11),
				new Position(65, 8.5, -7)
				);
		list.add(new Callouts("CT Bridge", new Region[] {ctBridge1})); // CT Bridge
		Region underBridge1 = new Region(
				new Position(60.7, 2, -7),
				new Position(54.3, 5, -19)
				);
		list.add(new Callouts("Under Bridge", new Region[] {underBridge1})); // Under Bridge
		Region aLong1 = new Region(
				new Position(54.3, 2, -19.3),
				new Position(64, 3.5, -47.7)
				);
		Region aLong2 = new Region(
				new Position(57, 2, -47.7),
				new Position(65.7, 3.5, -41)
				);
		list.add(new Callouts("A Long", new Region[] {aLong1, aLong2})); // A Long
		Region longCubby1 = new Region(
				new Position(64, 2, -41),
				new Position(65.7, 3.5, -39.3)
				);
		list.add(new Callouts("Long Cubby", new Region[] {longCubby1})); // Long Cubby
		Region genStairs1 = new Region(
				new Position(64, 2, -36.7),
				new Position(69.7, 8.5, -25.3)
				);
		list.add(new Callouts("Generator Stairs", new Region[] {genStairs1})); // Generator Stairs
		Region generator1 = new Region(
				new Position(63.3, 7, -23.7),
				new Position(74.7, 9.5, -7.3)
				);
		list.add(new Callouts("Generator", new Region[] {generator1})); // Generator
		Region bridge1 = new Region(
				new Position(63, 7.5, -13.3),
				new Position(52.7, 9.5, -17.7)
				);
		list.add(new Callouts("Bridge", new Region[] {bridge1})); // Bridge
		Region boilers1 = new Region(
				new Position(43.3, 7, -18.7),
				new Position(51.7, 8.5, -2)
				);
		Region boilers2 = new Region(
				new Position(51.7, 7, -1.3),
				new Position(47.3, 8.5, -2)
				);
		list.add(new Callouts("Boilers", new Region[] {boilers1, boilers2})); // Boilers
		Region garageStairs1 = new Region(
				new Position(45.7, 8.5, -2),
				new Position(43.3, 2.5, 3)
				);
		list.add(new Callouts("Garage Stairs", new Region[] {garageStairs1})); // Garage Stairs
		Region speedway1 = new Region(
				new Position(36.3, 2, -40.3),
				new Position(54, 3.5, -47)
				);
		Region speedway2 = new Region(
				new Position(54, 2, -47.7),
				new Position(51.3, 3.5, -47)
				);
		Region speedway3 = new Region(
				new Position(42.7, 2, -46),
				new Position(33.3, 3.5, -61)
				);
		list.add(new Callouts("Speedway", new Region[] {speedway1, speedway2, speedway3})); // Speedway
		Region aPlat1 = new Region(
				new Position(48.7, 2.5, -62.7),
				new Position(42.7, 5.5, -47)
				);
		Region aPlat2 = new Region(
				new Position(45, 5, -49),
				new Position(43, 6.5, -45)
				);
		list.add(new Callouts("A Plat", new Region[] {aPlat1, aPlat2})); // A Plat
		Region plane1 = new Region(
				new Position(10, 2, -52),
				new Position(30, 5.5, -71.7)
				);
		list.add(new Callouts("Plane", new Region[] {plane1})); // Plane
		Region z1 = new Region(
				new Position(39.7, 2, -40),
				new Position(33.3, 3.5, -33)
				);
		list.add(new Callouts("Z", new Region[] {z1})); // Z
		Region mid1 = new Region(
				new Position(21.3, 2, -35.7),
				new Position(33, 3.5, -24.3)
				);
		Region mid2 = new Region(
				new Position(33, 2, -32.7),
				new Position(40.7, 3.5, -24)
				);
		Region mid3 = new Region(
				new Position(40.7, 2, -24),
				new Position(21.3, 3.5, -21)
				);
		list.add(new Callouts("Mid", new Region[] {mid1, mid2, mid3})); // Mid
		Region pillars1 = new Region(
				new Position(21.3, 2, -16.3),
				new Position(40.7, 3.5, -21)
				);
		list.add(new Callouts("Pillars", new Region[] {pillars1})); // Pillars
		Region breakables1 = new Region(
				new Position(9.7, 2, -24.7),
				new Position(4, 5.5, -18.3)
				);
		list.add(new Callouts("Breakables", new Region[] {breakables1})); // Breakables
		Region bShort1 = new Region(
				new Position(0.7, 2, -18),
				new Position(3.7, 3.5, -3)
				);
		list.add(new Callouts("B Short", new Region[] {bShort1})); // Short
		Region banana1 = new Region(
				new Position(0.5, 2, -14),
				new Position(-14.7, 3.5, -21.7)
				);
		Region banana2 = new Region(
				new Position(-19.7, 2, -14.7),
				new Position(-7.3, 3.5, -0)
				);
		list.add(new Callouts("Banana", new Region[] {banana1, banana2})); // Banana
		Region tSpawn1 = new Region(
				new Position(-28, 6.5, -42),
				new Position(-7, 2, -58)
				);
		list.add(new Callouts("T Spawn", new Region[] {tSpawn1})); // T Spawn
		Region pallet1 = new Region(
				new Position(-3, 2, -42),
				new Position(-8, 3.5, -39)
				);
		Region pallet2 = new Region(
				new Position(-11, 2, -39),
				new Position(-3, 3.5, -27)
				);
		list.add(new Callouts("Pallet", new Region[] {pallet1, pallet2})); // Pallet
		Region tMain1 = new Region(
				new Position(-5, 2, -59),
				new Position(5, 6.5, -42)
				);
		Region tMain2 = new Region(
				new Position(10, 2, -63),
				new Position(5, 3.5, -47)
				);
		Region tMain3 = new Region(
				new Position(5, 2, -42),
				new Position(-4, 5.5, -27)
				);
		Region tMain4 = new Region(
				new Position(5, 2, -34),
				new Position(15, 3.5, -29)
				);
		Region tMain5 = new Region(
				new Position(12, 2, -34),
				new Position(15, 3.5, -40)
				);
		Region tMain6 = new Region(
				new Position(12, 2, -40),
				new Position(33, 3.5, -50)
				);
		Region tMain7 = new Region(
				new Position(4.7, 2, -28),
				new Position(-2.7, 5.5, -22)
				);
		list.add(new Callouts("T Main", new Region[] {tMain1, tMain2, tMain3, tMain4, tMain5, tMain6, tMain7})); // T Main
		Region forklift1 = new Region(
				new Position(5, 2, -46),
				new Position(12, 8, -34)
				);
		list.add(new Callouts("Forklift", new Region[] {forklift1})); // Forklift
		Region carpet1 = new Region(
				new Position(15, 2, -40),
				new Position(25, 8, -37)
				);
		list.add(new Callouts("Carpet", new Region[] {carpet1})); // Carpet
		Region bLong1 = new Region(
				new Position(-4, 2, -3),
				new Position(24, 5.5, 3)
				);
		Region bLong2 = new Region(
				new Position(-14, 2, 2),
				new Position(-2, 3.5, 11)
				);
		list.add(new Callouts("B Long", new Region[] {bLong1, bLong2})); // B Long
		Region square1 = new Region(
				new Position(23.9, 2, 25.3),
				new Position(7.3, 3.5, 43.7)
				);
		list.add(new Callouts("Square", new Region[] {square1})); // Square
		Region ctHalls1 = new Region(
				new Position(25, 2, 34.7),
				new Position(38.7, 3.5, 13)
				);
		Region ctHalls2 = new Region(
				new Position(38.7, 3.5, 13),
				new Position(34, 2, 5)
				);
		list.add(new Callouts("CT Halls", new Region[] {ctHalls1, ctHalls2})); // CT Halls
		Region garage1 = new Region(
				new Position(39, 1.5, 5),
				new Position(48.7, 4.5, 14.7)
				);
		list.add(new Callouts("Garage", new Region[] {garage1})); // Garage
		Region ninja1 = new Region(
				new Position(29.7, 2, 4),
				new Position(28.3, 3.5, 5.7)
				);
		list.add(new Callouts("Ninja", new Region[] {ninja1})); // Ninja
		Region bDefault1 = new Region(
				new Position(34, 2, -4),
				new Position(36, 3.5, -3.3)
				);
		list.add(new Callouts("B Default", new Region[] {bDefault1})); // B Default
		Region bSite1 = new Region(
				new Position(30, 2, 3.7),
				new Position(34, 3.5, -6)
				);
		Region bSite2 = new Region(
				new Position(30, 2, 3.7),
				new Position(39, 3.5, -3)
				);
		Region bSite3 = new Region(
				new Position(39, 2, -3),
				new Position(36, 3.5, -7)
				);
		Region bSite4 = new Region(
				new Position(36, 2, -7),
				new Position(32, 3.5, -4)
				);
		Region bSite5 = new Region(
				new Position(33.7, 2, -4),
				new Position(30, 3.5, 3.7)
				);
		Region bSite6 = new Region(
				new Position(33.7, 2, -3),
				new Position(28.3, 6.5, -5.7)
				);
		Region bSite7 = new Region(
				new Position(37.7, 2, -10),
				new Position(28, 3.5, -11.7)
				);
		list.add(new Callouts("B Site", new Region[] {bSite1, bSite2, bSite3, bSite4, bSite5, bSite6, bSite7})); // B Site
		Region toothpaste1 = new Region(
				new Position(39, 2, -1.3),
				new Position(40.7, 3.5, -6.7)
				);
		list.add(new Callouts("Toothpaste", new Region[] {toothpaste1})); // Toothpaste
		Region triple1 = new Region(
				new Position(38, 2, -7),
				new Position(40.7, 6.5, -11.7)
				);
		list.add(new Callouts("Triple", new Region[] {triple1})); // Triple
		Region blue1 = new Region(
				new Position(28.3, 2, -6.3),
				new Position(32, 7.5, -10)
				);
		list.add(new Callouts("Blue", new Region[] {blue1})); // Blue
		Region whiteDoors1 = new Region(
				new Position(29.7, 2, 3.7),
				new Position(23.1, 3.5, -2.7)
				);
		list.add(new Callouts("White Doors", new Region[] {whiteDoors1})); // White Doors
		Region east1 = new Region(
				new Position(39.7, 2, -16),
				new Position(34.3, 3.5, -13)
				);
		list.add(new Callouts("East", new Region[] {east1})); // East
		Region center1 = new Region(
				new Position(34.3, 2, -15.3),
				new Position(29.7, 3.5, -13)
				);
		list.add(new Callouts("Center", new Region[] {center1})); // Center
		Region west1 = new Region(
				new Position(24.3, 2, -16),
				new Position(27.7, 3.5, -6.3)
				);
		list.add(new Callouts("West", new Region[] {west1})); // West
		Region lobby1 = new Region(
				new Position(10.6, 2, 22.7),
				new Position(-1.8, 6, 6.3)
				);
		Region lobby2 = new Region(
				new Position(10.6, 2, 22.7),
				new Position(20.7, 6, 3)
				);
		list.add(new Callouts("Lobby", new Region[] {lobby1, lobby2})); // Lobby
		Region ctSpawn1 = new Region(
				new Position(38.7, 2, 58.7),
				new Position(18, 3.5, 43)
				);
		list.add(new Callouts("CT Spawn", new Region[] {ctSpawn1})); // CT Spawn
		Region tank1 = new Region(
				new Position(32, 2, -65),
				new Position(41.7, 3.5, -71.7)
				);
		list.add(new Callouts("Tank", new Region[] {tank1})); // Tank
		return list;
	}
}
