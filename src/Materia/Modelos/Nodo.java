package Materia.Modelos;

public class Nodo { 
    private int value;
    private Nodo next; 

    // Constructor
    public Nodo(int value) {
        this.value = value;
        this.next = null;
    }
    @Override
    public String toString() {
        return "Nodo [value=" + value + ", next=" + next + "]";
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }

    
}