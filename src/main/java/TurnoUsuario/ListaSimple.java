/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TurnoUsuario;

/**
 *
 * @author David
 */
public class ListaSimple {
    private NodoSimple head;
    private int size;

    public ListaSimple() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Añadir un usuario al inicio de la lista
    public void addFirst(Usuario data) {
        NodoSimple newNode = new NodoSimple(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    // Añadir un usuario al final de la lista
    public void addLast(Usuario data) {
        NodoSimple newNode = new NodoSimple(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            NodoSimple temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;
    }

    // Eliminar y devolver el primer usuario de la lista
    public Usuario removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía.");
        }
        Usuario data = head.getData(); // Obtener datos del primer nodo
        head = head.getNext(); // Avanzar al siguiente nodo
        size--;
        return data; // Retornar el primer usuario
    }

    // Obtener el primer nodo de la lista
    public NodoSimple getHead() {
        return head; // Retornamos el nodo head
    }
}
