package TP1.ej2;

import java.util.Scanner;

public class EjercicioDos {
	
	public static int[] imprimirArray() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            arreglo[i] = n * (i + 1);
        }
	
		return arreglo;

	}
	
}
