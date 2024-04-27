package TP3.ej8;

public class Navidad {
	
	private GeneralTree<Integer> tree;
	
	public Navidad(GeneralTree<Integer> tree) {
		this.tree = tree;
	}
	
	public boolean esAbetoNavidenio() {
		return esAbetoNavidenio(this.tree);
	}
	
	private boolean esAbetoNavidenio(GeneralTree<Integer> tree) {
		int nodos = 0;
        for(GeneralTree<Integer> child: tree.getChildren()) {
            if(child.isLeaf()) {
            	nodos++;
            }
            else if(!esAbetoNavidenio(child)) {
            	return false;
            }
        }
        return (nodos >= 3);
	}

}
