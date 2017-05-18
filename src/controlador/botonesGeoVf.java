package controlador;
import java.awt.event.*;
import java.text.DecimalFormat;

import vista.*;

public class botonesGeoVf implements ActionListener{
	marcoPrincipal mp;
	private double vf,a,i,n,g,lim1,lim2,ecu,inter,icom;
	private boolean b;
	private DecimalFormat decimal;
	public botonesGeoVf(marcoPrincipal mp){
		this.mp=mp;
		decimal=new DecimalFormat("0.0000000000000");
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(mp.jpGeoVf.bg)){
			vf=Double.parseDouble(mp.jpGeoVf.cvf.getText());
			a=Double.parseDouble(mp.jpGeoVf.ca.getText());
			i=Double.parseDouble(mp.jpGeoVf.ci.getText());
			n=Double.parseDouble(mp.jpGeoVf.cn.getText());
			lim1=Double.parseDouble(mp.jpGeoVf.clim1.getText());
			lim2=Double.parseDouble(mp.jpGeoVf.clim2.getText());
			
			for(g=lim1;g<lim2;g+=0.0001){
				
				inter=((a*(Math.pow((1+g), n)-Math.pow((1+i), n)))/(g-i))-vf;
				System.out.println(decimal.format(inter)+ "    "+ g);
				if(Math.abs(inter)<1){
					icom=g;
					break;
				}				
			}
			
			mp.jpGeoVf.res.setText("G=" + icom);
			
		}
		if(e.getSource().equals(mp.jpGeoVf.bi)){
			
			vf=Double.parseDouble(mp.jpGeoVf.cvf.getText());
			a=Double.parseDouble(mp.jpGeoVf.ca.getText());
			g=Double.parseDouble(mp.jpGeoVf.cg.getText());
			n=Double.parseDouble(mp.jpGeoVf.cn.getText());
			lim1=Double.parseDouble(mp.jpGeoVf.clim1.getText());
			lim2=Double.parseDouble(mp.jpGeoVf.clim2.getText());
			
			
			
			for(i=lim1;i<lim2;i+=0.0001){
				inter=((a*(Math.pow((1+g), n)-Math.pow((1+i), n)))/(g-i))-vf;
				System.out.println(decimal.format(inter)+ "    "+ i);
				if(Math.abs(inter)<1){
					icom=i;
					break;
				}				
			}
			
			mp.jpGeoVf.res.setText("i=" + decimal.format(icom));		
						
		}
		
		if(e.getSource().equals(mp.jpGeoVf.bn)){
			
			vf=Double.parseDouble(mp.jpGeoVf.cvf.getText());
			a=Double.parseDouble(mp.jpGeoVf.ca.getText());
			g=Double.parseDouble(mp.jpGeoVf.cg.getText());
			i=Double.parseDouble(mp.jpGeoVf.ci.getText());
			lim1=Double.parseDouble(mp.jpGeoVf.clim1.getText());
			lim2=Double.parseDouble(mp.jpGeoVf.clim2.getText());
			
			
			
			for(n=lim1;n<lim2;n++){
				inter=((a*(Math.pow((1+g), n)-Math.pow((1+i), n)))/(g-i))-vf;
				System.out.println(decimal.format(inter)+ "    "+ n);
				if(Math.abs(inter)<1){
					icom=n;
					break;
				}				
			}
			
			mp.jpGeoVf.res.setText("n=" + decimal.format(icom));		
						
		}
	}
	
}
