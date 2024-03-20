package TP1.ej7;
import java.util.*;

public class TestArrayList{
	private List<Integer> secuencia;
	
	public TestArrayList() { // Constructor de la clase
        secuencia = new ArrayList<Integer>(); // Inicializa la lista como un ArrayList de Integer
    }
	
	public void agregarNumero(int numero) { // Método para agregar un número a la lista
        secuencia.add(numero);
    }
	
	public void imprimirLista() {
		for(Integer i: secuencia) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
        TestArrayList test = new TestArrayList(); // Crea una instancia de la clase TestArrayList
        Scanner scanner = new Scanner(System.in);
        // Agrega los números proporcionados como argumentos de la línea de comandos
        for (int i= 1; i<6 ; i++) {
        	System.out.println("Ingrese el numero "+i+":");
        	int numero = scanner.nextInt();
            test.agregarNumero(numero); // Agrega el número a la lista
        }
        
        test.imprimirLista(); // Imprime los números almacenados en la lista
    }
	
}
