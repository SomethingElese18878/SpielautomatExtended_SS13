import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;


public class MyToolbar extends JToolBar{
	
	JButton btnPlayerNameOK;
	JTextField tfPlayerName;
	
	Playfield playfield;
	ListenerMyToolbar listenerMyToolbar;
	
	public MyToolbar(Playfield _playfield){
		this.playfield = _playfield;
		
		this.listenerMyToolbar = new ListenerMyToolbar(this);
		this.tfPlayerName = new JTextField("Player1");
		
		this.btnPlayerNameOK = new JButton("OK");
		this.btnPlayerNameOK.addActionListener(listenerMyToolbar);
		
		this.setSize(200, 20);
		
		this.add(new JButton("bier"));
		this.add(this.tfPlayerName);
		this.add(this.btnPlayerNameOK);
	}

}
