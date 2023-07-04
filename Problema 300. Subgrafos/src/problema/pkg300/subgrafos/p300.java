package problema.pkg300.subgrafos;
import java.util.Scanner;
public class p300 {
    Scanner a_teclado;
    int a_vertices;
    boolean a_bandera = true;
    String a_caso, arreRenglones[];
    public static void main(String[] args) {
        p300 objeto = new p300();
        Grafo grafo = new Grafo();
        objeto.a_teclado = new Scanner(System.in);
        objeto.m_ingrVertices();
        objeto.m_ingrRenglones();
        while(objeto.a_bandera){
            try {
                grafo.m_llenaMatriz(objeto.arreRenglones, objeto.a_vertices);
                objeto.a_caso = objeto.a_teclado.nextLine();
            } catch (Exception e) {
                objeto.a_bandera = false;
            }
            if (objeto.a_bandera){
                grafo.m_defiSubgrafo(objeto.a_caso);
            }  
        }
    }
    void m_ingrVertices(){
        a_vertices = a_teclado.nextInt();
        a_teclado.nextLine();
    }
    void m_ingrRenglones(){
        int v_cont;
        arreRenglones = new String[a_vertices];
        for (v_cont = 0; v_cont < a_vertices && a_bandera; v_cont++){
            arreRenglones[v_cont] = a_teclado.nextLine();
            if (arreRenglones[v_cont].length() != (a_vertices * 2 - 1))
                a_bandera = false;
        }
    }
}