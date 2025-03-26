public class MetodoSeleccion {
    public void ordenar(int[] arreglo, boolean isDes) {
        System.out.println("--Metodo Selección--");
        System.out.println("Arreglo Original");
        imprimirArreglo(arreglo);
        
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceExtremo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if ((isDes && arreglo[j] > arreglo[indiceExtremo]) || (!isDes && arreglo[j] < arreglo[indiceExtremo])) {
                    indiceExtremo = j;
                }
            }
            int aux = arreglo[i];
            arreglo[i] = arreglo[indiceExtremo];
            arreglo[indiceExtremo] = aux;
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