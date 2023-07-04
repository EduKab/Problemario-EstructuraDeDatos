package problema.pkg291.numeros.complejos;
import java.util.Scanner;
public class p291{
    Scanner a_teclado;
    String a_linea;
    boolean a_bandera = true;
    public static void main(String[] args) {
        p291 objeto = new p291();
        Operaciones operaciones = new Operaciones();
        objeto.a_teclado = new Scanner(System.in);
        while (objeto.a_bandera){
            try {
                objeto.m_ingrDatos();
            } catch (Exception e) {
                objeto.a_bandera = false;
            }
            if (objeto.a_bandera)
                operaciones.m_obteNumeros(objeto.a_linea);
        }
    }
    void m_ingrDatos(){
        a_linea = a_teclado.nextLine();
    }        
}