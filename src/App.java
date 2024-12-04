import Materia.Stackss.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        runStack();
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
}
