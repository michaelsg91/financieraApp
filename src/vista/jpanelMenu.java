package vista;

import java.awt.*;
import javax.swing.*;

public class jpanelMenu extends JPanel{
	public JButton convertir,ariVp,ariVf,geoVp,geoVf;
	private JLabel inter;
	public jpanelMenu(){
		//--- Panel properties --------------------
		setPreferredSize(new Dimension(195,360));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Menú Principal"));
		
		//--- Variables Initialization --------------
		convertir=new JButton("Conversión");
		ariVp=new JButton("Aritmético VP");
		ariVf=new JButton("Aritmético VF");
		geoVp=new JButton("Geométrico VP");
		geoVf=new JButton("Geométrico VF");
		
		inter=new JLabel("Interpolación");
		
		//--- Location elements -------------
		convertir.setBounds(20,30,155,30);
		inter.setBounds(20,70,155,30);
		ariVp.setBounds(20,110,155,30);
		ariVf.setBounds(20,150,155,30);
		geoVp.setBounds(20,190,155,30);
		geoVf.setBounds(20,230,155,30);
		//confUsu.setBounds(20,270,155,30);
		
		inter.setHorizontalAlignment(JLabel.CENTER);
		
		add(convertir);add(ariVp);add(ariVf);add(geoVp);add(geoVf);add(inter);
	}
	
}
