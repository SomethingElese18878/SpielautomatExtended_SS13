import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;


public class ChildWindowListener implements ComponentListener{
	
	MainWindow mainWindow;
	
	public ChildWindowListener(MainWindow _mainWindow) {
		this.mainWindow = _mainWindow;
	}

	@Override
	public void componentHidden(ComponentEvent e){
	
	}

	public void componentMoved(ComponentEvent e) {
		this.mainWindow.statusWindow.setLocation(mainWindow.getLocation().x + mainWindow.getWidth() + 10, mainWindow.getLocation().y );
	
	}

	@Override
	public void componentResized(ComponentEvent e) {
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		
	}


}
