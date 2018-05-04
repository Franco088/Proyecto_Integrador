package vista;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaAlumnoBaja  extends JDialog implements Interface_Amip{
	private JLabel lblExpedienteBaja;
	private JTextField textField;

	public VentanaAlumnoBaja() {
		super();
		getContentPane().setLayout(null);
		
		lblExpedienteBaja = new JLabel("N\u00BA Expediente");
		lblExpedienteBaja.setBounds(12, 114, 97, 16);
		getContentPane().add(lblExpedienteBaja);
		
		textField = new JTextField();
		textField.setBounds(130, 111, 220, 22);
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
