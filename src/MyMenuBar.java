import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MyMenuBar extends JMenuBar {
	
	JMenu menuProgram, menuExtensions;
	JMenuItem itemStatus, itemExit, itemInfoWindow;
	
	public MyMenuBar() {
		//Create menu elements
		this.menuProgram = new JMenu("Program");
		this.itemExit = new JMenuItem("Exit");
		this.itemStatus = new JMenuItem("Status");
		
		this.menuProgram.add(this.itemStatus);
		this.menuProgram.add(this.itemExit);
		
		//Second MenuPoint
		this.menuExtensions = new JMenu("Extensions");
		this.itemInfoWindow = new JMenuItem("Info");
		
		this.menuExtensions.add(itemInfoWindow);
		
		//Add menupoints to JMenuBar
		this.add(this.menuProgram);
		this.add(this.menuExtensions);
	}
	
}
