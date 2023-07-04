package problema.pkg292.el.polinomio.de.hermite.recursion;
import java.util.Scanner;
public class p292 {
    int a_casos, a_cont;
    Scanner a_teclado;
    public static void main(String[] args) {
        p292 objeto = new p292();
        objeto.a_teclado = new Scanner(System.in);
        if (objeto.m_ingrCasos())
            for (objeto.a_cont = 0; objeto.a_cont < objeto.a_casos; objeto.a_cont++){
                Recursion recursion = new Recursion();
                recursion.m_obteValores(objeto.m_ingrRenglones());
            }        
    }
    boolean m_ingrCasos(){
        boolean v_bandera = true;
        a_casos = a_teclado.nextInt();
        if (a_casos <= 0)
            v_bandera = false;
        a_teclado.nextLine();
        return v_bandera;
    }
    String m_ingrRenglones(){
        String v_renglon;
        v_renglon = a_teclado.nextLine();
        return v_renglon;
    }
}