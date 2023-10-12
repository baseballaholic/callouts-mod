package com.baseballaholic.CalloutsMod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.baseballaholic.CalloutsMod.callouts.*;

public class CalloutCreator {
	public static Map<String, List <Callouts>> getAllCallouts() {
		Map<String, List <Callouts>> map = new HashMap<String, List<Callouts>>();
		map.put("Sandstorm", Sandstorm.createSandstormCallouts());
		map.put("Reserve", Reserve.createCallouts());
		map.put("Junction", Junction.createCallouts());
		map.put("Ruins", Ruins.createCallouts());
		map.put("Atomic V2", Atomicv2.createCallouts()); 
		map.put("Alleyway", Alleyway.createCallouts());
		map.put("Bazaar", Bazaar.createCallouts()); 
		map.put("Castle", Castle.createCallouts());
		map.put("Temple", Temple.createCallouts());
		map.put("Derailed", Derailed.createCallouts());
		map.put("Overgrown", Overgrown.createCallouts()); 
		map.put("Carrier", Carrier.createCallouts()); 
		return map;
	}
}
