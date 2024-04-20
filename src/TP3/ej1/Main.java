package TP3.ej1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//	a) Implemente en la clase RecorridosAG los siguientes métodos:
//	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,
//	Integer n)
//	Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
//	pasados como parámetros, recorrido en preorden.
//	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a,
//	Integer n)
//	Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
//	pasados como parámetros, recorrido en inorden.
//	public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a,
//	Integer n)
//	Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
//	pasados como parámetros, recorrido en postorden.
//	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree <Integer> a,
//	Integer n)
//	Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
//	pasados como parámetros, recorrido por niveles.
//	b) Si ahora tuviera que implementar estos métodos en la clase GeneralTree<T>, ¿qué modificaciones
//	haría tanto en la firma como en la implementación de los mismos?

public class Main {
	
	public static void main(String[] args) {
		
		GeneralTree<Integer> A1 = new GeneralTree<Integer>(1);
		List <GeneralTree<Integer>> children1 = new LinkedList<GeneralTree<Integer>>();
		children1.add(new GeneralTree<Integer>(15));
		children1.add(new GeneralTree<Integer>(19));
		children1.add(new GeneralTree<Integer>(25));
		
		GeneralTree<Integer> A2 = new GeneralTree<Integer>(2,children1);
		List <GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		children2.add(new GeneralTree<Integer>(44));
		children2.add(new GeneralTree<Integer>(12));
		children2.add(new GeneralTree<Integer>(17));

		GeneralTree<Integer> A3 = new GeneralTree<Integer>(3,children2);
		List <GeneralTree<Integer>> children = new LinkedList<GeneralTree<Integer>>();
		children.add(A1);
		children.add(A2);
		children.add(A3);
		GeneralTree<Integer> A = new GeneralTree<Integer>(65,children);
		
		
		RecorridosAG recorridos = new RecorridosAG();
		int num = 3;
		
		List<Integer> listaImparesPostOrden = recorridos.numerosImparesMayoresQuePreOrden(A, num);
		List<Integer> listaImparesInOrden = recorridos.numerosImparesMayoresQueInOrden(A, num);

		System.out.println("-------------");
		System.out.println("Los numeros impares mayores a "+num+" son");
		for (Integer i: listaImparesPostOrden) {
			System.out.println(i);
		}
		
		System.out.println("-------------");
		System.out.println("Los numeros impares mayores a "+num+" son");
		for (Integer i: listaImparesInOrden) {
			System.out.println(i);
		}	
		
	}

}
