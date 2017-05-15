package vista;
import java.awt.*;
import javax.swing.*;

public class jpanelAriVp extends JPanel{
	private JLabel vp,a,i,n,g,lim1,lim2;
	public JTextField cvp,ca,ci,cn,cg,clim1,clim2;
	public JLabel res;
	public JButton bi,bg,bn;
	
	public jpanelAriVp(){
		//--- Panel properties --------------------
		setPreferredSize(new Dimension(560,360));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Interpolación"));
		
		vp=new JLabel("VP");
		a=new JLabel("A");
		i=new JLabel("i");
		n=new JLabel("n");
		g=new JLabel("G");
		lim1=new JLabel("Limite Inicial");
		lim2=new JLabel("Limite Final");
		
		cvp=new JTextField();
		ca=new JTextField();
		ci=new JTextField();
		cn=new JTextField();
		cg=new JTextField();
		clim1=new JTextField();
		clim2=new JTextField();
		
		bi=new JButton("Hallar i");
		bg=new JButton("Hallar G");
		bn=new JButton("Hallar n");
		
		res=new JLabel();

		vp.setBounds(20,20,50,30);
		a.setBounds(20,60,50,30);
		i.setBounds(20,100,50,30);
		n.setBounds(20,140,50,30);
		g.setBounds(20,180,50,30);
		
		lim1.setBounds(160,20,100,30);
		lim2.setBounds(160,60,100,30);
		
		cvp.setBounds(60,20,80,30);
		ca.setBounds(60,60,80,30);
		ci.setBounds(60,100,80,30);
		cn.setBounds(60,140,80,30);
		cg.setBounds(60,180,80,30);
		
		clim1.setBounds(260,20,80,30);
		clim2.setBounds(260,60,80,30);
		
		bi.setBounds(20,240,100,30);
		bg.setBounds(150,240,100,30);
		bn.setBounds(280,240,100,30);
		
		res.setBounds(20,280,200,30);
		
		add(vp);add(a);add(i);add(n);add(g);add(lim1);add(lim2);
		add(cvp);add(ca);add(ci);add(cn);add(cg);add(clim1);add(clim2);
		add(bi);add(bg);add(bn);add(res);
	}
}
