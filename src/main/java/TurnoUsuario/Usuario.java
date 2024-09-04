/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TurnoUsuario;

/**
 *
 * @author David
 */
public class Usuario {
    private String nombre;
    private long id;

    // Constructor con argumentos
    public Usuario(String nombre, long id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Métodos obtener el nombre e ID
    public String getNombre() {
        return nombre;
    }

    public long getId() {
        return id;
    }
}
