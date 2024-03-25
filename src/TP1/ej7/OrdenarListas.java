package TP1.ej7;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarListas {
	
	public ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
		 ArrayList<Integer> listaCombinada = new ArrayList<Integer>();
		 // listaCombinada.addAll(lista1);
		 // listaCombinada.addAll(lista2);
		 // Collections.sort(listaCombinada);
		 
		 int i = 0, j = 0;
	        while (i < lista1.size() && j < lista2.size()) {
	            if (lista1.get(i) < lista2.get(j)) {
	                listaCombinada.add(lista1.get(i));
	                i++;
	            } else {
	                listaCombinada.add(lista2.get(j));
	                j++;
	            }
	        }
	        
	        while (i < lista1.size()) {
	            listaCombinada.add(lista1.get(i));
	            i++;
	        }
	        
	        while (j < lista2.size()) {
	            listaCombinada.add(lista2.get(j));
	            j++;
	        }

		 return listaCombinada;
	}
	
	public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista1.add(7);
        lista1.add(9);
        lista1.add(16);
        lista1.add(22);
        lista1.add(49);
        
        lista2.add(2);
        lista2.add(11);
        lista2.add(40);
        lista2.add(65);
        lista2.add(86);
        
        OrdenarListas ordenador = new OrdenarListas(); // Crear una instancia de la clase
        ArrayList<Integer> listaOrdenada = ordenador.combinarOrdenado(lista1, lista2); // Llamar al método sobre la instancia creada
        
        System.out.println("Lista ordenada: " + listaOrdenada);
        
                
    }

}
