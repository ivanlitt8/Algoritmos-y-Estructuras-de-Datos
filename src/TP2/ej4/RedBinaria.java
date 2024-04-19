package TP2.ej4;

public class RedBinaria {
	
	public RedBinaria() {
        
    }

    public BinaryTree<Integer> crearArbolLleno(int nivel, int valor) {
        if (nivel <= 0) {
            return null;
        }

        BinaryTree<Integer> nodo = new BinaryTree<Integer>(valor);
        nodo.addLeftChild(crearArbolLleno(nivel - 1, valor * 2));
        nodo.addRightChild(crearArbolLleno(nivel - 1, valor * 2 + 1));
        
        return nodo;
    }
    
    public int retardoReenvio ( BinaryTree<Integer> tree) {
        int retHI = 0;
        int retHD = 0;
        if(tree.hasLeftChild())
            retHI = retardoReenvio (tree.getLeftChild());
        if(tree.hasRightChild())
            retHD = retardoReenvio (tree.getRightChild());
        return (Math.max(retHI, retHD)+ tree.getData());
    }
    	
}
