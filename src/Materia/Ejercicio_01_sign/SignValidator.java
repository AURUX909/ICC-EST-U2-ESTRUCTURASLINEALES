package Materia.Ejercicio_01_sign;

import Materia.Stackss.StackGenerica;

public class SignValidator {

    public boolean isValidString(String cadena) {
        if (cadena == null || cadena.isEmpty()) return false;

        StackGenerica<Character> pila = new StackGenerica<>();

        for (char caracter : cadena.toCharArray()) {
            if (esSignoApertura(caracter)) {
                pila.push(caracter);
            } else if (esSignoCierre(caracter)) {
                if (pila.isEmpty() || !sonSignosCorrespondientes(pila.pop(), caracter)) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    private boolean esSignoApertura(char caracter) {
        return caracter == '(' || caracter == '{' || caracter == '[';
    }

    private boolean esSignoCierre(char caracter) {
        return caracter == ')' || caracter == '}' || caracter == ']';
    }

    private boolean sonSignosCorrespondientes(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '{' && cierre == '}') ||
               (apertura == '[' && cierre == ']');
    }
}