package problema.pkg274.evaluacion.expresion.polaca;
public class Operaciones{
    boolean a_bandOperandos;
    ExprPolaca m_sepaDatos(String p_linea){
        String arreDatos[];
        arreDatos = p_linea.split(" ");
        ExprPolaca expresion = new ExprPolaca(arreDatos);
        return expresion;
    }
    void m_veriOperacion(ExprPolaca p_expresion){
        int v_cont, v_contPila = 0;
        boolean v_bandSigno = true;
        a_bandOperandos = true;
        for (v_cont = 0; v_cont < p_expresion.a_datos.length && a_bandOperandos == true && v_bandSigno == true; v_cont++){
            switch (p_expresion.a_datos[v_cont].charAt(0)){
                case '+':
                    v_contPila = m_veriPila(v_contPila);
                    break;
                case '-':
                    v_contPila = m_veriPila(v_contPila);
                    break;
                case '*':
                    v_contPila = m_veriPila(v_contPila);
                    break;
                case '/':
                    v_contPila = m_veriPila(v_contPila);
                    break;
                case '%':
                    v_contPila = m_veriPila(v_contPila);
                    break;
                default:
                    if (Character.isDigit(p_expresion.a_datos[v_cont].charAt(0)) || Character.isLetter(p_expresion.a_datos[v_cont].charAt(0)))
                        v_contPila++;
                    else
                        v_bandSigno = false;
            }
        }
        if (a_bandOperandos)
            if (v_bandSigno)
                if (v_contPila == 1)
                    System.out.println("OK");  
                else
                    System.out.println("FALTA OPERADOR");
            else
                System.out.println("SIMBOLO DESCONOCIDO");
        else
            System.out.println("FALTA OPERANDO");
    }
    int m_veriPila(int p_contPila){
        if (p_contPila >= 2)
            p_contPila--;
        else
            a_bandOperandos = false;
        return p_contPila;
    }
}