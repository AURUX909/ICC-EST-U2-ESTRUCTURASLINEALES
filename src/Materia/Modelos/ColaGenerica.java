package Materia.Modelos;

public class ColaGenerica<T> {
    private T value;
    private ColaGenerica<T> next;

    public ColaGenerica(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ColaGenerica<T> getNext() {
        return next;
    }

    public void setNext(ColaGenerica<T> next) {
        this.next = next;
    }
}