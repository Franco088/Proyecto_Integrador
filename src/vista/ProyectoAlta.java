package vista;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProyectoAlta extends JDialog implements Interface_Amip {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public ProyectoAlta() {
		super();
		getContentPane().setLayout(null);
		
		JLabel lblAltaProyecto = new JLabel("Alta Proyecto");
		lblAltaProyecto.setBounds(164, 13, 88, 16);
		getContentPane().add(lblAltaProyecto);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 62, 56, 16);
		getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(80, 59, 172, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setBounds(12, 91, 56, 16);
		getContentPane().add(lblCurso);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(12, 120, 56, 16);
		getContentPane().add(lblAo);
		
		JLabel lblGrupo = new JLabel("Grupo");
		lblGrupo.setBounds(12, 149, 56, 16);
		getContentPane().add(lblGrupo);
		
		JLabel lblUrl = new JLabel("Url");
		lblUrl.setBounds(12, 191, 56, 16);
		getContentPane().add(lblUrl);
		
		JLabel lblNewLabel = new JLabel("Nota");
		lblNewLabel.setBounds(12, 224, 56, 16);
		getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(80, 94, 172, 22);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(80, 146, 172, 22);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(80, 188, 172, 22);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(80, 221, 172, 22);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
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
