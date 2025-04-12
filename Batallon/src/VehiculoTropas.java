public class VehiculoTropas extends Vehiculo{
    private int capacidadTropas;

    public VehiculoTropas(String id, String modelo, int anioFabricacion, int kilometraje, EstadoOperativo estadoOperativo, int capacidadTropas) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo);
        this.capacidadTropas = capacidadTropas;
    }

    public int getCapacidadTropas() {
        return capacidadTropas;
    }

    public void setCapacidadTropas(int capacidadTropas) {
        this.capacidadTropas = capacidadTropas;
    }
}
