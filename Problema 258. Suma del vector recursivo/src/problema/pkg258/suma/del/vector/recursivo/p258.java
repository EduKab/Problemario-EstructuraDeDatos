package problema.pkg258.suma.del.vector.recursivo;
import java.util.Scanner;
public class p258 {
Scanner a_teclado;
int a_tamaArreglo, arreNumeros[], a_cont = 0, a_dato, a_suma = 0;
    public static void main(String[] args) {
        p258 objeto = new p258();
        RecursivaDatos objeto2 = new RecursivaDatos();
        RecursivaSuma objeto3 = new RecursivaSuma();
        objeto.m_pediNumeElementos();
        objeto.arreNumeros = new int[objeto.a_tamaArreglo];
        objeto.arreNumeros = objeto2.m_recuPediDatos(objeto.arreNumeros, objeto.a_cont, objeto.a_dato, objeto.a_teclado);
        System.out.println (objeto3.m_recuSuma(objeto.arreNumeros, objeto.a_cont, objeto.a_suma));
    }
    void m_pediNumeElementos(){
        a_teclado = new Scanner (System.in);
        a_tamaArreglo = a_teclado.nextInt();
    }
}