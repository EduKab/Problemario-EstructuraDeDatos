package problema.pkg291.numeros.complejos;
import java.text.DecimalFormat;
public class Operaciones {
    String a_signo;
    float a_parteReal = 0, a_parteImaginaria = 0;
    void m_obteNumeros(String p_linea){
        String v_linea[];
        float v_numeReal, v_numeImaginario;
        v_linea = p_linea.split(" ");
        v_numeReal = Float.parseFloat(v_linea[0]);
        v_numeImaginario = Float.parseFloat(v_linea[1].substring(0, v_linea[1].length() - 1));
        NumeroComplejo Numero1 = new NumeroComplejo(v_numeReal, v_numeImaginario);
        v_numeReal = Float.parseFloat(v_linea[2]);
        v_numeImaginario =  Float.parseFloat(v_linea[3].substring(0, v_linea[3].length() - 1));
        NumeroComplejo Numero2 = new NumeroComplejo(v_numeReal, v_numeImaginario);
        a_signo = v_linea[4];
        m_haceOperacion(Numero1, Numero2);
    }
    void m_haceOperacion(NumeroComplejo p_numero1, NumeroComplejo p_numero2){
        switch (a_signo) {
            case "+":
                a_parteReal = p_numero1.a_numeReal + p_numero2.a_numeReal;
                a_parteImaginaria = p_numero1.a_numeImaginario + p_numero2.a_numeImaginario;
                break;
            case "-":
                a_parteReal = p_numero1.a_numeReal - p_numero2.a_numeReal;
                a_parteImaginaria = p_numero1.a_numeImaginario - p_numero2.a_numeImaginario;
                break;
            case "*":
                a_parteReal = (p_numero1.a_numeReal * p_numero2.a_numeReal) - (p_numero1.a_numeImaginario * p_numero2.a_numeImaginario);
                a_parteImaginaria = (p_numero1.a_numeReal * p_numero2.a_numeImaginario) + (p_numero2.a_numeReal * p_numero1.a_numeImaginario);
                break;
            case "/":
                a_parteReal = ((p_numero1.a_numeReal * p_numero2.a_numeReal) + (p_numero1.a_numeImaginario * p_numero2.a_numeImaginario)) / ((p_numero2.a_numeReal * p_numero2.a_numeReal) + (p_numero2.a_numeImaginario * p_numero2.a_numeImaginario));
                a_parteImaginaria = ((p_numero1.a_numeImaginario * p_numero2.a_numeReal) - (p_numero1.a_numeReal * p_numero2.a_numeImaginario)) / ((p_numero2.a_numeReal * p_numero2.a_numeReal) + (p_numero2.a_numeImaginario * p_numero2.a_numeImaginario));
                break;
        }
        m_mostNumeros();
    }
    void m_mostNumeros(){
        DecimalFormat v_decimal;
        v_decimal = new DecimalFormat("#.#");
        if (a_parteImaginaria >= 0){
            System.out.println(v_decimal.format(a_parteReal) + " +" + v_decimal.format(a_parteImaginaria) + "i");
        }
        else{
            System.out.println(v_decimal.format(a_parteReal) + " " + v_decimal.format(a_parteImaginaria) + "i");
        }
    }
}
