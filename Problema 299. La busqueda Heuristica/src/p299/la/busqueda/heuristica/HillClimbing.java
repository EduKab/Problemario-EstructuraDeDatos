package p299.la.busqueda.heuristica;
public class HillClimbing {
    String matriz[][];
    void m_llenaMatriz(String[] p_renglones){
        String v_renglones[];
        int v_cont, v_cont2;
        matriz = new String[p_renglones.length][p_renglones.length];
        for (v_cont = 0; v_cont < p_renglones.length; v_cont++){
            v_renglones = p_renglones[v_cont].split(" ");
            for (v_cont2 = 0; v_cont2 < p_renglones.length; v_cont2++){
                matriz[v_cont][v_cont2] = v_renglones[v_cont2];
            }
        }
    }
    void m_buscRuta(String p_parVertices){
        String v_ruta[], v_vertInicial, v_vertFinal;
        Nodo v_vertActual;
        int v_cont, v_cont2;
        Pila pila = new Pila();
        v_ruta = new String[6];
        for (v_cont = 0; v_cont < matriz.length; v_cont++)
            for(v_cont2 = 0; v_cont2 < matriz.length; v_cont2++){
                if (!matriz[v_cont][v_cont2].equals("0")) {
                    switch (v_cont2){
                        case 0:
                            pila.m_PUSH("A", matriz[v_cont][v_cont2]);
                            break;
                        case 1:
                            pila.m_PUSH("B", matriz[v_cont][v_cont2]);
                            break;
                        case 2:
                            pila.m_PUSH("C", matriz[v_cont][v_cont2]);
                            break;
                        case 3:
                            pila.m_PUSH("D", matriz[v_cont][v_cont2]);
                            break;
                        case 4:
                            pila.m_PUSH("E", matriz[v_cont][v_cont2]);
                            break;
                        default:
                            pila.m_PUSH("F", matriz[v_cont][v_cont2]);
                    }
                }
            }
        v_vertActual = pila.m_POP();
        System.out.println("Dato sacado: " + v_vertActual.a_vertice + " - " + v_vertActual.v_costo);
    }
}
