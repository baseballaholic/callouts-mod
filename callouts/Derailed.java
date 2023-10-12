package com.baseballaholic.CalloutsMod.callouts;

import java.util.ArrayList;
import java.util.List;

import com.baseballaholic.CalloutsMod.Callouts;
import com.baseballaholic.CalloutsMod.Position;
import com.baseballaholic.CalloutsMod.Region;


public class Derailed {
	public static List <Callouts> createCallouts() {
		List <Callouts> list = new ArrayList <Callouts> ();
		Region tSpawn1 = new Region(
				new Position(693.4, 52, -2160.3),
				new Position(734.7, 54.5, -2170.7)
				);
		Region tSpawn2 = new Region(
				new Position(722.7, 53, -2171.4),
				new Position(713.3, 54.5, -2175.1)
				);
		Region tSpawn3 = new Region(
				new Position(713.9, 53, -2175.7),
				new Position(714.7, 54.5, -2175.7)
				);
		Region tSpawn4 = new Region(
				new Position(692.3, 52, -2160.3),
				new Position(685.6, 55, -2156.2)
				);
		Region tSpawn5 = new Region(
				new Position(686.4, 52, -2161.3),
				new Position(692.7, 53.5, -2181.5)
				);
		list.add(new Callouts("T Spawn", new Region[] {tSpawn1, tSpawn2, tSpawn3, tSpawn4, tSpawn5})); // T Spawn
		Region dumpster1 = new Region(
				new Position(684.6, 52, -2162.2),
				new Position(681.3, 57, -2170.7)
				);
		list.add(new Callouts("Dumpster", new Region[] {dumpster1})); // Dumpster
		Region tAlley1 = new Region(
				new Position(680.5, 52, -2165.7),
				new Position(649.7, 55.5, -2158.3)
				);
		Region tAlley2 = new Region(
				new Position(658.3, 52, -2166.7),
				new Position(669.7, 55, -2170.7)
				);
		list.add(new Callouts("T Alley", new Region[] {tAlley1, tAlley2})); // T Alley
		Region pigeons1 = new Region(
				new Position(648.7, 52, -2166.7),
				new Position(635.3, 56, -2157.3)
				);
		list.add(new Callouts("Pigeons", new Region[] {pigeons1})); // Pigeons
		Region ivy1 = new Region(
				new Position(642.7, 52, -2167.3),
				new Position(636.3, 53.5, -2186.7)
				);
		Region ivy2 = new Region(
				new Position(638.3, 52, -2187.4),
				new Position(641.7, 53.5, -2187.5)
				);
		list.add(new Callouts("Ivy", new Region[] {ivy1, ivy2})); // Ivy
		Region a1 = new Region(
				new Position(630.4, 52, -2206.1),
				new Position(649.7, 53.5, -2208.7)
				);
		list.add(new Callouts("A1", new Region[] {a1})); // A1
		Region a2 = new Region(
				new Position(645.7, 52, -2202.3),
				new Position(630.4, 53.5, -2204.8)
				);
		list.add(new Callouts("A2", new Region[] {a2})); // A2
		Region a3 = new Region(
				new Position(649.6, 52, -2188.3),
				new Position(631.7, 53.5, -2192.7)
				);
		list.add(new Callouts("A3", new Region[] {a3})); // A3
		Region a4 = new Region(
				new Position(654, 52, -2199),
				new Position(662, 53.5, -2193)
				);
		Region a5 = new Region(
				new Position(684.7, 52, -2209.7),
				new Position(678, 53.5, -2194)
				);
		list.add(new Callouts("A", new Region[] {a4, a5})); // A
		Region ctTuns1 = new Region(
				new Position(630.5, 52, -2188.3),
				new Position(625.3, 53.5, -2212.7)
				);
		Region ctTuns2 = new Region(
				new Position(626.3, 52, -2213.4),
				new Position(628.7, 53.5, -2213.4)
				);
		list.add(new Callouts("CT Tuns", new Region[] {ctTuns1, ctTuns2})); // CT Tuns
		Region ctStairs1 = new Region(
				new Position(629.7, 53.5, -2214.3),
				new Position(625.3, 49, -2225.4)
				);
		list.add(new Callouts("CT Stairs", new Region[] {ctStairs1})); // CT Stairs
		Region ctSpawn1 = new Region(
				new Position(624.8, 49, -2226.3),
				new Position(637.7, 52, -2239.4)
				);
		Region ctSpawn2 = new Region(
				new Position(638.6, 49, -2223.3),
				new Position(639.6, 50.5, -2225.7)
				);
		list.add(new Callouts("CT Spawn", new Region[] {ctSpawn1, ctSpawn2})); // CT Spawn
		Region ctHall1 = new Region(
				new Position(625.3, 49, -2243.4),
				new Position(639.6, 52, -2247.7)
				);
		list.add(new Callouts("CT Hall", new Region[] {ctHall1})); // CT Hall
		Region cloud1 = new Region(
				new Position(640.5, 49, -2247.7),
				new Position(651.4, 54.5, -2244.3)
				);
		list.add(new Callouts("Cloud", new Region[] {cloud1})); // Cloud
		Region headshot1 = new Region(
				new Position(652.2, 53, -2247.7),
				new Position(655.7, 56.5, -2244.3)
				);
		list.add(new Callouts("Headshot", new Region[] {headshot1})); // Headshot
		Region cat1 = new Region(
				new Position(687.2, 56, -2247.7),
				new Position(656.4, 57.5, -2244.4)
				);
		list.add(new Callouts("Cat", new Region[] {cat1})); // Cat
		Region ladder1 = new Region(
				new Position(688.4, 58, -2244.5),
				new Position(689.6, 48, -2242.6)
				);
		list.add(new Callouts("Ladder", new Region[] {ladder1})); // Ladder
		Region upper1 = new Region(
				new Position(688.5, 56, -2245.7),
				new Position(689.7, 57.5, -2247.7)
				);
		Region upper2 = new Region(
				new Position(690.4, 56, -2246.7),
				new Position(690.4, 57.5, -2245.3)
				);
		Region upper3 = new Region(
				new Position(691.4, 57.5, -2247.7),
				new Position(700.7, 55, -2244.4)
				);
		list.add(new Callouts("Upper", new Region[] {upper1, upper2, upper3})); // Upper
		Region bHalls1 = new Region(
				new Position(696.3, 55, -2243.5),
				new Position(703.7, 58.5, -2215.3)
				);
		Region bHalls2 = new Region(
				new Position(687.3, 60.5, -2215.6),
				new Position(696.5, 56.5, -2217.7)
				);
		list.add(new Callouts("B Halls", new Region[] {bHalls1, bHalls2})); // B Halls
		Region lower1 = new Region(
				new Position(695.6, 56.5, -2223.3),
				new Position(690.1, 49.5, -2225.6)
				);
		list.add(new Callouts("Lower", new Region[] {lower1})); // Lower
		Region sidewalk1 = new Region(
				new Position(689.5, 49, -2223.3),
				new Position(655.7, 50.5, -2225.7)
				);
		list.add(new Callouts("Sidewalk", new Region[] {sidewalk1})); // Sidewalk
		Region white1 = new Region(
				new Position(685.3, 48, -2226.3),
				new Position(670.2, 55, -2229.5)
				);
		list.add(new Callouts("White", new Region[] {white1})); // White
		Region bSite1 = new Region(
				new Position(669.5, 48, -2229.5),
				new Position(658.6, 49.5, -2226.3)
				);
		Region bSite2 = new Region(
				new Position(667.5, 48, -2243.7),
				new Position(684.1, 49.5, -2238.2)
				);
		list.add(new Callouts("B Site", new Region[] {bSite1, bSite2})); // B Site
		Region bread1 = new Region(
				new Position(657.3, 48, -2226.3),
				new Position(644.7, 55, -2228.7)
				);
		list.add(new Callouts("Bread", new Region[] {bread1})); // Bread
		Region backsiteB1 = new Region(
				new Position(644.4, 52.5, -2223.3),
				new Position(640.3, 48, -2243.7)
				);
		Region backsiteB2 = new Region(
				new Position(649.4, 48, -2243.7),
				new Position(645.5, 51, -2230.3)
				);
		list.add(new Callouts("Backsite B", new Region[] {backsiteB1, backsiteB2})); // Backsite B
		Region yellow1 = new Region(
				new Position(662.4, 48, -2230.4),
				new Position(650.3, 55, -2238)
				);
		list.add(new Callouts("Yellow", new Region[] {yellow1})); // Yellow
		Region oil1 = new Region(
				new Position(651.3, 48, -2239.4),
				new Position(667.5, 55, -2243.7)
				);
		list.add(new Callouts("Oil", new Region[] {oil1})); // Oil
		Region bombTrain1 = new Region(
				new Position(666.8, 48, -2230.4),
				new Position(684.3, 51.5, -2237.5)
				);
		list.add(new Callouts("Bomb Train", new Region[] {bombTrain1})); // Bomb Train
		Region spools1 = new Region(
				new Position(689.7, 48, -2241.4),
				new Position(685.5, 53, -2235.7)
				);
		list.add(new Callouts("Spools", new Region[] {spools1})); // Spools
		Region summit1 = new Region(
				new Position(663.4, 48, -2237),
				new Position(666.1, 49.5, -2232.5)
				);
		list.add(new Callouts("Summit", new Region[] {summit1})); // Summit
		Region topPopdog1 = new Region(
				new Position(687.3, 59, -2214.6),
				new Position(695.2, 60.5, -2206.3)
				);
		list.add(new Callouts("Top Popdog", new Region[] {topPopdog1})); // Top Popdog
		Region popdog1 = new Region(
				new Position(691.7, 52, -2210.3),
				new Position(681.3, 56.5, -2213.7)
				);
		Region popdog2 = new Region(
				new Position(685.7, 52, -2214.1),
				new Position(683.3, 53.5, -2214.1)
				);
		list.add(new Callouts("Popdog", new Region[] {popdog1, popdog2})); // Popdog
		Region tHalls1 = new Region(
				new Position(696.3, 59, -2214.7),
				new Position(698.7, 60.5, -2186.5)
				);
		Region tHalls2 = new Region(
				new Position(687.3, 59, -2206.3),
				new Position(695.5, 60.5, -2207.7)
				);
		list.add(new Callouts("T Halls", new Region[] {tHalls1, tHalls2})); // T Halls
		Region showers1 = new Region(
				new Position(686.3, 59, -2192.3),
				new Position(693.7, 61.5, -2204.7)
				);
		Region showers2 = new Region(
				new Position(690.6, 61, -2189.6),
				new Position(688.3, 59, -2191.1)
				);
		list.add(new Callouts("Showers", new Region[] {showers1, showers2})); // Showers
		Region kitchen1 = new Region(
				new Position(694.7, 60, -2179.3),
				new Position(687.3, 62.5, -2188.7)
				);
		Region kitchen2 = new Region(
				new Position(695.1, 61, -2184.7),
				new Position(695.1, 62, -2180.3)
				);
		list.add(new Callouts("Kitchen", new Region[] {kitchen1, kitchen2})); // Kitchen
		Region tStairs1 = new Region(
				new Position(698.7, 60, -2185.4),
				new Position(695.3, 55, -2171.3)
				);
		Region tStairs2 = new Region(
				new Position(698.7, 52, -2170.5),
				new Position(696.3, 53.5, -2170.5)
				);
		Region tStairs3 = new Region(
				new Position(698.7, 52, -2171),
				new Position(695.3, 55, -2177.3)
				);
		list.add(new Callouts("T Stairs", new Region[] {tStairs1, tStairs2, tStairs3})); // T Stairs
		Region tCon1 = new Region(
				new Position(696.7, 52, -2183.3),
				new Position(686.3, 54.5, -2194.7)
				);
		list.add(new Callouts("T Con", new Region[] {tCon1})); // T Con
		Region blue1 = new Region(
				new Position(684.7, 52, -2187.4),
				new Position(669.6, 57.5, -2192.6)
				);
		list.add(new Callouts("Blue", new Region[] {blue1})); // Blue
		Region green1 = new Region(
				new Position(668.4, 52, -2192.7),
				new Position(650.3, 58.5, -2188.5)
				);
		list.add(new Callouts("Green", new Region[] {green1})); // Green
		Region sandwich1 = new Region(
				new Position(671.4, 52, -2187.3),
				new Position(666.3, 53.5, -2192)
				);
		list.add(new Callouts("Sandwich", new Region[] {sandwich1})); // Sandwich
		Region hell1 = new Region(
				new Position(650.3, 52, -2187.5),
				new Position(662.7, 53.5, -2185.5)
				);
		list.add(new Callouts("Hell", new Region[] {hell1})); // Hell
		Region olof1 = new Region(
				new Position(672.3, 52, -2186.6),
				new Position(684.7, 53.5, -2185.3)
				);
		list.add(new Callouts("Olof", new Region[] {olof1})); // Olof
		Region red1 = new Region(
				new Position(675.8, 52, -2194),
				new Position(662.4, 57.5, -2198.4)
				);
		list.add(new Callouts("Red", new Region[] {red1})); // Red
		Region aSite1 = new Region(
				new Position(668.5, 52, -2199.3),
				new Position(653.4, 55.5, -2205.5)
				);
		Region aSite2 = new Region(
				new Position(649.3, 52, -2199.7),
				new Position(653.5, 53.5, -2209.4)
				);
		Region aSite3 = new Region(
				new Position(654.5, 52, -2206.7),
				new Position(674.6, 53.5, -2209.7)
				);
		Region aSite4 = new Region(
				new Position(674.1, 52, -2199.6),
				new Position(668.6, 53.5, -2205.4)
				);
		list.add(new Callouts("A Site", new Region[] {aSite1, aSite2, aSite3, aSite4})); // A Site
		Region camera1 = new Region(
				new Position(649.3, 52, -2195.3),
				new Position(652.4, 55.5, -2199.7)
				);
		list.add(new Callouts("Camera", new Region[] {camera1})); // Camera
		Region cubby1 = new Region(
				new Position(650.3, 52, -2210.4),
				new Position(653.3, 58.5, -2212.7)
				);
		list.add(new Callouts("Cubby", new Region[] {cubby1})); // Cubby
		Region heaven1 = new Region(
				new Position(658.7, 59, -2209.8),
				new Position(652.3, 61.5, -2212.7)
				);
		list.add(new Callouts("Heaven", new Region[] {heaven1})); // Heaven
		Region z1 = new Region(
				new Position(664.1, 52, -2218.7),
				new Position(658.3, 53.5, -2212.6)
				);
		Region z2 = new Region(
				new Position(664.1, 52, -2216.3),
				new Position(647.3, 53.5, -2218.4)
				);
		Region z3 = new Region(
				new Position(647.3, 53.5, -2219.6),
				new Position(651.7, 51, -2222.5)
				);
		Region z4 = new Region(
				new Position(661.7, 52, -2210.4),
				new Position(658.3, 53.5, -2211.6)
				);
		Region z5 = new Region(
				new Position(656.6, 49, -2223.3),
				new Position(640.6, 53.5, -2225.5)
				);
		list.add(new Callouts("Z", new Region[] {z1, z2, z3, z4, z5})); // Z
		Region oldBomb1 = new Region(
				new Position(649.6, 52, -2208.7),
				new Position(646.2, 53.5, -2202.3)
				);
		list.add(new Callouts("Old Bomb", new Region[] {oldBomb1})); // Old Bomb
		Region eBox1 = new Region(
				new Position(678, 52, -2199),
				new Position(675, 53.5, -2204)
				);
		list.add(new Callouts("EBox", new Region[] {eBox1})); // EBox
		return list;
	}
}
