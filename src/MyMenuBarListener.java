import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;


public class MyMenuBarListener implements ActionListener {
	
	Playfield playfield;
	
	public MyMenuBarListener(Playfield _playfield) {
		this.playfield = _playfield;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

//		JMenuItem pressedItemObj = (JMenuItem) e.getSource();	//ToDo: When i use that?
		
		System.out.println("JMenuItem: " + e.getActionCommand());
		
		String cmd = e.getActionCommand();
		
		if(cmd == "Status"){
			System.out.println("STATUS program");
		}
	
		if(cmd == "Exit"){
			System.out.println("EXIT program");
			System.exit(0);
		}
		if(cmd == "Info"){
			System.out.println("INFO pressed");
		}
		
		//Signal - Third menu element
		if(cmd == "JOption"){
			System.out.println("JOption pressed");
			this.playfield.showJOption();
		}
		if(cmd == "JDialog"){
			System.out.println("JDialog pressed");
			this.playfield.showJDialog();
		}
		
		if(cmd == "JFileChooser"){
			System.out.println("JFileChooser pressed");
			this.playfield.showJFileChooser();
		}
		
		
		//Look and Feels
		if(cmd == "Metal"){
			this.playfield.setLookAndFeel(this.playfield.lookAndFeelInfo[0].getClassName());
		}
		if(cmd == "Nimbus"){
			this.playfield.setLookAndFeel(this.playfield.lookAndFeelInfo[1].getClassName());
		}
		if(cmd == "Motif"){
			this.playfield.setLookAndFeel(this.playfield.lookAndFeelInfo[2].getClassName());
		}
		if(cmd == "Gtk"){
			this.playfield.setLookAndFeel(this.playfield.lookAndFeelInfo[3].getClassName());
		}
	}

}
