public class VehiculoApoyo extends Vehiculo{
    private TipoFuncion tipoFuncion;
    public VehiculoApoyo (String id, String modelo, int aniofabricacion, int kilometraje, EstadoOperativo estadoOperativo, TipoFuncion tipoFuncion) {
        super (id, modelo, aniofabricacion, kilometraje, estadoOperativo);
        this.tipoFuncion = tipoFuncion;
    }

    public TipoFuncion getTipoFuncion() {
        return tipoFuncion;
    }

    public void setTipoFuncion(TipoFuncion tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }
}
