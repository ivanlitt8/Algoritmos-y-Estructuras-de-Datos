package TP1.ej5;

// Dado un arreglo de valores tipo entero se desea calcular el valor máximo, mínimo, y promedio
// en un único método. Escriba tres métodos de clase, donde respectivamente:
// a. Devuelva lo pedido por el mecanismo de retorno de un método en Java ("return").
// b. Devuelva lo pedido interactuando con algún parámetro (el parámetro no puede ser de
// tipo arreglo).
// c. Devuelva lo pedido sin usar parámetros ni la sentencia "return".

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
