package modelo;

public class PojoProyecto {

	private int id_P;
	private String nombre;
	private String grupo;
	private String curso;
	private double nota;
	private String url;
	private String ciclo;
	private int Año;
	
	
	public PojoProyecto(int id_P, String nombre, String grupo, String curso, double nota, String url, String ciclo,
			int año) {
		
		this.id_P = id_P;
		this.nombre = nombre;
		this.grupo = grupo;
		this.curso = curso;
		this.nota = nota;
		this.url = url;
		this.ciclo = ciclo;
		Año = año;
	}


	public int getId_P() {
		return id_P;
	}


	public String getNombre() {
		return nombre;
	}


	public String getGrupo() {
		return grupo;
	}


	public String getCurso() {
		return curso;
	}


	public double getNota() {
		return nota;
	}


	public String getUrl() {
		return url;
	}


	public String getCiclo() {
		return ciclo;
	}


	public int getAño() {
		return Año;
	}
	
	
	
	
}
