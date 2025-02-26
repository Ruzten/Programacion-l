public class ClaseArreglos {




    public static void main(String[] args) {
        int n = 4;
        int [] arregloEdades = new int[n];

        for (int i = 0; i < arregloEdades.length; i++) {
            arregloEdades[i] = (int) (Math.random()*10);
        }
        for (int i = 0; i < arregloEdades.length; i++) {
            System.out.print(arregloEdades[i] + " ");
        }
    }
}
