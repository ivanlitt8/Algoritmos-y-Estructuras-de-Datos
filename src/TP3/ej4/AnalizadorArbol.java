package TP3.ej4;

import TP1.ej8.Queue;

public class AnalizadorArbol {
	
	public AnalizadorArbol() {
		
	}
	
	public double devolverMaximoPromedio (GeneralTree<AreaEmpresa> arbol) {
		Queue<GeneralTree<AreaEmpresa>> cola = new Queue<>();
        cola.enqueue(arbol);
        double maxPromedio = 0.0;
        while (!cola.isEmpty()) {
            int nivelSize = cola.size();
            int nivelValues = 0; 
            for (int i = 0; i < nivelSize; ++i) {
                GeneralTree<AreaEmpresa> nodo = cola.dequeue(); 
                nivelValues += nodo.getData().getDelay();
                for (GeneralTree<AreaEmpresa> child : nodo.getChildren()) {
                    cola.enqueue(child);
                }
            }
            double promedio = (double) nivelValues / nivelSize;
            if (promedio > maxPromedio) {
                maxPromedio = promedio;
            }
        }        
        return maxPromedio;
    }

}
