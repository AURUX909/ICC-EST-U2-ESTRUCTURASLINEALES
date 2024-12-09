package Materia.Modelos;

public class LinkedList<T> {
    private NodoGenerico<T> head; // Referencia al primer nodo
    private int size; // Contador del número de nodos

    // Constructor
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Método para agregar un nodo al final de la lista
    public void appendToTail(T value) {
        NodoGenerico<T> newNode = new NodoGenerico<>(value);
        if (head == null) {
            head = newNode;
        } else {
            NodoGenerico<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    // Método para buscar un nodo por su valor
    public NodoGenerico<T> findByValue(T value) {
        NodoGenerico<T> current = head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return current;
            }
            current = current.getNext();
        }
        return null; // No se encontró el valor
    }

    // Método para eliminar un nodo por su valor
    public boolean deleteByValue(T value) {
        if (head == null) {
            return false; // Lista vacía
        }

        if (head.getValue().equals(value)) {
            head = head.getNext();
            size--;
            return true;
        }

        NodoGenerico<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(value)) {
                current.setNext(current.getNext().getNext());
                size--;
                return true;
            }
            current = current.getNext();
        }

        return false; // No se encontró el valor
    }

    // Método para imprimir la lista
    public void print() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        NodoGenerico<T> current = head;
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("END");
    }

    // Getters y Setters
    public NodoGenerico<T> getHead() {
        return head;
    }

    public void setHead(NodoGenerico<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}