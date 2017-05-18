package vista;
import java.awt.*;
import javax.swing.*;
import controlador.*;

public class marcoPrincipal extends JFrame{
	public jpanelMenu jpMenu;
	public jpanelConvertir jpConvertir;
	public jpanelAriVp jpAriVp;
	public jpanelAriVf jpAriVf;
	public jpanelGeoVp jpGeoVp;
	public jpanelGeoVf jpGeoVf;
	
	//--- Controlador -------
	private botonesConvertir bConvertir;
	private botonesMenu bMenu;
	private botonesAriVp bAriVp;
	private botonesAriVf bAriVf;
	private botonesGeoVp bGeoVp;
	private botonesGeoVf bGeoVf;
	
	public marcoPrincipal(){
		jpMenu=new jpanelMenu();
		jpConvertir=new jpanelConvertir();
		jpAriVp=new jpanelAriVp();
		jpAriVf=new jpanelAriVf();
		jpGeoVp=new jpanelGeoVp();
		jpGeoVf=new jpanelGeoVf();
		
		//--- Controlador -----
		bConvertir=new botonesConvertir(this);
		bMenu=new botonesMenu(this);
		bAriVp=new botonesAriVp(this);
		bAriVf=new botonesAriVf(this);
		bGeoVp=new botonesGeoVp(this);
		
		setTitle("Financiera App");
		setResizable(false);
		
		add(jpMenu,BorderLayout.WEST);
		pack();
		add(jpConvertir,BorderLayout.CENTER);
		pack();
		add(jpAriVp,BorderLayout.CENTER);
		pack();
		add(jpAriVf,BorderLayout.CENTER);
		pack();
		add(jpGeoVp,BorderLayout.CENTER);
		pack();
		add(jpGeoVf,BorderLayout.CENTER);
		pack();

		setLocationRelativeTo(null);
		
		jpConvertir.setVisible(false);
		jpAriVp.setVisible(false);
		jpAriVf.setVisible(false);
		jpGeoVp.setVisible(false);
		jpGeoVf.setVisible(false);
		
		
		
		//--- Events ------------------------------
		jpMenu.convertir.addActionListener(bMenu);
		jpMenu.ariVp.addActionListener(bMenu);
		jpMenu.ariVf.addActionListener(bMenu);
		jpMenu.geoVp.addActionListener(bMenu);
		
		
		
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
		
		jpAriVf.bg.addActionListener(bAriVf);
		jpAriVf.bi.addActionListener(bAriVf);
		jpAriVf.bn.addActionListener(bAriVf);
		
		jpGeoVp.bg.addActionListener(bGeoVp);
		jpGeoVp.bi.addActionListener(bGeoVp);
		jpGeoVp.bn.addActionListener(bGeoVp);
		
	}
}
