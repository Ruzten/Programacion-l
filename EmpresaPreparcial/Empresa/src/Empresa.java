import javax.swing.*;

public class Empresa {
    private String nombre;
    private String nit;
    private Empleado[] listEmpleados;

    // CONSTRUCTOR

    public Empresa(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listEmpleados = new Empleado[49];
        System.out.println("listEmpleados inicializado con tamaño: " + listEmpleados.length);

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
            if (listEmpleados[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void crearEmpleado() {
        int cuposInicial = validarCupoEmpleado();
        int espaciosDisponibles = 0;
        if (cuposInicial == -1) {
            JOptionPane.showMessageDialog(null, "No hay cupos disponibles para nuevos empleados, los 50 estan ocupados");
            return;
        }
        for (Empleado emp : listEmpleados) {
            if (emp == null) {
                espaciosDisponibles++;
            }
        }
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados a agregar: "));
        if (n > espaciosDisponibles) {
            JOptionPane.showMessageDialog(null, "No se puede agregar esa cantidad de empleados, solo hay " + espaciosDisponibles + "espacios disponibles");
            return;
        }
        for (int i = 0; i < n; i++) {
            int x = i + 1;
            int cupo = validarCupoEmpleado();
            if (cupo == -1) {
                JOptionPane.showMessageDialog(null, "No hay mas espacios disponibles");
                return;
            }
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado " + x + ": ");
            String cedula = JOptionPane.showInputDialog("Ingrese la cedula del empleado " + x + ": ");
            String cargo = "";
            String cargoOpcion = JOptionPane.showInputDialog("Ingrese el cargo del empleado " + x + ": \n" + "1. Gerente general\n" + "2. Jefe de recursos humanos\n" + "3. Contador\n" + "4. Empleado operativo\n");
            switch (cargoOpcion) {
                case "1":
                    cargo = "Gerente general";
                    break;
                case "2":
                    cargo = "Jefe de recursos humanos";
                    break;
                case "3":
                    cargo = "Contador";
                    break;
                case "4":
                    cargo = "Empleado operativo";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida");
                    return;
            }
            int antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la antigüedad del empleado (en años) en la empresa" + x + ": "));
            Empleado nuveoEmpleado = new Empleado(nombre, cedula, cargo, antiguedad);
            listEmpleados[cupo] = nuveoEmpleado;
            JOptionPane.showMessageDialog(null, "Empleado(s) agregado(s) con exito");
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

                emp.setNombre(nuevoNombre);
                emp.setCedula(nuevaCedula);
                emp.setCargo(nuevoCargo);
                emp.setAntiguedad(nuevaAntiguedad);

                JOptionPane.showMessageDialog(null, "Empleado modificado exitosamente.");
                return;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró un empleado con esa cédula.");
        }
    }

    public void buscarEmpleadoCargo() {
        String cargoBuscar = JOptionPane.showInputDialog("Seleccione el cargo: \n"
                + "1. Gerente general\n"
                + "2. Jefe de recursos humanos\n"
                + "3. Contador\n"
                + "4. Empleado operativo\n");
        String cargo = "";
        int contador = 0;
        switch (cargoBuscar) {
            case "1":
                cargo = "Gerente general";
                break;
            case "2":
                cargo = "Jefe de recursos humanos";
                break;
            case "3":
                cargo = "Contador";
                break;
            case "4":
                cargo = "Empleado operativo";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no valida");
                return;
        }
        for (Empleado emp : listEmpleados) {
            if (emp != null && emp.getCargo().equals(cargo)) {
                contador++;
            }
        }
        Empleado[] empleadosCargo = new Empleado[contador];
        int anadiendo = 0;
        for (Empleado emp: listEmpleados) {
            if (emp != null && emp.getCargo().equals(cargo)) {
                empleadosCargo[anadiendo] = emp;
                anadiendo++;
            }
        }
        String mensaje = "Los empleados con el cargo " + cargo + " son: \n";
        for (Empleado emp : empleadosCargo) {
            mensaje+= "Nombre: " + emp.getNombre() + "\n Cedula: " + emp.getCedula() + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}




//
//
//
//
//    public void buscarEmpleadoCedula() {
//        String cedulaBuscar = JOptionPane.showInputDialog("Ingrese el cedula del empleado: ");
//        for (Empleado emp : listEmpleados) {
//            if (emp.getCedula().equals(cedulaBuscar)) {
//                JOptionPane.showMessageDialog(null, emp.toString());
//                break;
//            }
//        }
//    }
//
