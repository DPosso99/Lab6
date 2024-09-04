/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TurnoUsuario;

/**
 *
 * @author David
 */

import java.io.FileWriter;
import java.io.IOException;

public class TurnoUsuario {
    private Registro registro; // Cola para los usuarios que esperan su turno
    private UsuarioAtendidos usuarioAtendidos; // Pila para los usuarios atendidos
    private int version; // Contador para la versión de los archivos

    public TurnoUsuario() {
        registro = new Registro(); // Inicializamos la cola
        usuarioAtendidos = new UsuarioAtendidos(); // Inicializamos la pila
        version = 1; // Iniciamos el contador de versiones
    }

    // Método para registrar un usuario en la cola
    public void registrar(Usuario u) {
        registro.enqueue(u); // Insertamos el usuario en la cola
        System.out.println("Usuario registrado: " + u.getNombre() + " (ID: " + u.getId() + ")");
    }

    // Método para atender al siguiente usuario en la cola
    public Usuario atenderSiguiente() {
        if (!registro.isEmpty()) {
            Usuario usuario = registro.dequeue(); // Removemos el primer usuario de la cola
            usuarioAtendidos.push(usuario); // Lo insertamos en la pila de atendidos
            System.out.println("Usuario atendido: " + usuario.getNombre() + " (ID: " + usuario.getId() + ")");
            return usuario;
        }
        System.out.println("No hay usuarios en la cola para atender.");
        return null; // Si no hay usuarios en la cola
    }

    // Método para guardar los usuarios en archivos de texto con un número de versión
    public void toFile() {
        try {
            // Nombres de los archivos con la versión
            String pendientesFile = "usuariospendientes_" + version + ".txt";
            String atendidosFile = "usuariosatendidos_" + version + ".txt";

            // Guardar usuarios pendientes
            FileWriter pendientesWriter = new FileWriter(pendientesFile);
            NodoSimple current = registro.getLista().getHead();
            pendientesWriter.write("Usuarios en cola:\n");
            if (current == null) {
                pendientesWriter.write("No hay usuarios en la cola.\n");
            } else {
                while (current != null) {
                    Usuario u = current.getData();
                    pendientesWriter.write("Nombre: " + u.getNombre() + " - Id: " + u.getId() + "\n");
                    current = current.getNext();
                }
            }
            pendientesWriter.close();
            System.out.println("Archivo '" + pendientesFile + "' actualizado.");

            // Guardar usuarios atendidos
            FileWriter atendidosWriter = new FileWriter(atendidosFile);
            current = usuarioAtendidos.getLista().getHead();
            atendidosWriter.write("Usuarios atendidos:\n");
            if (current == null) {
                atendidosWriter.write("No hay usuarios atendidos.\n");
            } else {
                while (current != null) {
                    Usuario u = current.getData();
                    atendidosWriter.write("Nombre: " + u.getNombre() + " - Id: " + u.getId() + "\n");
                    current = current.getNext();
                }
            }
            atendidosWriter.close();
            System.out.println("Archivo '" + atendidosFile + "' actualizado.");

            // Incrementar la versión para la próxima llamada
            version++;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método main para probar el sistema
    public static void main(String[] args) {
        TurnoUsuario sistema = new TurnoUsuario();

        // Crear algunos usuarios como ejemplo
        Usuario u1 = new Usuario("Carlos Díaz", 12);
        Usuario u2 = new Usuario("Ana Camila", 23);
        Usuario u3 = new Usuario("Luis Velez", 34);
        Usuario u4 = new Usuario("Maria Constanza Torres", 45);
        Usuario u5 = new Usuario("Pedro Infante", 56);

        // Registrar los usuarios
        sistema.registrar(u1);
        sistema.registrar(u2);
        sistema.registrar(u3);
        sistema.registrar(u4);
        sistema.registrar(u5);

        // Guardar los usuarios pendientes en archivo (Primera llamada)
        sistema.toFile();

        // Atender dos usuarios
        sistema.atenderSiguiente();
        sistema.atenderSiguiente();

        // Guardar nuevamente en archivo tras atender dos usuarios (Segunda llamada)
        sistema.toFile();
    }
}
