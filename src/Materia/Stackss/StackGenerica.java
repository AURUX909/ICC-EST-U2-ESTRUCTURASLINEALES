package Materia.Stackss;

import java.util.EmptyStackException;

public class StackGenerica<T> {
    private Node<T> top;
    private int size;

    // Constructor
    public StackGenerica() {
        this.top = null;
        this.size = 0;
    }

    // Método para agregar un elemento a la pila
    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    // Método para quitar el elemento en la cima de la pila
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    // Método para consultar el elemento en la cima sin quitarlo
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return top == null;
    }

    // Método para obtener el tamaño de la pila
    public int getSize() {
        return size;
    }

    // Método para imprimir los elementos de la pila
    public void printStack() {
        Node<T> current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    // Clase interna para los nodos de la pila
    private static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
            this.next = null;
        }

        public E getValue() {
            return value;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}