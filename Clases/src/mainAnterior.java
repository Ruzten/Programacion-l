import javax.swing.*;
import java.util.ArrayList;

// mostrar primero el menu, ingresar el entero, si es igual a 1 entonces motrar tal cosa, al final dar la opcion de volver al menu y finalizar


public class mainAnterior {
    public static void main(String[] args) {

        ArrayList<estudiante> listaestudiantes = new ArrayList();

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes: "));

        for (int i = 0; i < n; i++) {

            String nombre = JOptionPane.showInputDialog ("Ingrese su nombre: ");
//            JOptionPane.showMessageDialog (null, "El nombre es " + nombre);

            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
//            JOptionPane.showMessageDialog (null, "Usted tiene " + edad);

            String id = JOptionPane.showInputDialog ("Ingrese su id: ");
//            JOptionPane.showMessageDialog (null, "El id es " + id);

            String genero = JOptionPane.showInputDialog ("Ingrese su genero: ");
//            JOptionPane.showMessageDialog (null, "El genero es " + genero);

            String alergia = JOptionPane.showInputDialog ("Ingrese sus alergias: ");
//            JOptionPane.showMessageDialog (null, "Usted es alergico a " + alergia);

            String nombreAcudiente = JOptionPane.showInputDialog ("Ingrese su nombre de acudiente: ");
//            JOptionPane.showMessageDialog (null, "El nombre es " + nombreAcudiente);

            String numeroAcudiente = JOptionPane.showInputDialog ("Ingrese su numero de acudiente: ");
//            JOptionPane.showMessageDialog (null, "El numero de acudiente es " + numeroAcudiente);

            estudiante estudiantenuevo = new estudiante(nombre,edad,id,genero,alergia,nombreAcudiente,numeroAcudiente);
            JOptionPane.showMessageDialog(null,estudiantenuevo);

            listaestudiantes.add(estudiantenuevo);


        }
//      ARREGLOS
//        int [] arregloEnteros = new int[n];
//        int [] arregloEnterosDos = {1,2,3,4};
//
//      LISTAS
//        ArrayList<String> listEjemplo = new ArrayList<>();
//        listEjemplo.add("hola");
//        listEjemplo.remove(0);

    }
}
