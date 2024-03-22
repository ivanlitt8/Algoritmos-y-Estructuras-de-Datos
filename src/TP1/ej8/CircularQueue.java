package TP1.ej8;

import java.util.ArrayList;
import java.util.List;

public class CircularQueue<T> extends Queue<T> {
    
    public CircularQueue() {
        super();
    }

    public T shift() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía.");
        }
        T element = dequeue(); // Elimina el elemento del frente de la cola
        enqueue(element); // Agrega el elemento eliminado al final de la cola
        return element; // Retorna el elemento eliminado
    }
}