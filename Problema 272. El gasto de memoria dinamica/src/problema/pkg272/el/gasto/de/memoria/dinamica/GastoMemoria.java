package problema.pkg272.el.gasto.de.memoria.dinamica;
import java.util.Scanner;
public class GastoMemoria {
    int a_cont, a_cont2;
    void m_ingrAlgoritmos(Algoritmos[] p_arreglo, int p_numeAlgoritmos, Scanner p_teclado){
        String v_algoritmo;      
        for (a_cont = 0; a_cont < p_numeAlgoritmos; a_cont++){
            v_algoritmo = p_teclado.nextLine();
            Algoritmos objeto = new Algoritmos(v_algoritmo);
            p_arreglo[a_cont] = objeto;
        }
    }
    void m_evalAlgoritmo(Algoritmos[] p_arreAlgoritmo){
        String v_algoritmo[];
        int v_memoria, v_menorMemoria = 0, v_contMenor = 0;
        for (a_cont = 0; a_cont < p_arreAlgoritmo.length; a_cont++){
            v_memoria = 0;
            v_algoritmo = p_arreAlgoritmo[a_cont].a_algoritmo.split(",");
            for (a_cont2 = 0; a_cont2 < v_algoritmo.length; a_cont2++){
                switch (v_algoritmo[a_cont2]){
                    case "byte":
                        v_memoria += 1;
                        break;
                    case "boolean":
                        v_memoria += 1;
                        break;
                    case "char":
                        v_memoria += 2;
                        break;
                    case "int":
                        v_memoria += 4;
                        break;
                    case "float":
                        v_memoria += 4;
                        break;
                    case "long":
                        v_memoria += 8;
                        break;
                    case "double":
                        v_memoria += 8;
                        break;
                    case "String":
                        v_memoria += 16;
                        break;                       
                }
            }
            if(v_menorMemoria == 0){
                v_menorMemoria = v_memoria;
                v_contMenor = a_cont + 1;
            }
            else{
                if (v_memoria < v_menorMemoria){
                    v_menorMemoria = v_memoria;
                    v_contMenor = a_cont + 1;
                }
            }
        }
        System.out.println("Algoritmo " + v_contMenor + " => " + v_menorMemoria + " bytes");
    }  
}
