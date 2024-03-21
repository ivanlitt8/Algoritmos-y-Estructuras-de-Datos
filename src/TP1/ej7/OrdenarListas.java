package TP1.ej7;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarListas {
	
	public ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
		 ArrayList<Integer> listaCombinada = new ArrayList<Integer>();
		 listaCombinada.addAll(lista1);
		 listaCombinada.addAll(lista2);
		 
		 Collections.sort(listaCombinada);

		 return listaCombinada;
	}
	
	public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista1.add(7);
        lista1.add(23);
        lista1.add(53);
        lista1.add(11);
        lista1.add(19);
        
        lista2.add(22);
        lista2.add(12);
        lista2.add(2);
        lista2.add(5);
        lista2.add(26);
        
        OrdenarListas ordenador = new OrdenarListas(); // Crear una instancia de la clase
        ArrayList<Integer> listaOrdenada = ordenador.combinarOrdenado(lista1, lista2); // Llamar al método sobre la instancia creada
        
        System.out.println("Lista ordenada: " + listaOrdenada);
        
                
    }

}
