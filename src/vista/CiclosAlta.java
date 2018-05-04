package vista;

import javax.swing.JDialog;
import javax.swing.UIManager;

public class CiclosAlta  extends JDialog implements Interface_Amip{

	
	
	public CiclosAlta() {
		super();
		
		
		inicializar();
		
	}



	@Override
	public void inicializar() {
		
		
		try {
			UIManager.setLookAndFeel(
				UIManager.getCrossPlatformLookAndFeelClassName());
			
		}catch (Exception ex){
			ex.printStackTrace();
			
		}
		
		getContentPane().setLayout(null);
	}
	
	

	@Override
	public void hacerVisible() {
		// TODO Auto-generated method stub
		
	}

}
