import javax.swing.*;

public class Empresa {
    private String nombre;
    private String nit;
    private Empleado[] listEmpleados;

    // CONSTRUCTOR

    public Empresa(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listEmpleados = new Empleado[50];
    }

    // GETTER Y SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    // METODOS

    public int validarCupoEmpleado() {
        for (int i = 0; i < listEmpleados.length; i++) {
            if(listEmpleados[i] == null){
                return i;
            }
        }
        return -1;
    }

    public void crearEmpleado() {
        int cuposinicial = validarCupoEmpleado();
        if (cuposinicial == -1) {
            JOptionPane.showMessageDialog(null, "No hay cupos dispobibles para nuevos empleados");
            return;
        }
        int espaciosDisponibless = 0;
        for (Empleado emp : listEmpleados) {
            if (emp == null) {
                espaciosDisponibless++;
            }
        }

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados a agregar: "));

        if (n > espaciosDisponibless) {
            JOptionPane.showMessageDialog(null, "Solo hay "+ espaciosDisponibless + " espacios disponibles");
            return;
        }
        for (int i = 0; i < n; i++) {
            int cupo = validarCupoEmpleado();
            if (cupo == -1) {
                JOptionPane.showMessageDialog(null, "No hay mas espacios disponibles");
                return;
            }
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
                String cedula = JOptionPane.showInputDialog("Ingrese la cedula del empleado: ");
                String cargo = "";
                String cargoOpcion = JOptionPane.showInputDialog("Ingrese el cargo del empleado: \n"
                        + "1. Gerente general\n"
                        + "2. Jefe de recursos humanos\n"
                        + "3. Contador\n"
                        + "4. Empleado operativo\n");
                if (cargoOpcion.equals("1")) {
                    cargo = "Gerente general";
                } else if (cargoOpcion.equals("2")) {
                    cargo = "Jefe de recursos humanos";
                } else if (cargoOpcion.equals("3")) {
                    cargo = "Contador";
                } else if (cargoOpcion.equals("4")) {
                    cargo = "Empleado operativo";
                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
                int antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la antigüedad del empleado dentro de la empresa: "));

                Empleado nuevoEmpleado = new Empleado(nombre, cedula, cargo, antiguedad);
                listEmpleados[cupo] = nuevoEmpleado;
                JOptionPane.showMessageDialog(null, "Empleado(s) agregado(s) con exito :)");
            }
        }
    }

public void modificarEmpleado() {
    String cedulaBuscar = JOptionPane.showInputDialog("Ingrese la cédula del empleado a modificar: ");
    boolean encontrado = false;

    for (int i = 0; i < listEmpleados.length; i++) {
        Empleado emp = listEmpleados[i];

        if (emp != null && emp.getCedula().equals(cedulaBuscar)) {
            encontrado = true;

            String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre (actual: " + emp.getNombre() + "):", emp.getNombre());
            String nuevaCedula = JOptionPane.showInputDialog("Ingrese la nueva cédula (actual: " + emp.getCedula() + "):", emp.getCedula());

            String nuevoCargo = emp.getCargo();
            String cargoOpcion = JOptionPane.showInputDialog("Seleccione el nuevo cargo (actual: " + emp.getCargo() + "):\n"
                    + "1. Gerente general\n"
                    + "2. Jefe de recursos humanos\n"
                    + "3. Contador\n"
                    + "4. Empleado operativo\n");

            if (cargoOpcion.equals("1")) {
                nuevoCargo = "Gerente general";
            } else if (cargoOpcion.equals("2")) {
                nuevoCargo = "Jefe de recursos humanos";
            } else if (cargoOpcion.equals("3")) {
                nuevoCargo = "Contador";
            } else if (cargoOpcion.equals("4")) {
                nuevoCargo = "Empleado operativo";
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida. Se mantiene el cargo actual.");
            }

            int nuevaAntiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva antigüedad (actual: " + emp.getAntiguedad() + "):", emp.getAntiguedad()));

            // Actualizar los datos del empleado
            listEmpleados[i] = new Empleado(nuevoNombre, nuevaCedula, nuevoCargo, nuevaAntiguedad);

            JOptionPane.showMessageDialog(null, "Empleado modificado exitosamente.");
            return;  // Termina la función después de modificar el empleado
        }
    }

    if (!encontrado) {
        JOptionPane.showMessageDialog(null, "No se encontró un empleado con esa cédula.");
    }
}




    public void buscarEmpleadoCedula() {
        String cedulaBuscar = JOptionPane.showInputDialog("Ingrese el cedula del empleado: ");
        for (Empleado emp : listEmpleados) {
            if (emp.getCedula().equals(cedulaBuscar)) {
                JOptionPane.showMessageDialog(null, emp.toString());
                break;
            }
        }
    }
//
//    public void buscarEmpleadoCargo() {
//        String cargoBuscar = JOptionPane.showInputDialog("Ingrese el cargo: ");
//        int contador = 0;
//        for (Empleado emp : listEmpleados) {
//            if (emp.getCargo().equals(cargoBuscar)) {
//                contador++;
//            }
//        }
//        int[] busquedaCargo = new int[contador];
//        for (int emp : busquedaCargo) {
//            JOptionPane.showMessageDialog(null, emp);
//        }
//    }
//}