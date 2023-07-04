package problema.pkg292.el.polinomio.de.hermite.recursion;
public class Recursion {
    boolean m_obteValores(String p_renglon){
        String v_split[], v_resultado;
        float v_n, v_X;
        boolean v_bandera = true;
        v_split = p_renglon.split(" ");
        v_n = Float.parseFloat(v_split[0]);
        v_X = Float.parseFloat(v_split[1]);
        if (v_n >= 0){
            try {
                v_resultado = String.format("%.3f", m_Hn((int)v_n, v_X));
                v_resultado = v_resultado.substring(0, v_resultado.length()-1);
                System.out.println(v_resultado);
            } catch (Exception e) {
                System.out.println("null"); 
            }
        }
        else
            v_bandera = false;
        return v_bandera;
    }
    float m_Hn(int p_n, float p_X){
        if (p_n >= 0)
            if ((int)p_n == 0 || (int)p_n == 1)
                if (p_n >= 0 && p_n < 1)
                    return 1;
                else
                    return 2 * p_X;
            else
                try {
                    return 2*(p_X) * m_Hn((int)(p_n - 1), p_X) - 2 * (p_n - 1) * m_Hn((int)(p_n - 2), p_X);
                }catch (Exception e) {
                    return 0;
                }
        else
            return 0;
    }
}
