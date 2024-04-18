package TP2.ej3;

import java.util.ArrayList;

import TP2.ej2.BinaryTree;

//Defina una clase Java denominada ContadorArbol cuya función principal es proveer métodos de
//validación sobre árboles binarios de enteros. Para ello la clase tiene como variable de instancia un
//BinaryTree<Integer>. Implemente en dicha clase un método denominado numerosPares() que
//devuelve en una estructura adecuada (sin ningún criterio de orden) todos los elementos pares del
//árbol (divisibles por 2).
//a) Implemente el método realizando un recorrido InOrden.
//b) Implemente el método realizando un recorrido PostOrden.

public class ContadorArbol {
    private BinaryTree<Integer> tree;

    public ContadorArbol(BinaryTree<Integer> tree) {
        this.tree = tree;
    }
    
    public ArrayList<Integer> numerosParesPostOrden() {
        ArrayList<Integer> numerosPares = new ArrayList<>();
        numerosParesPostOrden(this.tree, numerosPares);
        return numerosPares;
    }

    private void numerosParesPostOrden(BinaryTree<Integer> nodo, ArrayList<Integer> numerosPares) {
        if (nodo != null) {
            // Recorrer el subárbol izquierdo en postorden
            numerosParesPostOrden(nodo.getLeftChild(), numerosPares);
            // Recorrer el subárbol derecho en postorden
            numerosParesPostOrden(nodo.getRightChild(), numerosPares);
            // Verificar si el valor del nodo es par
            if (nodo.getData() % 2 == 0) {
                // Agregar el valor del nodo a la lista de números pares
                numerosPares.add(nodo.getData());
            }
        }
    }
    
    // Método para obtener la lista de números pares mediante un recorrido en inorden
    public ArrayList<Integer> numerosParesInOrden() {
        ArrayList<Integer> numerosPares = new ArrayList<>();
        numerosParesInOrden(this.tree, numerosPares);
        return numerosPares;
    }

    private void numerosParesInOrden(BinaryTree<Integer> nodo, ArrayList<Integer> numerosPares) {
        if (nodo != null) {
            // Recorrer el subárbol izquierdo en inorden
            numerosParesInOrden(nodo.getLeftChild(), numerosPares);
            // Verificar si el valor del nodo es par
            if (nodo.getData() % 2 == 0) {
                // Agregar el valor del nodo a la lista de números pares
                numerosPares.add(nodo.getData());
            }
            // Recorrer el subárbol derecho en inorden
            numerosParesInOrden(nodo.getRightChild(), numerosPares);
        }
    }
    
    public ContadorArbol(Integer data) {
        this.tree = new BinaryTree<>(data);
    }

    public void setTree(BinaryTree<Integer> tree) {
        this.tree = tree;
    }

    public BinaryTree<Integer> getTree() {
        return this.tree;
    }
}
