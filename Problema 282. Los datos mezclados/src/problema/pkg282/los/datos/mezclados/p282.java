package problema.pkg282.los.datos.mezclados;
import java.util.Scanner;
public class p282 {
  Scanner a_teclado;
  String a_cadena;
  int a_casos, a_cont;
  boolean a_bandera = false;
  public static void main(String[] args) {
     p282 objeto = new p282();
     Operaciones objetoOperaciones = new Operaciones();
     Pila objetoPila = new Pila();
     Cola objetoCola = new Cola();
     objeto.a_teclado = new Scanner(System.in);
     objeto.m_ingrCasos();
     for (objeto.a_cont = 0; objeto.a_cont < objeto.a_casos && objeto.a_bandera == false; objeto.a_cont++){
        objeto.m_ingrCadena();
        objetoOperaciones.m_realOperaciones(objetoPila, objetoCola, objeto.a_cadena);
     }
  }
  void m_ingrCasos(){
    a_casos = a_teclado.nextInt();
    if (a_casos < 1 || a_casos > 5){
      a_bandera = true;
    }
  }
  void m_ingrCadena(){
    a_cadena = a_teclado.next();
  }
}