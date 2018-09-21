package model;

import java.io.Serializable;

import TDA.iStack;
import dataStructure.LinearStructure;

public class Player implements Serializable{

	private static final double VALUE_OF_KD = 0.35;
	private static final double VALUE_OF_WON_MATCHS_ABOVE_LOSED_MATCHS = 0.35;
	private static final double VALUE_OF_TOP10_ABOVE_PLAYER_MATCHS = 0.10;
	private static final double VALUE_OF_TOP5_ABOVE_PLAYER_MATCHS = 0.10;
	private static final double VALUE_OF_DAMAGE = 0.10;
	
	public static final int EXCELENT_SKILL_AND_GOOD_LATENCE= 20;
	public static final int EXCELENT_SKILL_AND_MEDIUM_LATENCE = 21;
	public static final int EXCELENT_SKILL_AND_BAD_LATENCE= 22;
	public static final int EXCELENT_SKILL_AND_PESSIMUM_LATENCE = 23;
	
	public static final int GOOD_SKILL_AND_GOOD_LATENCE = 24;
	public static final int GOOD_SKILL_AND_MEDIUM_LATENCE= 25;
	public static final int GOOD_SKILL_AND_BAD_LATENCE =26;
	public static final int GOOD_SKILL_AND_PESSIMUM_LATENCE = 27;
	
	public static final int MEDIUM_SKILL_AND_GOOD_LATENCE  = 28;
	public static final int MEDIUM_SKILL_AND_MEDIUM_LATENCE = 29;
	public static final int MEDIUM_SKILL_AND_BAD_LATENCE = 30;
	public static final int MEDIUM_SKILL_AND_PESSIMUM_LATENCE= 31;
	
	public static final int BAD_SKILL_AND_GOOD_LATENCE = 32;
	public static final int BAD_SKILL_AND_MEDIUM_LATENCE = 33;
	public static final int BAD_SKILL_AND_BAD_LATENCE = 34;
	public static final int BAD_SKILL_AND_PESSIMUM_LATENCE = 35;
	
	public static final int PESSIMUM_SKILL_AND_GOOD_LATENCE= 36;
	public static final int PESSIMUM_SKILL_AND_MEDIUM_LATENCE = 37;
	public static final int PESSIMUM_SKILL_AND_BAD_LATENCE = 38;
	public static final int PESSIMUM_SKILL_AND_PESSIMUM_LATENCE = 39;
	
	public static final int PLAYSTATION = 5;
	public static final int MICROSOFT = 6;
	public static final int MACOS = 7;
	public static final int XBOX = 8;
	public static final int NINTENDO = 9;
	
	
	
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
	private String platform;	
	
	private iStack<Weapon> inventory;

	public Player(String name, double latence, int deads, int kills, int playedMatchs, int wonMatchs, int top10, int top5, double damage, String platform) {
		this.name = name;
		this.latence = latence;
		this.deads = deads;
		this.kills = kills;
		this.playedMatchs = playedMatchs;
		this.wonMatchs = wonMatchs;
		this.top10 = top10;
		this.top5 = top5;
		this.damage = damage;
		this.platform = platform;
		
		inventory = new LinearStructure<Weapon>();
		inventory.push(new Weapon("peak", 0));
		
	}
	
	public Player(String name) {
		this.name = name;

		inventory = new LinearStructure<Weapon>();
		inventory.push(new Weapon("peak", 0));
		
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
	
	
	public double getAverageWonMatchsAboveLosedMatchs() {
		return averageWonMatchsAboveLosedMatchs;
	}

	public void setAverageWonMatchsAboveLosedMatchs(double averageWonMatchsAboveLosedMatchs) {
		this.averageWonMatchsAboveLosedMatchs = averageWonMatchsAboveLosedMatchs;
	}

	public int getTop5() {
		return top5;
	}

	public void setTop5(int top5) {
		this.top5 = top5;
	}

	public int getTop10() {
		return top10;
	}

	public void setTop10(int top10) {
		this.top10 = top10;
	}

	public double getAverageTop10() {
		return averageTop10;
	}

	public void setAverageTop10(double averageTop10) {
		this.averageTop10 = averageTop10;
	}

	public double getAverageTop5() {
		return averageTop5;
	}

	public void setAverageTop5(double averageTop5) {
		this.averageTop5 = averageTop5;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public void setSkill(double skill) {
		this.skill = skill;
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
		  calculationAverageTop5();
		  calculationAverageTop10();
		  calculationWonMatchsAboveLosedMatchs();
		  calculationKD();
		  skill = Math.ceil( (averageKillsAboveDeads*VALUE_OF_KD)+
				  (averageWonMatchsAboveLosedMatchs*VALUE_OF_WON_MATCHS_ABOVE_LOSED_MATCHS)+
				  (averageTop10*VALUE_OF_TOP10_ABOVE_PLAYER_MATCHS)+
				  (averageTop5*VALUE_OF_TOP5_ABOVE_PLAYER_MATCHS)+
				  (damage*VALUE_OF_DAMAGE) );
	}
	
	public double getSkill() {
		calculationSkill();
		return skill;
	}
	
	public void pickUpWeapon(Weapon newWeapon) {
		inventory.push(newWeapon);
	}
	
	public void shoot() {
		
		if(!inventory.top().getType().getName().equalsIgnoreCase("peak")) {
			inventory.top().getType().setAmmo(inventory.top().getType().getAmmo()-2);
			if(inventory.top().getType().getAmmo() == 0) {
				inventory.pop();
			}
		}
	}
		
	
}
	