package problema.pkg271.la.expresion.polaca;
public class exprPolaca {
    void m_evalOperaciones(String p_linea){
        switch(p_linea.trim().charAt(0)){
            case '+':
                System.out.println("PREFIJA");
                break;
            case '-':
                System.out.println("PREFIJA");
                break;
            case '*':
                System.out.println("PREFIJA");
                break;
            case '/':
                System.out.println("PREFIJA");
                break;
            case '%':
                System.out.println("PREFIJA");
                break;
            default:
                System.out.println("POSTFIJA");
        }
    }
}