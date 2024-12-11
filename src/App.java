import Controlador.MenuControlador;
import Materia.Quieues.Queue;
import Materia.Quieues.QueueGenerico;
import Materia.Screen;
import Materia.Stackss.Stack;
import Materia.Stackss.StackGenerica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n==Menu==");
        runContactoAgente();

        System.out.println("\n=== Pila ===");
        runStack();

        System.out.println("\n=== Cola ===");
        runQueue();

        System.out.println("\n=== Pila Genérica ===");
        runStackGenericExample();

        System.out.println("\n=== Cola Genérica ===");
        runQueueGenericoExample();
    }

    public static void runContactoAgente() {
        MenuControlador menuControlador = new MenuControlador();
        menuControlador.showMenu();
    }

    public static void runStack() {
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
        QueueGenerico<Screen> screenQueue = new QueueGenerico<>();

        // Agregar pantallas a la cola
        screenQueue.enqueue(new Screen(1, "Computer", "/Home"));
        screenQueue.enqueue(new Screen(2, "Files", "/Home/files"));
        screenQueue.enqueue(new Screen(3, "Documents", "/Home/files/documents"));

        // Mostrar el tamaño actual de la cola
        System.out.println("Tamaño actual de la cola: " + screenQueue.getSize());

        System.out.println("Pantalla actual: " + screenQueue.peek().getRoute());

        // Procesar y mostrar todas las pantallas
        while (!screenQueue.isEmpty()) {
            System.out.println("Procesando pantalla: " + screenQueue.dequeue().getRoute());
            // Mostrar el tamaño actualizado después de cada dequeue
            System.out.println("Tamaño restante de la cola: " + screenQueue.getSize());
        }
    }
}