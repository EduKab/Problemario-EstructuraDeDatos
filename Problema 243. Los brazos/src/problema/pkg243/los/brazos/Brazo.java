package problema.pkg243.los.brazos;
public class Brazo {
    int a_totalGrados, a_limiInferior, a_limiSuperior;
    public Brazo(int p_gradLibertad){
        a_totalGrados = 0;
        a_limiInferior = 0 - p_gradLibertad;
        a_limiSuperior = p_gradLibertad;
    }   
}