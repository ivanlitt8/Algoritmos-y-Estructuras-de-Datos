package TP2.ej5;

import TP1.ej8.Queue;
import TP2.ej4.BinaryTree;

public class ProfundidadDeArbolBinario {
	
	private BinaryTree<Integer> data;
	
	public ProfundidadDeArbolBinario(int nivel, int valor) {
		super();
		if (nivel > 0) {
			this.data = crearArbolLleno(nivel,valor);
		}    
	}
	
	public BinaryTree<Integer> crearArbolLleno(int nivel, int valor) {
        										
		if (nivel == 0) {
	        return new BinaryTree<>(valor);
	    }
		
		BinaryTree<Integer> nodo = new BinaryTree<Integer>(valor);
        nodo.addLeftChild(crearArbolLleno(nivel - 1, valor * 2)); 
        nodo.addRightChild(crearArbolLleno(nivel - 1, valor * 2 + 1));
        
        return nodo;
    }
	
	public void imprimir() {
		this.data.printLevelTraversal();
	}

	
	public int sumaElementosProfundidad(int nivelDeseado) {
	    if (this.data == null || nivelDeseado < 0) {
	        return 0;
	    }
	
	    Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
	    cola.enqueue(this.data); // Agrega la raíz a la cola
	    int nivelActual = 0; // Inicializa el nivel actual como 0
	    int totalNivel = 0; // Inicializa la suma del nivel como 0
	
	    while (!cola.isEmpty() && nivelActual <= nivelDeseado) {
	        int nivelSize = cola.size();
	
	        // Procesar los nodos en el nivel actual
	        for (int i = 0; i < nivelSize; i++) {
	            BinaryTree<Integer> nodo = cola.dequeue();
	
	            // Si el nivel actual coincide con el nivel deseado, sumar los valores de los nodos en este nivel
	            if (nivelActual == nivelDeseado) {
	                totalNivel += nodo.getData();
	            } else {
	                // Si el nivel actual no coincide con el nivel deseado, agregar los hijos del nodo actual a la cola
	                // para procesarlos en el siguiente nivel
	                if (nodo.hasLeftChild()) {
	                    cola.enqueue(nodo.getLeftChild());
	                }
	                if (nodo.hasRightChild()) {
	                    cola.enqueue(nodo.getRightChild());
	                }
	            }
	        }
	
	        // Incrementar el nivel actual después de procesar todos los nodos en el nivel actual
	        nivelActual++;
	    }
	
	    return totalNivel;
}

}
