package com.baseballaholic.CalloutsMod;

public class Region {
	
	private Position pos1, pos2;
	
	public Region(Position pos1, Position pos2) {
		this.pos1 = pos1;
		this.pos2 = pos2;
	}
	
	public Position getPos1() {
		return pos1;
	}
	
	public Position getPos2() {
		return pos2;
	}
	
	public double getMinX() {
		return Math.min(pos1.getX(), pos2.getX());
	}
	
	public double getMinY() {
		return Math.min(pos1.getY(), pos2.getY());
	}
	
	public double getMinZ() {
		return Math.min(pos1.getZ(), pos2.getZ());
	}
	
	public double getMaxX() {
		return Math.max(pos1.getX(), pos2.getX());
	}
	
	public double getMaxY() {
		return Math.max(pos1.getY(), pos2.getY());
	}
	
	public double getMaxZ() {
		return Math.max(pos1.getZ(), pos2.getZ());
	}
	
	public boolean isInside(Position pos) {
		if(pos.getX() < getMinX() || pos.getX() > getMaxX()) return false;
		if(pos.getY() < getMinY() || pos.getY() > getMaxY()) return false;
		if(pos.getZ() < getMinZ() || pos.getZ() > getMaxZ()) return false;
		return true;
	}
	
}
