package Materia.Stackss;

import Materia.Modelos.Nodo;
import java.util.EmptyStackException;

public class Stack {
    private Nodo top; //Nodo es la cima de nuestra pila
    private int size; //Contador para el tamaño de la pila

    //Creacmos la pila con la cima nula o vacia
    public Stack(){
        this.top = null;
        this.size = 0;
    }

    public void push(int value){
        Nodo nudo = new Nodo(value);
        nudo.setNext(top);
        top = nudo;
        size++;
    }
    //Metodo que retira el nodo de la cima
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }
    //Metodo que retorna el valor del nodo de la cima
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;
    }
    public void printStack(){
        Nodo current = top;
        while(current != null){
            System.out.println(current.getValue()); 
            current = current.getNext();
        }
    }
    //Copejidad O(a)
    public int getSize(){
        return size;
    }
}
