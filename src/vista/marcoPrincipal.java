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
	private validacionCajas vCajas;
	
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
		vCajas=new validacionCajas(this);
		
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
		jpMenu.geoVf.addActionListener(bMenu);
		
		
		
		jpConvertir.sol.addActionListener(bConvertir);
		
		
		jpAriVp.bg.addActionListener(bAriVp);
		jpAriVp.bi.addActionListener(bAriVp);
		jpAriVp.bn.addActionListener(bAriVp);
		
		jpAriVf.bg.addActionListener(bAriVf);
		jpAriVf.bi.addActionListener(bAriVf);
		jpAriVf.bn.addActionListener(bAriVf);
		
		jpGeoVp.bg.addActionListener(bGeoVp);
		jpGeoVp.bi.addActionListener(bGeoVp);
		jpGeoVp.bn.addActionListener(bGeoVp);
		
		jpGeoVf.bg.addActionListener(bGeoVp);
		jpGeoVf.bi.addActionListener(bGeoVp);
		jpGeoVf.bn.addActionListener(bGeoVp);
		
		jpAriVf.ci.addKeyListener(vCajas);
		jpAriVf.ca.addKeyListener(vCajas);
		jpAriVf.cvf.addKeyListener(vCajas);
		jpAriVf.cg.addKeyListener(vCajas);
		jpAriVf.cn.addKeyListener(vCajas);
		jpAriVf.clim1.addKeyListener(vCajas);
		jpAriVf.clim2.addKeyListener(vCajas);
		
		jpAriVp.ci.addKeyListener(vCajas);
		jpAriVp.ca.addKeyListener(vCajas);
		jpAriVp.cvp.addKeyListener(vCajas);
		jpAriVp.cg.addKeyListener(vCajas);
		jpAriVp.cn.addKeyListener(vCajas);
		jpAriVp.clim1.addKeyListener(vCajas);
		jpAriVp.clim2.addKeyListener(vCajas);
		
		jpGeoVf.ci.addKeyListener(vCajas);
		jpGeoVf.ca.addKeyListener(vCajas);
		jpGeoVf.cvf.addKeyListener(vCajas);
		jpGeoVf.cg.addKeyListener(vCajas);
		jpGeoVf.cn.addKeyListener(vCajas);
		jpGeoVf.clim1.addKeyListener(vCajas);
		jpGeoVf.clim2.addKeyListener(vCajas);
		
		jpGeoVp.ci.addKeyListener(vCajas);
		jpGeoVp.ca.addKeyListener(vCajas);
		jpGeoVp.cvp.addKeyListener(vCajas);
		jpGeoVp.cg.addKeyListener(vCajas);
		jpGeoVp.cn.addKeyListener(vCajas);
		jpGeoVp.clim1.addKeyListener(vCajas);
		jpGeoVp.clim2.addKeyListener(vCajas);
		
		
		jpConvertir.cajaRes.addKeyListener(vCajas);
		jpConvertir.cajaResPor.addKeyListener(vCajas);
		jpConvertir.ctasa.addKeyListener(vCajas);
		
	}
}
