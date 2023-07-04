package problema.pkg243.los.brazos;
public class Movimientos {
    Brazo brazos[];
    String arreDatos[];
    void m_sepaDatos(String p_datos){
        int v_cont, v_numeBrazos;
        arreDatos = p_datos.split(" ");
        v_numeBrazos = Integer.parseInt(arreDatos[0]);
        if (v_numeBrazos > 0 && v_numeBrazos <= 5){
            brazos = new Brazo[v_numeBrazos];
            for (v_cont = 0; v_cont < v_numeBrazos; v_cont++){
                Brazo nuevBrazo = new Brazo (Integer.parseInt(arreDatos[v_cont + 1]));
                brazos[v_cont] = nuevBrazo;
            };
        }
    }
    void m_geneMovimientos(){
        String v_resultado = "";
        int v_brazoMover, v_cont = 1, v_gradoMover;
        boolean v_bandera = true;
        do {     
            v_brazoMover = Integer.parseInt(arreDatos[brazos.length + v_cont]);
            //System.out.println("Brazo a mover: " + v_brazoMover);
            if (v_brazoMover > 0){
                v_gradoMover = Integer.parseInt(arreDatos[brazos.length + (v_cont + 1)]);
                //System.out.println("Grados a mover: " + v_gradoMover);
                brazos[v_brazoMover - 1].a_totalGrados += v_gradoMover;
                if (brazos[v_brazoMover - 1].a_totalGrados < brazos[v_brazoMover - 1].a_limiInferior || brazos[v_brazoMover - 1].a_totalGrados> brazos[v_brazoMover - 1].a_limiSuperior)
                    v_bandera = false;
                v_cont += 2;
            }
        } while (v_brazoMover > 0 && v_bandera == true);
        if (v_bandera){
            for (v_cont = 0; v_cont < brazos.length; v_cont++)
                v_resultado = v_resultado.concat(v_cont + 1 + " " + brazos[v_cont].a_totalGrados + " ");
            System.out.println(v_resultado);
        }
        else
            System.out.println("STOP " + v_brazoMover + " " + brazos[v_brazoMover - 1].a_totalGrados);
    }
}
