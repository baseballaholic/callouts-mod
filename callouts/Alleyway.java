package com.baseballaholic.CalloutsMod.callouts;

import java.util.ArrayList;
import java.util.List;

import com.baseballaholic.CalloutsMod.Callouts;
import com.baseballaholic.CalloutsMod.Position;
import com.baseballaholic.CalloutsMod.Region;

public class Alleyway {
	public static List <Callouts> createCallouts() {
		List <Callouts> list = new ArrayList <Callouts> ();
		Region tSpawn1 = new Region(
				new Position(-818.6, 79, -150.7),
				new Position(-828.7, 84.5, -118.3)
				);
		Region tSpawn2 = new Region(
				new Position(-829.5, 80, -119.3),
				new Position(-830.6, 81.5, -121.7)
				);
		Region tSpawn3 = new Region(
				new Position(-831.7, 81.5, -118.3),
				new Position(-842.7, 79, -133.6)
				);
		Region tSpawn4 = new Region(
				new Position(-849.7, 78, -134.3),
				new Position(-840.3, 81.5, -153.7)
				);
		Region tSpawn5 = new Region(
				new Position(-839.3, 79, -148.3),
				new Position(-839.3, 80.5, -149.7)
				);
		Region tSpawn6 = new Region(
				new Position(-844.3, 82.5, -133.3),
				new Position(-846.7, 79.5, -133.4)
				);
		Region tSpawn7 = new Region(
				new Position(-839.3, 80.5, -134.3),
				new Position(-834.6, 78, -146.7)
				);
		Region tSpawn8 = new Region(
				new Position(-833.5, 78, -143.3),
				new Position(-825.7, 80.5, -146.7)
				);
		Region tSpawn9 = new Region(
				new Position(-833.7, 81.5, -147.7),
				new Position(-829.3, 78.5, -147.7)
				);
		list.add(new Callouts("T Spawn", new Region[] {tSpawn1, tSpawn2, tSpawn3, tSpawn4, tSpawn5, tSpawn6, tSpawn7, tSpawn8, tSpawn9})); // T Spawn
		Region hayBales1 = new Region(
				new Position(-817.7, 79, -150.3),
				new Position(-812.7, 83.5, -153.7)
				);
		list.add(new Callouts("Hay Bales", new Region[] {hayBales1})); // Hay Bales
		Region ramp1 = new Region(
				new Position(-811.7, 79.5, -150.3),
				new Position(-803.5, 83.5, -153.7)
				);
		list.add(new Callouts("Ramp", new Region[] {ramp1})); // Ramp
		Region tStairs1 = new Region(
				new Position(-817.2, 79, -149.3),
				new Position(-813, 82.5, -143.3)
				);
		Region tStairs2 = new Region(
				new Position(-817.7, 81, -142.5),
				new Position(-816.4, 85.5, -132.3)
				);
		list.add(new Callouts("T Stairs", new Region[] {tStairs1, tStairs2})); // T Stairs
		Region livingRoom1 = new Region(
				new Position(-815.5, 84, -132.3),
				new Position(-810.3, 86.5, -141.7)
				);
		Region livingRoom2 = new Region(
				new Position(-809.6, 84, -139.7),
				new Position(-809.6, 85.5, -137.3)
				);
		Region livingRoom3 = new Region(
				new Position(-813.6, 84.5, -131.6),
				new Position(-811.3, 85.5, -131.5)
				);
		Region livingRoom4 = new Region(
				new Position(-808.4, 84, -137.5),
				new Position(-797.3, 86.5, -140.7)
				);
		Region livingRoom5 = new Region(
				new Position(-801.3, 84, -136.5),
				new Position(-802.7, 85.5, -136.5)
				);
		list.add(new Callouts("Living Room", new Region[] {livingRoom1, livingRoom2, livingRoom3, livingRoom4, livingRoom5})); // Living Room
		Region kitchen1 = new Region(
				new Position(-808.7, 84, -136.3),
				new Position(-805.3, 85.5, -135.3)
				);
		Region kitchen2 = new Region(
				new Position(-808.7, 84, -134.5),
				new Position(-806.3, 85.5, -132.3)
				);
		list.add(new Callouts("Kitchen", new Region[] {kitchen1, kitchen2})); // Kitchen
		Region tBalcony1 = new Region(
				new Position(-803.7, 85, -130.6),
				new Position(-796.3, 87, -135.7)
				);
		list.add(new Callouts("T Balcony", new Region[] {tBalcony1})); // T Balcony
		Region bridge1 = new Region(
				new Position(-810.9, 85, -130.7),
				new Position(-814.9, 87.5, -124.3)
				);
		list.add(new Callouts("Bridge", new Region[] {bridge1})); // Bridge
		Region altMid1 = new Region(
				new Position(-817.4, 80, -130.7),
				new Position(-782.7, 84, -124.6)
				);
		list.add(new Callouts("Alt Mid", new Region[] {altMid1})); // Alt Mid
		Region apartmentStairs1 = new Region(
				new Position(-784.7, 82, -135.7),
				new Position(-779.3, 86, -129.8)
				);
		list.add(new Callouts("Apartment Stairs", new Region[] {apartmentStairs1})); // Apartment Stairs
		Region mid1 = new Region(
				new Position(-779.3, 82, -136.7),
				new Position(-784.7, 85, -141.3)
				);
		Region mid2 = new Region(
				new Position(-793.3, 82, -149.7),
				new Position(-770.5, 84.5, -142.3)
				);
		Region mid3 = new Region(
				new Position(-802.4, 82, -149.4),
				new Position(-794.4, 84.5, -143.3)
				);
		list.add(new Callouts("Mid", new Region[] {mid1, mid2, mid3})); // Mid
		Region backAlley1 = new Region(
				new Position(-796.7, 82, -123.5),
				new Position(-784.1, 84, -110.3)
				);
		Region backAlley2 = new Region(
				new Position(-796.7, 82, -123.6),
				new Position(-794.3, 83.5, -113.6)
				);
		list.add(new Callouts("Back Alley", new Region[] {backAlley1, backAlley2})); // Back Alley
		Region tApartments1 = new Region(
				new Position(-797.5, 82, -117.3),
				new Position(-814.7, 86.5, -123.3)
				);
		Region tApartments2 = new Region(
				new Position(-814.7, 86.5, -116.3),
				new Position(-812.3, 84, -114.3)
				);
		Region tApartments3 = new Region(
				new Position(-811.3, 84.5, -123.5),
				new Position(-813.7, 86, -123.5)
				);
		list.add(new Callouts("T Apartments", new Region[] {tApartments1, tApartments2, tApartments3})); // T Apartments
		Region mexico1 = new Region(
				new Position(-795.7, 79.5, -131.8),
				new Position(-795.3, 80, -149.7)
				);
		list.add(new Callouts("Mexico", new Region[] {mexico1})); // Mexico
		Region bench1 = new Region(
				new Position(-781.3, 82, -149.7),
				new Position(-785.7, 87, -149.7)
				);
		list.add(new Callouts("Bench", new Region[] {bench1})); // Bench
		Region topMid1 = new Region(
				new Position(-769.7, 83, -141.3),
				new Position(-764.3, 85, -149.7)
				);
		Region topMid2 = new Region(
				new Position(-764.3, 83, -140.7),
				new Position(-769.7, 87, -134.7)
				);
		list.add(new Callouts("Top Mid", new Region[] {topMid1, topMid2})); // Top Mid
		Region lane1 = new Region(
				new Position(-769.7, 83, -133.5),
				new Position(-756.8, 84.5, -127.3)
				);
		list.add(new Callouts("Lane", new Region[] {lane1})); // Lane
		Region patio1 = new Region(
				new Position(-769.7, 86.5, -130.8),
				new Position(-755.5, 88.5, -127.3)
				);
		list.add(new Callouts("Patio", new Region[] {patio1})); // Patio
		Region truck1 = new Region(
				new Position(-755.4, 83, -127.3),
				new Position(-745.6, 88, -130.5)
				);
		list.add(new Callouts("Truck", new Region[] {truck1})); // Truck
		Region pit1 = new Region(
				new Position(-735.3, 82, -129.7),
				new Position(-739.3, 84.5, -116.3)
				);
		list.add(new Callouts("Pit", new Region[] {pit1})); // Pit
		Region sidePit1 = new Region(
				new Position(-740.4, 83, -116.3),
				new Position(-748.7, 84.5, -119.6)
				);
		list.add(new Callouts("Side Pit", new Region[] {sidePit1})); // Side Pit
		Region underBalcony1 = new Region(
				new Position(-746.5, 82, -120.4),
				new Position(-750.7, 84.5, -126.7)
				);
		list.add(new Callouts("Under Balcony", new Region[] {underBalcony1})); // Under Balcony
		Region closeApartments1 = new Region(
				new Position(-751.5, 86, -125.7),
				new Position(-754.6, 88, -119.3)
				);
		list.add(new Callouts("Close Apartments", new Region[] {closeApartments1})); // Close Apartments
		Region balcony1 = new Region(
				new Position(-746.7, 86, -120.7),
				new Position(-750.7, 88.5, -126.4)
				);
		list.add(new Callouts("Balcony", new Region[] {balcony1})); // Balcony
		Region apartments1 = new Region(
				new Position(-755.5, 86, -121.6),
				new Position(-770.2, 87.5, -119.3)
				);
		Region apartments2 = new Region(
				new Position(-771.3, 86, -122.6),
				new Position(-773.5, 87.5, -130.2)
				);
		list.add(new Callouts("Apartments", new Region[] {apartments1, apartments2})); // Apartments
		Region window1 = new Region(
				new Position(-775.3, 86, -131.7),
				new Position(-780.6, 88, -123.3)
				);
		Region window2 = new Region(
				new Position(-774.5, 86, -130.7),
				new Position(-774.5, 88, -129.3)
				);
		list.add(new Callouts("Window", new Region[] {window1, window2})); // Window
		Region bedroom1 = new Region(
				new Position(-775.3, 86, -120.7),
				new Position(-777.7, 87.5, -116.3)
				);
		Region bedroom2 = new Region(
				new Position(-774.5, 86, -119.7),
				new Position(-774.6, 87.5, -118.4)
				);
		list.add(new Callouts("Bedroom", new Region[] {bedroom1, bedroom2})); // Bedroom
		Region tBoiler1 = new Region(
				new Position(-771.3, 85, -117.5),
				new Position(-773.7, 83, -109.8)
				);
		Region tBoiler2 = new Region(
				new Position(-781.7, 82, -122.6),
				new Position(-779.3, 84.5, -107.3)
				);
		Region tBoiler3 = new Region(
				new Position(-783.7, 82, -107.3),
				new Position(-782.7, 85.5, -116.7)
				);
		list.add(new Callouts("T Boiler", new Region[] {tBoiler1, tBoiler2, tBoiler3})); // T Boiler
		Region graveyard1 = new Region(
				new Position(-739.6, 83, -130.5),
				new Position(-736.6, 88.5, -145.7)
				);
		list.add(new Callouts("Graveyard", new Region[] {graveyard1})); // Graveyard
		Region closeLeft1 = new Region(
				new Position(-752.7, 84, -135.3),
				new Position(-754.7, 87.5, -135.3)
				);
		list.add(new Callouts("Close Left", new Region[] {closeLeft1})); // Close left
		Region backsiteA1 = new Region(
				new Position(-753.2, 84, -138.5),
				new Position(-754.7, 87, -150.3)
				);
		list.add(new Callouts("Backsite A", new Region[] {backsiteA1})); // Back Site
		Region frontA1 = new Region(
				new Position(-740.4, 83, -134.4),
				new Position(-745, 85.5, -149.4)
				);
		list.add(new Callouts("Front A", new Region[] {frontA1})); // Front A
		Region aSite1 = new Region(
				new Position(-751.5, 84, -149.7),
				new Position(-746.5, 88, -134.4)
				);
		list.add(new Callouts("A Site", new Region[] {aSite1})); // A Site
		Region moto1 = new Region(
				new Position(-745.7, 84, -150.4),
				new Position(-739.4, 85.5, -157.7)
				);
		list.add(new Callouts("Moto", new Region[] {moto1})); // Moto
		Region aLong1 = new Region(
				new Position(-740.3, 84, -158.7),
				new Position(-764.3, 85.5, -163.7)
				);
		Region aLong2 = new Region(
				new Position(-765.8, 85.5, -160.6),
				new Position(-769.7, 84, -151.6)
				);
		Region aLong3 = new Region(
				new Position(-764.3, 84, -151.3),
				new Position(-764.3, 85.5, -156.7)
				);
		list.add(new Callouts("A Long", new Region[] {aLong1, aLong2, aLong3})); // A Long
		Region cubby1 = new Region(
				new Position(-769.4, 85.5, -161.3),
				new Position(-770.7, 84, -163.1)
				);
		list.add(new Callouts("Cubby", new Region[] {cubby1})); // Cubby
		Region boiler1 = new Region(
				new Position(-773.7, 87, -132.7),
				new Position(-769.4, 83, -139.7)
				);
		list.add(new Callouts("Boiler", new Region[] {boiler1})); // Boiler
		Region library1 = new Region(
				new Position(-737.7, 84, -159.3),
				new Position(-732.3, 85.5, -159.4)
				);
		Region library2 = new Region(
				new Position(-739.7, 84, -160.3),
				new Position(-732.3, 86.5, -166.7)
				);
		list.add(new Callouts("Library", new Region[] {library1, library2})); // Library
		Region ctKitchen1 = new Region(
				new Position(-733.7, 84, -170.3),
				new Position(-733.3, 86.5, -174.3)
				);
		Region ctKitchen2 = new Region(
				new Position(-734.3, 84, -167.5),
				new Position(-743.7, 86.5, -173.3)
				);
		list.add(new Callouts("CT Kitchen", new Region[] {ctKitchen1, ctKitchen2})); // CT Kitchen
		Region arch1 = new Region(
				new Position(-759.6, 84, -182.7),
				new Position(-755.3, 86.5, -163.9)
				);
		list.add(new Callouts("Arch", new Region[] {arch1})); // Archway
		Region speedway1 = new Region(
				new Position(-760.6, 84, -175.3),
				new Position(-761.7, 86.5, -202.9)
				);
		Region speedway2 = new Region(
				new Position(-758.7, 83, -202.6),
				new Position(-759.3, 86.5, -184.3)
				);
		list.add(new Callouts("Speedway", new Region[] {speedway1, speedway2})); // Speedway
		Region ctSpawn1 = new Region(
				new Position(-754.5, 86.5, -182.7),
				new Position(-735.3, 83, -195.7)
				);
		Region ctSpawn2 = new Region(
				new Position(-740.3, 83, -196.4),
				new Position(-756.7, 87, -208.7)
				);
		Region ctSpawn3 = new Region(
				new Position(-753.6, 84, -181.4),
				new Position(-731.7, 87.5, -175.3)
				);
		Region ctSpawn4 = new Region(
				new Position(-742.3, 84, -174.6),
				new Position(-743.7, 85.5, -174.6)
				);
		list.add(new Callouts("CT Spawn", new Region[] {ctSpawn1, ctSpawn2, ctSpawn3, ctSpawn4})); // CT Spawn
		Region iceCream1 = new Region(
				new Position(-759.5, 83, -203.3),
				new Position(-773.3, 86.5, -208.7)
				);
		list.add(new Callouts("Ice Cream", new Region[] {iceCream1})); // Ice Cream
		Region tree1 = new Region(
				new Position(-769.3, 83, -202.7),
				new Position(-772.5, 84.5, -201.3)
				);
		list.add(new Callouts("Tree", new Region[] {tree1})); // Tree
		Region ct1 = new Region(
				new Position(-773.5, 83, -204.2),
				new Position(-781.4, 84.5, -201.3)
				);
		Region ct2 = new Region(
				new Position(-774.7, 83, -208.3),
				new Position(-776.7, 84.5, -205.5)
				);
		list.add(new Callouts("CT", new Region[] {ct1, ct2})); // CT
		Region construction1 = new Region(
				new Position(-772.3, 83, -211.3),
				new Position(-781.7, 86, -220.7)
				);
		Region construction2 = new Region(
				new Position(-779.3, 83, -210.7),
				new Position(-781.7, 86, -207.3)
				);
		Region construction3 = new Region(
				new Position(-771.3, 83, -212.3),
				new Position(-771.3, 84.5, -213.7)
				);
		Region construction4 = new Region(
				new Position(-782.6, 83, -219.7),
				new Position(-783.3, 84.5, -218.3)
				);
		list.add(new Callouts("Construction", new Region[] {construction1, construction2, construction3, construction4})); // Construction
		Region sandbags1 = new Region(
				new Position(-782.4, 83.5, -211.3),
				new Position(-788.7, 87.5, -215.7)
				);
		list.add(new Callouts("Sand Bags", new Region[] {sandbags1})); // Sand Bags
		Region garden1 = new Region(
				new Position(-794.7, 86.5, -218.6),
				new Position(-784.3, 85, -224.7)
				);
		list.add(new Callouts("Garden", new Region[] {garden1})); // Garden
		Region coffin1 = new Region(
				new Position(-794.5, 84, -211.7),
				new Position(-790.3, 87.5, -217.3)
				);
		list.add(new Callouts("Coffin", new Region[] {coffin1})); // Coffins
		Region bSite1 = new Region(
				new Position(-790.3, 84, -209.7),
				new Position(-801.7, 90, -200.6)
				);
		Region bSite2 = new Region(
				new Position(-800.7, 84, -212.3),
				new Position(-795.7, 85.5, -211.5)
				);
		Region bSite3 = new Region(
				new Position(-798.3, 84, -213.7),
				new Position(-799.7, 85.5, -213.7)
				);
		Region bSite4 = new Region(
				new Position(-801.7, 84, -200.5),
				new Position(-789.7, 89, -198.6)
				);
		Region bSite5 = new Region(
				new Position(-789.5, 83.5, -200.3),
				new Position(-789.5, 86, -208.7)
				);
		list.add(new Callouts("B Site", new Region[] {bSite1, bSite2, bSite3, bSite4, bSite5})); // B Site
		Region dark1 = new Region(
				new Position(-802.5, 84, -208.7),
				new Position(-806.7, 90, -212.7)
				);
		Region dark2 = new Region(
				new Position(-805.7, 84, -213.7),
				new Position(-804.3, 85.5, -213.7)
				);
		list.add(new Callouts("Dark", new Region[] {dark1, dark2})); // Dark
		Region backsiteB1 = new Region(
				new Position(-802.7, 84, -207.5),
				new Position(-807.7, 85.5, -203.3)
				);
		list.add(new Callouts("Backsite B", new Region[] {backsiteB1})); // Backsite B
		Region quad1 = new Region(
				new Position(-803.3, 84, -202.3),
				new Position(-806.7, 85.5, -196.3)
				);
		list.add(new Callouts("Quad", new Region[] {quad1})); // Quad
		Region second1 = new Region(
				new Position(-798.7, 84, -200.3),
				new Position(-802.5, 85.5, -196.3)
				);
		list.add(new Callouts("2nd", new Region[] {second1})); // Second
		Region boost1 = new Region(
				new Position(-798, 87.5, -198.3),
				new Position(-794.7, 90, -197.3)
				);
		list.add(new Callouts("Boost", new Region[] {boost1})); // Boost
		Region first1 = new Region(
				new Position(-794.7, 84, -197.7),
				new Position(-789.7, 90, -196.3)
				);
		list.add(new Callouts("1st", new Region[] {first1})); // First
		Region grill1 = new Region(
				new Position(-788.7, 83, -205.7),
				new Position(-784.3, 86.5, -208.7)
				);
		list.add(new Callouts("Grill", new Region[] {grill1})); // Grill
		Region frontB1 = new Region(
				new Position(-782.7, 83, -204.7),
				new Position(-788.7, 84.5, -195.3)
				);
		Region frontB2 = new Region(
				new Position(-781.3, 83, -195.7),
				new Position(-781.3, 84, -194.3)
				);
		list.add(new Callouts("Front B", new Region[] {frontB1, frontB2})); // Front B
		Region topBanana1 = new Region(
				new Position(-783.5, 83, -194.9),
				new Position(-783.3, 86.5, -181.3)
				);
		Region topBanana2 = new Region(
				new Position(-789.3, 83, -181.3),
				new Position(-792.5, 84.5, -186.7)
				);
		list.add(new Callouts("Top Banana", new Region[] {topBanana1, topBanana2})); // Top Banana
		Region car1 = new Region(
				new Position(-793.4, 83, -181.3),
				new Position(-797.7, 84.5, -186.7)
				);
		list.add(new Callouts("Car", new Region[] {car1})); // Car
		Region banana1 = new Region(
				new Position(-795.3, 83, -180.6),
				new Position(-800.7, 84.5, -180.6)
				);
		Region banana2 = new Region(
				new Position(-792.3, 84.5, -179.8),
				new Position(-804.7, 82, -168.7)
				);
		Region banana3 = new Region(
				new Position(-795.3, 82, -167.6),
				new Position(-802.7, 83.5, -160.3)
				);
		list.add(new Callouts("Banana", new Region[] {banana1, banana2, banana3})); // Banana
		Region logs1 = new Region(
				new Position(-803.7, 82, -167.3),
				new Position(-807.7, 85, -162.3)
				);
		list.add(new Callouts("Logs", new Region[] {logs1})); // Logs
		Region bottomBanana1 = new Region(
				new Position(-799.3, 82, -154.5),
				new Position(-802.7, 83.5, -161.5)
				);
		list.add(new Callouts("Bottom Banana", new Region[] {bottomBanana1})); // Bottom Banana
		
		return list;
	}
}
