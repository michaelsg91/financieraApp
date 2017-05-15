package vista;
import java.awt.*;
import javax.swing.*;
import controlador.*;

public class marcoPrincipal extends JFrame{
	public jpanelMenu jpMenu;
	public jpanelConvertir jpConvertir;
	public jpanelAriVp jpAriVp;
	
	//--- Controlador -------
	private botonesConvertir bConvertir;
	private botonesMenu bMenu;
	private botonesAriVp bAriVp;
	
	public marcoPrincipal(){
		jpMenu=new jpanelMenu();
		jpConvertir=new jpanelConvertir();
		jpAriVp=new jpanelAriVp();
		
		//--- Controlador -----
		bConvertir=new botonesConvertir(this);
		bMenu=new botonesMenu(this);
		bAriVp=new botonesAriVp(this);
		
		setTitle("MP Parking");
		setResizable(false);
		
		add(jpMenu,BorderLayout.WEST);
		pack();
		add(jpConvertir,BorderLayout.CENTER);
		pack();
		add(jpAriVp,BorderLayout.CENTER);
		pack();

		setLocationRelativeTo(null);
		
		jpConvertir.setVisible(false);
		jpAriVp.setVisible(false);
		
		
		
		//--- Events ------------------------------
		jpMenu.convertir.addActionListener(bMenu);
		jpMenu.ariVp.addActionListener(bMenu);
		
		
		
		jpConvertir.bi.addActionListener(bConvertir);
		jpConvertir.bi2.addActionListener(bConvertir);
		jpConvertir.bi3.addActionListener(bConvertir);
		jpConvertir.bia.addActionListener(bConvertir);
		jpConvertir.bia2.addActionListener(bConvertir);
		jpConvertir.bja.addActionListener(bConvertir);
		jpConvertir.bj.addActionListener(bConvertir);
		
		jpAriVp.bg.addActionListener(bAriVp);
		jpAriVp.bi.addActionListener(bAriVp);
		jpAriVp.bn.addActionListener(bAriVp);
	}
}
