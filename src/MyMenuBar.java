import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


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
	
	JMenu menuSignal;
	JMenuItem menuSignalJOption;
	JMenuItem menuSignalJDialog;
	
	MyMenuBarListener myMenuBarListener;
	
	public MyMenuBar(Playfield _playfield) {
		this.playfield = _playfield;
		myMenuBarListener = new MyMenuBarListener(this.playfield);
		
		//Create menu elements
		this.menuProgram = new JMenu("Program");
		this.menuProgram.setMnemonic(KeyEvent.VK_P);
		
		this.menuProgramStatus = new JMenuItem("Status");
		this.menuProgramStatus.addActionListener(this.myMenuBarListener);
		this.menuProgramExit = new JMenuItem("Exit", KeyEvent.VK_E);
		this.menuProgramExit.addActionListener(this.myMenuBarListener);
		
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
		
		this.menuExtensions.add(this.menuExtensionsInfo);
		this.menuExtensions.add(this.menuExtensionsLookAndFeel);
		
		//Third MenuPoint
		this.menuSignal = new JMenu("Signal");
		
		this.menuSignalJOption = new JMenuItem("JOption");
		this.menuSignalJOption.addActionListener(this.myMenuBarListener);
		
		this.menuSignalJDialog = new JMenuItem("JDialog");
		this.menuSignalJDialog.addActionListener(this.myMenuBarListener);

		//add items to third menu
		this.menuSignal.add(this.menuSignalJOption);
		this.menuSignal.add(this.menuSignalJDialog);
		
		
		//Add menupoints to JMenuBar
		this.add(this.menuProgram);
		this.add(this.menuExtensions);
		this.add(this.menuSignal);
	}
	
}
