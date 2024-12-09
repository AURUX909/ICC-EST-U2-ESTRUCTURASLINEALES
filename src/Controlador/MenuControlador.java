package Controlador;

import Materia.Modelos.Contacto;
import Vista.ConsolaVista;

public class MenuControlador {
    private ContactoAgente contactoAgente;
    private ConsolaVista consolaVista;

    public MenuControlador() {
        this.contactoAgente = new ContactoAgente();
        this.consolaVista = new ConsolaVista();
    }

    public void showMenu() {
        boolean exit = false;
        while (!exit) {
            consolaVista.displayMenu();
            String opcion = consolaVista.getInput("Seleccione una opción: ");
            
            switch (opcion) {
                case "1":
                    añadirContacto();
                    break;
                case "2":
                    encontrarContacto();
                    break;
                case "3":
                    eliminarContacto();
                    break;
                case "4":
                    contactoAgente.printList();
                    break;
                case "5":
                    exit = true;
                    consolaVista.showMessage("Saliendo del programa...");
                    break;
                default:
                    consolaVista.showMessage("Opción inválida, intente nuevamente");
                    break;
            }
        }
    }

    private void añadirContacto() {
        String nombre = consolaVista.getInput("Ingrese el nombre: ");
        String telefono = consolaVista.getInput("Ingrese el teléfono: ");
        Contacto<String, String> contacto = new Contacto<>(nombre, telefono);
        contactoAgente.añadirContacto(contacto);
        consolaVista.showMessage("Contacto añadido exitosamente");
    }

    private void encontrarContacto() {
        String nombre = consolaVista.getInput("Ingrese el nombre a buscar: ");
        Contacto<String, String> contacto = contactoAgente.encontrarContactoPorNombre(nombre);
        if (contacto != null) {
            consolaVista.showMessage("Contacto encontrado: " + contacto.toString());
        } else {
            consolaVista.showMessage("Contacto no encontrado");
        }
    }

    private void eliminarContacto() {
        String nombre = consolaVista.getInput("Ingrese el nombre del contacto a eliminar: ");
        if (contactoAgente.eliminarContactoPorNombre(nombre)) {
            consolaVista.showMessage("Contacto eliminado exitosamente");
        } else {
            consolaVista.showMessage("No se pudo eliminar el contacto");
        }
    }
}
