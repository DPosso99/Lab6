/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author David
 */
public class Queue {
    private ListaSimple lista;

    public Queue() {
        lista = new ListaSimple(); // Inicializamos la lista simple
    }

    // Método para insertar un elemento en la cola (enqueue)
    public void enqueue(int data) {
        lista.addLast(data); // Insertamos al final de la lista
    }

    // Método para remover el primer elemento de la cola (dequeue)
    public int dequeue() {
        return lista.removeFirst(); // Removemos el primer elemento de la lista
    }

    // Método que retorna el primer elemento sin removerlo (front/peek)
    public int front() {
        return lista.first(); // Devolvemos el primer elemento sin eliminarlo
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return lista.isEmpty(); // Verificamos si la lista está vacía
    }

    // Método para obtener el tamaño de la cola
    public int size() {
        return lista.getSize(); // Retornamos el tamaño de la cola
    }

    // Método para imprimir el contenido de la cola
    public void printQueue() {
        lista.printList(); // Imprime la lista completa (cola)
    }

    // Método main para probar la clase Queue
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Insertar los valores enteros 2, 4, 6, 8, 10 en la cola
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(10);

        // Imprimir el contenido de la cola
        System.out.println("Cola completa:");
        queue.printQueue();

        // Remover los elementos de la cola y mostrarlos
        System.out.println("\nRemoviendo los elementos de la cola:");
        while (!queue.isEmpty()) {
            System.out.println("Removido: " + queue.dequeue());
            System.out.println("Cola actualizada");
            queue.printQueue();
        }
        while (queue.isEmpty()){
            System.out.println("Cola vacia");
            break;
        }
    }
}
