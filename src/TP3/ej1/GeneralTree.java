package TP3.ej1;

import java.util.LinkedList;
import java.util.List;

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
	    List<GeneralTree<T>> children = getChildren();
	    if (!children.isEmpty()) {
	        children.get(0).inOrder(list); // Recorre el hijo izquierdo
	    }
	    list.add(getData()); // Agrega el nodo actual
	    for (int i = 1; i < children.size(); i++) {
	        children.get(i).inOrder(list); // Recorre los hijos derechos
	    }
	}
	
	public int altura() {	 
			
		return 0;
	}
	
	public int nivel(T dato){
		return 0;
	  }

	public int ancho(){
		
		return 0;
	}
}