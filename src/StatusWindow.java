import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JWindow;


public class StatusWindow extends JWindow {
	
	boolean visibility = true;

	public StatusWindow(JFrame haupt) {
		super(haupt);
		System.out.println(haupt.getLocation().x + " " + haupt.getWidth() + " " + haupt.getLocation().y + " " + haupt.getHeight() + " END");
		this.setLocation(haupt.getLocation().x + haupt.getWidth(), haupt.getLocation().y + haupt.getHeight()/2);
		
		this.add(new JButton("klar"), BorderLayout.NORTH);
		this.add(new JButton("klarooooo"), BorderLayout.SOUTH);
		
		this.pack();
		this.setVisible(this.visibility);
	}
	
	public void changeVisibility(){
		this.visibility = !this.visibility;
		this.setVisible(this.visibility);
	}
	
	
}
