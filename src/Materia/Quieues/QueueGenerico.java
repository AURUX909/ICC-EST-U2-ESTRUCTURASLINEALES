package Materia.Quieues;

import Materia.Modelos.ColaGenerica;
import java.util.NoSuchElementException;

public class QueueGenerico<T> {
    private ColaGenerica<T> frente;
    private ColaGenerica<T> rear;
    private int size;

    public QueueGenerico() {
        this.frente = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(T value) {
        ColaGenerica<T> newCola = new ColaGenerica<>(value);
        if (isEmpty()) {
            frente = rear = newCola;
        } else {
            rear.setNext(newCola);
            rear = newCola;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        T value = frente.getValue();
        frente = frente.getNext();
        if (frente == null) {
            rear = null;
        }
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return frente.getValue();
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        ColaGenerica<T> current = frente;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}