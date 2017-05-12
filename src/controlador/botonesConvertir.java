package controlador;
import java.awt.event.*;
import vista.*;
public class botonesConvertir implements ActionListener{
	marcoPrincipal mp;
	private double ia,ja,m1,i,m2,j;
	public botonesConvertir(marcoPrincipal mp){
		this.mp=mp;
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(mp.jpConvertir.bi)){
			if(!mp.jpConvertir.cia.getText().isEmpty()){
				ia=Double.parseDouble(mp.jpConvertir.cia.getText());
				i=ia/(1-ia);
				mp.jpConvertir.ri.setText("i = "+i);
			}
			if(!mp.jpConvertir.cj.getText().isEmpty() && !mp.jpConvertir.cm1.getText().isEmpty()){
				j=Double.parseDouble(mp.jpConvertir.cj.getText());
				m1=Double.parseDouble(mp.jpConvertir.cm1.getText());
				i=j/m1;
				mp.jpConvertir.ri.setText("i = "+i);
			}
			if(!mp.jpConvertir.ci.getText().isEmpty() && !mp.jpConvertir.cm1.getText().isEmpty() && !mp.jpConvertir.cm2.getText().isEmpty()){
				i=Double.parseDouble(mp.jpConvertir.ci.getText());
				m1=Double.parseDouble(mp.jpConvertir.cm1.getText());
				m2=Double.parseDouble(mp.jpConvertir.cm2.getText());
				
				i=(Math.pow((1+i), (m1/m2)))-1;
				mp.jpConvertir.ri.setText("i = "+i);
			}
			
			
		}
		if(e.getSource().equals(mp.jpConvertir.bia)){
			
		}
		if(e.getSource().equals(mp.jpConvertir.bj)){
			
		}
		if(e.getSource().equals(mp.jpConvertir.bja)){
			
		}
	}
}
