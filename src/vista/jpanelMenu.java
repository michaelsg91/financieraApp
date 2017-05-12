package vista;

import java.awt.*;
import javax.swing.*;

public class jpanelMenu extends JPanel{
	public JButton convertir;
	public jpanelMenu(){
		//--- Panel properties --------------------
		setPreferredSize(new Dimension(195,360));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Menú Principal"));
		
		//--- Variables Initialization --------------
		convertir=new JButton("Recibo");
		
		//--- Location elements -------------
		convertir.setBounds(20,30,155,30);
		//factura.setBounds(20,70,155,30);
		//ingresos.setBounds(20,110,155,30);
		//cambUsu.setBounds(20,150,155,30);
		//configurar.setBounds(20,190,155,30);
		//confTarCamp.setBounds(20,230,155,30);
		//confUsu.setBounds(20,270,155,30);
		
		add(convertir);
	}
	
}
