package com.baseballaholic.CalloutsMod.callouts;

import java.util.ArrayList;
import java.util.List;

import com.baseballaholic.CalloutsMod.Callouts;
import com.baseballaholic.CalloutsMod.Position;
import com.baseballaholic.CalloutsMod.Region;

public class Sandstorm {
	public static List <Callouts> createSandstormCallouts() {
		List <Callouts> list = new ArrayList <Callouts> ();
		Region ctSpawn1 = new Region(
				new Position(-824, 80, -114),
				new Position(-802, 83, -125)
				);
		list.add(new Callouts("CT Spawn", new Region[] {ctSpawn1})); //CT Spawn
		Region elevator1 = new Region(
				new Position(-824, 80, -124),
				new Position(-842, 85.5, -115.3)
				);
		list.add(new Callouts("Elevator", new Region[] {elevator1})); // Elevator
		Region ramp1 = new Region(
				new Position(-842, 84.5, -117),
				new Position(-850, 87.5, -106)
				);
		list.add(new Callouts("Ramp", new Region[] {ramp1})); // Ramp
		Region aCar1 = new Region(
				new Position(-850, 85.5, -118),
				new Position(-853, 84, -130)
				);
		list.add(new Callouts("A Car", new Region[] {aCar1})); // A Car
		Region aLong1 = new Region(
				new Position(-842, 84, -117.3),
				new Position(-850, 85.5, -159)
				);
		Region aLong2 = new Region(
				new Position(-822.3, 84, -158.7),
				new Position(-842, 87.5, -144.3)
				);
		Region aLong3 = new Region(
				new Position(-832.3, 84, -159.7),
				new Position(-840.7, 87.5, -174.7)
				);
		list.add(new Callouts("A Long", new Region[] {aLong1, aLong2, aLong3})); // A Long
		Region pit1 = new Region(
				new Position(-849.7, 83.5, -159),
				new Position(-842.3, 81, -170.7)
				);
		list.add(new Callouts("Pit", new Region[] {pit1})); // Pit
		Region longPlat1 = new Region(
				new Position(-850, 84.5, -152.3),
				new Position(-853.7, 88.5, -168.7)
				);
		list.add(new Callouts("Long Plat", new Region[] {longPlat1})); // Long Plat
		Region aBarrels1 = new Region(
				new Position(-842, 87.5, -106),
				new Position(-846, 86, -102)
				);
		list.add(new Callouts("A Barrels", new Region[] {aBarrels1})); // A Barrels
		Region goose1 = new Region(
				new Position(-846, 86, -106),
				new Position(-849.7, 87.5, -96.3)
				);
		Region goose2 = new Region(
				new Position(-841.99, 86, -96.3),
				new Position(-835.3, 87.5, -106)
				);
		Region goose3 = new Region(
				new Position(-842, 86, -96.3),
				new Position(-845.99, 87.5, -101.99)
				);
		list.add(new Callouts("Goose", new Region[] {goose1, goose2, goose3})); // Goose
		Region cubby1 = new Region(
				new Position(-803.7, 80, -111.3),
				new Position(-801, 80, -114)
				);
		list.add(new Callouts("Cubby", new Region[] {cubby1})); // Cubby
		Region ctMid1 = new Region(
				new Position(-800.99, 80, -111.3),
				new Position(-781.3, 82, -123.7)
				);
		Region ctMid2 = new Region(
				new Position(-801.7, 80, -114.01),
				new Position(-796.3, 80, -129)
				);
		Region ctMid3 = new Region(
				new Position(-796.3, 80, -129),
				new Position(-800, 80, -131.7)
				);
		list.add(new Callouts("CT Mid", new Region[] {ctMid1, ctMid2, ctMid3})); // CT Mid
		Region window1 = new Region(
				new Position(-780.99, 81.5, -111.3),
				new Position(-775.3, 84.5, -117)
				);
		Region window2 = new Region(
				new Position(-770.01, 82, -109.3),
				new Position(-775.29, 84.5, -114)
				);
		list.add(new Callouts("Window", new Region[] {window1, window2})); // Window
		Region bDoors1 = new Region(
				new Position(-775.3, 82, -117.01),
				new Position(-776.49, 81.5, -123.7)
				);
		Region bDoors2 = new Region(
				new Position(-773, 82, -119),
				new Position(-775.3, 82, -123.7)
				);
		list.add(new Callouts("B Doors", new Region[] {bDoors1, bDoors2})); // B Doors
		Region bBoxes1 = new Region(
				new Position(-781, 83.5, -123.7),
				new Position(-776.5, 81.5, -121)
				);
		list.add(new Callouts("CT Mid Boxes", new Region[] {bBoxes1})); // CT Mid Boxes
		Region doubleStack1 = new Region(
				new Position(-770, 82, -118),
				new Position(-766, 86, -114)
				);
		list.add(new Callouts("Double Stack", new Region[] {doubleStack1})); // Double Stack
		Region bDefault1 = new Region(
				new Position(-771, 82, -118),
				new Position(-773.7, 82, -114.3)
				);
		list.add(new Callouts("B Default", new Region[] {bDefault1})); // B Default
		Region bSite1 = new Region(
				new Position(-770.01, 82, -117.99),
				new Position(-770.99, 82, -109.3)
				);
		Region bSite2 = new Region(
				new Position(-769.99, 83.5, -108.3),
				new Position(-765.3, 82, -113.99)
				);
		list.add(new Callouts("B Site", new Region[] {bSite1, bSite2})); // B Site
		Region bigBox1 = new Region(
				new Position(-765, 84.5, -117),
				new Position(-760, 82, -121)
				);
		list.add(new Callouts("Big Box", new Region[] {bigBox1})); // Big Box
		Region backPlat1 = new Region(
				new Position(-754, 83, -101), 
				new Position(-762.7, 84.5, -108)
				);
		list.add(new Callouts("Back Plat", new Region[] {backPlat1})); // Back Plat
		Region bBarrels1 = new Region(
				new Position(-763.7, 83, -116.7),
				new Position(-760, 84.5, -112)
				);
		list.add(new Callouts("B Barrels", new Region[] {bBarrels1})); // B Barrels
		Region bPlat1 = new Region(
				new Position(-765, 83.5, -116),
				new Position(-764, 83, -108.3)
				);
		Region bPlat2 = new Region(
				new Position(-763.7, 83, -108.3),
				new Position(-754.3, 83, -111.7)
				);
		Region bPlat3 = new Region(
				new Position(-760, 83, -118),
				new Position(-754.3, 85, -112)
				);
		list.add(new Callouts("B Plat", new Region[] {bPlat1, bPlat2, bPlat3})); // B Plat
		Region b1 = new Region(
				new Position(-760, 82, -120),
				new Position(-753.3, 82.5, -118.3)
				);
		Region b2 = new Region(
				new Position(-753.3, 83.5, -120),
				new Position(-773.7, 82, -129)
				);
		Region b3 = new Region(
				new Position(-753.3, 82, -129),
				new Position(-759.7, 82, -134.7)
				);
		list.add(new Callouts("B", new Region[] {b1, b2, b3})); // B
		Region closeTuns1 = new Region(
				new Position(-754, 82.5, -132),
				new Position(-753.3, 83, -134.7)
				);
		list.add(new Callouts("Close Tuns", new Region[] {closeTuns1})); // Close Tuns
		Region bCar1 = new Region(
				new Position(-764.3, 82, -136.7),
				new Position(-773.7, 84, -129.01)
				);
		list.add(new Callouts("B Car", new Region[] {bCar1})); // B Car
		Region closet1 = new Region(
				new Position(-767.7, 82, -139.7),
				new Position(-765.3, 83.5, -139)
				);
		list.add(new Callouts("Closet", new Region[] {closet1})); // Closet
		Region fence1 = new Region(
				new Position(-753, 82, -128.7),
				new Position(-751.3, 83, -125.3)
				);
		list.add(new Callouts("Fence", new Region[] {fence1})); // Fence
		Region upperTunnels1 = new Region(
				new Position(-758.7, 82.5, -135),
				new Position(-754.300, 84.5, -151.7)
				);
		Region upperTunnels2 = new Region(
				new Position(-759, 84.5, -145.3),
				new Position(-779.7, 82.5, -154.7)
				);
		Region upperTunnels3 = new Region(
				new Position(-767.7, 83.5, -155),
				new Position(-764.3, 82, -159)
				);
		Region upperTunnels4 = new Region(
				new Position(-780, 82.5, -152.7),
				new Position(-783.7, 80.5, -146)
				);
		list.add(new Callouts("Upper Tunnels", new Region[] {upperTunnels1, upperTunnels2, upperTunnels3, upperTunnels4})); // Upper Tunnels
		Region lowerTunnels1 = new Region(
				new Position(-778.3, 80, -145.7),
				new Position(-796, 81.5, -141.3)
				);
		list.add(new Callouts("Lower Tunnels", new Region[] {lowerTunnels1})); // Lower Tunnels
		Region hiko1 = new Region(
				new Position(-802.7, 80, -129.3),
				new Position(-801, 81.5, -133.7)
				);
		Region hiko2 = new Region(
				new Position(-800, 80, -132.7),
				new Position(-801, 81.5, -129)
				);
		list.add(new Callouts("Hiko", new Region[] {hiko1, hiko2})); // Hiko
		Region midDoors1 = new Region(
				new Position(-801.7, 80, -136),
				new Position(-796.3, 81.5, -134)
				);
		Region midDoors2 = new Region(
				new Position(-799, 80, -131),
				new Position(-796.3, 81.5, -133.7)
				);
		list.add(new Callouts("Mid Doors", new Region[] {midDoors1, midDoors2})); // Mid Doors
		Region aSite1 = new Region(
				new Position(-828, 86, -106.3),
				new Position(-842, 89, -117)
				);
		list.add(new Callouts("A Site", new Region[] {aSite1})); // A Site
		Region elbow1 = new Region(
				new Position(-827.9, 86, -107.3),
				new Position(-823, 88.5, -115)
				);
		Region elbow2 = new Region(
				new Position(-823, 88.5, -115),
				new Position(-817.3, 86, -108.5)
				);
		list.add(new Callouts("Elbow", new Region[] {elbow1, elbow2})); // Elbow
		Region ninja1 = new Region(
				new Position(-821.7, 86, -106.3),
				new Position(-817.3, 86, -108.4)
				);
		list.add(new Callouts("Ninja", new Region[] {ninja1})); // Ninja
		Region short1 = new Region(
				new Position(-824, 88, -115),
				new Position(-817.3, 86, -132)
				);
		Region short2 = new Region(
				new Position(-822.7, 84, -137.01),
				new Position(-808, 85.5, -142.7)
				);
		list.add(new Callouts("Short", new Region[] {short1, short2})); // Short
		Region stairs1 = new Region(
				new Position(-822.7, 87.5, -132.01),
				new Position(-817.3, 84, -137)
				);
		list.add(new Callouts("Stairs", new Region[] {stairs1})); // Stairs
		Region cat1 = new Region(
				new Position(-807.99, 84, -138.3),
				new Position(-803, 85.5, -160)
				);
		list.add(new Callouts("Cat", new Region[] {cat1})); // Cat
		Region palm1 = new Region(
				new Position(-804, 85.5, -160.01),
				new Position(-801, 84, -163)
				);
		list.add(new Callouts("Palm Tree", new Region[] {palm1})); // Palm Tree
		Region xbox1 = new Region(
				new Position(-802.7, 84.49, -140.7),
				new Position(-800, 80, -146)
				);
		list.add(new Callouts("Xbox", new Region[] {xbox1})); // Xbox
		Region mid1 = new Region(
				new Position(-796.3, 80, -136),
				new Position(-802.7, 81.5, -140.7)
				);
		Region mid2 = new Region(
				new Position(-799.7, 80, -141),
				new Position(-800, 81.5, -146)
				);
		Region mid3 = new Region(
				new Position(-802.7, 80, -146.3),
				new Position(-796.3, 84.5, -159.9)
				);
		list.add(new Callouts("Mid", new Region[] {mid1, mid2, mid3})); // Mid
		Region topRightMid1 = new Region(
				new Position(-795, 84, -164.3),
				new Position(-789.3, 85.5, -174.4)
				);
		list.add(new Callouts("Top Right Mid", new Region[] {topRightMid1})); // Top Right Mid
		Region topMid1 = new Region(
				new Position(-796.3, 83.5, -160.01),
				new Position(-800.7, 85.5, -174.7)
				);
		Region topMid2 = new Region(
				new Position(-801, 84, -173.7),
				new Position(-806.7,  84.5, -163.01)
				);
		Region topMid3 = new Region(
				new Position(-806.7, 84, -160),
				new Position(-804, 85.5, -163.01)
				);
		Region topMid4 = new Region(
				new Position(-807.7, 84, -165.3),
				new Position(-819.7, 85.5, -173)
				);
		list.add(new Callouts("Top Mid", new Region[] {topMid1, topMid2, topMid3, topMid4})); // Top Mid
		Region longDoors1 = new Region(
				new Position(-823.3, 84, -159),
				new Position(-827.7, 85.5, -176)
				);
		list.add(new Callouts("Long Doors", new Region[] {longDoors1})); // Long Doors
		Region outsideLong1 = new Region(
				new Position(-815.3, 84, -176.01),
				new Position(-827.7, 87.5, -196)
				);
		list.add(new Callouts("Outside Long", new Region[] {outsideLong1})); // Outside Long
		Region tSpawn1 = new Region(
				new Position(-815, 84, -192.3),
				new Position(-800, 85.5, -195.7)
				);
		Region tSpawn2 = new Region(
				new Position(-822.7, 84, -196.01),
				new Position(-782.3, 87.5, -208.14)
				);
		list.add(new Callouts("T Spawn", new Region[] {tSpawn1, tSpawn2})); // T Spawn
		Region tPlat1 = new Region(
				new Position(-782, 86, -197),
				new Position(-748.863, 89.5, -208.7)
				);
		Region tPlat2 = new Region(
				new Position(-763, 88, -186),
				new Position(-785.7, 86, -195.9)
				);
		list.add(new Callouts("T Plat", new Region[] {tPlat1, tPlat2})); // T Plat
		Region tRamp1 = new Region(
				new Position(-762.7, 85.5, -196.699),
				new Position(-754.3, 81, -183)
				);
		list.add(new Callouts("T Ramp", new Region[] {tRamp1})); // T Ramp
		Region outsideTuns1 = new Region(
				new Position(-763, 82, -183),
				new Position(-772, 86.5, -185.6)
				);
		Region outsideTuns2 = new Region(
				new Position(-777.7, 85, -159.3),
				new Position(-754.3, 81, -183)
				);
		list.add(new Callouts("Outside Tuns", new Region[] {outsideTuns1, outsideTuns2})); // Outside Tuns
		Region suicide1 = new Region(
				new Position(-796.3, 84, -195.7),
				new Position(-799.7, 87.5, -175.01)
				);
		list.add(new Callouts("Suicide", new Region[] {suicide1})); // Suicide
		return list;
	}
}
