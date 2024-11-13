/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Fabia
 */
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Gestion gestion = new Gestion(10); // Capacidad máxima de 10 estudiantes
        String menu = "1. Agregar Estudiante\n2. Consultar Estudiantes\n3. Eliminar Estudiante\n4. Modificar Estudiante\n5. Salir";
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    String cedula = JOptionPane.showInputDialog("Ingrese la cédula:");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
                    String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos:");
                    Estudiante estudiante = new Estudiante(cedula, nombre, apellidos);
                    gestion.agregarEstudiante(estudiante);
                    break;
                case 2:
                    String listaEstudiantes = gestion.consultarEstudiantes();
                    JOptionPane.showMessageDialog(null, listaEstudiantes);
                    break;
                case 3:
                    String cedulaEliminar = JOptionPane.showInputDialog("Ingrese la cédula del estudiante a eliminar:");
                    gestion.eliminarEstudiante(cedulaEliminar);
                    break;
                case 4:
                    String cedulaModificar = JOptionPane.showInputDialog("Ingrese la cédula del estudiante a modificar:");
                    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                    String nuevosApellidos = JOptionPane.showInputDialog("Ingrese los nuevos apellidos:");
                    gestion.modificarEstudiante(cedulaModificar, nuevoNombre, nuevosApellidos);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
}