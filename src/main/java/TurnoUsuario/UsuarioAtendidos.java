/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TurnoUsuario;

/**
 *
 * @author David
 */
public class UsuarioAtendidos {
    private ListaSimple lista;

    public UsuarioAtendidos() {
        lista = new ListaSimple(); // Inicializamos la lista simple
    }

    // Método para insertar un usuario en la pila (push)
    public void push(Usuario data) {
        lista.addFirst(data); // Insertamos al principio de la lista
    }

    // Método para remover el usuario del tope de la pila (pop)
    public Usuario pop() {
        return lista.removeFirst(); // Removemos y retornamos el usuario del tope
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    // Método para obtener el tamaño de la pila
    public int size() {
        return lista.getSize();
    }

    // Método para obtener el acceso a la lista interna
    public ListaSimple getLista() {
        return lista;
    }
}
