import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JWindow;


public class StatusWindow extends JWindow {
	
	boolean visibility = true;
	JTextField tFieldRoundCount;
	JButton btnAuto;
	int roundCount;
	MainWindow mainWindow;
	
	boolean pubModeOn;

	public StatusWindow(MainWindow _mainWindow) {
		super(_mainWindow);
		this.mainWindow = _mainWindow;
		this.pubModeOn = false;

		System.out.println(_mainWindow.getLocation().x + " " + _mainWindow.getWidth() + " " + _mainWindow.getLocation().y + " " + _mainWindow.getHeight() + " END");
		this.setLocation(_mainWindow.getLocation().x + _mainWindow.getWidth(), _mainWindow.getLocation().y);
		this.roundCount = 0;
		
		this.tFieldRoundCount = new JTextField(Integer.toString(this.roundCount));
		this.tFieldRoundCount.setEditable(false);
		
		this.btnAuto = new JButton("auto");
		this.btnAuto.setActionCommand("togglePubModeButton");
		this.btnAuto.addActionListener(new ButtonListener(this.mainWindow.playfield));
		
		this.add(new JLabel("Spielrunden"), BorderLayout.NORTH);
		this.add(this.tFieldRoundCount, BorderLayout.CENTER);
		this.add(this.btnAuto, BorderLayout.SOUTH);
		
		this.pack();
		this.setVisible(this.visibility);
	}
	
	
	public void changeVisibility(){
		this.visibility = !this.visibility;
		this.setVisible(this.visibility);
	}
	
	public void increaseRoundCount(){
		this.roundCount = this.roundCount + 1;
		this.tFieldRoundCount.setText(Integer.toString(this.roundCount));
	}
	
	public void togglePubModeButton(){
		if(this.pubModeOn == false){
			this.btnAuto.setText("off");
			this.mainWindow.playfield.createNewPubModeThread();
			mainWindow.playfield.pubModeThread.start();
		}
		
		if(this.pubModeOn == true){
			this.btnAuto.setText("auto");
			mainWindow.playfield.pubModeThread.stopPubModeThread();
		}
		this.pubModeOn = !this.pubModeOn;
			
	}
	
	
}
