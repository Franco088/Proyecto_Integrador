package vista;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class VentanaAlumnoAlta  extends JDialog implements Interface_Amip {
	private JTextField texNombre;
	private JTextField texApellido;
	private JTextField textField;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblExpediente;

	public VentanaAlumnoAlta() {
		super();
		getContentPane().setLayout(null);
		
		JLabel lblDatosAlumno = new JLabel("DATOS ALUMNO");
		lblDatosAlumno.setBounds(165, 13, 107, 16);
		getContentPane().add(lblDatosAlumno);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 87, 56, 16);
		getContentPane().add(lblNombre);
		
		texNombre = new JTextField();
		texNombre.setBounds(121, 84, 151, 22);
		getContentPane().add(texNombre);
		texNombre.setColumns(10);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(12, 138, 56, 16);
		getContentPane().add(lblApellido);
		
		texApellido = new JTextField();
		texApellido.setBounds(121, 135, 151, 22);
		getContentPane().add(texApellido);
		texApellido.setColumns(10);
		
		lblExpediente = new JLabel("N\u00BA Expediente");
		lblExpediente.setBounds(12, 187, 85, 16);
		getContentPane().add(lblExpediente);
		
		textField = new JTextField();
		textField.setBounds(121, 184, 151, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
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
