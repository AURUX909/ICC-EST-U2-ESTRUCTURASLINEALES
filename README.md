# Práctica de Laboratorio: Estructuras Lineales (Pilas y Colas)

**Versión:** 2.0.2  
**Autor:** Andres Renato Yadaicela Uyaguari  

## Descripción General
Este proyecto implementa ejercicios prácticos relacionados con estructuras de datos lineales: pilas y colas. Los ejercicios permiten aplicar conceptos teóricos y reflejan casos de uso comunes en la programación.

### Ejercicio 01: Validación de Signos

- **Descripción:**  
  Implementa un validador para strings con los caracteres `()`, `{}`, `[]`. Determina si están anidados y cerrados en el orden correcto.
  
- **Detalles Técnicos:**  
  Utiliza pilas para rastrear los signos de apertura y verificar correspondencias con los signos de cierre.

- **Ejemplo de Entrada y Salida:**
  | Entrada        | Salida     |
  |----------------|------------|
  | `([]){}`       | Válido     |
  | `({)}{}`       | Inválido   |

### Ejercicio 02: Ordenamiento de un Stack

- **Descripción:**  
  Ordena una pila de números enteros, colocando el menor elemento en el tope.  
  Se permite usar solo pilas auxiliares para realizar las operaciones de ordenamiento.  
  
- **Detalles Técnicos:**  
  Mediante operaciones de `push()` y `pop()` se utiliza una pila auxiliar como soporte para el ordenamiento.

- **Ejemplo de Entrada y Salida:**
  | Entrada        | Salida    |
  |----------------|-----------|
  | 5 → 1 → 4 → 2  | 1 → 2 → 4 → 5 |

## Instrucciones de Uso
1. Clonar el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/AURUX909/ICC-EST-U2-ESTRUCTURASLINEALES.git