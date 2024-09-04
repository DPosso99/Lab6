/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack;

/**
 *
 * @author David
 */
public class NodoSimple {
    private int data;
    private NodoSimple next;

    public NodoSimple(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public NodoSimple getNext() {
        return next;
    }

    public void setNext(NodoSimple next) {
        this.next = next;
    }
}
