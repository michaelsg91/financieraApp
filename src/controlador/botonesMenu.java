package controlador;
import vista.*;
import java.awt.event.*;

public class botonesMenu implements ActionListener{
	marcoPrincipal mp;
	public botonesMenu(marcoPrincipal mp){
		this.mp=mp;
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(mp.jpMenu.convertir)){
			mp.jpConvertir.setVisible(true);
			mp.jpAriVp.setVisible(false);
			mp.jpAriVf.setVisible(false);
			mp.jpGeoVp.setVisible(false);
			mp.jpGeoVf.setVisible(false);
		}
		if(e.getSource().equals(mp.jpMenu.ariVp)){
			mp.jpConvertir.setVisible(false);
			mp.jpAriVp.setVisible(true);
			mp.jpAriVf.setVisible(false);
			mp.jpGeoVp.setVisible(false);
			mp.jpGeoVf.setVisible(false);
		}
		if(e.getSource().equals(mp.jpMenu.ariVf)){
			mp.jpConvertir.setVisible(false);
			mp.jpAriVp.setVisible(false);
			mp.jpAriVf.setVisible(true);
			mp.jpGeoVp.setVisible(false);
			mp.jpGeoVf.setVisible(false);
		}
		if(e.getSource().equals(mp.jpMenu.geoVp)){
			mp.jpConvertir.setVisible(false);
			mp.jpAriVp.setVisible(false);
			mp.jpAriVf.setVisible(false);			
			mp.jpGeoVp.setVisible(true);
			mp.jpGeoVf.setVisible(false);
		}
		if(e.getSource().equals(mp.jpMenu.geoVf)){
			mp.jpConvertir.setVisible(false);
			mp.jpAriVp.setVisible(false);
			mp.jpAriVf.setVisible(false);			
			mp.jpGeoVp.setVisible(false);
			mp.jpGeoVf.setVisible(true);
		}
	}
}
