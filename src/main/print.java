package main;
import api.HeapTDA;
import imp.maxHeap;
public class print {
    static void mostrarD(HeapTDA heap) { // muestra el heap destruyendo el oroginal
        while (!heap.vacio()) {
            System.out.print(heap.remover() + "; ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        HeapTDA heap = new maxHeap();
        heap.inicializar(100);
        heap.agregarValor(84);
        heap.agregarValor(35);
        heap.agregarValor(86);
        heap.agregarValor(12);
        heap.agregarValor(47);
        heap.agregarValor(53);
        heap.agregarValor(29);
        heap.agregarValor(69);
        heap.agregarValor(10);
        heap.agregarValor(60);
        heap.agregarValor(7);
        System.out.println(heap.removerEn(5));
        System.out.println(heap.removerEn(8));
        mostrarD(heap);
    }

}
