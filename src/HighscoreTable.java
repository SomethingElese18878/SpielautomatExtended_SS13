import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class HighscoreTable extends JFrame {
	
	JFrame highscoreFenster;
	Playfield playfield;
	
	boolean visibility = false;
	
	public HighscoreTable(Playfield _playfield){
		this.playfield = _playfield;
		
		String[][] rowData = {
			    { "Japan", "245" }
		};
		String[] columnNames = {
        "Player", "MaxCredits"
		};

	  JTable table = new JTable( rowData, columnNames );
	  
	  this.add( new JScrollPane(table));
	  
	  this.pack();
	  this.setVisible(this.visibility);		
	}
	
	public void toggleVisibilityHighscore(){
		this.visibility = !this.visibility;
		System.out.println("Change Visibility Highscore: " + this.visibility);
		this.setVisible(this.visibility);
	}

}
