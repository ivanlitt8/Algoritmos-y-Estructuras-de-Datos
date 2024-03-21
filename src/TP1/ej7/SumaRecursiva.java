package TP1.ej7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class SumaRecursiva {
	
	public int sumarLinkedList(LinkedList<Integer> lista) {
		return sumaRecursiva(lista, lista.size()-1);
	}
	
	public int sumaRecursiva(LinkedList<Integer> lista, int pos){
		if(pos!=0) {
			return lista.get(pos)+sumaRecursiva(lista, pos-1);
		}else {
			 return lista.get(pos);
		}
	}
	
	public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        for (Integer integer : numeros) {
			System.out.println(integer+" ");
		}
        SumaRecursiva sumaRecursiva = new SumaRecursiva();
        int resultado = sumaRecursiva.sumarLinkedList(numeros);
        System.out.println("La suma recursiva de la lista es: " + resultado);
    }

}
