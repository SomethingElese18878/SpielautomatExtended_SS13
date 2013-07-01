import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MyMenuBar extends JMenuBar {
	
	JMenu menuProgram;
	JMenuItem menuProgramStatus;
	JMenuItem menuProgramExit;
	
	JMenu menuExtensions;
	JMenuItem menuExtensionsInfo;
	JMenuItem menuExtensionsLookAndFeel;
	JMenuItem menuExtensionsLookAndFeelLook1;
	JMenuItem menuExtensionsLookAndFeelLook2;
	
	MyMenuBarListener myMenuBarListener = new MyMenuBarListener();
	
	public MyMenuBar() {
		//Create menu elements
		this.menuProgram = new JMenu("Program");
		this.menuProgram.setMnemonic(KeyEvent.VK_P);
		
		this.menuProgramExit = new JMenuItem("Exit", KeyEvent.VK_E);
		this.menuProgramExit.addActionListener(this.myMenuBarListener);
		this.menuProgramStatus = new JMenuItem("Status");
		this.menuProgramStatus.addActionListener(this.myMenuBarListener);
		
		//add items to first menu element
		this.menuProgram.add(this.menuProgramStatus);
		this.menuProgram.add(this.menuProgramExit);
		
		//Second MenuPoint
		this.menuExtensions = new JMenu("Extensions");
		
		this.menuExtensionsInfo = new JMenuItem("Info");
		this.menuExtensionsInfo.addActionListener(this.myMenuBarListener);
		this.menuExtensionsLookAndFeel = new JMenu("LookAndFeel");
		this.menuExtensionsLookAndFeel.setMnemonic(KeyEvent.VK_L);
		
		//subMenu LookAndFeel in Extensions
		this.menuExtensionsLookAndFeelLook1 = new JMenuItem("look1");
		this.menuExtensionsLookAndFeelLook2 = new JMenuItem("look2");
		
		this.menuExtensionsLookAndFeel.add(this.menuExtensionsLookAndFeelLook1);
		this.menuExtensionsLookAndFeel.add(this.menuExtensionsLookAndFeelLook2);
		
		this.menuExtensions.add(menuExtensionsInfo);
		this.menuExtensions.add(menuExtensionsLookAndFeel);
		
		//Add menupoints to JMenuBar
		this.add(this.menuProgram);
		this.add(this.menuExtensions);
	}
	
}
