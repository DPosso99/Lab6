/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TurnoUsuario;

/**
 *
 * @author David
 */
public class Registro {
    private ListaSimple lista;

    public Registro() {
        lista = new ListaSimple(); // Inicializamos la lista simple
    }

    // Método para insertar un usuario al final de la cola (enqueue)
    public void enqueue(Usuario data) {
        lista.addLast(data); // Insertamos al final de la lista
    }

    // Método para remover el primer usuario de la cola (dequeue)
    public Usuario dequeue() {
        return lista.removeFirst(); // Removemos y retornamos el primer usuario de la lista
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    // Método para obtener el tamaño de la cola
    public int size() {
        return lista.getSize();
    }

    // Método para obtener el acceso a la lista interna (solo una vez)
    public ListaSimple getLista() {
        return lista;
    }
}

