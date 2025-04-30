package main;
import api.HeapTDA;
import imp.minHeap;
public class print {
    public static void main(String[] args) {
        HeapTDA heap = new minHeap();
        heap.inicializar(100);
        System.out.println(heap.vacio());
        heap.agregarValor(5);
        System.out.println(heap.obtener());
        heap.agregarValor(3);
        System.out.println(heap.obtener());
        heap.agregarValor(8);
        System.out.println(heap.obtener());
        heap.agregarValor(1);
        System.out.println(heap.obtener());
    }

}
