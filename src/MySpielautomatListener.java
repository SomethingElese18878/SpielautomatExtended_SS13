import model.spielautomatEvent;
import model.spielautomatListener;


public class MySpielautomatListener implements spielautomatListener {
	Playfield playfield;
	
	
	public MySpielautomatListener(Playfield _playfield) {
		this.playfield = _playfield;
	
	}

	@Override
	public void ModelChanged(spielautomatEvent arg0) {
		this.playfield.printRollingNumerics();
		System.out.println("ModelChanged");
		
	}

	@Override
	public void StatusChanged(spielautomatEvent arg0) {
//		spielautomatEvent sourceEvent = (spielautomatEvent) arg0.getSource();

		System.out.println("getKategorie: " + arg0.getKategorie());
		System.out.println("getZiffern: " + arg0.getZiffern());
		System.out.println("getStatus: " + arg0.getStatus());
		System.out.println("getGewinn: " + arg0.getGewinn());
//		System.out.println("getKategorie: " + sourceEvent.getKategorie());
//		System.out.println("getKategorie: " + sourceEvent.getStatus());
//		System.out.println("StatusChanged");
		this.playfield.updateCreditPrize();
		
	}

}
