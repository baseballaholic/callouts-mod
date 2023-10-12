package com.baseballaholic.CalloutsMod.callouts;

import java.util.ArrayList;
import java.util.List;

import com.baseballaholic.CalloutsMod.Callouts;
import com.baseballaholic.CalloutsMod.Position;
import com.baseballaholic.CalloutsMod.Region;

public class Castle {
	public static List <Callouts> createCallouts() {
		List <Callouts> list = new ArrayList <Callouts> ();
		Region tSpawn1 = new Region(
				new Position(20, 70, -92.7),
				new Position(29.7, 71.5, -86.3)
				);
		list.add(new Callouts("T Spawn", new Region[] {tSpawn1})); // T Spawn
		Region rapunzel1 = new Region(
				new Position(22.3, 79, -93.3),
				new Position(24.7, 70, -93.7)
				);
		list.add(new Callouts("Rapunzel", new Region[] {rapunzel1})); // Rapunzel
		Region tower1 = new Region(
				new Position(24.7, 79, -94),
				new Position(19.3, 80.5, -100.7)
				);
		list.add(new Callouts("Tower", new Region[] {tower1})); // Tower
		Region statue1 = new Region(
				new Position(9, 72, -86),
				new Position(3, 75, -80)
				);
		list.add(new Callouts("Statue", new Region[] {statue1})); // Statue 
		Region t1 = new Region(
				new Position(19.7, 70.5, -86),
				new Position(-13.5, 80, -100)
				);
		Region t2 = new Region(
				new Position(9.001, 70, -86),
				new Position(14.7, 74.5, -66)
				);
		Region t3 = new Region(
				new Position(15, 75, -85),
				new Position(20.7, 71.5, -81.3)
				);
		Region t4 = new Region(
				new Position(2.99, 72, -86),
				new Position(-10.7, 76, -72.3)
				);
		list.add(new Callouts("T", new Region[] {t1, t2, t3, t4})); // T Spawn
		Region patio1 = new Region(
				new Position(14.7, 73, -66),
				new Position(9, 77, -59.3)
				);
		Region patio2 = new Region(
				new Position(15, 75, -59.3),
				new Position(20.7, 77.5, -74.7)
				);
		list.add(new Callouts("Patio", new Region[] {patio1, patio2})); // Patio
		Region dLore1 = new Region(
				new Position(16.3, 76.5, -54),
				new Position(27.7, 73, -48.3)
				);
		list.add(new Callouts("D Lore", new Region[] {dLore1})); // D Lore
		Region upperHalls1 = new Region(
				new Position(29.3, 73, -50),
				new Position(39.7, 75.5, -56.7)
				);
		list.add(new Callouts("Upper Halls", new Region[] {upperHalls1})); // Upper Halls
		Region lowerHalls1 = new Region(
				new Position(39.7, 73, -46),
				new Position(29.3, 74.5, -49)
				);
		Region lowerHalls2 = new Region(
				new Position(39.7, 73, -46),
				new Position(36.3, 75.5, -42.3)
				);
		list.add(new Callouts("Lower Halls", new Region[] {lowerHalls1, lowerHalls2})); // Lower Halls
		Region sky1 = new Region(
				new Position(29.3, 73, -46),
				new Position(36, 77.5, -42.3)
				);
		Region sky2 = new Region(
				new Position(33.7, 76, -42),
				new Position(31.3, 78.5, -33)
				);
		list.add(new Callouts("Sky", new Region[] {sky1, sky2})); // Sky
		Region drop1 = new Region(
				new Position(26.3, 73, -28.3),
				new Position(33.7, 75, -33.7)
				);
		Region drop2 = new Region(
				new Position(29.3, 73, -28),
				new Position(33.999, 74.5, -24.3)
				);
		list.add(new Callouts("Drop", new Region[] {drop1, drop2})); // Drop
		Region electric1 = new Region(
				new Position(34, 73, -24.3),
				new Position(40, 74.5, -27.7)
				);
		list.add(new Callouts("Electric", new Region[] {electric1})); // Electric
		Region bLong1 = new Region(
				new Position(36.3, 73, -37),
				new Position(38.7, 74.5, -35.3)
				);
		Region bLong2 = new Region(
				new Position(36.3, 73, -37),
				new Position(53, 74.5, -40.7)
				);
		list.add(new Callouts("B Long", new Region[] {bLong1, bLong2})); // B Long
		Region bPlat1 = new Region(
				new Position(53.3, 73, -37),
				new Position(64.7, 75.5, -45.7)
				);
		list.add(new Callouts("B Plat", new Region[] {bPlat1})); // B Plat
		Region sidewalk1 = new Region(
				new Position(55, 71, -32),
				new Position(48.3, 73.5, -35.7)
				);
		Region sidewalk2 = new Region(
				new Position(48, 74, -34.7),
				new Position(41.3, 72, -27)
				);
		list.add(new Callouts("Sidewalk", new Region[] {sidewalk1, sidewalk2})); // Sidewalk
		Region fountain1 = new Region(
				new Position(52, 72, -19),
				new Position(58, 74.5, -25)
				);
		list.add(new Callouts("Fountain", new Region[] {fountain1})); // Fountain
		Region bSite1 = new Region(
				new Position(52, 72, -19),
				new Position(48.3, 73.5, -28)
				);
		Region bSite2 = new Region(
				new Position(52, 73.5, -25),
				new Position(61, 71, -28)
				);
		Region bSite3 = new Region(
				new Position(58, 73.5, -25),
				new Position(61, 71, -16)
				);
		Region bSite4 = new Region(
				new Position(61, 71, -16),
				new Position(52, 73.5, -19)
				);
		list.add(new Callouts("B Site", new Region[] {bSite1, bSite2, bSite3, bSite4})); // B Site
		Region b1 = new Region(
				new Position(61, 71, -32.7),
				new Position(67.7, 73.5, -16)
				);
		Region b2 = new Region(
				new Position(69.7, 74.5, -16),
				new Position(68, 71, -24)
				);
		Region b3 = new Region(
				new Position(59, 71, -16),
				new Position(52.3, 71, -12.3)
				);
		Region b4 = new Region(
				new Position(52, 71, -16),
				new Position(49.3, 71, -13.3)
				);
		Region b5 = new Region(
				new Position(47, 71, -16.3),
				new Position(43.3, 72.5, -24)
				);
		list.add(new Callouts("B", new Region[] {b1, b2, b3, b4, b5})); // B
		Region rock1 = new Region(
				new Position(44, 71, -22),
				new Position(37, 74.5, -17)
				);
		list.add(new Callouts("Rock", new Region[] {rock1})); // Rock
		Region bDoors1 = new Region(
				new Position(35, 71, -16.3),
				new Position(28.7, 72.5, -20)
				);
		list.add(new Callouts("B Doors", new Region[] {bDoors1})); // B Doors
		Region connector1 = new Region(
				new Position(28.7, 72, -25.7),
				new Position(15.3, 73.5, -9.3)
				);
		list.add(new Callouts("Connector", new Region[] {connector1})); // Drop
		Region window1 = new Region(
				new Position(26.3, 73, -26),
				new Position(28.7, 74.7, -28)
				);
		list.add(new Callouts("Window", new Region[] {window1})); // Window
		Region ventRoom1 = new Region(
				new Position(15, 72, -15.7),
				new Position(12.3, 73.5, -8.3)
				);
		Region ventRoom2 = new Region(
				new Position(9.3, 72, -15),
				new Position(12, 73.5, -10.3)
				);
		list.add(new Callouts("Vent Room", new Region[] {ventRoom1, ventRoom2})); // Vent Room
		Region balcony1 = new Region(
				new Position(13.7, 72.5, -8.250),
				new Position(10, 75.2, -4.3)
				);
		list.add(new Callouts("Balcony", new Region[] {balcony1})); // Balcony
		Region ctRamp1 = new Region(
				new Position(10.7, 75, -24),
				new Position(-1.7, 68, -41.7)
				);
		Region ctRamp2 = new Region(
				new Position(-3.7, 72.5, -31.3),
				new Position(-2, 69, -34.7)
				);
		list.add(new Callouts("CT Ramp", new Region[] {ctRamp1, ctRamp2})); // CT Ramp
		Region mid1 = new Region(
				new Position(8.7, 68, -43.3),
				new Position(-3.7, 71.5, -48.7)
				);
		Region mid2 = new Region(
				new Position(-2.7, 68, -49),
				new Position(2.7, 69.5, -52)
				);
		list.add(new Callouts("Mid", new Region[] {mid1, mid2})); // Mid
		Region ninja1 = new Region(
				new Position(68, 71, -28.7),
				new Position(69.7, 72.5, -24.3)
				);
		list.add(new Callouts("Ninja", new Region[] {ninja1})); // Ninja
		Region chickenCoop1 = new Region(
				new Position(69.7, 72, -15.7),
				new Position(59, 73.5, -12.3)
				);
		list.add(new Callouts("Chicken Coop", new Region[] {chickenCoop1})); // Chicken Coop
		Region ctSpawn1 = new Region(
				new Position(1.3, 73.5, 9.7),
				new Position(9.7, 72, -3.413)
				);
		list.add(new Callouts("CT Spawn", new Region[] {ctSpawn1})); // CT Spawn
		Region aTruck1 = new Region(
				new Position(0.3, 72, -4.746),
				new Position(7.7, 73.5, -13.68)
				);
		list.add(new Callouts("A Truck", new Region[] {aTruck1})); // A Truck
		Region aSite1 = new Region(
				new Position(-1.099, 73, 5.662),
				new Position(-9.089, 75, -10.7)
				);
		list.add(new Callouts("A Site", new Region[] {aSite1})); // A Site
		Region stables1 = new Region(
				new Position(-13.7, 73.5, -25.514),
				new Position(-10.461, 72, -12.3)
				);
		list.add(new Callouts("Stables", new Region[] {stables1})); // Stables
		Region cubby1 = new Region(
				new Position(-12.7, 72, -31.422),
				new Position(-10.3, 74.5, -32.7)
				);
		list.add(new Callouts("Cubby", new Region[] {cubby1})); // Cubby
		Region aLong1 = new Region(
				new Position(-15.5, 73, -28.350),
				new Position(-10.5, 74.5, -50.694)
				);
		list.add(new Callouts("A Long", new Region[] {aLong1})); // A Long
		Region catwalk1 = new Region(
				new Position(-9.7, 73, -47.313),
				new Position(-4.505, 74.5, -69.7)
				);
		list.add(new Callouts("Catwalk", new Region[] {catwalk1})); // Catwalk
		Region snake1 = new Region(
				new Position(15.560, 74.5, -51.7),
				new Position(7.501, 68, -52.304)
				);
		Region snake2 = new Region(
				new Position(10.7, 68, -52),
				new Position(7, 69.5, -54.7)
				);
		Region snake3 = new Region(
				new Position(11, 68.5, -50.6),
				new Position(15, 74.5, -49.3)
				);
		list.add(new Callouts("Snake", new Region[] {snake1, snake2, snake3})); // Snake
		Region a1 = new Region(
				new Position(8, 72, -24),
				new Position(-8.7, 73.5, -12)
				);
		Region a2 = new Region(
				new Position(-10, 72, -30.7),
				new Position(-3.3, 73.5, -25)
				);
		Region a3 = new Region(
				new Position(10.7, 72, -15),
				new Position(8, 73.5, -26)
				);
		list.add(new Callouts("A", new Region[] {a1, a2, a3})); // A
		Region tRamp1 = new Region(
				new Position(-4, 72.5, -68.7),
				new Position(-6.7, 69, -59.3)
				);
		Region tRamp2 = new Region(
				new Position(-3.7, 74.5, -72),
				new Position(6, 68, -52.3)
				);
		Region tRamp3 = new Region(
				new Position(6, 72.99, -70.7),
				new Position(10.7, 68, -56.3)
				);
		list.add(new Callouts("T Ramp", new Region[] {tRamp1, tRamp2, tRamp3})); // T Ramp
		Region underBalcony1 = new Region(
				new Position(9.7, 72, -4),
				new Position(8, 73.5, -8.7)
				);
		list.add(new Callouts("Under Balcony", new Region[] {underBalcony1})); // Under Balcony
		return list;
	}
}
