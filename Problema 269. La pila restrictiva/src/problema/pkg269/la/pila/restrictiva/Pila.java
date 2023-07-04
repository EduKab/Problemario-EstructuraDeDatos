package problema.pkg269.la.pila.restrictiva;
public class Pila{
    private Nodo datos[];
    private int a_tope;
    public Pila(int p_tamano){
        datos = new Nodo[p_tamano];
        a_tope = 0;
    }
    void m_PUSH(int p_dato){
        if (a_tope < datos.length){
            if (p_dato >= 1 && p_dato <= 99){
                Nodo nodo = new Nodo(p_dato);
                datos[a_tope] = nodo;
                a_tope++;
            }
            else
                System.out.println("PUSH ERRONEO" + " " + p_dato);
        }
        else
            System.out.println("OVERFLOW" + " " + p_dato);
    }
    int m_POP(){
        int v_datoPOP;
        v_datoPOP = datos[a_tope - 1].a_numero;
        a_tope--;
        return v_datoPOP;
    }
    void FREE(){
        int v_cont;
        for (v_cont = 0; v_cont < a_tope;)
            System.out.println(m_POP());
    }
}