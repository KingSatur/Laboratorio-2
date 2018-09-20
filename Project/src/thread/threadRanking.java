package thread;

import dataStructure.Node;
import model.Fortnite;
import model.Player;

public class threadRanking extends Thread {

	private Fortnite fortnite;
	
	public threadRanking (Fortnite fortnite) {
		this.fortnite = fortnite;
	}
	
	
	public void run() {
		
		for (int i = 0; i < 50  ; i++) {
			
			
			fortnite.rankear(fortnite.getPlayers()[i]);
						
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	
	
	
}
