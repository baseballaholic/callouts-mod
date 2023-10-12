package com.baseballaholic.CalloutsMod.callouts;

import java.util.ArrayList;
import java.util.List;

import com.baseballaholic.CalloutsMod.Callouts;
import com.baseballaholic.CalloutsMod.Position;
import com.baseballaholic.CalloutsMod.Region;

public class Reserve {
	public static List <Callouts> createCallouts() {
		List <Callouts> list = new ArrayList <Callouts> ();
		Region treeRoom1 = new Region(
			new Position(30.300, 44, -262.7),
			new Position(51.7, 47.5, -252.3)
			);
		list.add(new Callouts("Tree Room", new Region[] {treeRoom1})); // Tree Room
		Region ctSpawn1 = new Region(
			new Position(100.7, 44, -270.3),
			new Position(80.3, 45.5, -282.7)
			);
		Region ctSpawn2 = new Region(
			new Position(80, 44, -263),
			new Position(58.3, 47.5, -284.137)
			);
		list.add(new Callouts("CT Spawn", new Region[] {ctSpawn1, ctSpawn2})); // CT Spawn
		Region ctHalls1 = new Region(
			new Position(54.3, 44, -262.7),
			new Position(91.7, 47, -254.3)
			);
		list.add(new Callouts("CT Halls", new Region[] {ctHalls1})); // CT Halls
		Region truck1 = new Region(
			new Position(101.3, 48.5, -262.137),
			new Position(92, 46, -255.3)
			);
		list.add(new Callouts("Truck", new Region[] {truck1})); // Truck
		Region elektro1 = new Region(
			new Position(101.301, 47.5, -262.137),
			new Position(108.7, 46, -243)
			);
		Region elektro2 = new Region(
				new Position(101.300, 46, -252.7),
				new Position(99.3, 47.5, -243)
				);
		list.add(new Callouts("Elektro", new Region[] {elektro1, elektro2})); // Elektro
		Region a1 = new Region(
				new Position(114, 47.5, -241.7),
				new Position(99.3, 46, -233)
				);
		Region a2 = new Region(
				new Position(113.01, 46, -218.3),
				new Position(126, 47.5, -232)
				);
		list.add(new Callouts("A", new Region[] {a1, a2})); // A
		Region forklift1 = new Region(
				new Position(105.3, 46, -232.99),
				new Position(113, 48, -218.3)
				);
		Region forklift2 = new Region(
				new Position(108, 50, -230.3),
				new Position(111.3, 52, -222.7)
				);
		list.add(new Callouts("Forklift", new Region[] {forklift1, forklift2})); // Forklift
		Region aDefault1 = new Region(
				new Position(124, 46, -234.3),
				new Position(122.3, 47.5, -237)
				);
		list.add(new Callouts("A Default", new Region[] {aDefault1})); // A Default
		Region aSite1 = new Region(
				new Position(116, 46, -241.7),
				new Position(127.99, 47.5, -237.01)
				);
		Region aSite2 = new Region(
				new Position(127.99, 46, -232),
				new Position(124.01, 47.5, -236.99)
				);
		list.add(new Callouts("A Site", new Region[] {aSite1, aSite2})); // A Site
		Region quad1 = new Region(
				new Position(128, 46, -242.7),
				new Position(135.137, 47.5, -234.299)
				);
		Region quad2 = new Region(
				new Position(134.7, 46, -232.3),
				new Position(128, 46, -234)
				);
		list.add(new Callouts("Quad", new Region[] {quad1, quad2})); // Quad
		Region nbk1 = new Region(
				new Position(135.137, 47, -233.7),
				new Position(134.7, 48.5, -232.3)
				);
		list.add(new Callouts("NBK", new Region[] {nbk1})); // NBK
		Region shroud1 = new Region(
				new Position(124.7, 50, -225.3),
				new Position(127.7, 52, -218.3)
				);
		list.add(new Callouts("Shroud", new Region[] {shroud1})); // Shroud
		Region squeaky1 = new Region(
				new Position(129.3, 46, -230),
				new Position(135.7, 49.5, -199.3)
				);
		Region squeaky2 = new Region(
				new Position(127.7, 46, -204.7),
				new Position(122, 49.2, -194.3)
				);
		Region squeaky3 = new Region(
				new Position(122, 46, -201.7),
				new Position(117.3, 49.2, -194.3)
				);
		list.add(new Callouts("Squeaky", new Region[] {squeaky1, squeaky2, squeaky3})); // Squeaky
		Region aLong1 = new Region(
				new Position(116.99, 47.5, -193.3),
				new Position(87, 44, -199.7)
				);
		list.add(new Callouts("A Long", new Region[] {aLong1})); // A Long
		Region aMain1 = new Region(
				new Position(84.3, 44, -205.7),
				new Position(87, 47.5, -212.7)
				);
		Region aMain2 = new Region(
				new Position(87, 46, -215.7),
				new Position(126.7, 51, -208)
				);
		Region aMain3 = new Region(
				new Position(126.7, 46, -208),
				new Position(121, 47.5, -206)
				);
		Region aMain4 = new Region(
				new Position(120.7, 46, -202.3),
				new Position(111.3, 47.5, -208)
				);
		list.add(new Callouts("A Main", new Region[] {aMain1, aMain2, aMain3, aMain4})); // A Main
		Region lockers1 = new Region(
				new Position(110.99, 47, -207.99),
				new Position(108.3, 50.5, -203.3)
				);
		list.add(new Callouts("Lockers", new Region[] {lockers1})); // Lockers
		Region boost1 = new Region(
				new Position(83, 44, -202.7),
				new Position(79.3, 50, -211)
				);
		Region boost2 = new Region(
				new Position(82, 49, -203),
				new Position(86.7, 52.5, -215)
				);
		list.add(new Callouts("Boost", new Region[] {boost1, boost2})); // Boost
		Region ticketBooth1 = new Region(
				new Position(92, 50, -239),
				new Position(99, 52, -242.7)
				);
		list.add(new Callouts("Ticket Booth", new Region[] {ticketBooth1})); // Ticket Booth
		Region heaven1 = new Region(
				new Position(50, 44, -250.7),
				new Position(40.3, 50.5, -247.3)
				);
		Region heaven2 = new Region(
				new Position(40.7, 49, -247),
				new Position(52.075, 50.5, -238.7)
				);
		list.add(new Callouts("Heaven", new Region[] {heaven1, heaven2})); // Heaven
		Region catwalk1 = new Region(
				new Position(107.99, 53, -237.3),
				new Position(104.3, 50, -218.3)
				);
		Region catwalk2 = new Region(
				new Position(108.3, 53, -237.3),
				new Position(97.576, 50, -235.3)
				);
		list.add(new Callouts("Catwalk", new Region[] {catwalk1, catwalk2})); // Catwalk
		Region tSpawn1 = new Region(
				new Position(76.7, 44.0, -139.3),
				new Position(52.3, 49.5, -171.7)
				);
		Region tSpawn2 = new Region(
				new Position(63.3, 44.0, -170.3),
				new Position(90.7, 47.5, -179.7)
				);
		Region tSpawn3 = new Region(
				new Position(32.3, 44.0, -187.7),
				new Position(52.7, 45.5, -161.3)
				);
		Region tSpawn4 = new Region(
				new Position(63.3, 44.0, -181.7),
				new Position(78.7, 46.5, -180.3)
				);
		list.add(new Callouts("T Spawn", new Region[] {tSpawn1, tSpawn2, tSpawn3, tSpawn4})); // T Spawn
		Region garage1 = new Region(
				new Position(78.299, 44.0, -182.66),
				new Position(64.3, 47.5, -208.7)
				);
		list.add(new Callouts("Garage", new Region[] {garage1})); // Garage
		Region useless1 = new Region(
				new Position(62.7, 44.0, -196.3),
				new Position(55.3, 45.5, -207.7)
				);
		list.add(new Callouts("Useless", new Region[] {useless1})); // Useless
		Region bMain1 = new Region(
				new Position(49.7, 44.0, -189.3),
				new Position(43.3, 45.5, -199.7)
				);
		Region bMain2 = new Region(
				new Position(54.7, 44.0, -205.7),
				new Position(33.3, 45.5, -200.3)
				);
		Region bMain3 = new Region(
				new Position(33.3, 44.0, -200.3),
				new Position(40.7, 46.0, -222.7)
				);
		Region bMain4 = new Region(
				new Position(52.7, 44.0, 223.7),
				new Position(40.7, 46.0, -214.7)
				);
		list.add(new Callouts("B Main", new Region[] {bMain1, bMain2, bMain3, bMain4})); // B Main
		Region sunRoom1 = new Region(
				new Position(32.7, 44.0, -198.3),
				new Position(23.3, 48.5, -217.7)
				);
		list.add(new Callouts("Sun Room", new Region[]  {sunRoom1})); // Sun Room
		Region checkers1 = new Region(
				new Position(53.3, 44.0, -219.3),
				new Position(59.7, 46.5, -244.7)
				);
		Region checkers2 = new Region(
				new Position(54.3, 44.0, -237.3),
				new Position(54.3, 45.5, -235.3)
				);
		list.add(new Callouts("Checkers", new Region[] {checkers1, checkers2})); // Checkers
		Region pit1 = new Region(
				new Position(33.3, 42.0, -228.3),
				new Position(37.7, 45.5, -231.7)
				);
		list.add(new Callouts("Pit", new Region[] {pit1})); // Pit
		Region headshot1 = new Region(
				new Position(21.3, 44.0, -244.7),
				new Position(32.7, 47.5, -242.3)
				);
		list.add(new Callouts("Headshot", new Region[] {headshot1})); // Headshot
		Region backLeft1 = new Region(
				new Position(21.3, 45.0, -228.3),
				new Position(25.7, 48.5, -233.7)
				);
		list.add(new Callouts("Back Left", new Region[] {backLeft1})); // Back Left
		Region bSite1 = new Region(
				new Position(21.3, 45.0, -241.7),
				new Position(32.7, 49.5, -234.3)
				);
		Region bSite2 = new Region(
				new Position(26.3, 45.0, -233.7),
				new Position(32.3, 47.0, -228.3)
				);
		Region bSite3 = new Region(
				new Position(34.7, 44.0, -236.7),
				new Position(32.3, 47.0, -232.3)
				);
		list.add(new Callouts("B Site", new Region[] {bSite1, bSite2, bSite3})); // B Site
		Region b1 = new Region(
				new Position(51.7, 44.0, -228),
				new Position(35.3, 45.5, -244.7)
				);
		Region b2 = new Region(
				new Position(34.7, 44.0, -244.7),
				new Position(33.3, 46.5, -237.3)
				);
		list.add(new Callouts("B", new Region[] {b1, b2})); // B
		Region cubby1 = new Region(
				new Position(86.7, 44.0, -216.7),
				new Position(80.0, 45.5, -211.3)
				);
		list.add(new Callouts("Cubby", new Region[] {cubby1})); // Cubby
		Region mid1 = new Region(
				new Position(79.8, 44.0, -211.3),
				new Position(63.316 , 47.0 , -216.8)
				);
		Region mid2 = new Region(
				new Position(79.7 , 44.0 , -218.114),
				new Position(68.3 , 45.5 , -219.8)
				);
		Region mid3 = new Region(
				new Position(68.3 , 44.0 , -220.1),
				new Position(78.1 , 45.5 , -231.7)
				);
		Region mid4 = new Region(
				new Position(72.3 , 44.0 , -241.7),
				new Position(76.6 , 45.5 , -232.0)
				);
		Region mid5 = new Region(
				new Position(71.9 , 44.0 , -232.0),
				new Position(68.0 , 45.5 , -238.7)
				);
		Region mid6 = new Region(
				new Position(67.9 , 44 , -233.0),
				new Position(63.3 , 45.5 , -239.7)
				);
		list.add(new Callouts("Mid", new Region[] {mid1, mid2, mid3, mid4, mid5, mid6})); // Mid
		Region vent1 = new Region(
				new Position(63.1 , 47.5 , -216.3),
				new Position(59.3 , 48.0 , -222.1)
				);
		list.add(new Callouts("Vent", new Region[] {vent1})); // Vent
		Region midHouse1 = new Region(
				new Position(69.2 , 48.0 , -216.7),
				new Position(63.3 , 51.5 , -231.2)
				);
		list.add(new Callouts("Mid House", new Region[] {midHouse1})); // Mid House
		Region rail1 = new Region(
				new Position(79.7 , 48.0 , -219.7),
				new Position(79.0 , 49.5 , -232.2)
				);
		list.add(new Callouts("Rail", new Region[] {rail1})); // Rail
		Region sandBags1 = new Region(
				new Position(68.0 , 44.0 , -233.1),
				new Position(63.3 , 45.5 , -230.3)
				);
		list.add(new Callouts("Sand Bags", new Region[] {sandBags1})); // Sand Bags
		Region z1 = new Region(
				new Position(64.7 , 46.0 , -238.7),
				new Position(72.2 , 44.5 , -241.6)
				);
		Region z2 = new Region(
				new Position(63.3, 46.5, -242),
				new Position(75.7, 44, -254)
				);
		list.add(new Callouts("Z", new Region[] {z1, z2})); // Z
		Region whiteBox1 = new Region(
				new Position(76.7 , 46.5 , -231.7),
				new Position(79.7 , 48.0 , -235.2)
				);
		Region whiteBox2 = new Region(
				new Position(81.2 , 45.5 , -237.2),
				new Position(78.8 , 47.0 , -235.3)
				);
		list.add(new Callouts("White Box", new Region[] {whiteBox1, whiteBox2})); // White Box
		Region highway1 = new Region(
				new Position(80.3 , 44.5 , -242.7),
				new Position(92.9 , 47.5 , -235.3)
				);
		Region highway2 = new Region(
				new Position(76.9 , 44.0 , -235.3),
				new Position(79.5 , 44.0 , -241.6)
				);
		list.add(new Callouts("Highway", new Region[] {highway1, highway2})); // Highway
		Region topA1 = new Region(
				new Position(113.7, 51.5, -237.3),
				new Position(124.3, 49, -231.7)
				);
		list.add(new Callouts("Top A", new Region[] {topA1})); // Top A
		Region window1 = new Region(
				new Position(75.7, 47, -244.3),
				new Position(71.7, 48.5, -245.3)
				);
		list.add(new Callouts("Window", new Region[] {window1})); // Window
		
		
		return list;
	}
}
