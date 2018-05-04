import vista.VentanaBase;

public class App_AMIP {

	public static void main(String[] args) {
java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VentanaBase vistaprincipal = new VentanaBase();
				vistaprincipal.hacerVisible();
				//hacerVisible hay que especificarla al final de la siguiente clase en true(punto 4)
				
			}
		});

	}

}
