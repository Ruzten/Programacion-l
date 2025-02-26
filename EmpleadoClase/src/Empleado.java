import java.time.LocalDate;

public class Empleado {

    private String id;
    private String nombre;
    private String puesto;
    private String correo;
    private String telefono;
    private LocalDate fechaContratacion;

    public Empleado(String id, String nombre, String puesto, String correo, String telefono, LocalDate fechaContratacion) {

        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaContratacion = fechaContratacion;

    }
}

