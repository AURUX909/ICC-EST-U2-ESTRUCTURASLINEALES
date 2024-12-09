package Materia.Modelos;

public class Contacto<T, U> {
    private T nombre;
    private U telefono;

    public Contacto(T nombre, U telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public U getTelefono() {
        return telefono;
    }

    public void setTelefono(U telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{nombre=" + nombre + ", telefono=" + telefono + "}";
    }
}