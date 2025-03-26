public class App {
    public static void main(String[] args) {
        int[] listado = {64, 25, 12, 22, 11};

        MetodoBurbuja mB = new MetodoBurbuja();
        MetodoSeleccion mS = new MetodoSeleccion();
        MetodoInsercion mI = new MetodoInsercion();

        System.out.println("-- Metodo Burbuja --");
        System.out.println("Arreglo original:");
        mB.imprimirArreglo(listado);
        System.out.println("--------------------------");
        mB.ordenar(listado, false);
        System.out.println("Arreglo ordenado ascendente:");
        mB.imprimirArreglo(listado);
        mB.ordenar(listado, true);

        System.out.println("-- Metodo Seleccion --");
        System.out.println("Arreglo original:");
        mS.imprimirArreglo(listado);
        System.out.println("--------------------------");
        mS.ordenar(listado, false);
        System.out.println("Arreglo ordenado descendente:");
        mS.imprimirArreglo(listado);
        System.out.println("--------------------------");

        System.out.println("-- Metodo Insercion --");
        System.out.println("Arreglo original:");
        mI.imprimirArreglo(listado);
        System.out.println("--------------------------");
        System.out.println("Ordenando con pasos activados:");
        mI.ordenarAscendente(listado, true);
        System.out.println("--------------------------");
        System.out.println("Arreglo ordenado:");
        mI.imprimirArreglo(listado);
    }
}