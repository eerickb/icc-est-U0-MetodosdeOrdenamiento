public class MetodoInsercion {
    public void ordenarAscendente(int[] arreglo, boolean pasos) {
        System.out.println("--Metodo Inserción--");
        System.out.println("Arreglo Original");
        imprimirArreglo(arreglo);

        for (int i = 1; i < arreglo.length; ++i) {
            int aux = arreglo[i];
            int j = i - 1;
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }
            while (j >= 0 && aux < arreglo[j]) {
                if (pasos) {
                    System.out.println("Compara aux: " + aux + " con arreglo[" + j + "]: " + arreglo[j]);
                }
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
                if (pasos) {
                    imprimirArreglo(arreglo);
                }
            }
            arreglo[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posición " + (j + 1));
                imprimirArreglo(arreglo);
            }
        }
        System.out.println("Arreglo Ordenado Con Pasos");
        imprimirArreglo(arreglo);
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + (elemento != arreglo[arreglo.length - 1] ? ", " : ""));
        }
        System.out.println("\n");
    }
}