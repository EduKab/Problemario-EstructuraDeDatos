package problema.pkg257.el.maximo.comun.divisor.recursivo;
import java.util.Scanner;
public class p257 {
    Scanner a_teclado;
    String arreLineas[];
    int a_numeCasos, arreNumeros1[], arreNumeros2[], a_cont;
    public static void main(String[] args) {
        p257 objeto = new p257();
        RecursivaMCDivisor objeto2 = new RecursivaMCDivisor();
        objeto.m_numeCasos();
        objeto.arreLineas = new String[objeto.a_numeCasos];
        objeto.arreNumeros1 = new int[objeto.a_numeCasos];
        objeto.arreNumeros2 = new int[objeto.a_numeCasos];
        objeto.m_ingrDatos(objeto.a_numeCasos, objeto.a_cont, objeto.arreLineas);
        objeto2.m_obteDatos(objeto.arreLineas,objeto.arreNumeros1, objeto.arreNumeros2, objeto.a_cont);
        objeto2.m_mostMCDivisor(objeto.a_numeCasos, objeto.a_cont, objeto.arreNumeros1, objeto.arreNumeros2);
    }
    void m_numeCasos(){
        a_teclado = new Scanner(System.in);
        a_numeCasos = a_teclado.nextInt();
    }
    void m_ingrDatos(int p_numeCasos, int p_cont, String[] p_arreLineas){
        a_teclado.nextLine();
        for (p_cont = 0; p_cont < p_numeCasos; p_cont++){
            p_arreLineas[p_cont] = a_teclado.nextLine();
        }
    }
}