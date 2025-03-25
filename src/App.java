public class App {
    public static void main(String[] args) {
        int[] listado = {64, 25, 12, 22, 11};

        MetodoInsercion mI = new MetodoInsercion();

        System.out.println("Arreglo original:");
        mI.printArray(listado);
        System.out.println("--------------------------");

        System.out.println("Ordenando con pasos activados:");
        mI.ordenarAscendente(listado, true);
        
        System.out.println("--------------------------");
        System.out.println("Arreglo ordenado:");
        mI.printArray(listado);
    }
}