package p299.la.busqueda.heuristica;
public class Pila {
    Nodo a_inicio = null, a_tope = null;
    void m_PUSH(String p_vertice, String p_valor){
        Nodo nuevNodo = new Nodo(p_vertice, Integer.parseInt(p_valor));
        if (a_inicio == null)
            a_inicio = nuevNodo;
        else{
            nuevNodo.a_siguiente = a_tope;
            a_tope = nuevNodo;
        }
    }
    Nodo m_POP(){
        Nodo v_aux;
        v_aux = a_tope;
        a_tope = a_tope.a_siguiente;
        return v_aux;
    }
}
