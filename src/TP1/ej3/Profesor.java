package TP1.ej3;

public class Profesor {
	
	private String nombre;
	private String apellido;
	private int catedra;
	private String email;
	private String facultad;
	
	public Profesor(String nombre, String apellido, int catedra, String email, String facultad ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.catedra = catedra;
        this.email = email;
        this.facultad = facultad;
    }
	
	public void tusDatos() {
        System.out.println("Nombre: "+nombre+", Apellido:"+apellido+
        		", Catedra: "+catedra+", Email: "+email+", Facultad: "+facultad	);
    }
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCatedra() {
		return catedra;
	}
	public void setCatedra(int catedra) {
		this.catedra = catedra;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	

}
