package problema.pkg258.suma.del.vector.recursivo;
public class RecursivaSuma{
    int m_recuSuma(int[] p_arreNumeros, int p_cont, int p_suma){
        if (p_cont >= p_arreNumeros.length){
            return p_suma;
        }
        else{
            p_suma += p_arreNumeros[p_cont];
            return m_recuSuma(p_arreNumeros, p_cont + 1, p_suma);
        }
    }
}