package TP2.ej4;
//	Los nodos que conforman una red binaria llena tiene la particularidad de que todos ellos conocen
//	cuál es su retardo de reenvío. El retardo de reenvío se define como el período comprendido entre
//	que un nodo recibe un mensaje y lo reenvía a sus dos hijos.
//	Su tarea es calcular el mayor retardo posible, en el camino que realiza un mensaje desde la raíz
//	hasta llegar a las hojas en una red binaria llena. En el ejemplo, debería retornar 10+3+9+12=34
//	(Si hay más de un máximo retorne el último valor hallado).
//	Nota: asuma que cada nodo tiene el dato de retardo de reenvío expresado en cantidad de
//	segundos.
//	a) Indique qué estrategia (recorrido en profundidad o por niveles) utilizará para resolver el
//	problema.
//	b) Cree una clase Java llamada RedBinariaLlena donde implementará lo solicitado en el
//	método retardoReenvio():int

public class Main {
	public static void main(String[] args) {
		
		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		
		RedBinaria redBinaria = new RedBinaria();
        
		tree = redBinaria.crearArbolLleno(5, 5);

        // Ahora puedes utilizar el árbol creado como lo desees
        // Por ejemplo, imprimir el árbol utilizando el método imprimir()
        tree.printLevelTraversal();
        
        int maxRetardo = redBinaria.retardoReenvio(tree);
        
        System.out.println();
        System.out.println("El retardo maximo de la red binaria es: "+ maxRetardo);
	}
}
