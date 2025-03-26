public class MetodoBurbuja {
    public void ordenar(int[] arreglo, boolean isDes) {
        System.out.println("--Metodo Burbuja--");
        System.out.println("Arreglo Original");
        imprimirArreglo(arreglo);

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if ((isDes && arreglo[i] < arreglo[j]) || (!isDes && arreglo[i] > arreglo[j])) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        System.out.println("Arreglo Ordenado " + (isDes ? "descendente" : "ascendente"));
        imprimirArreglo(arreglo);
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + (i < arreglo.length - 1 ? ", " : ""));
        }
        System.out.println("\n");
    }
}