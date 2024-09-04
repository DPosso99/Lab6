/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack;

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

    public void addFirst(int data) {
        NodoSimple newNode = new NodoSimple(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía.");
        }
        int data = head.getData();
        head = head.getNext();
        size--;
        return data;
    }

    public int first() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía.");
        }
        return head.getData();
    }

    public void printList() {
        NodoSimple temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}

