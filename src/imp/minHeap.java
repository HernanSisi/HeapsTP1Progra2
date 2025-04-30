package imp;

import api.HeapTDA;

public class minHeap implements HeapTDA{ 
    private int[] heap; 
    private int indice;



    @Override
    public void inicializar(int tam) { // O(1)
        heap = new int[tam];
        indice = 0;
    }

    @Override
    public void agregarValor(int valor) { // O(log n)
        heap[indice] = valor;
        indice++;
        int i = indice - 1;
        while (i != 0 && heap[padre(i)] > heap[i]) {
            int p=padre(i);
            int temp = heap[i];
            heap[i] = heap[p];
            heap[p] = temp;
            i = p;
        }
    }

    @Override
    public int remover() { // O(log n)
        if (vacio()) {
            return -1;
        }
        int min = heap[0];
        heap[0] = heap[indice - 1];
        indice--;
        int aux = 0;
        while (aux < indice) {
            int izq = hijoIzq(aux);
            int der = hijoDer(aux);
            int menor = aux;
            if (izq < indice && heap[izq] < heap[menor]) {
                menor = izq;
            }
            if (der < indice && heap[der] < heap[menor]) {
                menor = der;
            }
            if (menor == aux) {
                break;
            }
            int temp = heap[aux];
            heap[aux] = heap[menor];
            heap[menor] = temp;
            aux = menor;
        }
        return min;
    }

    @Override
    public int removerEn(int i) { // O(log n)
        if (vacio() || i <= 0 || i > indice) {
            return -1;
        }
        int min = heap[i];
        heap[i] = heap[indice - 1];
        indice--;
        int aux = i;
        while (aux < indice) {
            int izq = hijoIzq(aux);
            int der = hijoDer(aux);
            int menor = aux;
            if (izq < indice && heap[izq] < heap[menor]) {
                menor = izq;
            }
            if (der < indice && heap[der] < heap[menor]) {
                menor = der;
            }
            if (menor == aux) {
                break;
            }
            int temp = heap[aux];
            heap[aux] = heap[menor];
            heap[menor] = temp;
            aux = menor;
        }
        return min; 
    }

    @Override
    public int obtener() { // O(1)
        return heap[0];
    }

    @Override
    public boolean vacio() { // O(1)
        return indice == 0;
    }

    @Override
    public int padre(int i) { // O(1)
        return (i - 1) / 2;
    }

    @Override
    public int hijoIzq(int i) { // O(1)
        return (2 * i) + 1;
    }

    @Override
    public int hijoDer(int i) { // O(1)
        return (2 * i) + 2;
    }
    
    @Override
    public void heapSort(int[] arr) { // O(n log n)
        inicializar(arr.length);
        for (int i = 0; i < arr.length; i++) {
            agregarValor(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = remover();
        }
    }
}
