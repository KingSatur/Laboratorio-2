package model;

public class Player{

	private static final double VALUE_OF_KD = 0.40;
	private static final double VALUE_OF_WON_MATCHS_ABOVE_LOSED_MATCHS = 0.40;
	private static final double VALUE_OF_LEVEL = 0.10;
	private static final double VALUE_OF_TOP10_ABOVE_PLAYER_MATCHS = 0.10;
	private static final double VALUE_OF_TOP5_ABOVE_PLAYER_MATCHS = 0.10;
	private static final double VALUE_OF_DAMAGE = 0.10;
	private static final int GOOD_LATENCE = 297;
	private static final int BAD_LATENCE = 199;
	private static final int MEDIUM_LATENCE = 449;
	private static final int PESSIMUM_LATENCE = 615;
	private static final int PLAYSTATION = 4;
	private static final int MICROSOFT = 5;
	private static final int NINTENDO = 6;
	private static final int PC = 7;
	private String name;
	private double latence;
	private int deads;
	private int kills;
	private int playedMatchs;
	private int wonMatchs;
	private double averageKillsAboveDeads;
	private double averageWonMatchsAboveLosedMatchs;
	private double skill;
	private int top5;
	private int top10;
		

	public Player(String name, double latence, int deads, int kills, int playedMatchs, int wonMatchs, int killsForMatch, int killsForMinute,  double averageDamage, double averageEffectivity, int top10, int top5) {
		this.name = name;
		this.latence = latence;
		this.deads = deads;
		this.kills = kills;
		this.playedMatchs = playedMatchs;
		this.wonMatchs = wonMatchs;
		this.top10 = top10;
		this.top5 = top5;
	}
	
	public Player(String name) {
		this.name = name;
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
	
	public void calculationKD() {
		averageKillsAboveDeads = kills/deads;
	}
	
	public void calculationWonMatchsAboveLosedMatchs() {
		averageWonMatchsAboveLosedMatchs = kills/deads;
	}
	
	public void calculationSkill() {
		  
	}
		
	
	
	
}
	