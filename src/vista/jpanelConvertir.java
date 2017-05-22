package vista;

import java.awt.Dimension;
import javax.swing.*;

public class jpanelConvertir extends JPanel{
	private JLabel tasa,convertir,res;
	public JTextField ctasa,cajaRes;
	public JComboBox en,va,per,cen,cva,cper;
	public JButton sol;
	public jpanelConvertir(){
		//--- Panel properties --------------------
		setPreferredSize(new Dimension(600,360));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Convertir"));
		
		tasa=new JLabel("Tasa(%)");
		convertir=new JLabel("Convertir");
		res=new JLabel("Resultado");
		
		ctasa=new JTextField();
		cajaRes=new JTextField();
		
		sol=new JButton("Resolver");
		
		en=new JComboBox();
		va=new JComboBox();
		per=new JComboBox();
		cen=new JComboBox();
		cva=new JComboBox();
		cper=new JComboBox();
		
		en.addItem("Efectiva");
		en.addItem("Nominal");
		va.addItem("Vencida");
		va.addItem("Anticipada");
		per.addItem("Mensual");
		per.addItem("Bimestral");
		per.addItem("Trimestral");
		per.addItem("Semestral");
		per.addItem("Anual");
		
		cen.addItem("Efectiva");
		cen.addItem("Nominal");
		cva.addItem("Vencida");
		cva.addItem("Anticipada");
		cper.addItem("Mensual");
		cper.addItem("Bimestral");
		cper.addItem("Trimestral");
		cper.addItem("Semestral");
		cper.addItem("Anual");
		
		tasa.setBounds(20,20,60,30);
		ctasa.setBounds(90,20,160,30);
		en.setBounds(260,20,100,30);
		va.setBounds(370,20,100,30);
		per.setBounds(480,20,100,30);
				
		convertir.setBounds(20,80,80,30);
		cen.setBounds(100,80,100,30);
		cva.setBounds(210,80,100,30);
		cper.setBounds(320,80,100,30);
		
		res.setBounds(20,130,80,30);
		cajaRes.setBounds(110,130,220,30);
		
		sol.setBounds(20,180,120,30);
		
		add(tasa);add(convertir);add(res);add(ctasa);add(cajaRes);add(en);add(va);add(per);add(cen);add(cva);add(cper);add(sol);
		
		
		
	}
}
