package TP1.ej5;

public class Estadisticas {
	private int maximo;
	private int minimo;
	private double promedio;
	private int[] array;
	
	@Override
	public String toString() {
		return "\nMétodo C:\n"+ maximo + "," + minimo + "," + promedio;
	}

	public Estadisticas() {
		
	}
	
	public Estadisticas(int[] arr) {
		this.array = arr;
	}
	
	public String puntoA (int[] arreglo) {
		System.out.println("Método A:");
		int max = getMaximo(arreglo);
		int min = getMinimo(arreglo);
	    double prom = getPromedio(arreglo);
	    
		String resultados = max+","+min+","+prom;
		return resultados;
    }
	
	public String puntoB() {
		System.out.println("\nMétodo B:");
        int max = getMaximo(this.array);
        int min = getMinimo(this.array);
        double prom = getPromedio(this.array);
        
        String resultados = max+","+min+","+prom;
        return resultados;
	}
	
	public void datos(int[] arreglo) {
		maximo = getMaximo(this.array);
        minimo = getMinimo(this.array);
        promedio = getPromedio(this.array);
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

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
	
}
