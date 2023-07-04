package problema.pkg285.arbol.binario.ordenado.desbalanceado;
import java.util.Scanner;
public class p285 {
    Scanner a_teclado;
    String a_valorCadena, arreValores[];
    int a_casos, a_cont, a_cont2;
    boolean a_bandera = true;
    public static void main(String[] args){
        p285 objeto = new p285();
        objeto.m_ingrCasos();
        if (objeto.a_bandera){
            objeto.a_teclado.nextLine();
            for (objeto.a_cont = 0; objeto.a_cont < objeto.a_casos; objeto.a_cont++){
                Arbol arbol = new Arbol();
                objeto.a_bandera = true;
                while (objeto.a_bandera){
                    objeto.m_ingrValores();
                    objeto.arreValores = objeto.a_valorCadena.trim().split(" ");
                    for (objeto.a_cont2 = 0; objeto.a_cont2 < objeto.arreValores.length && objeto.a_bandera == true; objeto.a_cont2++){
                        if (objeto.arreValores[objeto.a_cont2].equals("0"))
                            objeto.a_bandera = false;
                        else
                            arbol.m_insertar(Integer.parseInt(objeto.arreValores[objeto.a_cont2]));
                    }
                }
                arbol.m_mostMenorYMayor();
            }
        }
    }
    void m_ingrCasos(){
        a_teclado = new Scanner (System.in);
        a_casos = a_teclado.nextInt();
        if (a_casos < 1 || a_casos > 4)
            a_bandera = false;
    }
    void m_ingrValores(){
        a_valorCadena = a_teclado.nextLine();
    }
}