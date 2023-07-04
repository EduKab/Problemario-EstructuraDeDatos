package problema.pkg285.arbol.binario.ordenado.desbalanceado;
public class Arbol {
    private Nodo a_raiz;
    private int a_contRamas; 
    private Nodo a_menorRama = null, a_mayorRama = null, a_anteMenorRama = null; 
    void m_insertar(int p_valor){
        Nodo v_lugar;
        Nodo nuevNodo = new Nodo(p_valor);
        v_lugar = m_buscarLugar(p_valor);
        nuevNodo.a_nivel = a_contRamas;
        //System.out.println("Nodo insertado: " + p_valor);
        if (v_lugar == null){
            a_raiz = nuevNodo;
            //System.out.println("Raiz: " + nuevNodo.a_numero);
        }
        else
            if (nuevNodo.a_numero < v_lugar.a_numero){
                v_lugar.a_izquierda = nuevNodo;
                //System.out.println("Lugar izquierdo de: " + v_lugar.a_numero);
            }
            else{
                v_lugar.a_derecha = nuevNodo;
                //System.out.println("Lugar derecho de: " + v_lugar.a_numero);
            }
        if (a_menorRama == null)
            a_menorRama = nuevNodo;
        else
            if (a_menorRama.a_derecha == null && a_menorRama.a_izquierda == null) {
                if (nuevNodo.a_nivel < a_menorRama.a_nivel){
                    a_anteMenorRama = a_menorRama;
                    a_menorRama = nuevNodo;
                }
            }
            else
                if (nuevNodo.a_nivel < a_menorRama.a_numero)
                    a_menorRama = nuevNodo;
                else
                    a_menorRama = a_anteMenorRama;
        if (a_mayorRama == null || nuevNodo.a_nivel > a_mayorRama.a_nivel)
            a_mayorRama = nuevNodo;
        /*System.out.println("Menor rama: " + a_menorRama.a_numero);
        System.out.println("Mayor rama: " + a_mayorRama.a_numero);
        System.out.println("");*/
    }
    Nodo m_buscarLugar(int p_valorBuscar){
        a_contRamas = 0;
        Nodo v_anterior, v_temporal;
        a_contRamas++;
        if (a_raiz == null)
            return null;
        else{
            v_anterior = a_raiz;
            v_temporal = a_raiz;
            while (v_temporal != null){
                v_anterior = v_temporal;
                if (p_valorBuscar < v_temporal.a_numero)
                    v_temporal = v_temporal.a_izquierda;
                else
                    v_temporal = v_temporal.a_derecha;
                a_contRamas++;                  
                }
            }
        return v_anterior;
    }
    void m_mostMenorYMayor(){
        System.out.println(a_menorRama.a_nivel + " " + a_mayorRama.a_nivel);
    }
}