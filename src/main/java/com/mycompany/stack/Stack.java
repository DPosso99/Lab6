/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stack;

/**
 *
 * @author David
 */
public class Stack {
    private ListaSimple lista;

    public Stack() {
        lista = new ListaSimple(); // Inicializamos la lista simple
    }

    public void push(int data) {
        lista.addFirst(data); // Insertamos al principio de la lista
    }

    public int pop() {
        return lista.removeFirst(); // Removemos el primer elemento de la lista
    }

    public int top() {
        return lista.first(); // Devolvemos el primer elemento sin eliminarlo
    }

    public boolean isEmpty() {
        return lista.isEmpty(); // Verificamos si la lista está vacía
    }

    public int size() {
        return lista.getSize(); // Retornamos el tamaño de la pila
    }

    public void printStack() {
        lista.printList(); // Imprime la lista completa (pila)
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Insertar los valores enteros 2, 4, 6, 8, 10
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(10);

        // Imprimir el contenido de la pila
        System.out.println("Pila completa:");
        stack.printStack();

        // Remover los elementos de la pila y mostrarlos
        System.out.println("\nRemoviendo los elementos de la pila:");
        while (!stack.isEmpty()) {
            System.out.println("Removido: " + stack.pop());
            System.out.println("Pila actualizada");
            stack.printStack();
        }
        
        while (stack.isEmpty()){
            System.out.println("Pila vacia");
            break;  
        }
    }
}
