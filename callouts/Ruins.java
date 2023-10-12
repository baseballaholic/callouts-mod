package com.baseballaholic.CalloutsMod.callouts;

import java.util.ArrayList;
import java.util.List;

import com.baseballaholic.CalloutsMod.Callouts;
import com.baseballaholic.CalloutsMod.Position;
import com.baseballaholic.CalloutsMod.Region;

public class Ruins {
	public static List <Callouts> createCallouts() {
		List <Callouts> list = new ArrayList <Callouts> ();
		Region tSpawn1 = new Region(
				new Position(2.7, 85, 91.7),
				new Position(22.7, 79, 71.3)
				);
		list.add(new Callouts("T Spawn", new Region[] {tSpawn1})); // T Spawn
		Region tTunnel1 = new Region(
				new Position(4.3, 80.5, 70.4),
				new Position(6.7, 79, 52.4)
				);
		list.add(new Callouts("T Tunnel", new Region[] {tTunnel1})); // T Tunnel
		Region swamp1 = new Region(
				new Position(14.7, 80.5, 51.7),
				new Position(7.4, 79, 45.3)
				);
		list.add(new Callouts("Swamp", new Region[] {swamp1})); // Swamp
		Region ruins1 = new Region(
				new Position(-9.5, 85, 31.3),
				new Position(6.6, 80.5, 51.6)
				);
		list.add(new Callouts("Ruins", new Region[] {ruins1})); // Ruins
		Region doubleDoors1 = new Region(
				new Position(-10.4, 83.5, 31.3),
				new Position(-17.7, 82, 40.7)
				);
		list.add(new Callouts("Double Doors", new Region[] {doubleDoors1})); // Double Doors
		Region ramp1 = new Region(
				new Position(-34.7, 86, 29.3),
				new Position(-18.5, 83.5, 37.7)
				);
		Region ramp2 = new Region(
				new Position(-35.5, 85.5, 31.3),
				new Position(-37.5, 88, 34.7)
				);
		list.add(new Callouts("Ramp", new Region[] {ramp1, ramp2})); // Ramp
		Region lane1 = new Region(
				new Position(-21.3, 84.5, 41.5),
				new Position(-26.5, 82, 49.7)
				);
		list.add(new Callouts("Lane", new Region[] {lane1})); // Lane
		Region banger1 = new Region(
				new Position(-27.4, 85.5, 49.7),
				new Position( -32.7, 88, 45.3)
				);
		list.add(new Callouts("Banger", new Region[] {banger1})); // Banger
		Region outsideCave1 = new Region(
				new Position(-24.7, 85, 50.7),
				new Position(-20.3, 88, 62.4)
				);
		list.add(new Callouts("Outside Cave", new Region[] {outsideCave1})); // Outside Cave
		Region cheetah1 = new Region(
				new Position(-30.3, 87.5, 64.7),
				new Position(-34.7, 86, 52.3)
				);
		list.add(new Callouts("Cheetah", new Region[] {cheetah1})); // Cheetah
		Region caveEntrance1 = new Region(
				new Position(-29.8, 85, 62.7),
				new Position(-24.1, 89, 56.7)
				);
		list.add(new Callouts("Cave Entrance", new Region[] {caveEntrance1})); // Cave Entrance
		Region snake1 = new Region(
				new Position(-20.3, 86, 63.4),
				new Position(-25.3, 89, 69.6)
				);
		list.add(new Callouts("Snake", new Region[] {snake1})); // Snake
		Region dark1 = new Region(
				new Position(-35.4, 86, 53.3),
				new Position(-39.4, 89, 54.7)
				);
		list.add(new Callouts("Dark", new Region[] {dark1})); // Dark
		Region cave1 = new Region(
				new Position(-40.3, 86, 56.7),
				new Position(-53.7, 89, 51.3)
				);
		Region cave2 = new Region(
				new Position(-44.7, 86, 50.3),
				new Position(-42.3, 89, 50.3)
				);
		Region cave3 = new Region(
				new Position(-52.7, 86, 49.7),
				new Position(-48.3, 88, 50.7)
				);
		list.add(new Callouts("Cave", new Region[] {cave1, cave2, cave3})); // Cave
		Region ninja1 = new Region(
				new Position(-38.5, 85, 45.5),
				new Position(-37.3, 88, 49.7)
				);
		list.add(new Callouts("Ninja", new Region[] {ninja1})); // Ninja
		Region bSite1 = new Region(
				new Position(-35.5, 85, 31.3),
				new Position(-38.3, 88, 44.6)
				);
		Region bSite2 = new Region(
				new Position(-39.6, 85, 31.3),
				new Position(-41.6, 87, 48.7)
				);
		Region bSite3 = new Region(
				new Position(-57.7, 85, 50.7),
				new Position(-52.3, 88, 31.3)
				);
		Region bSite4 = new Region(
				new Position(-51.5, 85, 33.3),
				new Position(-42.7, 88, 39.6)
				);
		list.add(new Callouts("B Site", new Region[] {bSite1, bSite2, bSite3, bSite4})); // B Site
		Region pillar1 = new Region(
				new Position(-42.5, 85, 48.7),
				new Position(-50.6, 88, 40.1)
				);
		list.add(new Callouts("Pillar", new Region[] {pillar1})); // Pillar
		Region bShort1 = new Region(
				new Position(-58.3, 85, 49.7),
				new Position(-66.6, 88, 45.3)
				);
		list.add(new Callouts("B Short", new Region[] {bShort1})); // B Short
		Region bLong1 = new Region(
				new Position(-58.2, 85, 34.7),
				new Position(-71.7, 88, 29.3)
				);
		Region bLong2 = new Region(
				new Position(-72.7, 85, 34.4),
				new Position(-72.7, 88, 31.4)
				);
		list.add(new Callouts("B Long", new Region[] {bLong1, bLong2})); // B Long
		Region backAlley1 = new Region(
				new Position(-71.5, 86.5, 35.4),
				new Position(-67.3, 88, 44.7)
				);
		list.add(new Callouts("Back Alley", new Region[] {backAlley1})); // Back Alley
		Region alley1 = new Region(
				new Position(-67, 88, 45.5),
				new Position(-71.7, 85.5, 67.7)
				);
		Region alley2 = new Region(
				new Position(-65.6, 85.5, 64.3),
				new Position(-66.3, 87, 67.6)
				);
		list.add(new Callouts("Alley", new Region[] {alley1, alley2})); // Alley
		Region ctCubby1 = new Region(
				new Position(-64.6, 85.5, 67.7),
				new Position(-63.3, 87, 64.3)
				);
		list.add(new Callouts("CT Cubby", new Region[] {ctCubby1})); // CT Cubby
		Region ctSpawn1 = new Region(
				new Position(-95.8, 83, 80.7),
				new Position(-73.3, 87, 68.3)
				);
		list.add(new Callouts("CT Spawn", new Region[] {ctSpawn1})); // CT Spawn
		Region midHouse1 = new Region(
				new Position(-70.7, 84, 69.3),
				new Position(-64.3, 85.5, 74.4)
				);
		list.add(new Callouts("Mid House", new Region[] {midHouse1})); // Mid House
		Region snipersNest1 = new Region(
				new Position(-62.3, 85, 76.3),
				new Position(-70.7, 86.5, 81.7)
				);
		Region snipersNest2 = new Region(
				new Position(-68.7, 86, 82.7),
				new Position(-64.3, 87.5, 82.7)
				);
		list.add(new Callouts("Snipers Nest", new Region[] {snipersNest1, snipersNest2})); // Snipers Nest
		Region red1 = new Region(
				new Position(-52.3, 86, 75.3),
				new Position(-58.7, 87.5, 81.7)
				);
		Region red2 = new Region(
				new Position(-57.7, 86, 82.7),
				new Position(-53.3, 87.5, 82.7)
				);
		list.add(new Callouts("Red", new Region[] {red1, red2})); // Red
		Region topMid1 = new Region(
				new Position(-42.2, 83.5, 75.3),
				new Position(-49.7, 87.5, 81.5)
				);
		list.add(new Callouts("Top Mid", new Region[] {topMid1})); // Top Mid
		Region pit1 = new Region(
				new Position(-41.7, 83, 70.5),
				new Position(-37.3, 84.5, 67.3)
				);
		list.add(new Callouts("Pit", new Region[] {pit1})); // Pit
		Region mid1 = new Region(
				new Position(-25.6, 83, 85.5),
				new Position(-41.7, 84.5, 71.4)
				);
		list.add(new Callouts("Mid", new Region[] {mid1})); // Mid
		Region lowerMid1 = new Region(
				new Position(-26.7, 84.5, 86.6),
				new Position(-21.5, 83, 94.6)
				);
		Region lowerMid2 = new Region(
				new Position(-24.5, 83, 85.3),
				new Position(-20.3, 84.5, 75.5)
				);
		Region lowerMid3 = new Region(
				new Position(-19.3, 83, 76.3),
				new Position(-19.3, 84.5, 80.7)
				);
		list.add(new Callouts("Lower Mid", new Region[] {lowerMid1, lowerMid2, lowerMid3})); // Lower Mid
		Region xbox1 = new Region(
				new Position(-20.3, 83, 74.3),
				new Position(-25.4, 87.5, 70.8)
				);
		list.add(new Callouts("Xbox", new Region[] {xbox1})); // Xbox
		Region ledge1 = new Region(
				new Position(-26.4, 86, 70.3),
				new Position(-36.5, 87.5, 71.3)
				);
		list.add(new Callouts("Ledge", new Region[] {ledge1})); // Ledge
		Region yard1 = new Region(
				new Position(-20.4, 84.5, 94.7),
				new Position(-14.4, 82, 92.3)
				);
		Region yard2 = new Region(
				new Position(2.5, 82, 92.4),
				new Position(-13.3, 83.5, 118.7)
				);
		list.add(new Callouts("Yard", new Region[] {yard1, yard2})); // Yard
		Region aStairs1 = new Region(
				new Position(-14.7, 82, 102.3),
				new Position(-17.7, 83.5, 118.7)
				);
		Region aStairs2 = new Region(
				new Position(-16.7, 82, 119.7),
				new Position(-14.3, 83.5, 119.7)
				);
		Region aStairs3 = new Region(
				new Position(-17.3, 83, 107.5),
				new Position(-21.7, 86.5, 113.7)
				);
		list.add(new Callouts("A Stairs", new Region[] {aStairs1, aStairs2, aStairs3})); // A Stairs
		Region aMain1 = new Region(
				new Position(-28.3, 84, 121.7),
				new Position(-42.7, 85.5, 108.3)
				);
		Region aMain2= new Region(
				new Position(-44.3, 84, 108.3),
				new Position(-49.7, 85.5, 122.7)
				);
		Region aMain3 = new Region(
				new Position(-50.7, 84, 119.7),
				new Position(-50.7, 85.5, 114.3)
				);
		Region aMain4 = new Region(
				new Position(-48.7, 86.5, 107.3),
				new Position(-45.3, 85, 107.3)
				);
		list.add(new Callouts("A Main", new Region[] {aMain1, aMain2, aMain3, aMain4})); // A Main
		Region outsideAMain1 = new Region(
				new Position(-57.6, 85.5, 119.7),
				new Position(-51.5, 84, 115.3)
				);
		Region outsideAMain2 = new Region(
				new Position(-55.3, 84, 114.3),
				new Position(-57.5, 85.5, 114.3)
				);
		list.add(new Callouts("Outside A Main", new Region[] {outsideAMain1, outsideAMain2})); // Outside A Main
		Region aSite1 = new Region(
				new Position(-58.3, 84, 119.7),
				new Position(-65.3, 85.5, 98.2)
				);
		Region aSite2 = new Region(
				new Position(-63.5, 84, 89.3),
				new Position(-59.4, 85.5, 97.3)
				);
		list.add(new Callouts("A Site", new Region[] {aSite1, aSite2})); // A Site
		Region bigBox1 = new Region(
				new Position(-66.4, 84, 106.5),
				new Position(-72.6, 85.5, 113.6)
				);
		list.add(new Callouts("Big Box", new Region[] {bigBox1})); // Big Box
		Region backsiteA1 = new Region(
				new Position(-65.4, 84, 119.7),
				new Position(-79.7, 88, 114.7)
				);
		Region backsiteA2 = new Region(
				new Position(-79.7, 84, 113.4),
				new Position(-73.6, 85.5, 102.3)
				);
		list.add(new Callouts("Backsite A", new Region[] {backsiteA1, backsiteA2})); // Backsite A
		Region triple1 = new Region(
				new Position(-65.4, 84, 97.5),
				new Position(-72.5, 88.5, 89.3)
				);
		list.add(new Callouts("Triple", new Region[] {triple1})); // Triple
		Region temple1 = new Region(
				new Position(-76.3, 86.5, 101.5),
				new Position(-84.7, 84, 83.3)
				);
		Region temple2 = new Region(
				new Position(-75.3, 85, 99.7),
				new Position(-75.3, 86.5, 95.3)
				);
		Region temple3 = new Region(
				new Position(-85.7, 86.5, 95.3),
				new Position(-85.7, 85, 99.7)
				);
		Region temple4 = new Region(
				new Position(-82.3, 86, 100.7),
				new Position(-83.7, 87, 100.7)
				);
		list.add(new Callouts("Temple", new Region[] {temple1, temple2, temple3, temple4})); // Temple
		Region tree1 = new Region(
				new Position(-57.3, 86, 105.3),
				new Position(-55.3, 87.5, 113.5)
				);
		list.add(new Callouts("Tree", new Region[] {tree1})); // Tree
		Region donut1 = new Region(
				new Position(-57.3, 85.5, 100.7),
				new Position(-57.3, 87, 95.3)
				);
		Region donut2 = new Region(
				new Position(-57.8, 84.5, 96.3),
				new Position(-47.5, 86.5, 99.7)
				);
		Region donut3 = new Region(
				new Position(-52.7, 86, 100.7),
				new Position(-50.3, 87.5, 100.7)
				);
		Region donut4 = new Region(
				new Position(-52.7, 86, 95.3),
				new Position(-50.3, 87.5, 95.3)
				);
		Region donut5 = new Region(
				new Position(-35.3, 85, 92.3),
				new Position(-44.7, 86.5, 103.7)
				);
		Region donut6 = new Region(
				new Position(-45.7, 85, 102.7),
				new Position(-45.7, 86.5, 93.3)
				);
		Region donut7 = new Region(
				new Position(-46.7, 88, 94.3),
				new Position(-46.7, 85, 101.7)
				);
		Region donut8 = new Region(
				new Position(-34.3, 85, 102.7),
				new Position(-34.3, 86.5, 93.3)
				);
		Region donut9 = new Region(
				new Position(-33.3, 86.5, 102.7),
				new Position(-33.3, 86.5, 101.7)
				);
		Region donut10 = new Region(
				new Position(-35.3, 83, 84.7),
				new Position(-41.7, 86.5, 91.6)
				);
		list.add(new Callouts("Donut", new Region[] {donut1, donut2, donut3, donut4, donut5, donut6, donut7, donut8, donut9, donut10})); //Donut
		Region street1 = new Region(
				new Position(-73.5, 84, 92.7),
				new Position(-76.7, 85.5, 81.6)
				);
		list.add(new Callouts("Street", new Region[] {street1})); // Street
		
		return list;
	}
}
