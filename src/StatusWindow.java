import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JWindow;


public class StatusWindow extends JWindow {
	
	boolean visibility = true;
	JTextField tFieldRoundCount;
	JButton btnAuto;
	int roundCount;
	MainWindow mainWindow;
	
	boolean pubModeOn;
	
	JPanel panelForBorder;

	public StatusWindow(MainWindow _mainWindow) {
		super(_mainWindow);
		this.mainWindow = _mainWindow;
		this.pubModeOn = false;
		this.panelForBorder = new JPanel();
		
		this.panelForBorder.setLayout(new BorderLayout());

		System.out.println(_mainWindow.getLocation().x + " " + _mainWindow.getWidth() + " " + _mainWindow.getLocation().y + " " + _mainWindow.getHeight() + " END");
		this.setLocation(_mainWindow.getLocation().x + _mainWindow.getWidth(), _mainWindow.getLocation().y);
		this.roundCount = 0;
		
		this.tFieldRoundCount = new JTextField(Integer.toString(this.roundCount));
		this.tFieldRoundCount.setEditable(false);
		
		this.btnAuto = new JButton("auto");
		this.btnAuto.setIcon(this.mainWindow.myMenuBar.iconBeer);
		this.btnAuto.setActionCommand("togglePubModeButton");
		this.btnAuto.addActionListener(new ButtonListener(this.mainWindow.playfield));
		
		this.panelForBorder.add(new JLabel("Spielrunden"), BorderLayout.NORTH);
		this.panelForBorder.add(this.tFieldRoundCount, BorderLayout.CENTER);
		this.panelForBorder.add(this.btnAuto, BorderLayout.SOUTH);
		
		this.panelForBorder.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		this.add(this.panelForBorder);
		
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
	public void setRoundCount2Zero(){
		this.roundCount = 0;
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
