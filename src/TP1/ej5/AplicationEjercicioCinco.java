package TP1.ej5;

// Dado un arreglo de valores tipo entero se desea calcular el valor máximo, mínimo, y promedio
// en un único método. Escriba tres métodos de clase, donde respectivamente:
// a. Devuelva lo pedido por el mecanismo de retorno de un método en Java ("return").
// b. Devuelva lo pedido interactuando con algún parámetro (el parámetro no puede ser de
// tipo arreglo). 
// c. Devuelva lo pedido sin usar parámetros ni la sentencia "return".

public class AplicationEjercicioCinco {
	
	public static Estadisticas puntoA (int[] arreglo) {
		Estadisticas est = new Estadisticas(arreglo);
		return est;
    }
	
	public static Estadisticas puntoB(int[] arreglo, Estadisticas est) {
		est.setMaximo(est.getMaximo(arreglo));
		est.setMinimo(est.getMinimo(arreglo));
		est.setPromedio(est.getPromedio(arreglo));
		return est;
	}
	
	public static void main(String[] args) {
       int[] numeros = {32, 25, 89, 48, 71};              
       Estadisticas resultadoA = puntoA(numeros);
       System.out.println("Punto A: " + resultadoA);

       Estadisticas estadisticas = new Estadisticas(numeros);
       Estadisticas resultadoB = puntoB(numeros, estadisticas);
       System.out.println("Punto B: " + resultadoB);

    }

}
