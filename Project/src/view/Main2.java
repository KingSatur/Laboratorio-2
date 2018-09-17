package view;

import dataStructure.ArrayLinearStructure;
import dataStructure.LinearStructure;
import model.Player;

public class Main2 {

	public static void main(String[] args) {

		ArrayLinearStructure<LinearStructure<Player>> m = new ArrayLinearStructure<LinearStructure<Player>>(new LinearStructure<Player>(), 4);
		LinearStructure<Player> no = new LinearStructure<Player>();
		no.addFirst(new Player("Juan"));
		no.addEnd(new Player("Messi"));
		m.agregar(no);
		
		
		
		

	}

}
