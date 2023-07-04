package problema.pkg258.suma.del.vector.recursivo;
import java.util.Scanner;
public class RecursivaDatos{
    int[] m_recuPediDatos(int[] p_arreNumeros, int p_cont, int p_dato, Scanner p_teclado){
        if(p_cont >= p_arreNumeros.length){
            return p_arreNumeros;
        }
        else{
            p_dato = p_teclado.nextInt();
            p_arreNumeros[p_cont] = p_dato;
            return m_recuPediDatos(p_arreNumeros, p_cont + 1, p_dato, p_teclado);
        }
    }
}