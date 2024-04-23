package TP3.ej3;

import java.util.LinkedList;
import java.util.List;

import TP1.ej8.Queue;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}
	
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	public List<T> preOrder() {
		List<T> lis = new LinkedList<T>();
   	 	this.preOrder(lis);
   	 	return lis;
	}
   
   private void preOrder(List<T> l) {
   		l.add(this.getData());
   		List<GeneralTree<T>> children = this.getChildren();
   		for (GeneralTree<T> child: children) {
   			child.preOrder(l);
   		}
   }
   
   public List<T> inOrder() {
	    List<T> list = new LinkedList<>();
	    inOrder(list);
	    return list;
	}

	private void inOrder(List<T> list) {
	    List<GeneralTree<T>> children = this.getChildren();
	    if (!children.isEmpty()) {
	        children.get(0).inOrder(list); // Recorre el hijo 
	    }
	    list.add(getData()); // Agrega el nodo actual
	    for (int i = 1; i < children.size(); i++) {
	        children.get(i).inOrder(list); // 
	    }
	}
	
	public List<T> postOrder() {
	    List<T> list = new LinkedList<>();
	    postOrder(this, list);
	    return list;
	}

	private void postOrder(GeneralTree<T> node, List<T> list) {
	    if (node == null) return;
	    List<GeneralTree<T>> children = node.getChildren();
	    for (GeneralTree<T> child : children) {
	        postOrder(child, list);
	    }
	    list.add(node.getData()); 
	}
	
	public List<T> levelOrder() {
	    List<T> result = new LinkedList<>();
	    if (this.data == null) {
	    	return result;
	    }
	    Queue<GeneralTree<T>> queue = new Queue<>();
	    queue.enqueue(this); // Agregamos la raíz a la cola

	    while (!queue.isEmpty()) {
	        GeneralTree<T> current = queue.dequeue(); // Obtenemos el primer elemento de la cola
	        result.add(current.getData()); // Agregamos el dato del nodo actual al resultado

	        // Agregamos los hijos del nodo actual a la cola
	        List<GeneralTree<T>> children = current.getChildren();
	        for (GeneralTree<T> child : children) {
	            queue.enqueue(child);
	        }
	    }

	    return result;
	}
	
	public int altura() {
	    return altura(this);
	}
	
	private int altura(GeneralTree<T> node) {	 
		if (node == null) {
	        return 0;
	    } else {
	        int maxChildHeight = 0;
	        for (GeneralTree<T> child : node.getChildren()) {
		        maxChildHeight += 1;
	            maxChildHeight = Math.max(maxChildHeight, altura(child));
	        }
	        return maxChildHeight;
	    }
	}

	public int nivel(T dato){
		if (this.getData() == dato) {
	        return 0; // La raíz está en el nivel 0
	    }
	    Queue<GeneralTree<T>> queue = new Queue<>();
	    queue.enqueue(this);
	    int nivel = 0;
	    while (!queue.isEmpty()) {
	        int size = queue.size();
	        for (int i = 0; i < size; i++) {
	            GeneralTree<T> current = queue.dequeue();
	            for (GeneralTree<T> child : current.getChildren()) {
	            	nivel++;
	                if (child.getData() == dato) {
	                    return nivel;
	                }else {
	                	queue.enqueue(child);
	                }
	            }
	        }
	    }
	    return -1; // El dato no se encuentra en el árbol
	 }

	public int ancho(){
		
		return 0;
	}
}