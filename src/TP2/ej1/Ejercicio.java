package TP2.ej1;

public class Ejercicio {
	public static void main(String[] args) {
        // Crear un árbol binario de tipo Integer
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        tree.insertarOrdenado(4);
        tree.insertarOrdenado(2);
        tree.insertarOrdenado(3);
        tree.insertarOrdenado(6);
        tree.insertarOrdenado(5);

        // Mostrar el árbol
        System.out.println("Árbol binario:");
        tree.imprimirEnOrden();
    }
}
