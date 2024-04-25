package TP3.ej4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//	El esquema de comunicación de una empresa está organizado en una estructura jerárquica, en donde
//	cada nodo envía el mensaje a sus descendientes. Cada nodo posee el tiempo que tarda en transmitir el
//	mensaje.

//	Se debe devolver el mayor promedio entre todos los valores promedios de los niveles.
//	Para el ejemplo presentado, el promedio del nivel 0 es 14, el del nivel 1 es 16 y el del nivel 2 es 10. Por
//	lo tanto, debe devolver 16.
//	a) Indique y justifique qué tipo de recorrido utilizará para resolver el problema.
//	b) Implementar en una clase AnalizadorArbol, el método con la siguiente firma:
//	public double devolverMaximoPromedio (GeneralTree<AreaEmpresa>arbol)

//	Donde AreaEmpresa es una clase que representa a un área de la empresa mencionada y que contiene
//	la identificación de la misma representada con un String y una tardanza de transmisión de mensajes
//	interna representada con int.

public class Main {
	public static void main(String[] args) {
		
		List <GeneralTree<AreaEmpresa>> children1 = new LinkedList<GeneralTree<AreaEmpresa>>();
		children1.add( new GeneralTree<AreaEmpresa>(new AreaEmpresa("A", 4)));
		children1.add( new GeneralTree<AreaEmpresa>(new AreaEmpresa("B", 7)));
		children1.add( new GeneralTree<AreaEmpresa>(new AreaEmpresa("C", 5)));
		GeneralTree<AreaEmpresa> A1 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("J", 13),children1);
		
		List <GeneralTree<AreaEmpresa>> children2 = new LinkedList<GeneralTree<AreaEmpresa>>();
		children2.add( new GeneralTree<AreaEmpresa>(new AreaEmpresa("D", 6)));
		children2.add( new GeneralTree<AreaEmpresa>(new AreaEmpresa("E", 10)));
		children2.add( new GeneralTree<AreaEmpresa>(new AreaEmpresa("F", 18)));
		GeneralTree<AreaEmpresa> A2 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("K", 25),children2);
		
		List <GeneralTree<AreaEmpresa>> children3 = new LinkedList<GeneralTree<AreaEmpresa>>();
		children3.add( new GeneralTree<AreaEmpresa>(new AreaEmpresa("G", 9)));
		children3.add( new GeneralTree<AreaEmpresa>(new AreaEmpresa("H", 12)));
		children3.add( new GeneralTree<AreaEmpresa>(new AreaEmpresa("I", 19)));
		GeneralTree<AreaEmpresa> A3 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("L", 10),children3);
		
		List <GeneralTree<AreaEmpresa>> children = new LinkedList<GeneralTree<AreaEmpresa>>();
		children.add(A1);
		children.add(A2);
		children.add(A3);
		GeneralTree<AreaEmpresa> A = new GeneralTree<AreaEmpresa>(new AreaEmpresa("M", 14),children);
				
		
		LinkedList<AreaEmpresa> lista = (LinkedList<AreaEmpresa>) A.levelOrder();
		Iterator<AreaEmpresa> iterator = lista.listIterator();
		while (iterator.hasNext()) {
		    AreaEmpresa valor = iterator.next();
		    System.out.print(valor);
		}
		
		AnalizadorArbol analizadorArbol = new AnalizadorArbol();
		
		double maxProm = analizadorArbol.devolverMaximoPromedio(A);
		
		System.out.println("El mayor promedio entre todos los valores promedios de los niveles es: "+maxProm);
	}
}

