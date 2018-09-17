package model;

public class Player{

	private static final double VALUE_OF_KD = 0.35;
	private static final double VALUE_OF_WON_MATCHS_ABOVE_LOSED_MATCHS = 0.35;
	private static final double VALUE_OF_TOP10_ABOVE_PLAYER_MATCHS = 0.10;
	private static final double VALUE_OF_TOP5_ABOVE_PLAYER_MATCHS = 0.10;
	private static final double VALUE_OF_DAMAGE = 0.10;
		
	public static final int EXCELENT_SKILL_AND_GOOD_LATENCE= 20;
	public static final int EXCELENT_SKILL_AND_BAD_LATENCE= 21;
	public static final int EXCELENT_SKILL_AND_MEDIUM_LATENCE = 22;
	public static final int EXCELENT_SKILL_AND_PESSIMUM_LATENCE = 23;
	public static final int GOOD_SKILL_AND_GOOD_LATENCE = 24;
	public static final int GOOD_SKILL_AND_MEDIUM_LATENCE= 26;
	public static final int GOOD_SKILL_AND_PESSIMUM_LATENCE = 27;
	public static final int MEDIUM_SKILL_AND_GOOD_LATENCE  = 28;
	public static final int MEDIUM_SKILL_AND_BAD_LATENCE = 29;
	public static final int MEDIUM_SKILL_AND_MEDIUM_LATENCE = 30;
	public static final int MEDIUM_SKILL_AND_PESSIMUM_LATENCE= 31;
	public static final int BAD_SKILL_AND_GOOD_LATENCE = 32;
	public static final int BAD_SKILL_AND_BAD_LATENCE = 33;
	public static final int BAD_SKILL_AND_MEDIUM_LATENCE = 34;
	public static final int BAD_SKILL_AND_PESSIMUM_LATENCE = 35;
	public static final int PESSIMUM_SKILL_AND_GOOD_LATENCE= 36;
	public static final int PESSIMIM_SKILL_AND_BAD_LATENCE = 37;
	public static final int PESSIMIM_SKILL_AND_MEDIUM_LATENCE = 38;
	public static final int PESSIMIM_SKILL_AND_PESSIMUM_LATENCE = 39;
	
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
	private double averageTop10;
	private double averageTop5;
	private double damage;
		

	public Player(String name, double latence, int deads, int kills, int playedMatchs, int wonMatchs, int killsForMatch, int killsForMinute,  double averageDamage, double averageEffectivity, int top10, int top5, double damage) {
		this.name = name;
		this.latence = latence;
		this.deads = deads;
		this.kills = kills;
		this.playedMatchs = playedMatchs;
		this.wonMatchs = wonMatchs;
		this.top10 = top10;
		this.top5 = top5;
		this.damage = damage;
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
		if(averageKillsAboveDeads >= 5) {
			averageKillsAboveDeads = 5;
		}
	}
	
	public void calculationWonMatchsAboveLosedMatchs() {
		averageWonMatchsAboveLosedMatchs = kills/deads;
		if(averageWonMatchsAboveLosedMatchs >= 5) {
			averageWonMatchsAboveLosedMatchs = 5;
		}
	}
	
	public void calculationAverageTop10() {
		averageTop10 = top10/playedMatchs;
		if(averageTop10 >= 5) {
			averageTop10 = 5;
		}
	}
	
	public void calculationAverageTop5() {
		averageTop5 = top5/playedMatchs;
		if(averageTop5 >= 5) {
			averageTop5 = 5;
		}
	}
	
	public void calculationSkill() {
		// EL VALOR DEL SKILL VA DE 0 A 5 
		  skill = Math.ceil( (averageKillsAboveDeads*VALUE_OF_KD)+
				  (averageWonMatchsAboveLosedMatchs*VALUE_OF_WON_MATCHS_ABOVE_LOSED_MATCHS)+
				  (averageTop10*VALUE_OF_TOP10_ABOVE_PLAYER_MATCHS)+
				  (averageTop5*VALUE_OF_TOP5_ABOVE_PLAYER_MATCHS)+
				  (damage*VALUE_OF_DAMAGE) );
		  
		  
	}
		
	
	
	
}
	