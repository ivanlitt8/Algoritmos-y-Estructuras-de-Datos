package TP1.ej7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

//d. Escriba un método que realice las siguientes acciones:
//* cree una lista que contenga 3 estudiantes
//* genere una nueva lista que sea una copia de la lista del inciso i
//* imprima el contenido de la lista original y el contenido de la nueva lista
//* modifique algún dato de los estudiantes
//* vuelva a imprimir el contenido de la lista original y el contenido de la nueva
//lista.¿Qué conclusiones obtiene a partir de lo realizado?
//* ¿Cuántas formas de copiar una lista existen? ¿Qué diferencias existen entre
//ellas?

public class ListaAlumnos {
	
	private List<Alumno> listaAlumnos;
	
	public ListaAlumnos() {
		listaAlumnos = new ArrayList<Alumno>();
		listaAlumnos.add(new Alumno("Pedro", "Gomez"));
		listaAlumnos.add(new Alumno("Gonzalo", "Narez"));
		listaAlumnos.add(new Alumno("Nicolas", "Lopez"));
	}
	
	public void add(Alumno al) {
		listaAlumnos.add(al);
    }
	
	public void imprimirLista() {
		for(Alumno alumno: listaAlumnos) {
			System.out.println(alumno.getNombre() + " " + alumno.getApellido());
		}
	}
	
    public List<Alumno> copiarLista() {
		ArrayList<Alumno> listaCopiada = new ArrayList<Alumno>();
		listaCopiada.addAll(listaAlumnos);
		return listaCopiada;
	}
    
    public void removerAlumno(int pos) {
    	listaAlumnos.remove(pos);
    }
    
    public void agregarNuevoAlumno(Alumno al) {
    	if(!listaAlumnos.contains(al)) {
    		System.out.println("El alumno fue agregado");
    		listaAlumnos.add(al);
    	} else {
    		System.out.println("El alumno no pudo agregarse porque ya esta en la lista");
    	}
    }
	
	public static void main(String[] args) {
		ListaAlumnos listaAlumnos = new ListaAlumnos();
		listaAlumnos.imprimirLista();
		List<Alumno> copia = listaAlumnos.copiarLista();
        System.out.println("--- Copia de la lista ---");
        for (Alumno alumno : copia) {
            System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        }
        listaAlumnos.removerAlumno(2);
        System.out.println("--- Lista original modificada ---");
        listaAlumnos.imprimirLista();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre de nuevo alumno: ");
        String nombre = scanner.next();
        System.out.println("Ingrese apellido de nuevo alumno: ");
        String apellido = scanner.next();
        Alumno nuevoAl = new Alumno(nombre, apellido);
        listaAlumnos.agregarNuevoAlumno(nuevoAl);
        listaAlumnos.imprimirLista();
        
	}    

}