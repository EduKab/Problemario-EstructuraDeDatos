package problema.pkg280.conteo.de.llamadas.recursivas;
import java.util.Scanner;
public class p280 {
    Scanner a_teclado;
    int a_numeCasos, a_cont, arreFibonacci[], a_contLlamadas;
    public static void main(String[] args) {
        p280 objeto = new p280();
        objeto.m_pediCasos();
        objeto.m_ingrFibonacci();
        objeto.m_contLlamadas();
    }
    void m_pediCasos(){
        a_teclado = new Scanner(System.in);
        a_numeCasos = a_teclado.nextInt();
        arreFibonacci = new int[a_numeCasos];
    }
    void m_ingrFibonacci(){
        for (a_cont = 0; a_cont < a_numeCasos; a_cont++)
            arreFibonacci[a_cont] = a_teclado.nextInt();
    }
    void m_contLlamadas(){
        for (a_cont = 0; a_cont < a_numeCasos; a_cont++){
            a_contLlamadas = 0;
            m_recursivo(arreFibonacci[a_cont]);
            System.out.println(a_contLlamadas);
        }
    }
    int m_recursivo(int p_fibonacci){
        a_contLlamadas++;
        if (p_fibonacci <= 1){ 
            return 1;
        }
        else{
            return m_recursivo(p_fibonacci - 1) + m_recursivo(p_fibonacci - 2);
        }
    }
}