package vista;

import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CiclosAlta  extends JDialog implements Interface_Amip{
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNombre;
	private JLabel lblDescripcion;

	
	
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
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 61, 56, 16);
		getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(102, 58, 258, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(12, 138, 78, 16);
		getContentPane().add(lblDescripcion);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 116, 258, 65);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
	
	

	@Override
	public void hacerVisible() {
		// TODO Auto-generated method stub
		
	}

}
