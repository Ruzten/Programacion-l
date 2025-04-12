package co.edu.uniquindio;

public abstract class Vehiculo {
    protected String id;
    protected String modelo;
    protected int anioFabricacion;
    protected int kilometraje;
    protected EstadoOperativo estadoOperativo;
    private int misionesCompletadas = 0;

    private Mision mision;

    public Vehiculo(String id,String modelo, int anioFabricacion, int kilometraje, EstadoOperativo estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.estadoOperativo = estadoOperativo;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    public int getMisionesCompletadas() {return misionesCompletadas;}

    public void setMisionesCompletadas(int misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }

//    public void calcularKilometraje (int kilometraje) {
//        // recorrer la lista uno por uno, obtener su getkilometraje y promediar
//        for (int i = 0, i < vehiculo)
//    }

}
