package Materia.Modelos;

public class Cola {
    private int value; // Valor del nodo
    private Cola next; // Apunta al siguiente nodo

    // Constructor
    public Cola(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Cola getNext() {
        return next;
    }

    public void setNext(Cola next) {
        this.next = next;
    }
}