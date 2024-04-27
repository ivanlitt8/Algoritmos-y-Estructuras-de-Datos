package TP3.ej8;

import java.util.LinkedList;
import java.util.List;

//	Retomando el ejercicio abeto navideño visto en teoría, cree una clase Navidad que cuenta con una
//	variable de instancia GeneralTree que representa al abeto (ya creado) e implemente el método con la
//	firma: public String esAbetoNavidenio()

//	(Llamaremos abeto a un árbol si cada vértice no hoja tiene al menos 3
//	hijos hojas. Dado un árbol general, compruebe si es un abeto)

public class Main {
	
	public static void main(String[] args) {
		
		////////////////////////////	Arbol 1
		List <GeneralTree<Integer>> children1 = new LinkedList<GeneralTree<Integer>>();
		children1.add(new GeneralTree<Integer>(2));
		children1.add(new GeneralTree<Integer>(3));
		children1.add(new GeneralTree<Integer>(4));		
		GeneralTree<Integer> A1 = new GeneralTree<Integer>(1,children1);		
		
		////////////////////////////	Arbol 2
		List <GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		children2.add(new GeneralTree<Integer>(5));
		children2.add(new GeneralTree<Integer>(6));
		children2.add(new GeneralTree<Integer>(7));		
		GeneralTree<Integer> A2 = new GeneralTree<Integer>(2,children2);
		
		List <GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
		children3.add(A2);
		children3.add(new GeneralTree<Integer>(3));
		children3.add(new GeneralTree<Integer>(4));
		GeneralTree<Integer> A3 = new GeneralTree<Integer>(1,children3);
		
		////////////////////////////	Arbol 3		
		List <GeneralTree<Integer>> children4 = new LinkedList<GeneralTree<Integer>>();
		children4.add(new GeneralTree<Integer>(6));
		children4.add(new GeneralTree<Integer>(7));
		children4.add(new GeneralTree<Integer>(8));
		GeneralTree<Integer> A4 = new GeneralTree<Integer>(3,children4);
		
		List <GeneralTree<Integer>> children5 = new LinkedList<GeneralTree<Integer>>();
		children5.add(new GeneralTree<Integer>(2));
		children5.add(A4);
		children5.add(new GeneralTree<Integer>(4));
		children5.add(new GeneralTree<Integer>(5));
		GeneralTree<Integer> A5 = new GeneralTree<Integer>(1,children5);

		Navidad nav1 = new Navidad(A1);
		Navidad nav2 = new Navidad(A3);
		Navidad nav3 = new Navidad(A5);
		
		System.out.println("¿El arbol 1 es abeto? :"+nav1.esAbetoNavidenio());
		System.out.println("¿El arbol 2 es abeto? :"+nav2.esAbetoNavidenio());
		System.out.println("¿El arbol 3 es abeto? :"+nav3.esAbetoNavidenio());
	}
}
