package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.HashMap;


public class Batallon {
    private String nombre;
    private String id;
    private ArrayList<Vehiculo> listaVehiculosApoyo;
    private ArrayList<Vehiculo> listaVehiculosBlindado;
    private ArrayList<Vehiculo> listaVehiculosTropas;
    private ArrayList<Mision> misiones;
    private ArrayList<Soldado> ListaSoldados;

    private Vehiculo vehiculo;

    public Batallon(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.listaVehiculosApoyo = new ArrayList<>();
        this.listaVehiculosBlindado = new ArrayList<>();
        this.listaVehiculosTropas = new ArrayList<>();
        this.misiones = new ArrayList<>();
        this.ListaSoldados = new ArrayList<>();
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

    // METODOS CREAR OBJETOS

    public boolean crearVehiculoBlindado(String id, String modelo, int anioFabricacion, int kilometraje, EstadoOperativo estadoOperativo, int nivelBlindaje) {
        boolean flag = false;

        for (Vehiculo vehiculo : listaVehiculosBlindado) {
            if (vehiculo.getId().equals(id)) {
                return flag;
            }
        }

        VehiculoBlindado newVehiculo = new VehiculoBlindado(id, modelo, anioFabricacion, kilometraje, estadoOperativo, nivelBlindaje);
        listaVehiculosBlindado.add(newVehiculo);
        flag = true;

        return flag;
    }

    public boolean crearVehiculoApoyo(String id, String modelo, int aniofabricacion, int kilometraje, EstadoOperativo estadoOperativo, TipoFuncion tipoFuncion) {
        boolean flag = false;

        for (Vehiculo vehiculo : listaVehiculosApoyo) {
            if (vehiculo.getId().equals(id)) {
                return flag;
            }
        }

        VehiculoApoyo newVehiculo = new VehiculoApoyo(id, modelo, aniofabricacion, kilometraje, estadoOperativo, misionesCompletadas, tipoFuncion);
        listaVehiculosApoyo.add(newVehiculo);
        flag = true;

        return flag;
    }

    public boolean crearVehiculoTropas(String id, String modelo, int anioFabricacion, int kilometraje, EstadoOperativo estadoOperativo, int capacidadTropas) {
        boolean flag = false;

        for (Vehiculo vehiculo : listaVehiculosTropas) {
            if (vehiculo.getId().equals(id)) {
                return flag;
            }
        }

        VehiculoTropas newVehiculo = new VehiculoTropas(id, modelo, anioFabricacion, kilometraje, estadoOperativo, capacidadTropas);
        listaVehiculosTropas.add(newVehiculo);
        flag = true;

        return flag;
    }

    public boolean crearMision(String id, String fecha, String ubicacion, ArrayList<Soldado> personalAsignado, String idVehiculoUtilizado) {
        boolean flag = false;

        for (Vehiculo vehiculo : listaVehiculosApoyo) {
            if (vehiculo.getId().equals(idVehiculoUtilizado)) {
                flag = true;
                break;
            }
        }
        if (flag != true) {
            for (Vehiculo vehiculo : listaVehiculosTropas) {
                if (vehiculo.getId().equals(idVehiculoUtilizado)) {
                    flag = true;
                    break;
                }
            }
        }

        if (flag != true) {
            for (Vehiculo vehiculo : listaVehiculosBlindado) {
                if (vehiculo.getId().equals(idVehiculoUtilizado)) {
                    flag = true;
                    break;
                }
            }
        }

        if (flag == true) {
            Mision newMision = new Mision(id, fecha, ubicacion, personalAsignado, idVehiculoUtilizado);
            misiones.add(newMision);
            return true;
        }
        return false;
    }

    public boolean crearSoldado(String id, String nombre, RangoMilitar rangoMilitar, Especializacion especializacion, int edad, Disponibilidad disponibilidad) {
        boolean flag = false;

        for (Soldado soldado : ListaSoldados) {
            if (soldado.getId().equals(id)) {
                return flag;
            }
        }
        Soldado newSoldado = new Soldado(id, nombre, rangoMilitar, especializacion, edad, disponibilidad);
        ListaSoldados.add(newSoldado);
        flag = true;

        return flag;
    }


    // METODOS DE COINCIDENCIA
    public Integer encontrarIdVTropas(String id) {
        Integer posicion = null;
        for (int i = 0; i < listaVehiculosTropas.size(); i++) {
            if (listaVehiculosTropas.get(i).getId().equals(id)) {
                return i;

            }
        }
        return null;
    }

    public Integer encontrarIdSoldado(String id) {
        Integer posicion = null;
        for (int i = 0; i < ListaSoldados.size(); i++) {
            if (ListaSoldados.get(i).getId().equals(id)) {
                return i;

            }
        }
        return null;
    }


    public Integer encontrarIdVApoyo(String id) {
        for (int i = 0; i < listaVehiculosApoyo.size(); i++) {
            if (listaVehiculosApoyo.get(i).getId().equals(id)) {
                return i;

            }
        }
        return null;
    }

    public Integer encontrarIdVBlindando(String id) {
        for (int i = 0; i < listaVehiculosBlindado.size(); i++) {
            if (listaVehiculosBlindado.get(i).getId().equals(id)) {
                return i;

            }
        }
        return null;
    }

    public Integer encontrarIdMision(String id) {
        for (int i = 0; i < misiones.size(); i++) {
            if (misiones.get(i).getId().equals(id)) {
                return i;

            }
        }
        return null;
    }

    public Vehiculo buscarVehiculoPorId(String id) {
        Integer pos = encontrarIdVTropas(id);
        if (pos != null) {
            return listaVehiculosTropas.get(pos);
        }

        pos = encontrarIdVBlindando(id);
        if (pos != null) {
            return listaVehiculosBlindado.get(pos);
        }

        pos = encontrarIdVApoyo(id);
        if (pos != null) {
            return listaVehiculosApoyo.get(pos);
        }

        return null;
    }


    // METODOS DE ELIMINACION
    public boolean borrarVehiculoTropas(String id) {
        Integer posicion = encontrarIdVTropas(id);
        if (posicion != null) {
            listaVehiculosTropas.remove((int) posicion);
            return true;
        }
        return false;
    }

    public boolean borrarSoldado(String id){
        Integer posicion = encontrarIdSoldado(id);
        if (posicion != null) {
            ListaSoldados.remove((int) posicion);
            return true;
        }
        return false;
    }

    public boolean borrarVehiculoApoyo(String id) {
        Integer posicion = encontrarIdVApoyo(id);
        if (posicion != null) {
            listaVehiculosApoyo.remove((int) posicion);
            return true;
        }
        return false;
    }

    public boolean borrarVehiculoBlindado(String id) {
        Integer posicion = encontrarIdVBlindando(id);
        if (posicion != null) {
            listaVehiculosBlindado.remove((int) posicion);
            return true;
        }
        return false;
    }

    public boolean borrarMision(String id) {
        Integer posicion = encontrarIdMision(id);
        if (posicion != null) {
            misiones.remove((int) posicion);
            return true;
        }
        return false;
    }

    // Buscar y ver info
    public VehiculoTropas verInfoVehiculoTropas(String id) {
        for (Vehiculo vehiculo : listaVehiculosTropas) {
            if (vehiculo.getId().equals(id)) {
                return (VehiculoTropas) vehiculo;
            }
        }
        return null;
    }

    public VehiculoApoyo verInfoVehiculoApoyo(String id) {
        for (Vehiculo vehiculo : listaVehiculosApoyo) {
            if (vehiculo.getId().equals(id)) {
                return (VehiculoApoyo) vehiculo;
            }
        }
        return null;
    }

    public VehiculoBlindado verInfoVehiculoBlindado(String id) {
        for (Vehiculo vehiculo : listaVehiculosBlindado) {
            if (vehiculo.getId().equals(id)) {
                return (VehiculoBlindado) vehiculo;
            }
        }
        return null;
    }

    public Mision verInfoMision(String id) {
        for (Mision mision : misiones) {
            if (mision.getId().equals(id)) {
                return mision;
            }
        }
        return null;
    }


    // METODO DE BUSCAR LOS VEHICULOS CON +50 MISIONES

    public ArrayList<Vehiculo> obtenerVehiculosConMasDe50Misiones() {
        ArrayList<Vehiculo> vehiculosConMasDe50 = new ArrayList<>();
        HashMap<String, Integer> conteoMisiones = new HashMap<>();

        for (Mision m : misiones) {
            String idVehiculo = m.getIdVehiculoUtilizado();
            conteoMisiones.put(idVehiculo, conteoMisiones.getOrDefault(idVehiculo, 0) + 1);
        }

        for (String idVehiculo : conteoMisiones.keySet()) {
            if (conteoMisiones.get(idVehiculo) > 50) {
                Vehiculo vehiculo = buscarVehiculoPorId(idVehiculo);
                if (vehiculo != null) {
                    vehiculosConMasDe50.add(vehiculo);
                }
            }
        }
        return vehiculosConMasDe50;
    }
    // METODO PARA BUSCAR SOLDADOS POR ESPECIALIDAD

     public boolean buscarSoldadoPorEspecialidad(){
        ArrayList<Soldado> soldadosPorRango = new ArrayList<>();

     }

    // METODO DE AÑADIR SOLDADO A MISION
    public boolean asignarSoldadoAMision(String idSoldado, String idMision) {

        boolean flag = false;
        Soldado soldadoSeleccionado = null;

        for (int i = 0; i < ListaSoldados.size(); i++) {
            if (ListaSoldados.get(i).getId().equals(id)) {
                soldadoSeleccionado = ListaSoldados.get(i);
            }
            return flag;
        }
        for (int i = 0; i < misiones.size(); i++) {
            if (misiones.get(i).getId().equals(id)) {
                misiones.get(i).aniadirPersonal(soldadoSeleccionado);
                flag = true;
            }
        }
        return flag;

    }
}