package thread;

import model.Fortnite;

public class threadPlatform extends Thread{
	
private Fortnite fortnite;
	
	public threadPlatform (Fortnite fortnite) {
		this.fortnite = fortnite;
	}
	
	
	public void run() {
		
		for (int i = 0; i < 50/*fortnite.getPlayers().length*/ ; i++) {
			
			fortnite.platform(fortnite.getPlayers()[i]);
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
	
}
