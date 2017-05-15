package controlador;
import java.awt.event.*;
import java.text.DecimalFormat;

import vista.*;

public class botonesAriVp implements ActionListener{
	marcoPrincipal mp;
	private double vp,a,i,n,g,lim1,lim2,ecu,inter,icom;
	private boolean b;
	private DecimalFormat decimal;
	public botonesAriVp(marcoPrincipal mp){
		this.mp=mp;
		decimal=new DecimalFormat("0.0000000000000");
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(mp.jpAriVp.bg)){
			vp=Double.parseDouble(mp.jpAriVp.cvp.getText());
			a=Double.parseDouble(mp.jpAriVp.ca.getText());
			i=Double.parseDouble(mp.jpAriVp.ci.getText());
			n=Double.parseDouble(mp.jpAriVp.cn.getText());
			
			ecu=(1-Math.pow((1+i), -n))/i;
			
			g=((vp-(a*ecu))*i)/(ecu-(n*Math.pow((1+i), -n)));
			
			mp.jpAriVp.res.setText("G=" + g);
			
		}
		if(e.getSource().equals(mp.jpAriVp.bi)){
			
			vp=Double.parseDouble(mp.jpAriVp.cvp.getText());
			a=Double.parseDouble(mp.jpAriVp.ca.getText());
			g=Double.parseDouble(mp.jpAriVp.cg.getText());
			n=Double.parseDouble(mp.jpAriVp.cn.getText());
			lim1=Double.parseDouble(mp.jpAriVp.clim1.getText());
			lim2=Double.parseDouble(mp.jpAriVp.clim2.getText());
			
			
			
			for(i=lim1;i<lim2;i+=0.0001){
				ecu=(1-Math.pow((1+i), -n))/i;
				
				inter=((a*ecu)+((g/i)*(ecu-n*Math.pow((1+i), -n))))-vp;
				System.out.println(decimal.format(inter));
				if(Math.abs(inter)<1){
					icom=i;
					break;
				}				
			}
			
			mp.jpAriVp.res.setText("i=" + decimal.format(icom));
			
						
		}
	}
	
}
