package problema.pkg271.la.expresion.polaca;
import java.util.Scanner;
public class p273{
    Scanner a_teclado;
    String a_linea = "";
    boolean a_bandera = true;
    public static void main(String[] args) {
        p273 objeto = new p273();
        exprPolaca objeto2 = new exprPolaca();
        objeto.a_teclado = new Scanner(System.in);
        while (objeto.a_bandera) {            
            try {
                objeto.m_ingrLineas();
            } catch (Exception e) {
                objeto.a_bandera = false;
            }
            if (objeto.a_bandera)
                objeto2.m_evalOperaciones(objeto.a_linea);
        }
    }
    void m_ingrLineas(){
        a_linea = a_teclado.nextLine();
    }
}