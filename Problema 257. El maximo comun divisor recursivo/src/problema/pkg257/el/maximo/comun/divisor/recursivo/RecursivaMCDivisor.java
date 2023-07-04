package problema.pkg257.el.maximo.comun.divisor.recursivo;
public class RecursivaMCDivisor{
    void m_obteDatos(String[] p_arreglo, int[] p_arreNumeros1, int[] p_arreNumeros2, int p_cont){
        int v_cont2;
        boolean v_bandera;
        for (p_cont = 0; p_cont < p_arreglo.length; p_cont++){
            v_bandera = true;
            for (v_cont2 = 0; v_cont2 < p_arreglo[p_cont].length() && v_bandera == true; v_cont2++){
                if  (p_arreglo[p_cont].charAt(v_cont2) == ' '){
                    p_arreNumeros1[p_cont] = Integer.parseInt(p_arreglo[p_cont].substring(0, v_cont2));
                    p_arreNumeros2[p_cont] = Integer.parseInt(p_arreglo[p_cont].substring(v_cont2 + 1, p_arreglo[p_cont].length()));
                    v_bandera = false;
                }                    
            }
        }
    }
    void m_mostMCDivisor(int p_numeCasos, int p_cont, int[] p_arreNumeros1, int [] p_arreNumeros2){
        for (p_cont = 0; p_cont < p_numeCasos; p_cont++){
            if (p_arreNumeros1[p_cont] >= p_arreNumeros2[p_cont])
                System.out.println(m_recursivaMCDivisor(p_arreNumeros1[p_cont], p_arreNumeros2[p_cont], 0));
            else
                System.out.println(m_recursivaMCDivisor(p_arreNumeros2[p_cont], p_arreNumeros1[p_cont], 0));
        }
    }
    int m_recursivaMCDivisor(int p_numero1, int p_numero2, int p_resultado){
        if((p_numero1 - p_numero2) == 0){
            return p_numero1;
        }
        else{
            p_resultado = p_numero1 - p_numero2;
            if (p_resultado >= p_numero2){
                return m_recursivaMCDivisor(p_resultado, p_numero2, 0);
            }
            else{
                return m_recursivaMCDivisor(p_numero2, p_resultado, 0);
            }     
        }
    }
}
