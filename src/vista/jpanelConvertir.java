package vista;

import java.awt.Dimension;
import javax.swing.*;

public class jpanelConvertir extends JPanel{
	private JLabel ia,ja,m1,i,m2,j;
	public JTextField cia,cja,cm1,ci,cm2,cj;
	public JLabel ria,rja,ri,rj;
	public JButton bia,bja,bi,bj;
	public jpanelConvertir(){
		//--- Panel properties --------------------
		setPreferredSize(new Dimension(560,360));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Convertir"));
		
		ia=new JLabel("ia");
		ja=new JLabel("ja");
		m1=new JLabel("m1");
		i=new JLabel("i");
		m2=new JLabel("m2");
		j=new JLabel("j");
		
		cia=new JTextField();
		cja=new JTextField();
		cm1=new JTextField();
		ci=new JTextField();
		cm2=new JTextField();
		cj=new JTextField();
		
		ria=new JLabel("ia =");
		rja=new JLabel("ja =");
		ri=new JLabel("i =");
		rj=new JLabel("j =");
		
		bia=new JButton("Econtrar");
		bja=new JButton("Econtrar");
		bi=new JButton("Econtrar");
		bj=new JButton("Econtrar");
		
		
		ia.setBounds(20,20,40,30);
		ja.setBounds(20,60,40,30);
		m1.setBounds(20,100,40,30);
		m2.setBounds(20,140,40,30);
		i.setBounds(20,180,40,30);
		j.setBounds(20,220,40,30);
		
		cia.setBounds(70,20,80,30);
		cja.setBounds(70,60,80,30);
		cm1.setBounds(70,100,80,30);
		cm2.setBounds(70,140,80,30);
		ci.setBounds(70,180,80,30);
		cj.setBounds(70,220,80,30);
		
		
		bia.setBounds(170,20,100,30);
		bja.setBounds(170,60,100,30);
		bi.setBounds(170,100,100,30);
		bj.setBounds(170,140,100,30);
		
		ria.setBounds(290,20,250,30);
		rja.setBounds(290,60,250,30);
		ri.setBounds(290,100,250,30);
		rj.setBounds(290,140,250,30);
		
		add(ia);add(ja);add(m1);add(m2);add(i);add(j);add(cia);add(cja);add(cm1);add(cm2);add(ci);add(cj);
		add(bia);add(bja);add(bi);add(bj);add(ria);add(rja);add(ri);add(rj);
		
		
	}
}
