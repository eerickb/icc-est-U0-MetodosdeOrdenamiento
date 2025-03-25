public class MetodoInsercion {
    public void ordenarAscendente(int[] arreglo, boolean pasos) {
        int tam = arreglo.length;
        for (int i = 1; i < tam; ++i) {
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
                    printArray(arreglo);
                }
            }
            arreglo[j + 1] = aux;

            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posición " + (j + 1));
                printArray(arreglo);
            }
        }
    }

    public void printArray(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + ", ");
        }
        System.out.println("");
    }
}