package Vista;

import java.util.Scanner;

public class ConsolaVista {
    private final Scanner scanner;

    public ConsolaVista() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("=== Menú de Contactos ===");
        System.out.println("1. Añadir Contacto");
        System.out.println("2. Buscar Contacto");
        System.out.println("3. Eliminar Contacto");
        System.out.println("4. Mostrar Todos los Contactos");
        System.out.println("5. Salir");
        System.out.println("Elija una opción:");
    }

    public String getInput(String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}