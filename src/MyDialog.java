import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.spielautomat;


public class MyDialog extends JDialog{
	
	MainWindow mainWindow;
	JDialog mdDialog;
	
	JPanel panelBtnEinsatz;
	JPanel panelBtnStartguthaben;
	JPanel panelDialog;
	
	JLabel lblStartguthaben;
	JLabel lblEinsatz;
	JLabel lblwhatChanged;
	
	JTextField tfStartguthaben;
	JTextField tfEinsatz;
	
	JButton btnStartguthabenOK;
	JButton btnStartguthabenDefault;
	JButton btnEinsatzOK;
	JButton btnEinsatzDefault;
	JButton btnBack;
	
	ListenerMyDialog listenerMyDialog;
	boolean mdDialogIsVisible = false;
	
	public MyDialog(MainWindow _mainWindow){
		this.mainWindow = _mainWindow;
		
		this.listenerMyDialog = new ListenerMyDialog(this);
		
		this.panelBtnEinsatz = new JPanel();
		this.panelBtnStartguthaben = new JPanel();
		
		this.mdDialog = new JDialog(this.mainWindow, "Change StartConditions");
		
		//CREATE dialog elements
		this.lblEinsatz = new JLabel("Einsatz");
		this.lblStartguthaben = new JLabel("Startguthaben");
		this.lblwhatChanged = new JLabel();
		this.lblwhatChanged.setFont( new Font("Arial", Font.BOLD ,12));
		this.lblwhatChanged.setForeground( new Color(0, 255, 0) );
		
		this.tfStartguthaben = new JTextField(Integer.toString(spielautomat.STARTGUTHABEN));
		this.tfEinsatz = new JTextField(Integer.toString(spielautomat.STARTEINSATZ));
		
		this.btnEinsatzOK = new JButton("OK");
		this.btnEinsatzOK.setActionCommand("EinsatzOK");
		this.btnEinsatzOK.addActionListener(this.listenerMyDialog);
		this.btnEinsatzDefault = new JButton("Standard");
		this.btnEinsatzDefault.setActionCommand("EinsatzDefault");
		this.btnEinsatzDefault.addActionListener(this.listenerMyDialog);
		
		this.btnStartguthabenOK = new JButton("OK");
		this.btnStartguthabenOK.setActionCommand("GuthabenOK");
		this.btnStartguthabenDefault = new JButton("Standard");
		this.btnStartguthabenDefault.setActionCommand("GuthabenStandard");
		
		this.btnBack = new JButton("Back");
		this.btnBack.addActionListener(this.listenerMyDialog);
		
		//Add to panels
		this.panelBtnStartguthaben.setLayout(new GridLayout(1, 2));
		this.panelBtnStartguthaben.add(this.btnStartguthabenDefault);
		this.panelBtnStartguthaben.add(this.btnStartguthabenOK);
		
		this.panelBtnEinsatz.setLayout(new GridLayout(1, 2));
		this.panelBtnEinsatz.add(this.btnEinsatzDefault);
		this.panelBtnEinsatz.add(this.btnEinsatzOK);
		
		//Add to Dialog
		this.mdDialog.setLayout(new GridLayout(8, 1));
		this.mdDialog.add(this.lblwhatChanged);
		this.mdDialog.add(this.lblEinsatz);
		this.mdDialog.add(this.tfEinsatz);
		this.mdDialog.add(panelBtnEinsatz);
		this.mdDialog.add(this.lblStartguthaben);
		this.mdDialog.add(this.tfStartguthaben);
		this.mdDialog.add(this.panelBtnStartguthaben);
		this.mdDialog.add(this.btnBack);
		
		this.mdDialog.pack();
		this.mdDialog.setVisible(this.mdDialogIsVisible);		
	}
	
	public void showMyDialog(){
		this.mdDialogIsVisible = !this.mdDialogIsVisible;
		this.mdDialog.setVisible(this.mdDialogIsVisible);
	}

}
