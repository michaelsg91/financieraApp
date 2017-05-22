package controlador;
import java.awt.event.*;

import javax.swing.JOptionPane;

import vista.*;
public class botonesConvertir implements ActionListener{
	marcoPrincipal mp;
	private double tasa,m1,m2,res;
	private String per1,per2;
	public botonesConvertir(marcoPrincipal mp){
		this.mp=mp;
	}
	
	public void actionPerformed(ActionEvent e){
		if(!mp.jpConvertir.ctasa.getText().isEmpty()){
			tasa=Double.parseDouble(mp.jpConvertir.ctasa.getText())/100;
			per1=mp.jpConvertir.per.getSelectedItem().toString();
			per2=mp.jpConvertir.cper.getSelectedItem().toString();
			
			if(per1.equals("Mensual")){
				m1=12;
			}
			if(per1.equals("Bimestral")){
				m1=6;
			}
			if(per1.equals("Trimestral")){
				m1=4;
			}
			if(per1.equals("Semestral")){
				m1=2;
			}
			if(per1.equals("Anual")){
				m1=1;
			}
			
			if(per2.equals("Mensual")){
				m2=12;
			}
			if(per2.equals("Bimestral")){
				m2=6;
			}
			if(per2.equals("Trimestral")){
				m2=4;
			}
			if(per2.equals("Semestral")){
				m2=2;
			}
			if(per2.equals("Anual")){
				m2=1;
			}

			if(mp.jpConvertir.en.getSelectedItem().toString().equals("Efectiva") && mp.jpConvertir.va.getSelectedItem().toString().equals("Vencida")){
				
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Efectiva") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Vencida")){
					res=(Math.pow((1+tasa), (m1/m2)))-1;
					mp.jpConvertir.cajaRes.setText(""+res);
				}
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Efectiva") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Anticipada")){
					res=(Math.pow((1+tasa), (m1/m2)))-1;
					res=res/(1+res);
					mp.jpConvertir.cajaRes.setText(""+res);
				}
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Nominal") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Vencida")){
					res=(Math.pow((1+tasa), (m1/m2)))-1;
					res=res*m2;
					mp.jpConvertir.cajaRes.setText(""+res);
				}
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Nominal") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Anticipada")){
					res=(Math.pow((1+tasa), (m1/m2)))-1;
					res=res/(1+res);
					res=res*m2;
					mp.jpConvertir.cajaRes.setText(""+res);
				}
				
			}
			
			if(mp.jpConvertir.en.getSelectedItem().toString().equals("Efectiva") && mp.jpConvertir.va.getSelectedItem().toString().equals("Anticipada")){
				
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Efectiva") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Vencida")){
					res=tasa/(1-tasa);
					res=(Math.pow((1+res), (m1/m2)))-1;
					mp.jpConvertir.cajaRes.setText(""+res);
				}
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Efectiva") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Anticipada")){
					res=tasa/(1-tasa);
					res=(Math.pow((1+res), (m1/m2)))-1;
					res=res/(1+res);
					mp.jpConvertir.cajaRes.setText(""+res);					
				}
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Nominal") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Vencida")){
					res=tasa/(1-tasa);
					res=(Math.pow((1+res), (m1/m2)))-1;
					res=res*m2;
					mp.jpConvertir.cajaRes.setText(""+res);					
				}
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Nominal") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Anticipada")){
					res=tasa/(1-tasa);
					res=(Math.pow((1+res), (m1/m2)))-1;
					res=res/(1+res);
					res=res*m2;
					mp.jpConvertir.cajaRes.setText(""+res);					
				}
				
			}
			
			if(mp.jpConvertir.en.getSelectedItem().toString().equals("Nominal") && mp.jpConvertir.va.getSelectedItem().toString().equals("Vencida")){
				
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Efectiva") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Vencida")){
					res=tasa/m1;
					res=(Math.pow((1+res), (m1/m2)))-1;
					mp.jpConvertir.cajaRes.setText(""+res);
				}
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Efectiva") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Anticipada")){
					res=tasa/m1;
					res=(Math.pow((1+res), (m1/m2)))-1;
					res=res/(1+res);
					mp.jpConvertir.cajaRes.setText(""+res);					
				}
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Nominal") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Vencida")){
					res=tasa/m1;
					res=(Math.pow((1+res), (m1/m2)))-1;
					res=res*m2;
					mp.jpConvertir.cajaRes.setText(""+res);					
				}
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Nominal") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Anticipada")){
					res=tasa/m1;
					res=(Math.pow((1+res), (m1/m2)))-1;
					res=res/(1+res);
					res=res*m2;
					mp.jpConvertir.cajaRes.setText(""+res);					
				}				
			}
			
			if(mp.jpConvertir.en.getSelectedItem().toString().equals("Nominal") && mp.jpConvertir.va.getSelectedItem().toString().equals("Anticipada")){
				
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Efectiva") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Vencida")){
					res=tasa/m1;
					res=res/(1-res);
					res=(Math.pow((1+res), (m1/m2)))-1;
					mp.jpConvertir.cajaRes.setText(""+res);
				}
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Efectiva") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Anticipada")){
					res=tasa/m1;
					res=res/(1-res);
					res=(Math.pow((1+res), (m1/m2)))-1;
					res=res/(1+res);
					mp.jpConvertir.cajaRes.setText(""+res);					
				}
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Nominal") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Vencida")){
					res=tasa/m1;
					res=res/(1-res);
					res=(Math.pow((1+res), (m1/m2)))-1;
					res=res*m2;
					mp.jpConvertir.cajaRes.setText(""+res);					
				}
				if(mp.jpConvertir.cen.getSelectedItem().toString().equals("Nominal") && mp.jpConvertir.cva.getSelectedItem().toString().equals("Anticipada")){
					res=tasa/m1;
					res=res/(1-res);
					res=(Math.pow((1+res), (m1/m2)))-1;
					res=res/(1+res);
					res=res*m2;
					mp.jpConvertir.cajaRes.setText(""+res);					
				}				
			}
		}else{
			JOptionPane.showMessageDialog(null, "Ingrese un valor");
		}
		
	}
}
