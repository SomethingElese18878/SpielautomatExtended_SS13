
public class PubModeThread extends Thread{
	
	Playfield playfield;
	boolean beerIsFull;
	
	public PubModeThread(Playfield _playfield) {
		
		this.playfield = _playfield;
		this.beerIsFull = true;
		
	}
	
	public void run(){
		while(this.beerIsFull){
			this.playfield.createNewThread();
			this.playfield.rollingNumericsThread.start();
			System.out.println("sueffel, sueffel, sueffel..");
			
			try{
				Thread.sleep(3000);
			}catch(Exception e){
				System.out.println("bla");
			}
			
			this.playfield.rollingNumericsThread.stopRollingNumericsThread();
			this.playfield.game.stopRollen();
			this.playfield.mainWindow.statusWindow.increaseRoundCount();

			
		}
		
	}
	
	
	public void stopPubModeThread(){
		this.beerIsFull = false;
	}

}
