package TP2.ej1;

// Comparable ?
public class BinaryTree <T extends Comparable<T>> {
	
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

	public  int contarHojas() {
	   
		return 0;
	}
    	 
    public BinaryTree<T> espejo(){
		       		  
 	   return null;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		
   }
	
	public void insertarOrdenado(T valor) {
		if (valor.compareTo(this.data) < 0) {
            if (this.hasLeftChild()) {
                this.leftChild.insertarOrdenado(valor);
            } else {
                BinaryTree<T> leftChild = new BinaryTree<>(valor);
                this.addLeftChild(leftChild);
            }
        } else {
            if (this.hasRightChild()) {
                this.rightChild.insertarOrdenado(valor);
            } else {
                BinaryTree<T> rightChild = new BinaryTree<>(valor);
                this.addRightChild(rightChild);
            }
        }
    }
	
	public void imprimirEnOrden() {
        imprimirEnOrden(this);
    }
	
	private void imprimirEnOrden(BinaryTree<T> nodo) {
        if (nodo != null) {
            imprimirEnOrden(nodo.leftChild);
            System.out.print(nodo.data + " ");
            imprimirEnOrden(nodo.rightChild);
        }
    }
		
}

