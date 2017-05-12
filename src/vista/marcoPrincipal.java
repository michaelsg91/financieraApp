package vista;
import java.awt.*;
import javax.swing.*;
import controlador.*;

public class marcoPrincipal extends JFrame{
	public jpanelMenu jpMenu;
	public jpanelConvertir jpConvertir;
	
	//--- Controlador -------
	private botonesConvertir bConvertir;
	
	public marcoPrincipal(){
		jpMenu=new jpanelMenu();
		jpConvertir=new jpanelConvertir();
		
		//--- Controlador -----
		bConvertir=new botonesConvertir(this);
		
		setTitle("MP Parking");
		setResizable(false);
		
		add(jpMenu,BorderLayout.WEST);
		pack();
		add(jpConvertir,BorderLayout.CENTER);
		pack();

		setLocationRelativeTo(null);
		
		
		jpConvertir.bi.addActionListener(bConvertir);
		jpConvertir.bia.addActionListener(bConvertir);
		jpConvertir.bja.addActionListener(bConvertir);
		jpConvertir.bj.addActionListener(bConvertir);
	}
}
