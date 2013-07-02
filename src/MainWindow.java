import javax.swing.JFrame;


public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	Playfield playfield;
	MyMenuBar myMenuBar;
	
	public MainWindow(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Spielautomat");
//		this.setLocation(200, 300);
		
		this.playfield = new Playfield();
		this.myMenuBar = new MyMenuBar(this.playfield);
		
		this.setJMenuBar(this.myMenuBar);

		this.add(this.playfield);
		this.pack();
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MainWindow();
	}

}
