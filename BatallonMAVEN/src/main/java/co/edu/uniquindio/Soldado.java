package co.edu.uniquindio;

public class
Soldado {
    private String id;
    private String nombre;
    private RangoMilitar rangoMilitar;
    private Especializacion especializacion;
    private int edad;
    private Disponibilidad disponibilidad;

    public Soldado(String id, String nombre, RangoMilitar rangoMilitar, Especializacion especializacion, int edad, Disponibilidad disponibilidad) {
        this.id = id;
        this.nombre = nombre;
        this.rangoMilitar = rangoMilitar;
        this.especializacion = especializacion;
        this.edad = edad;
        this.disponibilidad = disponibilidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RangoMilitar getRangoMilitar() {
        return rangoMilitar;
    }

    public void setRangoMilitar(RangoMilitar rangoMilitar) {
        this.rangoMilitar = rangoMilitar;
    }

    public Especializacion getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(Especializacion especializacion) {
        this.especializacion = especializacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    // METODOS


}
