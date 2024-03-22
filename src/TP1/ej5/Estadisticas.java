package TP1.ej5;

public class Estadisticas {
	private int maximo;
	private int minimo;
	private double promedio;
	
	public Estadisticas(int[] data) {
		this.maximo = getMaximo(data);
		this.minimo = getMinimo(data);
		this.promedio = getPromedio(data);
	}
	
	public int getMaximo(int[] array) {
		int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public int getMinimo(int[] array) {
		int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public double getPromedio(int[] array) {
		double prom = 0;
        for (int num : array) {
            prom = prom + num;
        }
        prom = prom / array.length;
        return prom;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "Estadisticas [maximo=" + maximo + ", minimo=" + minimo + ", promedio=" + promedio + "]";
	}
	
}
