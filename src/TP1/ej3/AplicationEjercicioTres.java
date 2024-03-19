
// c. Agregue un método de instancia llamado tusDatos() en la clase Estudiante y en la
// 	clase Profesor, que retorne un String con los datos de los atributos de las mismas.
// 	Para acceder a los valores de los atributos utilice los getters previamente
// 	definidos.
// d. Escriba una clase llamada Test con el método main, el cual cree un arreglo con 2
//	objetos Estudiante, otro arreglo con 3 objetos Profesor, y luego recorra ambos
//	arreglos imprimiendo los valores obtenidos mediante el método tusDatos(). Recuerde
//	asignar los valores de los atributos de los objetos Estudiante y Profesor invocando los
//	respectivos métodos setters.
// e. Agregue dos breakpoints, uno en la línea donde itera sobre los estudiantes y otro en la
//	línea donde itera sobre los profesores
// f. Ejecute la clase Test en modo debug y avance paso a paso visualizando si el
//	estudiante o el profesor recuperado es lo esperado.

package TP1.ej3;	

public class AplicationEjercicioTres {
	
	public static class Test {
		
		public void ejecutar() {
			
			Estudiante[] estudiantes = new Estudiante[2];
			estudiantes[0] = new Estudiante("Juan", "Perez", 21, "mail@estudiante1", "una direccion1");
	        estudiantes[1] = new Estudiante("María", "Gomez", 20, "mail@estudiante2", "una direccion2");
	        
			Profesor[] profesores = new Profesor[3];
			profesores[0] = new Profesor("Pedro", "Pascal,", 21, "mail@profesor1", "facultad 1");
			profesores[1] = new Profesor("Gretta", "Dening", 20, "mail@profesor2", "facultad 2");
			profesores[2] = new Profesor("Marcelo", "Rodriguez", 22, "mail@profesor3", "facultad 3");
	        
	        for (Estudiante estudiante : estudiantes) {
	            estudiante.tusDatos();
	        }
	        
	        System.out.println("-----------");
	        
	        for (Profesor profesor : profesores) {
	            profesor.tusDatos();
	        }
		}
	
	public static void main(String[] args) {
        Test test = new Test();
        test.ejecutar();
    }

	}
}
