import java.util.ArrayList;

public class Mision {
    private String id;
    private String fecha;
    private String ubicacion;
    private ArrayList<String> personalAsignado;
    private int idVehiculoUtilizado;

    public Mision(String id,String fecha, String ubicacion, ArrayList<String> personalAsignado, int idVehiculoUtilizado) {
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.personalAsignado = personalAsignado;
        this.idVehiculoUtilizado = idVehiculoUtilizado;
        this.id = id;
    }

    public Mision(int misionNueva, String fecha, String cucuta, ArrayList<String> listPersonal, String idVehiculoUtilizado) {
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

    public ArrayList<String> getPersonalAsignado() {
        return personalAsignado;
    }

    public void setPersonalAsignado(ArrayList<String> personalAsignado) {
        this.personalAsignado = personalAsignado;
    }

    public int getidVehiculoUtilizado() {
        return idVehiculoUtilizado;
    }

    public void setVehiculoUtilizado(Vehiculo vehiculoUtilizado) {
        this.idVehiculoUtilizado = idVehiculoUtilizado;
    }


}
