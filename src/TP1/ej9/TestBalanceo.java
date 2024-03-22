package TP1.ej9;

import java.util.Stack;

public class TestBalanceo {
    
    public static boolean verificarBalance(String cadena) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : cadena.toCharArray()) {
            if (caracter == '(' || caracter == '[' || caracter == '{') {
                pila.push(caracter);
            } else if (caracter == ')' || caracter == ']' || caracter == '}') {
                if (pila.isEmpty()) {
                    return false; // Si la pila está vacía y encontramos un cierre, no está balanceado
                }
                char apertura = pila.pop();
                if ((caracter == ')' && apertura != '(') ||
                    (caracter == ']' && apertura != '[') ||
                    (caracter == '}' && apertura != '{')) {
                    return false; // Si el cierre no coincide con la apertura correspondiente, no está balanceado
                }
            }
        }

        return pila.isEmpty(); // Si la pila está vacía al final, está balanceado
    }

    public static void main(String[] args) {
        String cadena1 = "{( ) [ ( [ ] ) ] }";
        String cadena2 = "( [ ) ]";

        System.out.println("¿La cadena 1 está balanceada? " + verificarBalance(cadena1));
        System.out.println("¿La cadena 2 está balanceada? " + verificarBalance(cadena2));
    }
}
