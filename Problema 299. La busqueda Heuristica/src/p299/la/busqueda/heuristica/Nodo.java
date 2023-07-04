package p299.la.busqueda.heuristica;
public class Nodo {
    Nodo a_siguiente;
    String a_vertice;
    int v_costo;
    public Nodo(String p_vertice, int p_costo){
        a_vertice = p_vertice;
        v_costo = p_costo;
        a_siguiente = null;
    }
}