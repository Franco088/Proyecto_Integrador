package vista;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.JMenu;

public class VentanaBase extends JFrame {
	private JMenuItem mntmDarDeAlta;
	private JMenu mnAlumno;
	private JMenuItem mntmDarDeBaja;
	private JMenuItem mntmModificar;
	private JMenu mnProyecto;
	private JMenuItem mntmAlta;
	private JMenuItem mntmBaja;
	private JMenuItem mntmModificar_1;
	private JMenu mnCiclos;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmModificar_2;
	private JMenu mnProyecto_1;
	private JMenuItem mntmVerTodo;
	
	public VentanaBase ()throws HeadlessException {
		super();
		inicializar();	
	}
	
	

	private void inicializar() {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnAlumno = new JMenu("ALUMNO");
		menuBar.add(mnAlumno);
		
		mntmDarDeAlta = new JMenuItem("DAR DE ALTA");
		mnAlumno.add(mntmDarDeAlta);
		
		mntmDarDeBaja = new JMenuItem("DAR DE BAJA");
		mnAlumno.add(mntmDarDeBaja);
		
		mntmModificar = new JMenuItem("MODIFICAR");
		mnAlumno.add(mntmModificar);
		
		mnProyecto = new JMenu("PROYECTO");
		menuBar.add(mnProyecto);
		
		mntmAlta = new JMenuItem("ALTA");
		mnProyecto.add(mntmAlta);
		
		mntmBaja = new JMenuItem("BAJA");
		mnProyecto.add(mntmBaja);
		
		mntmModificar_1 = new JMenuItem("MODIFICAR");
		mnProyecto.add(mntmModificar_1);
		
		mnCiclos = new JMenu("CICLOS");
		menuBar.add(mnCiclos);
		
		mntmNewMenuItem = new JMenuItem("ALTA");
		mnCiclos.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("BAJA");
		mnCiclos.add(mntmNewMenuItem_1);
		
		mntmModificar_2 = new JMenuItem("MODIFICAR");
		mnCiclos.add(mntmModificar_2);
		
		mnProyecto_1 = new JMenu("CONSULTAS");
		menuBar.add(mnProyecto_1);
		
		mntmVerTodo = new JMenuItem("LISTADO PROYECTOS");
		mnProyecto_1.add(mntmVerTodo);
		
		try {
			UIManager.setLookAndFeel(
				UIManager.getCrossPlatformLookAndFeelClassName());
			
		}catch (Exception ex){
			ex.printStackTrace();
			
		}
		
		getContentPane().setLayout(null);

	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 951, 440);
	}
	
	public void hacerVisible() {
		setVisible(true);

	}	
}



