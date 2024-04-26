package TP3.ej6;

public class RedDeAguaPotable {
	
	private GeneralTree<Character> tree;
	
	public RedDeAguaPotable(GeneralTree<Character> tree) {
		this.tree = tree;
	}
	
	public double minimoCaudal(double caudal) {
		if(this.tree.isEmpty()) {
			return 0;
		}else {
			return minimoCaudal(this.tree, caudal);
		}
	}
	
	private double minimoCaudal(GeneralTree<Character> tree, double caudal) {
		if (tree.isLeaf()) {
            return caudal;
        }
        double cantPorCaudal = caudal / tree.getChildren().size();
        double caudalMin = Double.MAX_VALUE;
        for (GeneralTree<Character> child: tree.getChildren()) {
            double caudalHijo = minimoCaudal(child, cantPorCaudal);
            caudalMin = Math.min(caudalMin, caudalHijo);
        }
        return caudalMin;
	}
}
