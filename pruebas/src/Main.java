public class Main {
    public static void main(String[] args) {
        String [] listEntrenadores = new String[5];
        listEntrenadores [0] = "felipe";
        listEntrenadores [1] = "andres";
        listEntrenadores [2] = "carolina";
        listEntrenadores [3] = "parangaturicurimicuaro";
        listEntrenadores [4] = "hola";
        String nombreMasLargo = listEntrenadores[0];

        for (int i = 0; i < listEntrenadores.length; i++) {
            if (nombreMasLargo.length() < listEntrenadores[i].length()) {
                nombreMasLargo = listEntrenadores[i];
            }
        }
        System.out.println(nombreMasLargo);
    }
}