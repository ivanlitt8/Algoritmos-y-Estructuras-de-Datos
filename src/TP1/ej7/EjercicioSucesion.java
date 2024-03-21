package TP1.ej7;

import java.util.ArrayList;
import java.util.List;

public class EjercicioSucesion {
	
	public static List<Integer> calcularSucesion(int n) {
        List<Integer> sucesion = new ArrayList<>();
        calcularSucesionRecursiva(n, sucesion);
        return sucesion;
    }
	
	private static void calcularSucesionRecursiva(int n, List<Integer> sucesion) {
        sucesion.add(n);
        if (n == 1) {
            return;
        }
        if (n % 2 == 0) {
            calcularSucesionRecursiva(n / 2, sucesion);
        } else {
            calcularSucesionRecursiva(3 * n + 1, sucesion);
        }
    }
	
	public static void main(String[] args) {
        int numeroInicial = 6; 
        List<Integer> resultado = calcularSucesion(numeroInicial);
        System.out.println("Sucesión para " + numeroInicial + ": " + resultado);
    }
}
