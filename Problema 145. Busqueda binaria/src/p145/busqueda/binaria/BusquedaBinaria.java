package p145.busqueda.binaria;
public class BusquedaBinaria {
    int a_contPreguntas = 0;
    boolean m_veriLimites(String p_limites){
        String arreLimites[];
        int v_valorEncontrado;
        boolean v_bandera = true;
        arreLimites = p_limites.split(" ");
        Datos datos = new Datos(Integer.parseInt(arreLimites[0]), Integer.parseInt(arreLimites[1]), Integer.parseInt(arreLimites[2]));
        if (datos.a_limiSuperior == 0 && datos.a_limiSuperior == 0 && datos.a_datoBuscar == 0)
            v_bandera = false;
        else{
                v_valorEncontrado = m_recuBuscar(datos.a_limiInferior, datos.a_limiSuperior, datos.a_datoBuscar);
                //System.out.println("Valor encontrado: " + v_valorEncontrado);
                //System.out.println("Dato a buscar: " + datos.a_datoBuscar);
                if(v_valorEncontrado == datos.a_datoBuscar)
                    System.out.println(a_contPreguntas);
                else
                    System.out.println("-1");      
        }
        return v_bandera;
    }
    int m_recuBuscar(int p_limiInferior, int p_limiSuperior, int p_datoBuscar){
        float v_valorCentro;
        a_contPreguntas++;
        v_valorCentro = (float)(p_limiSuperior + p_limiInferior) / 2;
        if (v_valorCentro < 0){
            if (v_valorCentro - ((int)v_valorCentro) == -0.5)
                v_valorCentro -= 1;
        }
        /*System.out.println("Numero de preguntas: " + a_contPreguntas);
        System.out.println("Inferior: " + p_limiInferior);
        System.out.println("Centro: " + (int)v_valorCentro);
        System.out.println("Superior: " + p_limiSuperior);
        System.out.println("");*/
        if (p_limiInferior == p_limiSuperior)
            return (int)v_valorCentro;
        else
                if (p_datoBuscar > (int)v_valorCentro){
                    p_limiInferior = (int)(v_valorCentro + 1);
                    return m_recuBuscar(p_limiInferior, p_limiSuperior, p_datoBuscar);
                }
                else{
                    p_limiSuperior = (int)v_valorCentro;
                    return m_recuBuscar(p_limiInferior, p_limiSuperior, p_datoBuscar);
                }
    }
}