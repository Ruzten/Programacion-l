import javax.swing.*;

public  class Main {
    public static void main (String[] args) {
        Empresa miEmpresa = new Empresa("Doofenshmirtz Malvados y Asociados", "12345");

        while (true) {
            String opcion = JOptionPane.showInputDialog("                       Empresa\n"+miEmpresa.getNombre()
                    + "\n\n1. Gestion de empleados\n"
                    +"2. Reporte de empleados");

            if (opcion.equals("1")) {
                String opcionUno = JOptionPane.showInputDialog("*** Gestion de Empleados ***\n"
                        + "1. Añadir Empleados\n"
                        + "2. Buscar Empleado\n"
                        + "3. Modificar Empleado\n"
                        + "4. Borrar Empleado");

                if (opcionUno.equals("1")) {
                    miEmpresa.crearEmpleado();
                }
                else if (opcionUno.equals("2")) {
                    String opcionDos = JOptionPane.showInputDialog("1. Buscar empleado por cedula \n2. Buscar empleado por cargo");
                    if (opcionDos.equals("1")) {

                    }
                    else if (opcionDos.equals("2")) {
                        miEmpresa.buscarEmpleadoCargo();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Opcion no valida");
                    }
                }
                else if (opcionUno.equals("3")) {
                    miEmpresa.modificarEmpleado();
                }
                else if (opcionUno.equals("4")) {

                }
                else {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
            }
            else if (opcion.equals("2")) {


            }

            else {
                JOptionPane.showMessageDialog(null, "Opcion no validas");
            }


        }


    }
}