package co.edu.uniquindio;

import java.util.ArrayList;

public class Mision {
    private String id;
    private String fecha;
    private String ubicacion;
    private ArrayList<Soldado> personalAsignado;
    private String idVehiculoUtilizado;

    public Mision(String id,String fecha, String ubicacion, ArrayList<Soldado> personalAsignado, String idVehiculoUtilizado) {
        this.id = id;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.personalAsignado = personalAsignado;
        this.idVehiculoUtilizado = idVehiculoUtilizado;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Soldado> getPersonalAsignado() {
        return personalAsignado;
    }

    public void setPersonalAsignado(ArrayList<Soldado> personalAsignado) {
        this.personalAsignado = personalAsignado;
    }

    public String getIdVehiculoUtilizado() {
        return idVehiculoUtilizado;
    }

    public void setIdVehiculoUtilizado(String idVehiculoUtilizado) {
        this.idVehiculoUtilizado = idVehiculoUtilizado;
    }

    // AÑADIR A LA LISTA DE PERSONAL
    public void aniadirPersonal (Soldado soldadoSeleccionado) {
        personalAsignado.add(soldadoSeleccionado);
    }

}
