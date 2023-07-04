package problema.pkg282.los.datos.mezclados;
public class Operaciones {
    void m_realOperaciones(Pila p_pila, Cola p_cola, String p_cadena){
    String v_subcadena, v_valor, v_cadena = "";
    int v_cont2, v_elemPendPila, v_elemPendCola;
    for (v_cont2 = 0; v_cont2 < p_cadena.length(); v_cont2 += 2){
        v_subcadena = p_cadena.substring(v_cont2, v_cont2 + 2);
        switch (v_subcadena){
           case "PU":
              v_valor = p_cadena.substring(v_cont2 + 2, v_cont2 + 4);                        
              p_pila.m_PUSH(Integer.parseInt(v_valor));
              break;
           case "PO":
              if (p_pila.a_contPila > 0)
                v_cadena = v_cadena.concat(String.valueOf(p_pila.m_POP() + ","));
              else
                v_cadena = v_cadena.concat("##,");
              break;
           case "LL":
              v_valor = p_cadena.substring(v_cont2 + 2, v_cont2 + 4);                        
              p_cola.m_LLEGA(Integer.parseInt(v_valor));
              break;
           case "SA":
              if (p_cola.a_contCola > 0)
                v_cadena = v_cadena.concat(String.valueOf(p_cola.m_SALE() + ","));
              else
                v_cadena = v_cadena.concat("$$,");
              break;
        }
    }
    v_elemPendPila = p_pila.a_contPila;
    v_elemPendCola = p_cola.a_contCola;
    for (v_cont2 = 0; v_cont2 < v_elemPendCola; v_cont2++)
       v_cadena = v_cadena.concat(String.valueOf(p_cola.m_SALE() + ","));
    for (v_cont2 = 0; v_cont2 < v_elemPendPila; v_cont2++)
       v_cadena = v_cadena.concat(String.valueOf(p_pila.m_POP() + ","));
    System.out.println(v_cadena.substring(0,v_cadena.length() - 1));
  }
}
