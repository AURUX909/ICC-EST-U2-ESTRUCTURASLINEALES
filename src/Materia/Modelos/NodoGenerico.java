package Materia.Modelos;

public class NodoGenerico<T> {
    private T value;
    private NodoGenerico<T> next;

    public NodoGenerico(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodoGenerico<T> getNext() {
        return next;
    }

    public void setNext(NodoGenerico<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodoGenerico{value=" + value + '}';
    }
}