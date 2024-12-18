import Controlador.MenuControlador;
import Materia.Ejercicio_01_sign.SignValidator;
import Materia.Ejercicio_02_sorting.StackSorter;
import Materia.Quieues.Queue;
import Materia.Quieues.QueueGenerico;
import Materia.Screen;
import Materia.Stackss.Stack;
import Materia.Stackss.StackGenerica;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║         Ejercicios de Práctica         ║");
            System.out.println("╠════════════════════════════════════════╣");
            System.out.println("║ 1. Validación de Signos                ║");
            System.out.println("║ 2. Ordenamiento de Pila                ║");
            System.out.println("║ 3. Menú Contacto Agente                ║");
            System.out.println("║ 4. Pilas                               ║");
            System.out.println("║ 5. Colas                               ║");
            System.out.println("║ 6. Pilas Genéricas                     ║");
            System.out.println("║ 7. Colas Genéricas                     ║");
            System.out.println("║ 0. Salir                               ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: probarValidacionSignos(); break;
                case 2: probarOrdenamientoPila(); break;
                case 3: runContactoAgente(); break;
                case 4: runStack(); break;
                case 5: runQueue(); break;
                case 6: runStackGenericExample(); break;
                case 7: runQueueGenericoExample(); break;
                case 0: System.out.println("¡Hasta luego!"); break;
                default: System.out.println("Opción no válida");
            }
        } while (opcion != 0);
        
        scanner.close();
    }

    public static void runContactoAgente() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║                  Menú                  ║");
        System.out.println("╚════════════════════════════════════════╝");
        MenuControlador menuControlador = new MenuControlador();
        menuControlador.showMenu();
    }

    public static void runStack() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║                Pilas                   ║");
        System.out.println("╚════════════════════════════════════════╝");
        
        Stack stack = new Stack();
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        System.out.println("Cima    -> " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Retirar -> " + stack.pop());
            if (!stack.isEmpty()) {
                System.out.println("Cima    -> " + stack.peek());
            }
        }
    }

    public static void runQueue() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║                Colas                   ║");
        System.out.println("╚════════════════════════════════════════╝");
        
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Elementos en la cola:");
        queue.printQueue();

        System.out.println("Desencolando: " + queue.dequeue());
        System.out.println("Desencolando: " + queue.dequeue());

        System.out.println("Frente de la cola: " + queue.peek());

        System.out.println("Elementos restantes en la cola:");
        queue.printQueue();
    }

    public static void runStackGenericExample() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║         Pilas Genéricas                ║");
        System.out.println("╚════════════════════════════════════════╝");
        
        StackGenerica<Screen> screenStack = new StackGenerica<>();

        screenStack.push(new Screen(1, "Home Page", "/home"));
        screenStack.push(new Screen(2, "Menu Page", "/home/menu"));
        screenStack.push(new Screen(3, "User Page", "/home/menu/users"));

        System.out.println("Pantalla actual: " + screenStack.peek().getRoute());

        while (!screenStack.isEmpty()) {
            System.out.println("Volver a: " + screenStack.pop().getRoute());
        }
    }

    public static void runQueueGenericoExample() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║         Colas Genéricas                ║");
        System.out.println("╚════════════════════════════════════════╝");
        
        QueueGenerico<Screen> screenQueue = new QueueGenerico<>();

        screenQueue.enqueue(new Screen(1, "Computer", "/Home"));
        screenQueue.enqueue(new Screen(2, "Files", "/Home/files"));
        screenQueue.enqueue(new Screen(3, "Documents", "/Home/files/documents"));

        System.out.println("Tamaño actual de la cola: " + screenQueue.getSize());

        System.out.println("Pantalla actual: " + screenQueue.peek().getRoute());

        while (!screenQueue.isEmpty()) {
            System.out.println("Procesando pantalla: " + screenQueue.dequeue().getRoute());
            System.out.println("Tamaño restante de la cola: " + screenQueue.getSize());
        }
    }

    public static void probarValidacionSignos() {
        SignValidator validador = new SignValidator();
        String[] pruebas = {"([]){}", "({)}", "", "((()))", "([)]"};
        String[] descripciones = {"Caso básico válido", "Caso con signos mal anidados", "Cadena vacía", "Paréntesis anidados", "Signos entrecruzados"};

        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║        Prueba Validación de Signos     ║");
        System.out.println("╠════════════════════════════════════════╣");

        for (int i = 0; i < pruebas.length; i++) {
            String resultado = validador.isValidString(pruebas[i]) ? "✓ Válido" : "✗ Inválido";
            System.out.printf("║ Test %d: %-30s ║\n", (i + 1), pruebas[i].isEmpty() ? "[Cadena vacía]" : pruebas[i]);
            System.out.printf("║ %s: %-27s ║\n", descripciones[i], resultado);
            if (i < pruebas.length - 1) {
                System.out.println("╟────────────────────────────────────────╢");
            }
        }
        System.out.println("╚════════════════════════════════════════╝");
    }

    public static void probarOrdenamientoPila() {
        Stack pila = new Stack();
        pila.push(2);
        pila.push(4);
        pila.push(1);
        pila.push(5);

        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║        Prueba Ordenamiento de Pila     ║");
        System.out.println("╠════════════════════════════════════════╣");
        
        // Mostrar pila original horizontalmente
        System.out.print("║ Original: ");
        Stack pilaTemp = new Stack();
        while (!pila.isEmpty()) {
            int elemento = pila.pop();
            System.out.print(elemento);
            if (!pila.isEmpty()) System.out.print(" -> ");
            pilaTemp.push(elemento);
        }
        System.out.println(" ║");

        // Restaurar pila
        while (!pilaTemp.isEmpty()) {
            pila.push(pilaTemp.pop());
        }

        // Ordenar
        StackSorter ordenador = new StackSorter();
        ordenador.sortStack(pila);

        // Mostrar pila ordenada horizontalmente
        System.out.print("║ Ordenada: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
            if (!pila.isEmpty()) System.out.print(" -> ");
        }
        System.out.println(" ║");
        System.out.println("╚════════════════════════════════════════╝");
    }
}