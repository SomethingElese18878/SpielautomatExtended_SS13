import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JWindow;


public class StatusWindow extends JWindow {
	
	boolean visibility = true;
	JTextField roundCount;

	public StatusWindow(JFrame haupt) {
		super(haupt);
		System.out.println(haupt.getLocation().x + " " + haupt.getWidth() + " " + haupt.getLocation().y + " " + haupt.getHeight() + " END");
		this.setLocation(haupt.getLocation().x + haupt.getWidth(), haupt.getLocation().y );
		
		this.roundCount = new JTextField();
		this.roundCount.setEditable(false);
		
		this.add(new JLabel("Spielrunden"), BorderLayout.NORTH);
		this.add(this.roundCount, BorderLayout.CENTER);
		this.add(new JButton("auto"), BorderLayout.SOUTH);
		
		this.pack();
		this.setVisible(this.visibility);
	}
	
	public void changeVisibility(){
		this.visibility = !this.visibility;
		this.setVisible(this.visibility);
	}
	
	
}
