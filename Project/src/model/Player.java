package model;

public class Player {

	private int level;
	private int habilitieLevel;
	private String name;
	private double latence;
	
	public Player(int level, int habilitieLevel, String name, double latence) {
		this.level = level;
		this.habilitieLevel = habilitieLevel;
		this.name = name;
		this.latence = latence;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHabilitieLevel() {
		return habilitieLevel;
	}

	public void setHabilitieLevel(int habilitieLevel) {
		this.habilitieLevel = habilitieLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLatence() {
		return latence;
	}

	public void setLatence(double latence) {
		this.latence = latence;
	}
	
	
	
	
	
	
	
}
