package com.baseballaholic.CalloutsMod.callouts;

import java.util.ArrayList;
import java.util.List;

import com.baseballaholic.CalloutsMod.Callouts;
import com.baseballaholic.CalloutsMod.Position;
import com.baseballaholic.CalloutsMod.Region;

public class Bazaar {
	public static List <Callouts> createCallouts() {
		List <Callouts> list = new ArrayList <Callouts> ();
		Region ctSpawn1 = new Region(
				new Position(188.3, 71, 35.7),
				new Position(196.7, 73, 22)
				);
		list.add(new Callouts("CT Spawn", new Region[] {ctSpawn1})); // CT Spawn
		Region ct1 = new Region(
				new Position(160.3, 74, 21.7),
				new Position(208.7, 74, 16)
				);
		Region ct2 = new Region(
				new Position(211.7, 76.5, 5),
				new Position(200, 72, 14)
				);
		list.add(new Callouts("CT", new Region[] {ct1, ct2})); // CT
		Region trash1 = new Region(
				new Position(201.3, 74.5, 4.99),
				new Position(204, 76.5, 3.3)
				);
		list.add(new Callouts("Trash", new Region[] {trash1})); // Trash
		Region ticketBooth1 = new Region(
				new Position(212.7, 75, 5),
				new Position(208, 80.5, -2.3)
				);
		list.add(new Callouts("Ticket Booth", new Region[] {ticketBooth1})); // Ticket Booth
		Region a1 = new Region(
				new Position(207, 75, 1),
				new Position(200.3, 76.5, -2)
				);
		Region a2 = new Region(
				new Position(196.001, 75, -22.99),
				new Position(187, 76.5, -2.3)
				);
		Region a3 = new Region(
				new Position(186, 75, -8),
				new Position(176.3, 76.5, -0.3)
				);
		list.add(new Callouts("A", new Region[] {a1, a2, a3})); // A
		Region aSite1 = new Region(
				new Position(201, 75, -1.3),
				new Position(211.7, 76.5, -11.7)
				);
		Region aSite2 = new Region(
				new Position(200, 75, -12),
				new Position(203, 76.5, -21.7)
				);
		Region aSite3 = new Region(
				new Position(196.001, 75, -15.99),
				new Position(198.99, 76.5, -12.001)
				);
		list.add(new Callouts("A Site", new Region[] {aSite1, aSite2, aSite3})); // A Site
		Region fireBox1 = new Region(
				new Position(203.001, 75, -21.7),
				new Position(206.7, 78.5, -13)
				);
		list.add(new Callouts("Fire Box", new Region[] {fireBox1})); // Fire Box
		Region double1 = new Region(
				new Position(196, 75, -16),
				new Position(200, 78.5, -20)
				);
		list.add(new Callouts("Double", new Region[] {double1})); // Double
		Region triple1 = new Region(
				new Position(201, 75, -5),
				new Position(196, 79.5, -12)
				);
		list.add(new Callouts("Triple", new Region[] {triple1})); // Triple
		Region dark1 = new Region(
				new Position(193.3, 75, -23),
				new Position(200.7, 76.5, -27.7)
				);
		list.add(new Callouts("Dark", new Region[] {dark1})); // Dark
		Region scaffolding1 = new Region(
				new Position(189, 76, -23),
				new Position(201, 80.5, -27.7)
				);
		list.add(new Callouts("Scaffolding", new Region[] {scaffolding1})); // Scaffolding
		Region stairs1 = new Region(
				new Position(176.3, 75.5, -7.7),
				new Position(186.3, 79.5, -15.299)
				);
		list.add(new Callouts("Stairs", new Region[] {stairs1})); // Stairs
		Region sandwich1 = new Region(
				new Position(186, 75, -15.3),
				new Position(182.3, 77, -17.7)
				);
		list.add(new Callouts("Sandwich", new Region[] {sandwich1})); // Sandwich
		Region tetris1 = new Region(
				new Position(185, 79, -18),
				new Position(181.3, 75, -22)
				);
		list.add(new Callouts("Tetris", new Region[] {tetris1})); // Tetris
		Region ramp1 = new Region(
				new Position(181, 76.5, -25),
				new Position(189.7, 71, -35)
				);
		list.add(new Callouts("Ramp", new Region[] {ramp1})); // Ramp
		Region outsideRamp1 = new Region(
				new Position(174, 71, -42.7),
				new Position(189.7, 72.5, -35)
				);
		list.add(new Callouts("Outside Ramp", new Region[] {outsideRamp1})); // Outside Ramp
		Region palace1 = new Region(
				new Position(201, 79, -23.2),
				new Position(206.7, 80.5, -26)
				);
		Region palace2 = new Region(
				new Position(206.7, 79, -26),
				new Position(204.3, 80.5, -30)
				);
		Region palace3 = new Region(
				new Position(194, 79.5, -47.3),
				new Position(179.3, 74, -50)
				);
		Region palace4 = new Region(
				new Position(179.3, 74, -50),
				new Position(182, 75.5, -59.7)
				);
		list.add(new Callouts("Palace", new Region[] {palace1, palace2, palace3, palace4})); // Palace
		Region pillars1 = new Region(
				new Position(206.7, 80.5, -30),
				new Position(194, 78, -51.7)
				);
		list.add(new Callouts("Pillars", new Region[] {pillars1})); // Pillars
		Region tRoof1 = new Region(
				new Position(174, 74, -55.7),
				new Position(177, 76.5, -42.7)
				);
		
		Region tRoof2 = new Region(
				new Position(177, 76.5, -42.7),
				new Position(188.7, 74.5, -45.7)
				);
		list.add(new Callouts("T Roof", new Region[] {tRoof1, tRoof2})); // T Roof
		Region tSpawn1 = new Region(
				new Position(173.3, 71.0, -39.3),
				new Position(132.7, 76.5, -62.7)
				);
		list.add(new Callouts("T Spawn", new Region[] {tSpawn1})); // T Spawn
		Region sideAlley1 = new Region(
				new Position(131.7, 74.0, -59.7),
				new Position(117.3, 71.0, -48.3)
				);
		Region sideAlley2 = new Region(
				new Position(121.3, 71.0, -47.3),
				new Position(126.5, 72.5, -27.3)
				);
		Region sideAlley3 = new Region(
				new Position(143.7, 75.0, -25.3),
				new Position(131.7, 71.5, -30.7)
				);
		Region sideAlley4 = new Region(
				new Position(131.7, 71.5, -30.7),
				new Position(126.5, 72.5, -27.3)
				);
		list.add(new Callouts("Side Alley", new Region[] {sideAlley1, sideAlley2, sideAlley3, sideAlley4})); // Side Alley
		Region cubby1 = new Region(
				new Position(129.3, 71.5, -25.3),
				new Position(130.7, 73.0, -26.7)
				);
		list.add(new Callouts("Cubby", new Region[] {cubby1})); // Cubby
		Region cart1 = new Region(
				new Position(120.7, 71.0, -32.7),
				new Position(117.3, 72.5, -25.3)
				);
		list.add(new Callouts("Cart", new Region[] {cart1})); // Cart
		Region apartmentsRamp1 = new Region(
				new Position(120.3, 71.0, -52.7),
				new Position(117.3, 76.5, -33.925)
				);
		Region apartmentsRamp2 = new Region(
				new Position(116.3, 75.0, -38.7),
				new Position(116.3, 76.5, -35.3)
				);
		list.add(new Callouts("Apartments Ramp", new Region[] {apartmentsRamp1, apartmentsRamp2})); // Apartments Ramp
		Region tv1 = new Region(
				new Position(115.7, 77.5, -38.7),
				new Position(111.3, 75.0, -19.3)
				);
		list.add(new Callouts("TV", new Region[] {tv1})); // TV
		Region underpass1 = new Region(
				new Position(126.7, 77.5, -18.7),
				new Position(123.3, 68.0, 5.7)
				);
		Region underpass2 = new Region(
				new Position(127, 68, 5.7),
				new Position(154, 72, 3.3)
				);
		list.add(new Callouts("Underpass", new Region[] {underpass1, underpass2})); // Underpass
		Region backAlley1 = new Region(
				new Position(110.3, 75.0, -18.7),
				new Position(122.7, 77.5, 3.7)
				);
		list.add(new Callouts("Back Alley", new Region[] {backAlley1})); // Back Alley
		Region kitchen1 = new Region(
				new Position(126.7, 76.0, 9.7),
				new Position(118.3, 77.5, 4.3)
				);
		list.add(new Callouts("Kitchen", new Region[] {kitchen1})); // Kitchen
		Region bApartments1 = new Region(
				new Position(118, 76, 4.3),
				new Position(111.3, 79, 28)
				);
		list.add(new Callouts("B Apartments", new Region[] {bApartments1})); // B Apartments
		Region bPlat1 = new Region(
				new Position(118.3, 77, 33.3),
				new Position(111.3, 79.8, 28.3)
				);
		list.add(new Callouts("B Plat", new Region[] {bPlat1})); // B Plat
		Region van1 = new Region(
				new Position(117, 75, 33.3),
				new Position(111.3, 80, 41.137)
				);
		list.add(new Callouts("Van", new Region[] {van1})); // Van
		Region bench1 = new Region(
				new Position(121.3, 74, 42),
				new Position(134.7, 77.5, 46.7)
				);
		list.add(new Callouts("Bench", new Region[] {bench1})); // Bench
		Region b1 = new Region(
				new Position(118.3, 74, 18.3),
				new Position(124.99, 75.5, 41.99)
				);
		Region b2 = new Region(
				new Position(124.99, 75.5, 41.99),
				new Position(146.7, 74, 38)
				);
		Region b3 = new Region(
				new Position(146.7, 74, 38),
				new Position(138.001, 75.5, 22)
				);
		Region b4 = new Region(
				new Position(138, 74, 24.7),
				new Position(125, 75.5, 18)
				);
		list.add(new Callouts("B", new Region[] {b1, b2, b3, b4})); // B
		Region bDefault1 = new Region(
				new Position(129, 74, 29.3),
				new Position(126, 75.5, 32.7)
				);
		list.add(new Callouts("B Default", new Region[] {bDefault1})); // B Default
		Region bSite1 = new Region(
				new Position(128.3, 74, 36.7),
				new Position(129, 74, 33)
				);
		Region bSite2 = new Region(
				new Position(132.7, 74, 26),
				new Position(129.3, 75.5, 37)
				);
		Region bSite3 = new Region(
				new Position(133, 74, 28.3),
				new Position(135, 75.5, 36.7)
				);
		Region bSite4 = new Region(
				new Position(135, 75.5, 36.7),
				new Position(136.7, 74, 29)
				);
		list.add(new Callouts("B Site", new Region[] {bSite1, bSite2, bSite3, bSite4})); // B Site
		Region empty1 = new Region(
				new Position(136.7, 74, 29),
				new Position(135.3, 75.5, 26.3)
				);
		list.add(new Callouts("Empty", new Region[] {empty1})); // Empty
		Region shortCorner1 = new Region(
				new Position(124, 74, 13),
				new Position(122.3, 75.5, 11.3)
				);
		list.add(new Callouts("Short Corner", new Region[] {shortCorner1})); // Short Corner
		Region arches1 = new Region(
				new Position(124, 74, 11.3),
				new Position(134.7, 75.5, 18)
				);
		Region arches2 = new Region(
				new Position(124, 74, 13),
				new Position(122.3, 75.5, 18)
				);
		list.add(new Callouts("Arches", new Region[] {arches1, arches2})); // Arches
		Region eBox1 = new Region(
				new Position(135, 77.5, 18.3),
				new Position(146.7, 74, 21.7)
				);
		list.add(new Callouts("E Box", new Region[] {eBox1})); // E Box
		Region door1 = new Region(
				new Position(153, 74, 41.7),
				new Position(147, 75.5, 39.3)
				);
		list.add(new Callouts("Door", new Region[] {door1})); // Door
		Region window1 = new Region(
				new Position(147, 76.5, 26.7),
				new Position(149, 74, 25)
				);
		list.add(new Callouts("Window", new Region[] {window1})); // Window
		Region market1 = new Region(
				new Position(149, 74, 24.3),
				new Position(153, 76.5, 32.7)
				);
		Region market2 = new Region(
				new Position(158, 74, 18.3),
				new Position(153.3, 76.5, 37)
				);
		Region market3 = new Region(
				new Position(156.7, 74, 37),
				new Position(153.001, 75.5, 41.7)
				);
		list.add(new Callouts("Market", new Region[] {market1, market2, market3})); // Market
		Region sneaky1 = new Region(
				new Position(157, 74, 37.3),
				new Position(157.7, 75.5, 40.7)
				);
		list.add(new Callouts("Sneaky", new Region[] {sneaky1})); // Sneaky
		Region short1 = new Region(
				new Position(130.3, 74, 11),
				new Position(136, 75.5, -2.7)
				);
		Region short2 = new Region(
				new Position(136, 75.5, -2.7),
				new Position(149, 74, 1.7)
				);
		Region short3 = new Region(
				new Position(142.3, 74, -3),
				new Position(149, 76.3, -5.7)
				);
		list.add(new Callouts("Short", new Region[] {short1, short2, short3})); // Short
		Region ladderRoom1 = new Region(
				new Position(139.3, 74, 2),
				new Position(145, 78, 9.7)
				);
		list.add(new Callouts("Ladder Room", new Region[] {ladderRoom1})); // Ladder Room
		Region vent1 = new Region(
				new Position(145, 77.5, 9.7),
				new Position(152, 76, 9.3)
				);
		list.add(new Callouts("Vent", new Region[] {vent1})); // Vent
		Region snipersNest1 = new Region(
				new Position(152.3, 74, 8.3),
				new Position(172.7, 76.5, 12.7)
				);
		Region snipersNest2 = new Region(
				new Position(154, 74.5, 8),
				new Position(158, 76, 6)
				);
		list.add(new Callouts("Snipers Nest", new Region[] {snipersNest1, snipersNest2})); // Snipers Nest
		Region murderHole1 = new Region(
				new Position(166.3, 74, 13),
				new Position(168, 75.5, 15)
				);
		list.add(new Callouts("Murder Hole", new Region[] {murderHole1})); // Murder Hole
		Region boost1 = new Region(
				new Position(160.7, 71, 6.7),
				new Position(157, 74, 5)
				);
		list.add(new Callouts("Boost", new Region[] {boost1})); // Boost
		Region midBench1 = new Region(
				new Position(160, 71.5, 3),
				new Position(160.7, 73.5, 0)
				);
		list.add(new Callouts("Mid Bench", new Region[] {midBench1})); // Mid Bench
		Region mid1 = new Region(
				new Position(154.3, 70.5, 3),
				new Position(159.999, 75.5, -23)
				);
		Region mid2 = new Region(
				new Position(159.999, 75.5, -23),
				new Position(160.7, 71, -0.3)
				);
		list.add(new Callouts("Mid", new Region[] {mid1, mid2})); // Mid
		Region chair1 = new Region(
				new Position(165.7, 74, -11.3),
				new Position(161.001, 76, -16)
				);
		list.add(new Callouts("Chair", new Region[] {chair1})); // Chair
		Region topMid1 = new Region(
				new Position(145.3, 74, -33.7),
				new Position(153, 75.5, -23)
				);
		Region topMid2 = new Region(
				new Position(164, 74, -25.3),
				new Position(165.7, 75.5, -33.7)
				);
		list.add(new Callouts("Top Mid", new Region[] {topMid1, topMid2})); // Top Mid
		Region midBoxes1 = new Region(
				new Position(153.001, 74, -34.7),
				new Position(163.7, 78, -25)
				);
		list.add(new Callouts("Mid Boxes", new Region[] {midBoxes1})); // Mid Boxes
		Region connector1 = new Region(
				new Position(161.001, 71, -2.3),
				new Position(176, 76.5, -5.7)
				);
		Region connector2 = new Region(
				new Position(174.7, 77.5, -6),
				new Position(163.3, 75, -8.7)
				);
		Region connector3 = new Region(
				new Position(163.3, 74, -0.3),
				new Position(173.7, 77.5, -2)
				);
		list.add(new Callouts("Connector", new Region[] {connector1, connector2, connector3})); // Connector
		Region jungle1 = new Region(
				new Position(175.3, 74, 12.7),
				new Position(184.7, 76.5, 0)
				);
		list.add(new Callouts("Jungle", new Region[] {jungle1})); // Jungle
		Region cat1 = new Region(
				new Position(154, 74, -23),
				new Position(149, 77, 1.7)
				);
		list.add(new Callouts("Catwalk", new Region[] {cat1})); // Cat
				
		
		return list;
	}
}
