package controlador;
import java.awt.event.*;
import vista.*;

public class validacionCajas extends KeyAdapter{
	marcoPrincipal mp;
	private char c;
	public validacionCajas(marcoPrincipal mp){
		this.mp=mp;
	}
	public void keyTyped(KeyEvent e){
		c=e.getKeyChar();
		
		if(mp.jpConvertir.ctasa.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpConvertir.cajaRes.isFocusOwner()){
			e.consume();
		}
		
		if(mp.jpAriVf.ci.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpAriVf.ca.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpAriVf.cvf.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpAriVf.cg.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpAriVf.clim1.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpAriVf.clim2.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpAriVf.cn.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		
		
		if(mp.jpAriVp.ci.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpAriVp.ca.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpAriVp.cvp.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpAriVp.cg.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpAriVp.clim1.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpAriVp.clim2.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpAriVp.cn.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		
		
		if(mp.jpGeoVf.ci.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpGeoVf.ca.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpGeoVf.cvf.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpGeoVf.cg.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpGeoVf.clim1.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpGeoVf.clim2.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpGeoVf.cn.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		
		
		if(mp.jpGeoVp.ci.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpGeoVp.ca.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpGeoVp.cvp.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpGeoVp.cg.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpGeoVp.clim1.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpGeoVp.clim2.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
		if(mp.jpGeoVp.cn.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
		}
	}
}
