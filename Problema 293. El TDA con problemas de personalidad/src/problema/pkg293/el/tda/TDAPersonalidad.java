package problema.pkg293.el.tda;
public class TDAPersonalidad {
    Nodo a_inicio = null, a_tope = null;
    int v_contElementos = 0;
    void PUSH(int p_dato){
        Nodo nuevNodo = new Nodo(p_dato);
        if (a_inicio == null)
            a_inicio = nuevNodo;
        else{
            nuevNodo.a_anterior = a_tope;
            a_tope.a_siguiente = nuevNodo;
        }
        a_tope = nuevNodo;
        v_contElementos++;
    }
    void IN(int p_dato){
        Nodo nuevNodo = new Nodo(p_dato);
        if (a_inicio == null)
            a_inicio = nuevNodo;
        else{
            nuevNodo.a_anterior = a_tope;
            a_tope.a_siguiente = nuevNodo;
        }
        a_tope = nuevNodo;
        v_contElementos++;
    }
    void INSERT(int p_dato){
        Nodo nuevNodo = new Nodo(p_dato);
        Nodo v_temporal;
        if (a_inicio == null){
            a_inicio = nuevNodo;
            a_tope = nuevNodo;
        }
        else{
            v_temporal = a_inicio;
            if (nuevNodo.a_dato < v_temporal.a_dato){
                nuevNodo.a_siguiente = a_inicio;
                a_inicio = nuevNodo;
                v_temporal.a_anterior = a_inicio;
            }
            else{
                while (v_temporal != null && p_dato > v_temporal.a_dato)
                        v_temporal = v_temporal.a_siguiente;
                if (v_temporal == null){
                    nuevNodo.a_anterior = a_tope;
                    a_tope.a_siguiente = nuevNodo;
                    a_tope = nuevNodo;
                }
                else{
                    nuevNodo.a_siguiente = v_temporal;
                    nuevNodo.a_anterior = v_temporal.a_anterior;
                    v_temporal.a_anterior = nuevNodo;
                }     
            }
        }
        v_contElementos++;
    }
    String m_POP(){
        String v_aux;
        if (v_contElementos > 0){
            if (v_contElementos == 1){
                v_aux = String.valueOf(a_inicio.a_dato);
                a_inicio = null;
                a_tope = null;
            }
            else{
                v_aux = String.valueOf(a_tope.a_dato);
                a_tope = a_tope.a_anterior;
                a_tope.a_siguiente = null;
            }
            v_contElementos--;
        }
        else
            v_aux = "UNDERFLOW";
        return v_aux;
    }
    String m_OUT(){
        String v_aux;
        if (v_contElementos > 0){
            if (v_contElementos == 1){
                v_aux = String.valueOf(a_inicio.a_dato);
                a_inicio = null;
                a_tope = null;
            }
            else{
                v_aux = String.valueOf(a_inicio.a_dato);
                a_inicio = a_inicio.a_siguiente;
                a_inicio.a_anterior = null;
            }
            v_contElementos--;
        }
        else
            v_aux = "UNDERFLOW";
        return v_aux;
    }
    boolean m_REMOVE(int p_datoBorrar){
        Nodo v_temporal;
        boolean v_bandera = true;
        if (v_contElementos > 0){
            v_temporal = a_inicio;
            if (v_temporal.a_dato == p_datoBorrar){
                if (v_contElementos == 1){
                    a_inicio = null;
                    a_tope = null;
                    v_contElementos--;
                }
                else{
                    a_inicio = a_inicio.a_siguiente;
                    a_inicio.a_anterior = null;
                    v_contElementos--;
                }
            }
            else{
                while (v_temporal != null && v_temporal.a_dato < p_datoBorrar)
                        v_temporal = v_temporal.a_siguiente;
                if (v_temporal == null)
                    v_bandera = false;
                else{
                    if (p_datoBorrar == v_temporal.a_dato){
                        v_contElementos--;
                        if (v_temporal.a_dato == a_tope.a_dato){
                            a_tope = v_temporal.a_anterior;
                            v_temporal.a_anterior.a_siguiente = null;
                            v_temporal.a_anterior = null;
                        }
                        else{
                            v_temporal.a_anterior.a_siguiente = v_temporal.a_siguiente;
                            v_temporal.a_siguiente.a_anterior = v_temporal.a_anterior;
                            v_temporal.a_anterior = null;
                            v_temporal.a_siguiente = null;
                        }
                    }
                    else
                        v_bandera = false;
                }
            }
        }
        else
            v_bandera = false;
        return v_bandera;
    }
}