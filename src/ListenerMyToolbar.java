import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class ListenerMyToolbar implements ActionListener{
	
	MyToolbar myToolbar;
	
	public ListenerMyToolbar(MyToolbar _myToolbar){
		this.myToolbar = _myToolbar;
	}

	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		
		if(e.getSource() instanceof JButton){
			JButton sourceBtn = (JButton) e.getSource();
			
			if(cmd == "OK"){
				System.out.println( sourceBtn.getText() );
				myToolbar.playfield.setPlayerName( myToolbar.tfPlayerName.getText() );
			}
			
			if(cmd == "Highscore"){
				System.out.println("Highscore!");
			}
			
		}
	}

}
