package TP1.ej7;

import java.util.ArrayList;
import java.util.List;

public class ListaCapicua {
	
	private List<Integer> listaCapicua;
	
	public ListaCapicua() {
		listaCapicua = new ArrayList<Integer>();
	}
	
	public void add(int num) {
		listaCapicua.add(num);
	}
	
	public void imprimir() {
		for(Integer i: listaCapicua) {
			System.out.print(i+" ");
		}
	}
	
	public boolean esCapicua() {
		int inicio = 0;
		int fin = listaCapicua.size() - 1;
    
		while (inicio < fin) {
			if (!listaCapicua.get(inicio).equals(listaCapicua.get(fin))) {
				return false;
			}
			inicio++;
			fin--;
		}
   
		return true;	
	}
	
	
	
	public static void main(String[] args) {
		ListaCapicua lista = new ListaCapicua(); 
		lista.add(8);
		lista.add(1);
		lista.add(3);
		lista.add(1);
		lista.add(8);
		lista.imprimir();
		System.out.println("¿La lista es capicúa? " + lista.esCapicua());
    }
	

}
