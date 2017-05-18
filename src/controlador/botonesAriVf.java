package controlador;
import java.awt.event.*;
import java.text.DecimalFormat;

import vista.*;

public class botonesAriVf implements ActionListener{
	marcoPrincipal mp;
	private double vf,a,i,n,g,lim1,lim2,ecu,inter,icom;
	private boolean b;
	private DecimalFormat decimal;
	public botonesAriVf(marcoPrincipal mp){
		this.mp=mp;
		decimal=new DecimalFormat("0.0000000000000");
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(mp.jpAriVf.bg)){
			vf=Double.parseDouble(mp.jpAriVf.cvf.getText());
			a=Double.parseDouble(mp.jpAriVf.ca.getText());
			i=Double.parseDouble(mp.jpAriVf.ci.getText());
			n=Double.parseDouble(mp.jpAriVf.cn.getText());
			
			ecu=(Math.pow((1+i), n)-1)/i;
			
			g=((vf-(a*ecu))*i)/(ecu-n);
			
			mp.jpAriVf.res.setText("G=" + g);
			
		}
		if(e.getSource().equals(mp.jpAriVf.bi)){
			
			vf=Double.parseDouble(mp.jpAriVf.cvf.getText());
			a=Double.parseDouble(mp.jpAriVf.ca.getText());
			g=Double.parseDouble(mp.jpAriVf.cg.getText());
			n=Double.parseDouble(mp.jpAriVf.cn.getText());
			lim1=Double.parseDouble(mp.jpAriVf.clim1.getText());
			lim2=Double.parseDouble(mp.jpAriVf.clim2.getText());
			
			
			
			for(i=lim1;i<lim2;i+=0.0001){
				ecu=(Math.pow((1+i), n)-1)/i;
				
				inter=((a*ecu)+((g/i)*(ecu-n)))-vf;
				System.out.println(decimal.format(inter));
				if(Math.abs(inter)<1){
					icom=i;
					break;
				}				
			}
			
			mp.jpAriVf.res.setText("i=" + decimal.format(icom));		
						
		}
		
		if(e.getSource().equals(mp.jpAriVf.bn)){
			
			vf=Double.parseDouble(mp.jpAriVf.cvf.getText());
			a=Double.parseDouble(mp.jpAriVf.ca.getText());
			g=Double.parseDouble(mp.jpAriVf.cg.getText());
			i=Double.parseDouble(mp.jpAriVf.ci.getText());
			lim1=Double.parseDouble(mp.jpAriVf.clim1.getText());
			lim2=Double.parseDouble(mp.jpAriVf.clim2.getText());
			
			
			
			for(n=lim1;n<lim2;n++){
				ecu=(Math.pow((1+i), n)-1)/i;
				
				inter=((a*ecu)+((g/i)*(ecu-n)))-vf;
				System.out.println(decimal.format(inter));
				if(Math.abs(inter)<1){
					icom=n;
					break;
				}				
			}
			
			mp.jpAriVf.res.setText("n=" + decimal.format(icom));		
						
		}
	}
	
}
