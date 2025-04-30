package imp;
import api.HeapTDA;
public class maxHeap implements HeapTDA {
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
        while (i != 0 && heap[padre(i)] < heap[i]) {
            int p=padre(i);
            int temp = heap[i];
            heap[i] = heap[p];
            heap[p] = temp;
            i = p;
        }
    }

    @Override
    public int remover() {
        if (vacio()) {
            return -1;
        }
        int max = heap[0];
        heap[0] = heap[indice - 1];
        indice--;
        int aux = 0;
        while (aux < indice) {
            int izq = hijoIzq(aux);
            int der = hijoDer(aux);
            int mayor = aux;
            if (izq < indice && heap[izq] > heap[mayor]) {
                mayor = izq;
            }
            if (der < indice && heap[der] > heap[mayor]) {
                mayor = der;
            }
            if (mayor == aux) {
                break;
            }
            int temp = heap[aux];
            heap[aux] = heap[mayor];
            heap[mayor] = temp;
            aux = mayor;
        }
        return max;
    }
    @Override
    public int removerEn(int i) {
        i--;
        if (vacio() || i <= 0 || i > indice) {
            return -1;
        }
        int max = heap[i];
        heap[i] = heap[indice - 1];
        indice--;
        int aux = i;
        while (aux < indice) {
            int izq = hijoIzq(aux);
            int der = hijoDer(aux);
            int mayor = aux;
            if (izq < indice && heap[izq] > heap[mayor]) {
                mayor = izq;
            }
            if (der < indice && heap[der] > heap[mayor]) {
                mayor = der;
            }
            if (mayor == aux) {
                break;
            }
            int temp = heap[aux];
            heap[aux] = heap[mayor];
            heap[mayor] = temp;
            aux = mayor;
        }
        return max;
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
