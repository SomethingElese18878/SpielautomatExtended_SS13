import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;


public class MyMenuBar extends JMenuBar {
	
	Playfield playfield;
	
	JMenu menuProgram;
	JRadioButton menuProgramStatus;
	JMenuItem menuProgramStartConditions;
	JMenuItem menuProgramExit;
	
	JMenu menuExtensions;
	JMenuItem menuExtensionsInfo;
	JMenuItem menuExtensionsLookAndFeel;
	JRadioButton menuExtensionsLookAndFeelMetal;
	JRadioButton menuExtensionsLookAndFeelNimbus;
	JRadioButton menuExtensionsLookAndFeelMotif;
	JRadioButton menuExtensionsLookAndFeelGtk;
	
	ButtonGroup groupRadioBtn;
	
	JMenu menuSignal;
	JMenuItem menuSignalJOption;
	JMenuItem menuSignalJDialog;
	JMenuItem menuSignalJFileChooser;
	
	ImageIcon iconExit;
	ImageIcon iconInfo;
	ImageIcon iconBeer;
	
	MyMenuBarListener myMenuBarListener;
	
	public MyMenuBar(Playfield _playfield) {
		this.playfield = _playfield;
		myMenuBarListener = new MyMenuBarListener(this.playfield);
		
		String link2iconExit = "./icons/exit.png";
		String link2iconInfo = "./icons/info.png";
		String link2iconBeer = "./icons/beer16px.png";

		//Load and resize Icons - also for other classes like statusWindow.
		this.iconExit = new ImageIcon(link2iconExit);
		this.iconExit.setImage(this.iconExit.getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));
		this.iconInfo = new ImageIcon(link2iconInfo);
		this.iconInfo.setImage(this.iconInfo.getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));
		this.iconBeer = new ImageIcon(link2iconBeer);
		this.iconBeer.setImage(this.iconBeer.getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));
		
		//Create menu elements
		this.menuProgram = new JMenu("Program");
		this.menuProgram.setMnemonic(KeyEvent.VK_P);
		
		this.menuProgramStatus = new JRadioButton("Status", true);
		this.menuProgramStatus.addActionListener(this.myMenuBarListener);
		this.menuProgramStartConditions = new JMenuItem("StartConditions");
		this.menuProgramStartConditions.addActionListener(this.myMenuBarListener);
		this.menuProgramExit = new JMenuItem("Exit", KeyEvent.VK_E);
		this.menuProgramExit.setIcon(this.iconExit);
		this.menuProgramExit.addActionListener(this.myMenuBarListener);
		
		//add items to first menu element
		this.menuProgram.add(this.menuProgramStatus);
		this.menuProgram.add(this.menuProgramStartConditions);
		this.menuProgram.add(this.menuProgramExit);
		
		//Second MenuPoint
		this.menuExtensions = new JMenu("Extensions");
		
		this.menuExtensionsInfo = new JMenuItem("Info");
		this.menuExtensionsInfo.setIcon(this.iconInfo);
		this.menuExtensionsInfo.addActionListener(this.myMenuBarListener);
		this.menuExtensionsLookAndFeel = new JMenu("LookAndFeel");
		this.menuExtensionsLookAndFeel.setMnemonic(KeyEvent.VK_L);
		
		//subMenu LookAndFeel in Extensions
		this.groupRadioBtn = new ButtonGroup();
		
		this.menuExtensionsLookAndFeelMetal = new JRadioButton("Metal", true);
		this.menuExtensionsLookAndFeelMetal.addActionListener(this.myMenuBarListener);
		this.groupRadioBtn.add(this.menuExtensionsLookAndFeelMetal);
		this.menuExtensionsLookAndFeelNimbus = new JRadioButton("Nimbus");
		this.menuExtensionsLookAndFeelNimbus.addActionListener(this.myMenuBarListener);
		this.groupRadioBtn.add(this.menuExtensionsLookAndFeelNimbus);
		this.menuExtensionsLookAndFeelMotif = new JRadioButton("Motif");
		this.menuExtensionsLookAndFeelMotif.addActionListener(this.myMenuBarListener);
		this.groupRadioBtn.add(this.menuExtensionsLookAndFeelMotif);
		this.menuExtensionsLookAndFeelGtk = new JRadioButton("Gtk");
		this.menuExtensionsLookAndFeelGtk.addActionListener(this.myMenuBarListener);
		this.groupRadioBtn.add(this.menuExtensionsLookAndFeelGtk);
		
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
		
		this.menuSignalJFileChooser = new JMenuItem("JFileChooser");
		this.menuSignalJFileChooser.addActionListener(this.myMenuBarListener);

		//add items to third menu
		this.menuSignal.add(this.menuSignalJOption);
		this.menuSignal.add(this.menuSignalJDialog);
		this.menuSignal.add(this.menuSignalJFileChooser);
		
		
		//Add menupoints to JMenuBar
		this.add(this.menuProgram);
		this.add(this.menuExtensions);
		this.add(this.menuSignal);
	}
	
}
