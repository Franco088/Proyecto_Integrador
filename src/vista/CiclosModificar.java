package vista;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CiclosModificar extends JDialog implements Interface_Amip {
	private JTextField textField;
	private JTextField textField_1;

	public CiclosModificar() {
		super();
		getContentPane().setLayout(null);
		
		JLabel lblModificarDatos = new JLabel("MODIFICAR DATOS");
		lblModificarDatos.setBounds(148, 24, 118, 16);
		getContentPane().add(lblModificarDatos);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 80, 56, 16);
		getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(80, 77, 301, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(12, 139, 70, 16);
		getContentPane().add(lblDescripcion);
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 112, 276, 75);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
     inicializar();
		
	}
	
	
	@Override
	public void inicializar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hacerVisible() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
