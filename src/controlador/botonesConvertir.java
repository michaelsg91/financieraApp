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
		}
		if(e.getSource().equals(mp.jpConvertir.bi2)){
			if(!mp.jpConvertir.cj.getText().isEmpty() && !mp.jpConvertir.cm1.getText().isEmpty()){
				j=Double.parseDouble(mp.jpConvertir.cj.getText());
				m1=Double.parseDouble(mp.jpConvertir.cm1.getText());
				i=j/m1;
				mp.jpConvertir.ri.setText("i = "+i);
			}
		}
			if(e.getSource().equals(mp.jpConvertir.bi3)){	
			if(!mp.jpConvertir.ci.getText().isEmpty() && !mp.jpConvertir.cm1.getText().isEmpty() && !mp.jpConvertir.cm2.getText().isEmpty()){
				i=Double.parseDouble(mp.jpConvertir.ci.getText());
				m1=Double.parseDouble(mp.jpConvertir.cm1.getText());
				m2=Double.parseDouble(mp.jpConvertir.cm2.getText());
				
				i=(Math.pow((1+i), (m1/m2)))-1;
				mp.jpConvertir.ri.setText("i = "+i);
			}
			
			
		}
		if(e.getSource().equals(mp.jpConvertir.bia)){
			if(!mp.jpConvertir.cja.getText().isEmpty() && !mp.jpConvertir.cm1.getText().isEmpty()){
				ja=Double.parseDouble(mp.jpConvertir.cja.getText());
				m1=Double.parseDouble(mp.jpConvertir.cm1.getText());
				ia=ja/m1;
				mp.jpConvertir.ria.setText("ia = "+ia);
			}
		}
		if(e.getSource().equals(mp.jpConvertir.bia2)){
			if(!mp.jpConvertir.ci.getText().isEmpty()){
				i=Double.parseDouble(mp.jpConvertir.ci.getText());
				ia=i/(1+i);
				mp.jpConvertir.ria.setText("ia = "+ia);
			}
		}
		if(e.getSource().equals(mp.jpConvertir.bj)){
			if(!mp.jpConvertir.ci.getText().isEmpty() && !mp.jpConvertir.cm1.getText().isEmpty()){
				i=Double.parseDouble(mp.jpConvertir.ci.getText());
				m1=Double.parseDouble(mp.jpConvertir.cm1.getText());
				j=i*m1;
				mp.jpConvertir.rj.setText("j = "+j);
			}
		}
		if(e.getSource().equals(mp.jpConvertir.bja)){
			if(!mp.jpConvertir.cia.getText().isEmpty() && !mp.jpConvertir.cm1.getText().isEmpty()){
				ia=Double.parseDouble(mp.jpConvertir.cia.getText());
				m1=Double.parseDouble(mp.jpConvertir.cm1.getText());
				ja=ia*m1;
				mp.jpConvertir.rja.setText("ja = "+ja);
			}
		}
	}
}
