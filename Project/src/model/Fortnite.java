package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import dataStructure.ArrayLinearStructure;
import dataStructure.LinearStructure;
import thread.threadPlatform;
import thread.threadRanking;

public class Fortnite {

	private ArrayLinearStructure<LinearStructure<Player>> ranking;
	private ArrayLinearStructure<LinearStructure<Player>> plataform;
	private Player[] players;
	private threadRanking threadRanking;
	private threadPlatform threadPlatform;
	private boolean rank;
	private boolean stage; 
	
	public Fortnite() {
		players = new Player[100000];
		players = new Player[100];
		InputPlayers();
		plataform = new ArrayLinearStructure<LinearStructure<Player>>(new LinearStructure<Player>(), 5);
		ranking = new ArrayLinearStructure<LinearStructure<Player>>(new LinearStructure<Player>(), 20);
		rank = false;
		stage = false;
		
	}

	public ArrayLinearStructure<LinearStructure<Player>> getRanking() {
		return ranking;
	}

	public void setRanking(ArrayLinearStructure<LinearStructure<Player>> ranking) {
		this.ranking = ranking;
	}

	public ArrayLinearStructure<LinearStructure<Player>> getPlataform() {
		return plataform;
	}

	public void setPlataform(ArrayLinearStructure<LinearStructure<Player>> plataform) {
		this.plataform = plataform;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}
	

	public boolean isRank() {
		return rank;
	}

	public void setRank(boolean rank) {
		this.rank = rank;
	}

	public boolean isStage() {
		return stage;
	}

	public void setStage(boolean stage) {
		this.stage = stage;
	}

	public void OuputPlayers() {
		createPlayers();

		try {
			ObjectOutputStream ouput = new ObjectOutputStream(new FileOutputStream("./Data/data.dat"));
			ouput.writeObject(players);
			ouput.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void InputPlayers() {
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("./Data/data.dat"));
			players = (Player[]) input.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void createPlayers() {
		String name;
		double latence;
		int deads;
		int kills;
		int playedMatchs;
		int wonMatchs;
		double averageKillsAboveDeads;
		double averageWonMatchsAboveLosedMatchs;
		double skill;
		int top5;
		int top10;
		double averageTop10;
		double averageTop5;
		double damage;

		String[] platforms = { "PlayStation", "MicroSoft", "MacOs", "Xbox", "Nintendo" };
		for (int i = 0; i < players.length; i++) {
			latence = (Math.random() * 200) + 1;
			deads = (int) (Math.random() * 10000) + 1;
			kills = (int) (Math.random() * 10000) + 1;
			playedMatchs = (int) (Math.random() * 3000) + 1;
			wonMatchs = (int) (Math.random() * 3000) + 1;
			top5 = (int) (Math.random() * 3000) + 1;
			top10 = (int) (Math.random() * 3000) + 1;
			damage = (Math.random() * 5) + 1;

			players[i] = new Player("player" + i, latence, deads, kills, playedMatchs, wonMatchs, top10, top5, damage,
					platforms[i % platforms.length]);
		}

	}

	public void rankear(Player player) {

		if (player.getLatence() >= 0 && player.getLatence() < 50) {
			
			if (player.getSkill() == 1) {
				createSlots(player, Player.PESSIMUM_SKILL_AND_GOOD_LATENCE, true);				
			}
			if (player.getSkill() == 2) {
				createSlots(player, Player.BAD_SKILL_AND_GOOD_LATENCE, true);	
			}
			if (player.getSkill() == 3) {
				createSlots(player, Player.MEDIUM_SKILL_AND_GOOD_LATENCE, true);	
			}
			if (player.getSkill() == 4) {
				createSlots(player, Player.GOOD_SKILL_AND_GOOD_LATENCE, true);	
			}
			if (player.getSkill() == 5) {
				createSlots(player, Player.EXCELENT_SKILL_AND_GOOD_LATENCE, true);	
			}
		}
		if (player.getLatence() >= 50 && player.getLatence() < 100) {
			if (player.getSkill() == 1) {
				createSlots(player, Player.PESSIMUM_SKILL_AND_MEDIUM_LATENCE, true);
			}
			if (player.getSkill() == 2) {
				createSlots(player, Player.BAD_SKILL_AND_MEDIUM_LATENCE, true);
			}
			if (player.getSkill() == 3) {
				createSlots(player, Player.MEDIUM_SKILL_AND_MEDIUM_LATENCE, true);
			}
			if (player.getSkill() == 4) {
				createSlots(player, Player.GOOD_SKILL_AND_MEDIUM_LATENCE, true);
			}
			if (player.getSkill() == 5) {
				createSlots(player, Player.EXCELENT_SKILL_AND_MEDIUM_LATENCE, true);
			}
		}
		if (player.getLatence() >= 100 && player.getLatence() < 150) {
			if (player.getSkill() == 1) {
				createSlots(player, Player.PESSIMUM_SKILL_AND_BAD_LATENCE, true);
			}
			if (player.getSkill() == 2) {
				createSlots(player, Player.BAD_SKILL_AND_BAD_LATENCE, true);
			}
			if (player.getSkill() == 3) {
				createSlots(player, Player.MEDIUM_SKILL_AND_BAD_LATENCE, true);
			}
			if (player.getSkill() == 4) {
				createSlots(player, Player.GOOD_SKILL_AND_BAD_LATENCE, true);
			}
			if (player.getSkill() == 5) {
				createSlots(player, Player.EXCELENT_SKILL_AND_BAD_LATENCE, true);
			}
		}
		if (player.getLatence() >= 150 && player.getLatence() <= 200) {
			if (player.getSkill() == 1) {
				createSlots(player, Player.PESSIMUM_SKILL_AND_PESSIMUM_LATENCE, true);
			}
			if (player.getSkill() == 2) {
				createSlots(player, Player.BAD_SKILL_AND_PESSIMUM_LATENCE, true);
			}
			if (player.getSkill() == 3) {
				createSlots(player, Player.MEDIUM_SKILL_AND_PESSIMUM_LATENCE, true);
			}
			if (player.getSkill() == 4) {
				createSlots(player, Player.GOOD_SKILL_AND_PESSIMUM_LATENCE, true);
			}
			if (player.getSkill() == 5) {

				createSlots(player, Player.EXCELENT_SKILL_AND_PESSIMUM_LATENCE, true);
			}
			
		}

	}

	public void platform(Player newPlayer) {

		if (newPlayer.getPlatform().equalsIgnoreCase("PlayStation")) {
			createSlots(newPlayer, Player.PLAYSTATION, false);

		}

		if (newPlayer.getPlatform().equalsIgnoreCase("MicroSoft")) {
			createSlots(newPlayer, Player.MICROSOFT, false);

		}

		if (newPlayer.getPlatform().equalsIgnoreCase("MacOs")) {
			createSlots(newPlayer, Player.MACOS, false);
		}

		if (newPlayer.getPlatform().equalsIgnoreCase("Xbox")) {
			createSlots(newPlayer, Player.XBOX, false);

		}

		if (newPlayer.getPlatform().equalsIgnoreCase("Nintendo")) {
			createSlots(newPlayer, Player.NINTENDO, false);

		}
	}

	public void createSlots(Player player, int rank, boolean r) {
		
		if(r) {
			if(ranking.getArray()[ranking.hashFunction(rank)] == null) {
				ranking.getArray()[ranking.hashFunction(rank)] = new LinearStructure<Player>();
				ranking.getArray()[ranking.hashFunction(rank)].addEnd(player);	
			}else {					
				ranking.getArray()[ranking.hashFunction(rank)].addEnd(player);	
			}	
		}else {
			if(plataform.getArray()[plataform.hashFunction(rank)] == null) {
				plataform.getArray()[plataform.hashFunction(rank)] = new LinearStructure<Player>();
				plataform.getArray()[plataform.hashFunction(rank)].addEnd(player);	
			}else {					
				plataform.getArray()[plataform.hashFunction(rank)].addEnd(player);	
			}
		}
		
	}
	
	public void initializeThreadRanking() {
		threadRanking = new threadRanking(this);
		threadRanking.start();
		rank = true;
	}
		
	public void initializeThreadPlatforms() {
		threadPlatform = new threadPlatform(this);
		threadPlatform.start();
		stage = true;
	}
	

	
}
