package imp;

import api.HeapTDA;

public class minHeap implements HeapTDA{
    private int[] heap; 
    private int indice;



    @Override
    public void inicializar(int tam) {
        heap = new int[tam];
        indice = 0;
    }

    @Override
    public void agregarValor(int valor) {
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
    public int remover() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int obtener() {
        return heap[0];
    }

    @Override
    public boolean vacio() {
        return indice == 0;
    }

    @Override
    public int padre(int i) {
        return (i - 1) / 2;
    }

    @Override
    public int hijoIzq(int i) {
        return (2 * i) + 1;
    }

    @Override
    public int hijoDer(int i) {
        return (2 * i) + 2;
    }
    
}
