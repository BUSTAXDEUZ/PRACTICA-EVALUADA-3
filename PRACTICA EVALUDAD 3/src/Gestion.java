/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fabia
 */
public class Gestion {
    private Estudiante[] estudiantes;
    private int maxEstudiantes;
    private int contador;

    // Constructor
    public Gestion(int maxEstudiantes) {
        this.maxEstudiantes = maxEstudiantes;
        this.estudiantes = new Estudiante[maxEstudiantes];
        this.contador = 0;
    }

    // Método para añadir estudiantes
    public void agregarEstudiante(Estudiante estudiante) {
        if (contador < maxEstudiantes) {
            estudiantes[contador] = estudiante;
            contador++;
        } else {
            System.out.println("No se pueden agregar más estudiantes.");
        }
    }

    // Método para consultar estudiantes
    public String consultarEstudiantes() {
        StringBuilder lista = new StringBuilder();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                lista.append(estudiante.toString()).append("\n");
            }
        }
        return lista.length() > 0 ? lista.toString() : "No hay estudiantes registrados.";
    }

    // Método para eliminar estudiantes
    public void eliminarEstudiante(String cedula) {
        for (int i = 0; i < contador; i++) {
            if (estudiantes[i] != null && estudiantes[i].getCedula().equals(cedula)) {
                estudiantes[i] = null;
                System.out.println("Estudiante eliminado.");
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }

    // Método para modificar estudiante
    public void modificarEstudiante(String cedula, String nuevoNombre, String nuevosApellidos) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.getCedula().equals(cedula)) {
                estudiante.setNombre(nuevoNombre);
                estudiante.setApellidos(nuevosApellidos);
                System.out.println("Estudiante modificado.");
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }
}