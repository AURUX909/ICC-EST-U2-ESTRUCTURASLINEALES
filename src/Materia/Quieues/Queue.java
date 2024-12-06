package Materia.Quieues;

import Materia.Modelos.Cola;

public class Queue {
    private Cola frente; // Inicio de la cola
    private Cola rear;  // Final de la cola
    private int size;   // Tamaño de la cola

    // Constructor para inicializar la cola vacía
    public Queue() {
        this.frente = null;
        this.rear = null;
        this.size = 0;
    }

    // Método para encolar un elemento
    public void enqueue(int value) {
        Cola newCola = new Cola(value);
        if (isEmpty()) {
            frente = rear = newCola;
        } else {
            rear.setNext(newCola);
            rear = newCola;
        }
        size++;
    }

    // Método para desencolar un elemento
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int value = frente.getValue();
        frente = frente.getNext();
        if (frente == null) {
            rear = null; // Si la cola queda vacía, rear también debe ser null
        }
        size--;
        return value;
    }

    // Método para obtener el valor al frente de la cola sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.getValue();
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return frente == null;
    }

    // Método para obtener el tamaño de la cola
    public int getSize() {
        return size;
    }

    // Método para imprimir los elementos de la cola
    public void printQueue() {
        Cola current = frente;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}

