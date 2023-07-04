package problema.pkg243.los.brazos;
import java.util.Scanner;
public class p243 {
    Scanner a_teclado;
    int a_casos, a_cont;
    public static void main(String[] args) {
        p243 objeto = new p243();
        objeto.a_teclado = new Scanner(System.in);
        objeto.m_ingrCasos();
        for (objeto.a_cont = 0; objeto.a_cont < objeto.a_casos; objeto.a_cont++){
            Movimientos movimientos = new Movimientos();
            movimientos.m_sepaDatos(objeto.m_ingrDatos());
            movimientos.m_geneMovimientos();
        }
    }
    void m_ingrCasos(){
        a_casos = a_teclado.nextInt();
        a_teclado.nextLine();
    }
    String m_ingrDatos(){
        String v_datos;
        v_datos = a_teclado.nextLine();
        return v_datos;
    }
}