public class Empleado {

    private String nombre;
    private String cedula;
    private String cargo;
    private int antiguedad;


    public Empleado(String nombre, String cedula, String cargo, int aniosEmpresa) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.cargo = cargo;
        this.antiguedad = aniosEmpresa;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}