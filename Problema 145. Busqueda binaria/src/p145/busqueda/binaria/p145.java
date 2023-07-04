package p145.busqueda.binaria;
import java.util.Scanner;
public class p145 {
    Scanner a_teclado;
    String a_cadena;
    boolean a_bandera = true;
    public static void main(String[] args) {
        p145 objeto = new p145();
        objeto.a_teclado = new Scanner(System.in);
        do {            
            BusquedaBinaria busqueda = new BusquedaBinaria();
            objeto.m_estaLimites();
            if (busqueda.m_veriLimites(objeto.a_cadena) == false)
                objeto.a_bandera = false;
        } while (objeto.a_bandera);
    }
    void m_estaLimites(){
        a_cadena = a_teclado.nextLine();
    }
}