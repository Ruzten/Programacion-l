import javax.swing.*;
import java.util.ArrayList;

// mostrar primero el menu, ingresar el entero, si es igual a 1 entonces motrar tal cosa, al final dar la opcion de volver al menu y finalizar


public class Main {
    public static void main(String[] args) {

        ArrayList<estudiante> listaestudiantes = new ArrayList();

        while (true) {
            String opcion = JOptionPane.showInputDialog("*** OPCIONES ***\n" +
                    "1). Añadir estudiante\n" +
                    "2). Modificar estudiante\n" +
                    "3). Borrar estudiante");

            if (opcion.equals("1")) {

                int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes para añadir: "));
                for (int i = 0; i < n; i++) {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: "));
                    String genero = JOptionPane.showInputDialog("Ingrese el genero del estudiante: ");
                    String id = JOptionPane.showInputDialog("Ingrese el ID del estudiante: ");
                    String alergia = JOptionPane.showInputDialog("Ingrese las alergias del estudiante: ");
                    String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente: ");
                    String numeroAcudiente = JOptionPane.showInputDialog("Ingrese el numero telefonico del acudiente: ");
                    estudiante estudiantenuevo = new estudiante(nombre, edad, genero, id, alergia, nombreAcudiente, numeroAcudiente);
                    listaestudiantes.add(estudiantenuevo);
                    JOptionPane.showMessageDialog(null, "*** Estudiante añadido correctamente ***\n" + estudiantenuevo);
                }
            }
            else if (opcion.equals("2")) {
                String idModificar = JOptionPane.showInputDialog("Ingrese el ID del estudiante a modificar:");

                for (estudiante est : listaestudiantes) {
                    if (est.getId().equals(idModificar)) {

                        est.setNombre(JOptionPane.showInputDialog("Nuevo nombre:", est.getNombre()));
                        est.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Nueva edad:", est.getEdad())));
                        est.setGenero(JOptionPane.showInputDialog("Nuevo género:", est.getGenero()));
                        est.setAlergias(JOptionPane.showInputDialog("Nuevas alergias:", est.getAlergias()));
                        est.setNombreAcudiente(JOptionPane.showInputDialog("Nuevo nombre del acudiente:", est.getNombreAcudiente()));
                        est.setNumeroAcudiente(JOptionPane.showInputDialog("Nuevo número del acudiente:", est.getNumeroAcudiente()));

                        JOptionPane.showMessageDialog(null, "Estudiante modificado correctamente:\n" + est);
                        break;
                    }
                }
            }
            else if (opcion.equals("3")) {
                String idEliminar = JOptionPane.showInputDialog("Ingrese el ID del estudiante a borrar: ");
                for (estudiante est : listaestudiantes) {
                    if (est.getId().equals(idEliminar));
                    listaestudiantes.remove(est);
                    JOptionPane.showMessageDialog(null, est);
                    JOptionPane.showMessageDialog(null,"Estudiante borrado correctamente");

                    break;
                }

            }
        }
    }
}
