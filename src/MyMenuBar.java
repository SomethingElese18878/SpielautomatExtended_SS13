import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;


public class MyMenuBar extends JMenuBar {
	
	Playfield playfield;
	
	JMenu menuProgram;
	JMenuItem menuProgramStatus;
	JMenuItem menuProgramExit;
	
	JMenu menuExtensions;
	JMenuItem menuExtensionsInfo;
	JMenuItem menuExtensionsLookAndFeel;
	JRadioButton menuExtensionsLookAndFeelMetal;
	JRadioButton menuExtensionsLookAndFeelNimbus;
	JRadioButton menuExtensionsLookAndFeelMotif;
	JRadioButton menuExtensionsLookAndFeelGtk;
	
	MyMenuBarListener myMenuBarListener;
	
	public MyMenuBar(Playfield _playfield) {
		this.playfield = _playfield;
		
		myMenuBarListener = new MyMenuBarListener(this.playfield);
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
		this.menuExtensionsLookAndFeelMetal = new JRadioButton("Metal");
		this.menuExtensionsLookAndFeelMetal.addActionListener(this.myMenuBarListener);
		this.menuExtensionsLookAndFeelNimbus = new JRadioButton("Nimbus");
		this.menuExtensionsLookAndFeelNimbus.addActionListener(this.myMenuBarListener);
		this.menuExtensionsLookAndFeelMotif = new JRadioButton("Motif");
		this.menuExtensionsLookAndFeelMotif.addActionListener(this.myMenuBarListener);
		this.menuExtensionsLookAndFeelGtk = new JRadioButton("Gtk");
		this.menuExtensionsLookAndFeelGtk.addActionListener(this.myMenuBarListener);
		
		this.menuExtensionsLookAndFeel.add(this.menuExtensionsLookAndFeelMetal);
		this.menuExtensionsLookAndFeel.add(this.menuExtensionsLookAndFeelNimbus);
		this.menuExtensionsLookAndFeel.add(this.menuExtensionsLookAndFeelMotif);
		this.menuExtensionsLookAndFeel.add(this.menuExtensionsLookAndFeelGtk);
		
		this.menuExtensions.add(menuExtensionsInfo);
		this.menuExtensions.add(menuExtensionsLookAndFeel);
		
		//Add menupoints to JMenuBar
		this.add(this.menuProgram);
		this.add(this.menuExtensions);
	}
	
}
