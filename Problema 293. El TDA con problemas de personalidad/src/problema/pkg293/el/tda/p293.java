package problema.pkg293.el.tda;
import java.util.Scanner;
public class p293 {
    Scanner a_teclado;
    int a_cont, a_casos;
    boolean a_bandera;
    public static void main(String[] args){
        p293 objeto = new p293();
        objeto.a_teclado = new Scanner(System.in);
        objeto.m_ingrCasos();
        for (objeto.a_cont = 0; objeto.a_cont < objeto.a_casos; objeto.a_cont++){
            objeto.a_bandera = true;
            Operaciones operaciones = new Operaciones();
            TDAPersonalidad TDA = new TDAPersonalidad();
            while (objeto.a_bandera){
                if (operaciones.m_sepaOperacion(objeto.m_ingrOperacion()) == true){
                    if (operaciones.m_realOperacion(TDA) == false)
                        objeto.a_bandera = false;
                }
                else
                    objeto.a_bandera = false;
            }
        }
    }
    void m_ingrCasos(){
        a_casos = a_teclado.nextInt();
        a_teclado.nextLine();
    }
    String m_ingrOperacion(){
        String v_operacion;
        v_operacion = a_teclado.nextLine();
        return v_operacion;
    }
}