package problema.pkg285.arbol.binario.ordenado.desbalanceado;
public class Nodo {
    int a_numero, a_nivel;
    Nodo a_derecha, a_izquierda;
    public Nodo(int p_numero){
        a_numero = p_numero;
        a_derecha = null;
        a_izquierda = null;
    }
}