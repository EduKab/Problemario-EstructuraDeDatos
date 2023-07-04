package problema.pkg272.el.gasto.de.memoria.dinamica;
import java.util.Scanner;
public class p272 {
    Scanner a_teclado;
    int a_casos;
    public static void main(String[] args) {
        p272 objeto = new p272();
        objeto.m_pediCasos();
        if(objeto.a_casos > 0 && objeto.a_casos < 10)
            objeto.calcMemoria(objeto.a_casos);
    }
    void m_pediCasos(){
        a_teclado = new Scanner(System.in);
        a_casos = a_teclado.nextInt();
    }
    void calcMemoria(int p_casos){
        int v_cont, v_numeAlgoritmos;
        Algoritmos[]v_arreAlgoritmos;
        boolean v_bandera = false;
        for (v_cont = 0; v_cont < p_casos && v_bandera == false; v_cont++){
            v_numeAlgoritmos = a_teclado.nextInt();
            if (v_numeAlgoritmos > 0 && v_numeAlgoritmos < 5){
                a_teclado.nextLine();
                v_arreAlgoritmos = new Algoritmos[v_numeAlgoritmos];
                GastoMemoria objeto2 = new GastoMemoria();
                objeto2.m_ingrAlgoritmos(v_arreAlgoritmos, v_numeAlgoritmos, a_teclado);
                objeto2.m_evalAlgoritmo(v_arreAlgoritmos);
            }
            else
                v_bandera = true;
        }
    }
}