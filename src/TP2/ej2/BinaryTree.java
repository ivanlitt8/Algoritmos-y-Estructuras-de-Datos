package TP2.ej2;

//import java.util.LinkedList;
import TP1.ej8.Queue; 

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());
	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	
	@Override
	public String toString() {
		return this.getData().toString();
	}
	
	public int contarHojas() {
        return contarHojas(this); // Llamada al método recursivo
    }

	public  int contarHojas(BinaryTree<T> nodo) {
		if (nodo == null) {
	        return 0; 
	    }	    
	    if (nodo.isLeaf()) {
	        return 1;
	    }
	    
	    int hojasIzquierdas = contarHojas(nodo.leftChild);
	    int hojasDerechas = contarHojas(nodo.rightChild);
	    
	    return hojasIzquierdas + hojasDerechas;
	}
    
	public BinaryTree<T> espejo() {
	    return espejo(this);
	}
	
    public BinaryTree<T> espejo(BinaryTree<T> nodo){  		  
    	if (nodo == null) {
            return null;
        }
        
        // Intercambiar los hijos izquierdo y derecho del nodo actual
        BinaryTree<T> temp = nodo.leftChild;
        nodo.leftChild = nodo.rightChild;
        nodo.rightChild = temp;
        
        // Espejar los hijos izquierdo y derecho recursivamente
        espejo(nodo.leftChild);
        espejo(nodo.rightChild);
        
        return nodo;
    }

	// 0<=n<=m
    /**
    public void entreNiveles( int n, int m) {
    	if (this.isEmpty() || n < 0 || m < n) {
            return;
        }

        Queue<BinaryTree<T>> cola = new LinkedList<>();
        cola.add(this);
        int nivelActual = 0;

        while (!cola.isEmpty() && nivelActual <= m) {
            int tamanioCola = cola.size();

            for (int i = 0; i < tamanioCola; i++) {
                BinaryTree<T> nodo = cola.remove();
                if (nivelActual >= n && nivelActual <= m) {
                    System.out.print(nodo.data + " ");
                }
                if (nodo.rightChild != null) {
                    cola.add(nodo.rightChild);
                }
                if (nodo.leftChild != null) {
                    cola.add(nodo.leftChild);
                }
            }

            nivelActual++;
        }
    }
	*/
	public void insertarOrdenado(T valor) {
		
		Integer valorInteger = (Integer) valor;

	    // Ahora puedes comparar valores como enteros
	    if (valorInteger <= (Integer) this.data) {
	        if (this.hasLeftChild()) {
	            this.leftChild.insertarOrdenado(valor);
	        } else {
	            BinaryTree<T> leftChild = new BinaryTree<>(valor);
	            leftChild.setData(valor);
	            this.addLeftChild(leftChild);
	        }
	    } else {
	        if (this.hasRightChild()) {
	            this.rightChild.insertarOrdenado(valor);
	        } else {
	            BinaryTree<T> rightChild = new BinaryTree<>(valor);
	            rightChild.setData(valor);
	            this.addRightChild(rightChild);
	        }
	    }
    }
	
	public void imprimir() {
        imprimir(this);
    }
	
	private void imprimir(BinaryTree<T> nodo) {
        if (nodo != null) {
            imprimir(nodo.leftChild);
            System.out.print(nodo.data + " ");
            imprimir(nodo.rightChild);
        }
    }
	
	public void printLevelTraversal() {
 		BinaryTree<T> ab = null;
 		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
 		cola.enqueue(this);
 		cola.enqueue(null);
 		while (!cola.isEmpty()) {
 				ab = cola.dequeue();
 				if (ab != null) {
 						System.out.print(ab.getData());
 						if (ab.hasLeftChild()) {
 							cola.enqueue(ab.getLeftChild());
 						}
 						if (ab.hasRightChild()) {
 							cola.enqueue(ab.getRightChild());
 						}
 				} else if (!cola.isEmpty()) {
 						System.out.println();
 						cola.enqueue(null);
 				}
 		}
 } 
		
}

