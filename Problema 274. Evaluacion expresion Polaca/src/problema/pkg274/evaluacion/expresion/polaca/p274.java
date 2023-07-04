package problema.pkg274.evaluacion.expresion.polaca;
import java.util.Scanner;
public class p274{
    Scanner a_teclado;
    String a_expresion;
    boolean a_bandera = true;
    public static void main(String[] args) {
        p274 objeto = new p274();
        objeto.a_teclado = new Scanner(System.in);
        Operaciones objeto2 = new Operaciones();
        while (objeto.a_bandera){
            try {
                objeto.m_pediDatos();
            } catch (Exception e) {
                objeto.a_bandera = false;
            }
            if(objeto.a_bandera)
                objeto2.m_veriOperacion(objeto2.m_sepaDatos(objeto.a_expresion)); 
        }
    }
    void m_pediDatos(){
        a_expresion = a_teclado.nextLine();
    }
}