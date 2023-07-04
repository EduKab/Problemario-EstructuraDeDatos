package problema.pkg269.la.pila.restrictiva;
import java.util.Scanner;
public class p269 {
    Scanner a_teclado;
    public static void main(String[] args) {
        p269 objeto = new p269();
        objeto.a_teclado = new Scanner (System.in);
        Pila pila = new Pila(objeto.m_ingrTamano());
        objeto.m_ingrOperaciones(pila);
    }
    int m_ingrTamano(){
        int v_tamano;
        a_teclado = new Scanner (System.in);
        v_tamano = a_teclado.nextInt();
        return v_tamano;
    }
    void m_ingrOperaciones(Pila p_pila){
        String v_split[];
        a_teclado.nextLine();
        v_split = a_teclado.nextLine().split(" ");
        while(v_split[0].equals("PUSH") || v_split[0].equals("POP")){
            if (v_split[0].equals("PUSH")){
                p_pila.m_PUSH(Integer.parseInt(v_split[1]));
            }
            else
                try {
                    System.out.println(p_pila.m_POP()); 
                } catch (Exception e) {
                    System.out.println("UNDERFLOW");
                    
                }
            v_split = a_teclado.nextLine().split(" ");
        }
        p_pila.FREE();
    }
}