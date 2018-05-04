package modelo;

public class PojoAlumno {

	private int id_A;
	private int n_exp;
	private String nombre;
	private String apellido;
	public PojoAlumno(int id_A, int n_exp, String nombre, String apellido) {
		
		this.id_A = id_A;
		this.n_exp = n_exp;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public int getId_A() {
		return id_A;
	}
	public int getN_exp() {
		return n_exp;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	
	
	
}
