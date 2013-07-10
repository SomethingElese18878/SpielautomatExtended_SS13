import java.awt.BorderLayout;

import javax.swing.JFrame;


public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	Playfield playfield;
	MyMenuBar myMenuBar;
	StatusWindow statusWindow;
	MyToolbar myToolbar;
	
	public MainWindow(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Spielautomat");
//		this.setLocation(200, 300);
		
		this.playfield = new Playfield(this);
		this.playfield.showUnseenVariables();
		this.myMenuBar = new MyMenuBar(this.playfield);
		this.myToolbar = new MyToolbar(this.playfield);

		this.setJMenuBar(this.myMenuBar);
		this.add(this.myToolbar, BorderLayout.PAGE_END); // .PAGE_START
		this.add(this.playfield);
		this.pack();
		
		this.statusWindow = new StatusWindow(this);	//After .pack() to get getWidth() getHeigth()
		this.addComponentListener( new ChildWindowListener(this) );
		
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MainWindow();
	}

}
