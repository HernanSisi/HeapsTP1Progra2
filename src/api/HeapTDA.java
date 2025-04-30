package api;

public interface HeapTDA {
    void inicializar(int tam); // O(1) inicializa el heap con un maximo de elementos
    void agregarValor(int valor); // O(log n) agrega un valor al heap
    int remover(); // O(1) remueve el max o min del heap
    int removerEn(int i); // O(log n) remueve el elemento en la posicion i-1
    int obtener();  // O(1) obtenes el max o min del heap
    boolean vacio(); // O(1) si el heap esta vacio
    int padre(int i); // O(1) de un hijo obtengo el indice del padre
    int hijoIzq(int i); // O(1) de un padre obtengo el indice del hijo izquierdo
    int hijoDer(int i); // O(1) de un padre obtengo el indice del hijo derecho
}