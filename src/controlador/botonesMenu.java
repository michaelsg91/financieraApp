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
		}
		if(e.getSource().equals(mp.jpMenu.ariVp)){
			mp.jpConvertir.setVisible(false);
			mp.jpAriVp.setVisible(true);
		}
		if(e.getSource().equals(mp.jpMenu.ariVf)){
					
				}
		if(e.getSource().equals(mp.jpMenu.geoVp)){
			
		}
		if(e.getSource().equals(mp.jpMenu.geoVf)){
			
		}
	}
}
