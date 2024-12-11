package Controlador;

import Materia.Modelos.Contacto;
import Materia.Modelos.LinkedList;
import Materia.Modelos.NodoGenerico;

public class ContactoAgente {
    private LinkedList<Contacto<String, String>> contactos;

    public ContactoAgente() {
        this.contactos = new LinkedList<>();
    }

    public void añadirContacto(Contacto<String, String> contacto) {
        contactos.appendToTail(contacto);
    }

    public Contacto<String, String> encontrarContactoPorNombre(String nombre) {
        NodoGenerico<Contacto<String, String>> current = contactos.getHead();
        while (current != null) {
            if (current.getValue().getNombre().equalsIgnoreCase(nombre)) { // Mejora añadida
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean eliminarContactoPorNombre(String nombre) {
        NodoGenerico<Contacto<String, String>> current = contactos.getHead();

        if (current == null)
            return false; // Lista vacía

        // Caso 1: El nodo a eliminar es la cabeza
        if (current.getValue().getNombre().equalsIgnoreCase(nombre)) {
            contactos.setHead(current.getNext());
            contactos.setSize(contactos.getSize() - 1); // Actualizamos tamaño
            return true;
        }

        // Caso 2: Nodo intermedio o al final
        while (current.getNext() != null) {
            if (current.getNext().getValue().getNombre().equalsIgnoreCase(nombre)) {
                current.setNext(current.getNext().getNext());
                contactos.setSize(contactos.getSize() - 1);
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public void printList() {
        if (contactos.getHead() == null) {
            System.out.println("La lista de contactos está vacía");
            return;
        }

        NodoGenerico<Contacto<String, String>> current = contactos.getHead();
        while (current != null) {
            System.out.println(current.getValue().toString());
            current = current.getNext();
        }
    }
}