/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;
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

    // Método para insertar al inicio de la lista (ya implementado)
    public void addFirst(int data) {
        NodoSimple newNode = new NodoSimple(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    // Método para insertar al final de la lista (addLast)
    public void addLast(int data) {
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

    // Método para eliminar el primer elemento (ya implementado)
    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía.");
        }
        int data = head.getData();
        head = head.getNext();
        size--;
        return data;
    }

    // Método para obtener el primer elemento sin eliminarlo (ya implementado)
    public int first() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía.");
        }
        return head.getData();
    }

    // Método para imprimir la lista
    public void printList() {
        NodoSimple temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}
