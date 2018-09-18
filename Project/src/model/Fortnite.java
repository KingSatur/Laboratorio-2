package model;

import dataStructure.ArrayLinearStructure;
import dataStructure.LinearStructure;

public class Fortnite {

	private ArrayLinearStructure<LinearStructure<Player>> ranking;
	private ArrayLinearStructure<LinearStructure<Player>> plataform;

	public Fortnite() {
		plataform = new ArrayLinearStructure<LinearStructure<Player>>(new LinearStructure<Player>(), 4);
		ranking = new ArrayLinearStructure<LinearStructure<Player>>(new LinearStructure<Player>(), 20);
		createSlots();
	}

	public void rankear(Player player) {

		if (player.getLatence() >= 0 && player.getLatence() < 50) {
			if (player.getSkill() == 1) {
				ranking.getArray()[ranking.hashFunction(Player.PESSIMUM_SKILL_AND_GOOD_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 2) {
				ranking.getArray()[ranking.hashFunction(Player.BAD_SKILL_AND_GOOD_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 3) {
				ranking.getArray()[ranking.hashFunction(Player.MEDIUM_SKILL_AND_GOOD_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 4) {
				ranking.getArray()[ranking.hashFunction(Player.GOOD_SKILL_AND_GOOD_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 5) {
				ranking.getArray()[ranking.hashFunction(Player.EXCELENT_SKILL_AND_GOOD_LATENCE)].addEnd(player);
			}
		}
		if (player.getLatence() >= 50 && player.getLatence() < 100) {
			if (player.getSkill() == 1) {
				ranking.getArray()[ranking.hashFunction(Player.PESSIMUM_SKILL_AND_MEDIUM_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 2) {
				ranking.getArray()[ranking.hashFunction(Player.BAD_SKILL_AND_MEDIUM_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 3) {
				ranking.getArray()[ranking.hashFunction(Player.MEDIUM_SKILL_AND_MEDIUM_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 4) {
				ranking.getArray()[ranking.hashFunction(Player.GOOD_SKILL_AND_MEDIUM_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 5) {
				ranking.getArray()[ranking.hashFunction(Player.EXCELENT_SKILL_AND_MEDIUM_LATENCE)].addEnd(player);
			}
		}
		if (player.getLatence() >= 100 && player.getLatence() < 150) {
			if (player.getSkill() == 1) {
				ranking.getArray()[ranking.hashFunction(Player.PESSIMUM_SKILL_AND_BAD_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 2) {
				ranking.getArray()[ranking.hashFunction(Player.BAD_SKILL_AND_BAD_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 3) {
				ranking.getArray()[ranking.hashFunction(Player.MEDIUM_SKILL_AND_BAD_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 4) {
				ranking.getArray()[ranking.hashFunction(Player.GOOD_SKILL_AND_BAD_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 5) {
				ranking.getArray()[ranking.hashFunction(Player.EXCELENT_SKILL_AND_BAD_LATENCE)].addEnd(player);
			}
		}
		if (player.getLatence() >= 150 && player.getLatence() <= 200) {
			if (player.getSkill() == 1) {
				ranking.getArray()[ranking.hashFunction(Player.PESSIMUM_SKILL_AND_PESSIMUM_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 2) {
				ranking.getArray()[ranking.hashFunction(Player.BAD_SKILL_AND_PESSIMUM_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 3) {
				ranking.getArray()[ranking.hashFunction(Player.MEDIUM_SKILL_AND_PESSIMUM_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 4) {
				ranking.getArray()[ranking.hashFunction(Player.GOOD_SKILL_AND_PESSIMUM_LATENCE)].addEnd(player);
			}
			if (player.getSkill() == 5) {
				ranking.getArray()[ranking.hashFunction(Player.EXCELENT_SKILL_AND_PESSIMUM_LATENCE)].addEnd(player);
			}
		}

	}
	
	public void createSlots() {
		
		for(int i = 0; i < ranking.getArray().length ; i ++) {
			ranking.getArray()[i] = new LinearStructure<Player>();
		}
		
		
	}

}
