package TP3.ej6;

import java.util.LinkedList;
import java.util.List;

//Sea una red de agua potable, la cual comienza en un caño maestro y la misma se va dividiendo
	//sucesivamente hasta llegar a cada una de las casas.
	//Por el caño maestro ingresan “x” cantidad de litros y en la medida que el caño se divide, de acuerdo
	//con las bifurcaciones que pueda tener, el caudal se divide en partes iguales en cada una de ellas. Es
	//decir, si un caño maestro recibe 1000 litros y tiene por ejemplo 4 bifurcaciones se divide en 4 partes
	//iguales, donde cada división tendrá un caudal de 250 litros.
	//Luego, si una de esas divisiones se vuelve a dividir, por ej. en 5 partes, cada una tendrá un caudal de
	//50 litros y así sucesivamente hasta llegar a un lugar sin bifurcaciones.
	//Se debe implementar una clase RedDeAguaPotable que contenga el método con la siguiente firma:
	//public double minimoCaudal(double caudal)
	//que calcule el caudal de cada nodo y determine cuál es el caudal mínimo que recibe una casa. Asuma
	//que la estructura de caños de la red está representada por una variable de instancia de la clase
	//RedAguaPotable y que es un GeneralTree<Character>.
	//Extendiendo el ejemplo en el siguiente gráfico, al llamar al método minimoCaudal con un valor de
	//1000.0 debería retornar 25.0

public class Main {
	public static void main(String[] args) {
		
		List <GeneralTree<Character>> children1 = new LinkedList<GeneralTree<Character>>();
		children1.add(new GeneralTree<Character>('M'));
		children1.add(new GeneralTree<Character>('N'));
		GeneralTree<Character> A1 = new GeneralTree<Character>('J',children1);
		
		List <GeneralTree<Character>> children2 = new LinkedList<GeneralTree<Character>>();
		children2.add(new GeneralTree<Character>('L'));
		GeneralTree<Character> A2 = new GeneralTree<Character>('G',children2);
		
		List <GeneralTree<Character>> children3 = new LinkedList<GeneralTree<Character>>();
		children3.add(new GeneralTree<Character>('F'));
		children3.add(A2);
		
		List <GeneralTree<Character>> children4 = new LinkedList<GeneralTree<Character>>();
		children4.add(new GeneralTree<Character>('H'));
		children4.add(new GeneralTree<Character>('I'));
		children4.add(A1);
		children4.add(new GeneralTree<Character>('K'));
		children4.add(new GeneralTree<Character>('P'));
		
		List <GeneralTree<Character>> children5 = new LinkedList<GeneralTree<Character>>();
		children5.add(new GeneralTree<Character>('B'));
		children5.add(new GeneralTree<Character>('C',children3));
		children5.add(new GeneralTree<Character>('D',children4));
		children5.add(new GeneralTree<Character>('E'));
		
		GeneralTree<Character> A = new GeneralTree<Character>('A',children5);

		RedDeAguaPotable redAgua = new RedDeAguaPotable(A);
		
		System.out.println("El caudal mínimo que recibe una casa es "+ redAgua.minimoCaudal(1000.0));
		
	}
}
