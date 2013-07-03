import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JWindow;


public class StatusWindow extends JWindow {
	
	boolean visibility = true;
	JTextField tFieldRoundCount;
	int roundCount;

	public StatusWindow(JFrame haupt) {
		super(haupt);
		System.out.println(haupt.getLocation().x + " " + haupt.getWidth() + " " + haupt.getLocation().y + " " + haupt.getHeight() + " END");
		this.setLocation(haupt.getLocation().x + haupt.getWidth(), haupt.getLocation().y );
		this.roundCount = 0;
		
		this.tFieldRoundCount = new JTextField(Integer.toString(this.roundCount));
		this.tFieldRoundCount.setEditable(false);
		
		this.add(new JLabel("Spielrunden"), BorderLayout.NORTH);
		this.add(this.tFieldRoundCount, BorderLayout.CENTER);
		this.add(new JButton("auto"), BorderLayout.SOUTH);
		
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
	
	
}
