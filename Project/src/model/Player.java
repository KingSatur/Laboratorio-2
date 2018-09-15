package model;

public class Player{

	private static final double VALUE_OF_KD = 0.40;
	private static final double VALUE_OF_WON_MATCHS_ABOVE_LOSED_MATCHS = 0.40;
	private static final double VALUE_OF_LEVEL = 0.10;
	private static final double VALUE_OF_DAMAGE = 0.10;
	private static final String GOOD_LATENCE = "Good";
	private static final String BAD_LATENCE = "Bad";
	private static final String MEDIUM_LATENCE = "Medium";
	private static final String PESSIMUM_LATENCE = "Pessimim";
	private static final String PLAYSTATION = "Play 4";
	private static final String MICROSOFT = "Xbox One";
	private static final String NINTENDO = "Nintendo";
	private static final String PC = "PC";
	private int level;
	private String name;
	private double latence;
	private int deads;
	private int kills;
	private int playedMatchs;
	private int wonMatchs;
	private double averageKillsAboveDeads;
	private double distanceAverage;
	private double averageDamage;
	private double averageEffectivity;
	private double skill;
		

	public Player(int level, String name, double latence, int deads, int kills, int playedMatchs, int wonMatchs, int killsForMatch, int killsForMinute,  double averageDamage, double averageEffectivity) {
		this.level = level;
		this.name = name;
		this.latence = latence;
		this.deads = deads;
		this.kills = kills;
		this.playedMatchs = playedMatchs;
		this.wonMatchs = wonMatchs;
		this.averageDamage = averageDamage;
		this.averageEffectivity = averageEffectivity;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
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


	public int getDeads() {
		return deads;
	}


	public void setDeads(int deads) {
		this.deads = deads;
	}


	public int getKills() {
		return kills;
	}


	public void setKills(int kills) {
		this.kills = kills;
	}


	public int getPlayedMatchs() {
		return playedMatchs;
	}


	public void setPlayedMatchs(int playedMatchs) {
		this.playedMatchs = playedMatchs;
	}


	public int getWonMatchs() {
		return wonMatchs;
	}


	public void setWonMatchs(int wonMatchs) {
		this.wonMatchs = wonMatchs;
	}


	public double getAverageKillsAboveDeads() {
		return averageKillsAboveDeads;
	}


	public void setAverageKillsAboveDeads(double averageKillsAboveDeads) {
		this.averageKillsAboveDeads = averageKillsAboveDeads;
	}


	public double getDistanceAverage() {
		return distanceAverage;
	}


	public void setDistanceAverage(double distanceAverage) {
		this.distanceAverage = distanceAverage;
	}


	public double getAverageDamage() {
		return averageDamage;
	}


	public void setAverageDamage(double averageDamage) {
		this.averageDamage = averageDamage;
	}


	public double getAverageEffectivity() {
		return averageEffectivity;
	}


	public void setAverageEffectivity(double averageEffectivity) {
		this.averageEffectivity = averageEffectivity;
	}
		
	
	
	
}
	