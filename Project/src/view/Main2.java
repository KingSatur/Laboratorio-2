package view;

import java.util.Random;

import dataStructure.ArrayLinearStructure;
import dataStructure.LinearStructure;
import model.Fortnite;
import model.Player;

public class Main2 {

	public static void main(String[] args) {

		ArrayLinearStructure<LinearStructure<Player>> m = new ArrayLinearStructure<LinearStructure<Player>>(new LinearStructure<Player>(), 4);
		LinearStructure<Player> no = new LinearStructure<Player>();
		no.addFirst(new Player("Juan"));
		no.addEnd(new Player("Messi"));
		m.agregar(no);
		Fortnite f = new Fortnite();
		Random j = new Random();

//		Player z = new Player("Player" , 10 , 11  , 1 , 5 , 3, 7, 2, 8);
//		Player s = new Player("Player 1", 10, 11, 1, 5, 3, 7 ,2, 8);
//		f.rankear(z);
//		f.rankear(s);
		
		
	}

}
