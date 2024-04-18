package TP2.ej2;

//	Agregue a la clase BinaryTree los siguientes métodos:
//	a) contarHojas():int Devuelve la cantidad de árbol/subárbol hojas del árbol receptor.
//	b) espejo(): BinaryTree<T> Devuelve el árbol binario espejo del árbol receptor.
//	c) entreNiveles(int n, m) Imprime el recorrido por niveles de los elementos del árbol
//	receptor entre los niveles n y m (ambos inclusive). (0≤n<m≤altura del árbol)


public class Main {
	public static void main(String[] args) {
        // Crear un árbol binario de tipo Integer
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        tree.addLeftChild(new BinaryTree<Integer>(2));
        tree.addRightChild(new BinaryTree<Integer>(3));
        
        tree.getLeftChild().addLeftChild(new BinaryTree<Integer>(4));
        tree.getLeftChild().addRightChild(new BinaryTree<Integer>(5));
        tree.getRightChild().addLeftChild(new BinaryTree<Integer>(6));
        
        // Mostrar el arbol
        System.out.println("Arbol binario:");
        tree.imprimir();
        System.out.println();
        System.out.println("-----------");
        
        // Contar hojas
        System.out.println("La cantidad de hojas del arbol es: " + tree.contarHojas());
        ;
        System.out.println("-----------");
        
        BinaryTree<Integer> treeEspejado = tree.espejo();
        System.out.println("Arbol binario espejo:");
        treeEspejado.imprimir();
        System.out.println();
        System.out.println("-----------");
        
        
        System.out.println("Recorrido por niveles entre los niveles 0 y 1:");
      //  tree.entreNiveles(0, 1);
        
        tree.printLevelTraversal();

    }
}
