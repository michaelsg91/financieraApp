package controlador;
import java.awt.event.*;
import java.text.DecimalFormat;

import vista.*;

public class botonesGeoVp implements ActionListener{
	marcoPrincipal mp;
	private double vp,a,i,n,g,lim1,lim2,ecu,inter,icom;
	private boolean b;
	private DecimalFormat decimal;
	public botonesGeoVp(marcoPrincipal mp){
		this.mp=mp;
		decimal=new DecimalFormat("0.0000000000000");
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(mp.jpGeoVp.bg)){
			vp=Double.parseDouble(mp.jpGeoVp.cvp.getText());
			a=Double.parseDouble(mp.jpGeoVp.ca.getText());
			i=Double.parseDouble(mp.jpGeoVp.ci.getText());
			n=Double.parseDouble(mp.jpGeoVp.cn.getText());
			lim1=Double.parseDouble(mp.jpGeoVp.clim1.getText());
			lim2=Double.parseDouble(mp.jpGeoVp.clim2.getText());
			
			for(g=lim1;g<lim2;g+=0.0001){
				
				inter=((a*(Math.pow((1+g), n)*Math.pow((1+i), -n)-1))/(g-i))-vp;
				System.out.println(decimal.format(inter)+ "    "+ g);
				if(Math.abs(inter)<1){
					icom=g;
					break;
				}				
			}
			
			mp.jpGeoVp.res.setText("G=" + icom);
			
		}
		if(e.getSource().equals(mp.jpGeoVp.bi)){
			
			vp=Double.parseDouble(mp.jpGeoVp.cvp.getText());
			a=Double.parseDouble(mp.jpGeoVp.ca.getText());
			g=Double.parseDouble(mp.jpGeoVp.cg.getText());
			n=Double.parseDouble(mp.jpGeoVp.cn.getText());
			lim1=Double.parseDouble(mp.jpGeoVp.clim1.getText());
			lim2=Double.parseDouble(mp.jpGeoVp.clim2.getText());
			
			
			
			for(i=lim1;i<lim2;i+=0.0001){
				inter=((a*(Math.pow((1+g), n)*Math.pow((1+i), -n)-1))/(g-i))-vp;
				System.out.println(decimal.format(inter)+ "    "+ i);
				if(Math.abs(inter)<1){
					icom=i;
					break;
				}				
			}
			
			mp.jpGeoVp.res.setText("i=" + decimal.format(icom));		
						
		}
		
		if(e.getSource().equals(mp.jpGeoVp.bn)){
			
			vp=Double.parseDouble(mp.jpGeoVp.cvp.getText());
			a=Double.parseDouble(mp.jpGeoVp.ca.getText());
			g=Double.parseDouble(mp.jpGeoVp.cg.getText());
			i=Double.parseDouble(mp.jpGeoVp.ci.getText());
			lim1=Double.parseDouble(mp.jpGeoVp.clim1.getText());
			lim2=Double.parseDouble(mp.jpGeoVp.clim2.getText());
			
			
			
			for(n=lim1;n<lim2;n++){
				inter=((a*(Math.pow((1+g), n)*Math.pow((1+i), -n)-1))/(g-i))-vp;
				System.out.println(decimal.format(inter)+ "    "+ n);
				if(Math.abs(inter)<1){
					icom=n;
					break;
				}				
			}
			
			mp.jpGeoVp.res.setText("n=" + decimal.format(icom));		
						
		}
	}
	
}
