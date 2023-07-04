package problema.pkg293.el.tda;
public class Operaciones {
    String arreDatos[];
    String a_cadena = "";
    boolean m_sepaOperacion(String p_operacion){
        boolean v_bandera = true;
        arreDatos = p_operacion.split(" ");
        if (arreDatos[0].equals("FINISH")){
            a_cadena = a_cadena.concat("****");
            System.out.println(a_cadena);
            v_bandera = false;
        }
        //System.out.println(a_cadena);
        return v_bandera;
    }
    boolean m_realOperacion(TDAPersonalidad p_TDA){
        boolean v_bandera = true;
        //System.out.println("Operacion a realizar: " + arreDatos[0]);
        switch (arreDatos[0]){
            case "PUSH":
                //System.out.println("Valor: " + arreDatos[1]);
                if (Integer.parseInt(arreDatos[1]) >= 0)
                    p_TDA.PUSH(Integer.parseInt(arreDatos[1]));
                else
                    v_bandera = false;
                break;
            case "IN":
                //System.out.println("Valor: " + arreDatos[1]);
                if (Integer.parseInt(arreDatos[1]) >= 0)
                    p_TDA.IN(Integer.parseInt(arreDatos[1]));
                else
                    v_bandera = false;
                break;
            case "INSERT":
                //System.out.println("Valor: " + arreDatos[1]);
                if (Integer.parseInt(arreDatos[1]) >= 0)
                    p_TDA.INSERT(Integer.parseInt(arreDatos[1]));
                else
                    v_bandera = false;
                break;
            case "POP":
                a_cadena = a_cadena.concat(p_TDA.m_POP() + ", ");
                break;
            case "OUT":
                a_cadena = a_cadena.concat(p_TDA.m_OUT()+ ", ");
                break;
            case "REMOVE":
                if (p_TDA.m_REMOVE(Integer.parseInt(arreDatos[1])))
                    a_cadena = a_cadena.concat(Integer.parseInt(arreDatos[1]) + ", ");
                else
                    a_cadena = a_cadena.concat("NO DATA, ");
                break;
            default:
                v_bandera = false; 
        }
        return v_bandera;
    }
}