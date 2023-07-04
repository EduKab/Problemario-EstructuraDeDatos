package p299.la.busqueda.heuristica;
import java.util.Scanner;
public class p299 {
    int a_vertices;
    Scanner a_teclado;
    public static void main(String[] args) {
        p299 objeto = new p299();
        objeto.m_ingrVertices();
        HillClimbing hillclimbing = new HillClimbing();
        hillclimbing.m_llenaMatriz(objeto.m_ingrRenglones());
        hillclimbing.m_buscRuta(objeto.m_ingrParVertices());
    }
    void m_ingrVertices(){
        a_vertices = a_teclado.nextInt();
        a_teclado.nextLine();
    }
    String[] m_ingrRenglones(){
        String v_renglones[];
        int v_cont;
        v_renglones = new String[a_vertices];
        for (v_cont = 0; v_cont < a_vertices; v_cont++)
            v_renglones[v_cont] = a_teclado.nextLine();
        return v_renglones;
    }
    String m_ingrParVertices(){
        String v_parVertices;
        v_parVertices = a_teclado.next();
        return v_parVertices;
    }
}
