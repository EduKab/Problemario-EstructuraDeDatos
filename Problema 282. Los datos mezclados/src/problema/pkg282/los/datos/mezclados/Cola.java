package problema.pkg282.los.datos.mezclados;
public class Cola {
   Nodo a_inicio, a_fin;
   int a_contCola = 0;
   void m_LLEGA(int p_valor){
      Nodo objeto = new Nodo(p_valor);
      if (a_contCola == 0)
         a_inicio = objeto;
      else
         a_fin.a_siguiente = objeto;
      a_fin = objeto;
      a_contCola++;
   }
   int m_SALE(){
     int v_aux;
     v_aux = a_inicio.a_valor;
     a_inicio = a_inicio.a_siguiente;
     a_contCola--;
     return v_aux;
   }
}