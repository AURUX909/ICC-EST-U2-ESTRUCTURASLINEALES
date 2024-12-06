import Materia.Quieues.Queue;
import Materia.Stackss.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Pila ===");
        runStack();

        System.out.println("\n=== Cola ===");
        runQueue();
    }

    public static void runStack(){
        Stack stack = new Stack();
        //Agregar elemento a la pila
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        //Mostrar valores
        System.out.println("Cima    -> " + stack.peek());
        
        //Sacar elemento de la pila
        System.out.println("Retirar -> " + stack.pop());

        System.out.println("Cima    -> " + stack.peek());

        System.out.println("Retirar -> " + stack.pop());

        System.out.println("Cima    -> " + stack.peek());
        
        System.out.println("Retirar -> " + stack.pop());

        System.out.println("Cima    -> " + stack.peek());
        
        System.out.println("Retirar -> " + stack.pop());
    }

    public static void runQueue() {
        Queue queue = new Queue();

        // Encolar elementos
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        // Imprimir la cola
        System.out.println("Elementos en la cola:");
        queue.printQueue();

        // Desencolar elementos y mostrar los valores
        System.out.println("Desencolando: " + queue.dequeue());
        System.out.println("Desencolando: " + queue.dequeue());

        // Mostrar el frente de la cola
        System.out.println("Frente de la cola: " + queue.peek());

        // Imprimir la cola nuevamente
        System.out.println("Elementos restantes en la cola:");
        queue.printQueue();
    }
}