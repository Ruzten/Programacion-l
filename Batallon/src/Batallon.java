import java.util.ArrayList;

public class Batallon {
    private String nombre;
    private String id;
    private ArrayList<Vehiculo> listaVehiculosApoyo;
    private ArrayList<Vehiculo> listaVehiculosBlindado;
    private ArrayList<Vehiculo> listaVehiculosTropas;
    private ArrayList<Mision> misiones;

    private Vehiculo vehiculo;

    public Batallon(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.listaVehiculosApoyo = new ArrayList<>();
        this.listaVehiculosBlindado = new ArrayList<>();
        this.listaVehiculosTropas = new ArrayList<>();
        this.misiones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Vehiculo> getListaVehiculosApoyo() {
        return listaVehiculosApoyo;
    }

    public void setListaVehiculosApoyo(ArrayList<Vehiculo> listaVehiculosApoyo) {
        this.listaVehiculosApoyo = listaVehiculosApoyo;
    }

    public ArrayList<Vehiculo> getListaVehiculosBlindado() {
        return listaVehiculosBlindado;
    }

    public void setListaVehiculosBlindado(ArrayList<Vehiculo> listaVehiculosBlindado) {
        this.listaVehiculosBlindado = listaVehiculosBlindado;
    }

    public ArrayList<Vehiculo> getListaVehiculosTropas() {
        return listaVehiculosTropas;
    }

    public void setListaVehiculosTropas(ArrayList<Vehiculo> listaVehiculosTropas) {
        this.listaVehiculosTropas = listaVehiculosTropas;
    }

    public ArrayList<Mision> getMisiones() {
        return misiones;
    }

    public void setMisiones(ArrayList<Mision> misiones) {
        this.misiones = misiones;
    }
//    public ArrayList<Vehiculo> vehiculosMuchasMisiones() {
//        ArrayList<Vehiculo> VehiculosMuchasMisiones = new ArrayList<>();
//        for (int i = 0; i < vehiculos.size(); i++) {
//            Vehiculo vehiculo = vehiculos.get(i);
//            int contadorMisiones
//        }
//    }

    public boolean registroMision (String fechaMision, String ubicacionMision, ArrayList<String> listPersonal, String idVehiculo) {

        int MisionNueva = misiones.size()+1;


//        for (int i = 0; i < misiones.size(); i++) {

            Mision newMision = new Mision(MisionNueva, "03/04/2025", "Cucuta", listPersonal, "1");
            System.out.println("");

        }
    }

}