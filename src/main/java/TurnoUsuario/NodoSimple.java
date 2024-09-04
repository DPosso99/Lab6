/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TurnoUsuario;

/**
 *
 * @author David
 */
public class NodoSimple {
    private Usuario data;
    private NodoSimple next;

    public NodoSimple(Usuario data) {
        this.data = data;
        this.next = null;
    }

    public Usuario getData() {
        return data;
    }

    public NodoSimple getNext() {
        return next;
    }

    public void setNext(NodoSimple next) {
        this.next = next;
    }
}
