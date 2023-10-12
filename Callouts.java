package com.baseballaholic.CalloutsMod;

public class Callouts {
	public String name;
	public Region[] regions;
	public Callouts(String name, Region[] regions) {
		this.name = name;
		this.regions = regions;
	}
	
	public String getName() {
		return name;
	}
	
	public Region[] getRegions() {
		return regions;
	}
}
