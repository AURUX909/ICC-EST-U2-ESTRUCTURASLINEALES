package Materia.Ejercicio_02_sorting;

import Materia.Stackss.Stack;

public class StackSorter {

    public void sortStack(Stack pilaOriginal) {
        if (pilaOriginal == null) throw new IllegalArgumentException("La pila no puede ser null");

        Stack pilaAuxiliar = new Stack();

        while (!pilaOriginal.isEmpty()) {
            int temporal = pilaOriginal.pop();

            while (!pilaAuxiliar.isEmpty() && pilaAuxiliar.peek() > temporal) {
                pilaOriginal.push(pilaAuxiliar.pop());
            }

            pilaAuxiliar.push(temporal);
        }

        while (!pilaAuxiliar.isEmpty()) {
            pilaOriginal.push(pilaAuxiliar.pop());
        }
    }
}