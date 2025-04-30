package main;
import api.ColaHeapTDA;
import api.HeapTDA;

public class print {
/*     static void mostrarD(HeapTDA heap) { // muestra el heap destruyendo el oroginal
        while (!heap.vacio()) {
            System.out.print(heap.remover() + "; ");
        }
        System.out.println();
    } */
    static void mostrarD(ColaHeapTDA heap) { // muestra el heap destruyendo el oroginal
        while (!heap.vacio()) {
            System.out.print(heap.obtenerPrioridad() + ", "+ heap.obtenerValor() + "; ");
            heap.remover();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
/*         ColaHeapTDA heap = new ListaPrioridadHeap();
        heap.inicializar(100);
        heap.agregarValor(84,2);
        heap.agregarValor(35,6);
        heap.agregarValor(86,2);
        heap.agregarValor(12,8);
        heap.agregarValor(47,9);
        heap.agregarValor(53,10);
        heap.agregarValor(29,1);
        heap.agregarValor(69,3);
        heap.agregarValor(10,12);
        heap.agregarValor(60,56);
        heap.agregarValor(7,4);
        // System.out.println(heap.removerEn(5));
        // System.out.println(heap.removerEn(8));
        mostrarD(heap); */
        HeapTDA heap = new imp.minHeap();
        int arreglo[] = {27, 83, 14, 59, 68, 3, 92, 41, 76, 11, 35, 60, 99, 5, 48};
        heap.heapSort(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }
    }

}
