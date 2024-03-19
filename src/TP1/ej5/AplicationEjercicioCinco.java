
package TP1.ej5;

public class AplicationEjercicioCinco {
	
	public static void main(String[] args) {
       int[] numeros = {32, 25, 89, 48, 71};       
       Estadisticas est1 = new Estadisticas();
       System.out.print(est1.puntoA(numeros)); 
    // -----------------------------------
       
       Estadisticas est2 = new Estadisticas(numeros);
       System.out.print(est2.puntoB()); 
    // -----------------------------------
       
       Estadisticas est3 = new Estadisticas(numeros);
       est3.datos(numeros);
       System.out.print(est3.toString());
    }

}
