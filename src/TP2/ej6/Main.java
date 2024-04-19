package TP2.ej6;

//	Cree una clase Java llamada Transformacion que tenga como variable de instancia un árbol
//	binario de números enteros y un método de instancia suma (): BinaryTree<Integer> el cuál
//	devuelve el árbol en el que se reemplazó el valor de cada nodo por la suma de todos los
//	elementos presentes en su subárbol izquierdo y derecho. Asuma que los valores de los subárboles
//	vacíos son ceros. 

public class Main {
	public static void main(String[] args) {
		Transformacion trans = new Transformacion(2,2);
		trans.imprimir();
	}
}
