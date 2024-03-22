package TP1.ej8;


public class DoubleEndedQueue<T> extends Queue<T> {
    
    public DoubleEndedQueue() {
        super();
    }

    public void enqueueFirst(T dato) {
        data.add(0, dato);
    }
}
