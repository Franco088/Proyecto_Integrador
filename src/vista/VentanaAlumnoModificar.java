package vista;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class VentanaAlumnoModificar  extends JDialog implements Interface_Amip {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNExpediente;
	private JLabel lblNombre;
	private JLabel lblApellido;

	
	public VentanaAlumnoModificar() {
		super();
		getContentPane().setLayout(null);
		
		lblNExpediente = new JLabel("N\u00BA Expediente");
		lblNExpediente.setBounds(12, 56, 89, 16);
		getContentPane().add(lblNExpediente);
		
		textField = new JTextField();
		textField.setBounds(113, 53, 190, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 111, 56, 16);
		getContentPane().add(lblNombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(12, 150, 56, 16);
		getContentPane().add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 108, 190, 22);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 150, 190, 22);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
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
