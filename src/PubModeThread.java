
public class PubModeThread extends Thread{
	
	Playfield playfield;
	boolean beerIsFull;
	
	public PubModeThread(Playfield _playfield) {
		
		this.playfield = _playfield;
		this.beerIsFull = true;
		
	}
	
	public void run(){
		while(this.beerIsFull){
			System.out.println("sueffel, sueffel, sueffel..");
		}
		
	}
	
	
	public void stopPubModeThread(){
		this.beerIsFull = false;
	}

}
