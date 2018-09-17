package model;

import dataStructure.ArrayLinearStructure;
import dataStructure.LinearStructure;

public class Fortnite {

	private ArrayLinearStructure<LinearStructure<Player>> plataform;
	private ArrayLinearStructure<LinearStructure<Player>> ranking;

	
	
	public Fortnite() {
		plataform = new ArrayLinearStructure<LinearStructure<Player>>(new LinearStructure<Player>(), 4);
		ranking = new ArrayLinearStructure<LinearStructure<Player>>(new LinearStructure<Player>(), 20);
	}
	
	
	
	
	
}
