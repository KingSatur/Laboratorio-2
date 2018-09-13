package model;

public class Player{

	private static final String GoodLatence = "Good";
	private static final String BadLatence = "Bad";
	private static final String MediumLatence = "Medium";
	private static final String PessimismLatence = "Pessimim";
	private static final String PlayStation = "Play 4";
	private static final String Microsoft = "Xbox One";
	private static final String Nintendo = "Nintendo";
	private int level;
	private String name;
	private double latence;
	private int deads;
	private int kills;
	private int playedMatchs;
	private int wonMatchs;
	private double averageKillsAboveDeads;
	private int killsForMatch;
	private int killsForMinute;
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
		this.killsForMatch = killsForMatch;
		this.killsForMinute = killsForMinute;
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


	public int getKillsForMatch() {
		return killsForMatch;
	}


	public void setKillsForMatch(int killsForMatch) {
		this.killsForMatch = killsForMatch;
	}


	public int getKillsForMinute() {
		return killsForMinute;
	}


	public void setKillsForMinute(int killsForMinute) {
		this.killsForMinute = killsForMinute;
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
	