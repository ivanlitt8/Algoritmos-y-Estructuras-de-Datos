package TP3.ej7;

import java.util.ArrayList;
import java.util.List;

public class Camino {
	private GeneralTree<Integer> tree;
	
	public Camino(GeneralTree<Integer> tree) {
		this.tree = tree;
	}
	
	
	public List<Integer> caminoAHojaMasLejana() {
        return encontrarCaminoMasLejano(tree);
    }

    private List<Integer> encontrarCaminoMasLejano(GeneralTree<Integer> nodo) {
        if (nodo == null)
            return new ArrayList<>();

        // Si el nodo actual es una hoja, retorna una lista con el valor del nodo
        if (nodo.isLeaf()) {
            List<Integer> camino = new ArrayList<>();
            camino.add(nodo.getData());
            return camino;
        }

        // Recorre los hijos del nodo actual y encuentra el camino más largo
        List<Integer> caminoMasLargo = new ArrayList<>();
        for (GeneralTree<Integer> hijo : nodo.getChildren()) {
            List<Integer> caminoHijo = encontrarCaminoMasLejano(hijo);
            if (caminoHijo.size() > caminoMasLargo.size()) {
                caminoMasLargo = caminoHijo;
            }
        }

        // Agrega el valor del nodo actual al camino más largo y lo retorna
        caminoMasLargo.add(0, nodo.getData());
        return caminoMasLargo;
    }

}
