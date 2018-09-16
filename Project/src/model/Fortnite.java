package model;

import dataStructure.ArrayLinearStructure;

public class Fortnite {

	private ArrayLinearStructure<Player> plataform;
	private ArrayLinearStructure<Player> ranking;
	
	public Fortnite() {
		plataform = new ArrayLinearStructure<Player>(Player.class, 4);
		ranking = new ArrayLinearStructure<Player>(Player.class, 20);
	}
	
	
	
	
	
}
