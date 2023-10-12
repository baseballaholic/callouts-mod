package com.baseballaholic.CalloutsMod.callouts;

import java.util.ArrayList;
import java.util.List;

import com.baseballaholic.CalloutsMod.Callouts;
import com.baseballaholic.CalloutsMod.Position;
import com.baseballaholic.CalloutsMod.Region;

public class Overgrown {
	public static List <Callouts> createCallouts() {
		List <Callouts> list = new ArrayList <Callouts> ();
		
		Region baseballaholic1 = new Region(
				new Position(22.3, 5, -8.3),
				new Position(22.3, 5, -8.3)
				);
		list.add(new Callouts("baseballaholic", new Region[] {baseballaholic1})); // Baseballaholic
		Region tSpawn1 = new Region(
				new Position(42.3, 10, 29),
				new Position(52.7, 13.5, -6)
				);
		list.add(new Callouts("T Spawn", new Region[] {tSpawn1})); // T Spawn
		Region tRamp1 = new Region(
				new Position(52.7, 13.5, -6),
				new Position(38, 5, -21)
				);
		list.add(new Callouts("T Ramp", new Region[] {tRamp1})); // T Ramp	
		Region outsideLong1 = new Region(
				new Position(37, 5, -13),
				new Position(23.3, 8.5, -23)
				);
		list.add(new Callouts("Outside Long", new Region[] {outsideLong1})); // Outside Long
		Region topMid1 = new Region(
				new Position(33, 4, -14),
				new Position(15.3, 8.5, 3.7)
				);
		list.add(new Callouts("Top Mid", new Region[] {topMid1})); // Top Mid
		Region suicide1 = new Region(
				new Position(33, 7, -0.7),
				new Position(41.7, 8.5, 4.7)
				);
		list.add(new Callouts("Suicide", new Region[] {suicide1})); // Suicide
		Region aPillar1 = new Region(
				new Position(6, 3, -8),
				new Position(-1, 5.5, -1)
				);
		list.add(new Callouts("A Pillar", new Region[] {aPillar1})); // A Pillar
		Region bPillar1 = new Region(
				new Position(2, 6.5, 2),
				new Position(-5, 3, 9)
				);
		list.add(new Callouts("B Pillar", new Region[] {bPillar1})); // B Pillar
		Region mid1 = new Region(
				new Position(6, 3, -14.7),
				new Position(15, 7.5, 12.7)
				);
		Region mid2 = new Region(
				new Position(-10.7, 3, -1),
				new Position(6, 4.5, 2)
				);
		Region mid3 = new Region(
				new Position(-5, 3, 12.7),
				new Position(-10.7, 8.5, -11.7)
				);
		Region mid4 = new Region(
				new Position(-11, 3, -5.7),
				new Position(-11.7, 4.5, -3.3)
				);
		Region mid5 = new Region(
				new Position(-11.7, 3, 6.7),
				new Position(-11, 7.5, 4.3)
				);
		Region mid6 = new Region(
				new Position(-5, 3, 9),
				new Position(6, 5.5, 13.7)
				);
		Region mid7 = new Region(
				new Position(5, 3, -8),
				new Position(-5, 4.5, -12.7)
				);
		list.add(new Callouts("Mid", new Region[] {mid1, mid2, mid3, mid4, mid5, mid6, mid7})); // Mid
		Region midDoors1 = new Region(
				new Position(-11, 3, 2.7),
				new Position(-14, 4.5, -1.7)
				);
		list.add(new Callouts("Mid Doors", new Region[] {midDoors1})); // Mid Doors
		Region cat1 = new Region(
				new Position(0.3, 3, -12),
				new Position(13.7, 6.5, -29)
				);
		Region cat2 = new Region(
				new Position(4, 3, -29),
				new Position(-5.699, 4.5, -39.7)
				);
		list.add(new Callouts("Cat", new Region[] {cat1, cat2})); // Cat
		Region truck1 = new Region(
				new Position(5, 3, -29),
				new Position(10.7, 7.5, -32.7)
				);
		list.add(new Callouts("Truck", new Region[] {truck1})); // Truck
		Region stairs1 = new Region(
				new Position(-5.7, 3.5, -39.7),
				new Position(-14.7, 9.5, -35.3)
				);
		list.add(new Callouts("Stairs", new Region[] {stairs1})); // Stairs
		Region short1 = new Region(
				new Position(-14.701, 8, -35.3),
				new Position(-21, 9.5, -39.7)
				);
		Region short2 = new Region(
				new Position(-21, 9.5, -37),
				new Position(-32, 6.5, -35.3)
				);
		Region short3 = new Region(
				new Position(-29, 10.5, -41),
				new Position(-24, 7, -38)
				);
		list.add(new Callouts("Short", new Region[] {short1, short2, short3})); // Short
		Region circle1 = new Region(
				new Position(-21, 8, -37),
				new Position(-24, 11.5, -41.3)
				);
		list.add(new Callouts("Circle", new Region[] {circle1})); // Circle
		Region square1 = new Region(
				new Position(-29, 6.5, -37),
				new Position(-32, 10.5, -41)
				);
		list.add(new Callouts("Square", new Region[] {square1})); // Square
		Region aSite1 = new Region(
				new Position(-32, 6, -35.3),
				new Position(-35, 9.5, -50)
				);
		Region aSite2 = new Region(
				new Position(-35, 6, -48.7),
				new Position(-42, 7.5, -44)
				);
		Region aSite3 = new Region(
				new Position(-37, 6, -44),
				new Position(-44, 7.5, -35.3)
				);
		Region aSite4 = new Region(
				new Position(-42, 6, -43),
				new Position(-44, 7.5, -55)
				);
		Region aSite5 = new Region(
				new Position(-44, 6, -47.3),
				new Position(-45.7, 7.5, -58.7)
				);
		list.add(new Callouts("A Site", new Region[] {aSite1, aSite2, aSite3, aSite4, aSite5})); // A Site
		Region aDefault1 = new Region(
				new Position(-37, 6, -44),
				new Position(-35.3, 7.5, -42)
				);
		list.add(new Callouts("A Default", new Region[] {aDefault1})); // Default
		Region ninja1 = new Region(
				new Position(-45.7, 6, -45),
				new Position(-44.3, 7.5, -47)
				);
		list.add(new Callouts("Ninja", new Region[] {ninja1})); // Ninja
		Region tree1 = new Region(
				new Position(-42, 6, -58.7),
				new Position(-38, 9, -55)
				);
		list.add(new Callouts("Tree", new Region[] {tree1})); // Back Right A
		Region pocket1 = new Region(
				new Position(-37.7, 7.5, -55),
				new Position(-31.3, 4, -58.7)
				);
		list.add(new Callouts("Pocket", new Region[] {pocket1})); // Pocket
		Region ramp1 = new Region(
				new Position(-31, 3.5, -50.3),
				new Position(-37, 7.5, -54.99)
				);
		list.add(new Callouts("Ramp", new Region[] {ramp1})); // Ramp
		Region elevator1 = new Region(
				new Position(-22.3, 3, -41),
				new Position(-30.7, 4.5, -48)
				);
		list.add(new Callouts("Elevator", new Region[] {elevator1})); // Elevator
		Region arch1 = new Region(
				new Position(-44, 6, -35.3),
				new Position(-48.7, 7.5, -39.7)
				);
		list.add(new Callouts("Arch", new Region[] {arch1})); // Arch
		Region aLong1 = new Region(
				new Position(-31, 3, -56.7),
				new Position(31.7, 7.5, -48)
				);
		Region aLong2 = new Region(
				new Position(31.7, 3, -48),
				new Position(-19.7, 7.5, -41.3)
				);
		Region aLong3 = new Region(
				new Position(31.7, 3, -41),
				new Position(23.3, 6.5, -28.3)
				);
		list.add(new Callouts("A Long", new Region[] {aLong1, aLong2, aLong3})); // A Long
		Region longDoors1 = new Region(
				new Position(30.7, 5, -28),
				new Position(24, 9.5, -23.7)
				);
		list.add(new Callouts("Long Doors", new Region[] {longDoors1})); // Long Doors
		Region ct1 = new Region(
				new Position(-22.3, 3, -39),
				new Position(-30.7, 4.5, -24.3)
				);
		list.add(new Callouts("CT", new Region[] {ct1})); // CT
		Region ctSpawn1 = new Region(
				new Position(-34.7, 3, -24),
				new Position(-21.3, 6.5, -7)
				);
		list.add(new Callouts("CT Spawn", new Region[] {ctSpawn1})); // CT Spawn
		Region ctMid1 = new Region(
				new Position(-32.7, 3, -6.7),
				new Position(-16.3, 7.5, 18)
				);
		Region ctMid2 = new Region(
				new Position(-16.3, 6, 18),
				new Position(-29.7, 8.5, 27)
				);
		list.add(new Callouts("CT Mid", new Region[] {ctMid1, ctMid2})); // CT Mid
		Region eastDoors1 = new Region(
				new Position(-17.3, 7, 27.7),
				new Position(-19.7, 8.5, 27)
				);
		list.add(new Callouts("East Doors", new Region[] {eastDoors1})); // East Doors
		Region westDoors1 = new Region(
				new Position(-27.3, 7, 27.7),
				new Position(-29.7, 8.5, 27)
				);
		list.add(new Callouts("West Doors", new Region[] {westDoors1})); // West Doors
		Region closeLeft1 = new Region(
				new Position(-15.3, 7, 45),
				new Position(-18, 8.5, 48.7)
				);
		list.add(new Callouts("Close Left", new Region[] {closeLeft1})); // Close Left
		Region bSite1 = new Region(
				new Position(-18.1, 7, 48.7),
				new Position(-27, 10.5, 38)
				);
		Region bSite2 = new Region(
				new Position(-27, 7, 39),
				new Position(-36.7, 8.5, 34)
				);
		Region bSite3 = new Region(
				new Position(-21, 7, 34),
				new Position(-33, 10.5, 29.3)
				);
		Region bSite4 = new Region(
				new Position(-20.3, 7, 34),
				new Position(-27, 8.5, 38)
				);
		list.add(new Callouts("B Site", new Region[] {bSite1, bSite2, bSite3, bSite4})); // B Site
		Region underWindow1 = new Region(
				new Position(-36.7, 7, 33),
				new Position(-33, 10.5, 29.3)
				);
		list.add(new Callouts("Under Window", new Region[] {underWindow1})); // Under Window
		Region headshot1 = new Region(
				new Position(-32.3, 7, 39),
				new Position(-36.7, 8.5, 40.7)
				);
		list.add(new Callouts("Headshot", new Region[] {headshot1})); // Headshot
		Region car1 = new Region(
				new Position(-20, 7, 38),
				new Position(-16.3, 7, 29.3)
				);
		list.add(new Callouts("Car", new Region[] {car1})); // Car
		Region bCubby1 = new Region(
				new Position(-27, 7, 43.3),
				new Position(-28.7, 8.5, 48.7)
				);
		list.add(new Callouts("B Cubby", new Region[] {bCubby1})); // B Cubby
		Region panes1 = new Region(
				new Position(-28, 10, 47),
				new Position(-29.137, 12.5, 44)
				);
		list.add(new Callouts("Panes", new Region[] {panes1})); // Panes
		Region outsideTuns1 = new Region(
				new Position(37, 7, 46),
				new Position(10, 10.5, 27)
				);
		list.add(new Callouts("Outside Tuns", new Region[] {outsideTuns1})); // Outside Tuns
		Region upperTunnels1 = new Region(
				new Position(-8, 10.5, 27),
				new Position(5, 7, 46)
				);
		Region upperTunnels2 = new Region(
				new Position(-16, 7, 41.3),
				new Position(-7, 9.5, 44.7)
				);
		list.add(new Callouts("Upper Tunnels", new Region[] {upperTunnels1, upperTunnels2})); // Upper Tunnels
		Region lowerTunnels1 = new Region(
				new Position(-3, 8.5, 26),
				new Position(0, 3, 14)
				);
		list.add(new Callouts("Lower Tunnels", new Region[] {lowerTunnels1})); // Lower Tunneels
		Region bDoors1 = new Region(
				new Position(-21, 7, 27),
				new Position(-26, 8.5, 31)
				);
		list.add(new Callouts("B Doors", new Region[] {bDoors1})); // B Doors
		Region window1 = new Region(
				new Position(-35, 12.5, 29),
				new Position(-31, 6.5, 19)
				);
		list.add(new Callouts("Window", new Region[] {window1})); // Window
		Region tPlat1 = new Region(
				new Position(55, 7.5, 29),
				new Position(37, 13.5, 46)
				);
		list.add(new Callouts("T Plat", new Region[] {tPlat1})); // T Plat
		return list;
	}
}
