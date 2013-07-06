
public class PubModeThread extends Thread{
	
	Playfield playfield;
	boolean beerIsFull;
	
	public PubModeThread(Playfield _playfield) {
		
		this.playfield = _playfield;
		this.beerIsFull = true;
		
	}
	
	public void run(){
		while(this.beerIsFull){
			this.playfield.startGame();
			System.out.println("sueffel, sueffel, sueffel..");
			
			try{
				Thread.sleep(3000);
			}catch(Exception e){
				System.out.println("bla");
			}
	
			this.playfield.stopGame();		
		}
		
	}
	
	public void stopPubModeThread(){
		this.beerIsFull = false;
	}

}
