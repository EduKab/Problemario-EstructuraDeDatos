package problema.pkg300.subgrafos;
public class Grafo {
    Matriz a_matriz;
    void m_llenaMatriz(String[] p_arreRenglones, int p_vertices){
        String v_valores[][], p_renglon[];
        int v_cont,v_cont2;
        v_valores = new String[p_vertices][p_vertices];
        for (v_cont = 0; v_cont < p_vertices; v_cont++){
            p_renglon = p_arreRenglones[v_cont].split(" ");
            for (v_cont2 = 0; v_cont2 < p_vertices; v_cont2++){
                v_valores[v_cont][v_cont2] = p_renglon[v_cont2];
                //System.out.print(v_valores[v_cont][v_cont2]);
            }
            //System.out.println();
        }
        a_matriz = new Matriz(v_valores);
    }
    void m_defiSubgrafo(String p_camino){
        String arreCamino[], v_vertInicial = "", v_vertFinal = "";
        int v_cont, v_vertActual = -1;
        boolean v_bandera = true;
        arreCamino = p_camino.split(" ");
        for (v_cont = 0; v_cont < arreCamino.length && v_bandera == true; v_cont++){
            try {
                if (v_vertActual == -1)
                    switch (arreCamino[v_cont]){
                        case "A":
                            v_vertActual = 0;
                            v_vertInicial = "A";
                            break;
                        case "B":
                            v_vertActual = 1;
                            v_vertInicial = "B";
                            break;
                        case "C":
                            v_vertActual = 2;
                            v_vertInicial = "C";
                            break;
                        case "D":
                            v_vertActual = 3;
                            v_vertInicial = "D";
                            break;
                        case "E":
                            v_vertActual = 4;
                            v_vertInicial = "E";
                            break;
                        case "F":
                            v_vertActual = 5;
                            v_vertInicial = "F";
                            break;
                        case "G":
                            v_vertActual = 6;
                            v_vertInicial = "G";
                            break;
                        case "H":
                            v_vertActual = 7;
                            v_vertInicial = "H";
                            break;
                        case "I":
                            v_vertActual = 8;
                            v_vertInicial = "I";
                            break;
                        case "J":
                            v_vertActual = 9;
                            v_vertInicial = "J";
                            break;
                        case "K":
                            v_vertActual = 10;
                            v_vertInicial = "K";
                            break;
                        case "L":
                            v_vertActual = 11;
                            v_vertInicial = "L";
                            break;
                        case "M":
                            v_vertActual = 12;
                            v_vertInicial = "M";
                            break;
                        case "N":
                            v_vertActual = 13;
                            v_vertInicial = "N";
                            break;
                        case "O":
                            v_vertActual = 14;
                            v_vertInicial = "O";
                            break;
                        case "P":
                            v_vertActual = 15;
                            v_vertInicial = "P";
                            break;
                        case "Q":
                            v_vertActual = 16;
                            v_vertInicial = "Q";
                            break;
                        case "R":
                            v_vertActual = 17;
                            v_vertInicial = "R";
                            break;
                        case "S":
                            v_vertActual = 18;
                            v_vertInicial = "S";
                            break;
                        case "T":
                            v_vertActual = 19;
                            v_vertInicial = "T";
                            break;
                        case "U":
                            v_vertActual = 20;
                            v_vertInicial = "U";
                            break;
                        case "V":
                            v_vertActual = 21;
                            v_vertInicial = "B";
                            break;
                        case "W":
                            v_vertActual = 22;
                            v_vertInicial = "W";
                            break;
                        case "X":
                            v_vertActual = 23;
                            v_vertInicial = "X";
                            break;
                        case "Y":
                            v_vertActual = 24;
                            v_vertInicial = "Y";
                            break;
                        case "Z":
                            v_vertActual = 25;
                            v_vertInicial = "Z";
                            break;
                        default:
                            v_bandera = false;
                    }
                else
                    switch (arreCamino[v_cont]){
                        case "A":
                            if (!a_matriz.matriz[v_vertActual][0].equals("0")){
                                v_vertActual = 0; 
                                v_vertFinal = "A";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "B":
                            if (!a_matriz.matriz[v_vertActual][1].equals("0")){
                                v_vertActual = 1; 
                                v_vertFinal = "B";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "C":
                            if (!a_matriz.matriz[v_vertActual][2].equals("0")){
                                v_vertActual = 2;
                                v_vertFinal = "C";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "D":
                            if (!a_matriz.matriz[v_vertActual][3].equals("0")){
                                v_vertActual = 3;
                                v_vertFinal = "D";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "E":
                            if (!a_matriz.matriz[v_vertActual][4].equals("0")){
                                v_vertActual = 4;
                                v_vertFinal = "E";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "F":
                            if (!a_matriz.matriz[v_vertActual][5].equals("0")){
                                v_vertActual = 5;
                                v_vertFinal = "F";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "G":
                            if (!a_matriz.matriz[v_vertActual][6].equals("0")){
                                v_vertActual = 6;
                                v_vertFinal = "G";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "H":
                            if (!a_matriz.matriz[v_vertActual][7].equals("0")){
                                v_vertActual = 7;
                                v_vertFinal = "H";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "I":
                            if (!a_matriz.matriz[v_vertActual][8].equals("0")){
                                v_vertActual = 8;
                                v_vertFinal = "I";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "J":
                            if (!a_matriz.matriz[v_vertActual][9].equals("0")){
                                v_vertActual = 9;
                                v_vertFinal = "J";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "K":
                            if (!a_matriz.matriz[v_vertActual][10].equals("0")){
                                v_vertActual = 10;
                                v_vertFinal = "K";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "L":
                            if (!a_matriz.matriz[v_vertActual][11].equals("0")){
                                v_vertActual = 11;
                                v_vertFinal = "L";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "M":
                            if (!a_matriz.matriz[v_vertActual][12].equals("0")){
                                v_vertActual = 12;
                                v_vertFinal = "M";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "N":
                            if (!a_matriz.matriz[v_vertActual][13].equals("0")){
                                v_vertActual = 13;
                                v_vertFinal = "N";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "O":
                            if (!a_matriz.matriz[v_vertActual][14].equals("0")){
                                v_vertActual = 14;
                                v_vertFinal = "O";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "P":
                            if (!a_matriz.matriz[v_vertActual][15].equals("0")){
                                v_vertActual = 15;
                                v_vertFinal = "P";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "Q":
                            if (!a_matriz.matriz[v_vertActual][16].equals("0")){
                                v_vertActual = 16;
                                v_vertFinal = "Q";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "R":
                            if (!a_matriz.matriz[v_vertActual][17].equals("0")){
                                v_vertActual = 17;
                                v_vertFinal = "R";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "S":
                            if (!a_matriz.matriz[v_vertActual][18].equals("0")){
                                v_vertActual = 18;
                                v_vertFinal = "S";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "T":
                            if (!a_matriz.matriz[v_vertActual][19].equals("0")){
                                v_vertActual = 19;
                                v_vertFinal = "T";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "U":
                            if (!a_matriz.matriz[v_vertActual][20].equals("0")){
                                v_vertActual = 20;
                                v_vertFinal = "U";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "V":
                            if (!a_matriz.matriz[v_vertActual][21].equals("0")){
                                v_vertActual = 21;
                                v_vertFinal = "V";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "W":
                            if (!a_matriz.matriz[v_vertActual][22].equals("0")){
                                v_vertActual = 22;
                                v_vertFinal = "2";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "X":
                            if (!a_matriz.matriz[v_vertActual][23].equals("0")){
                                v_vertActual = 23;
                                v_vertFinal = "X";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "Y":
                            if (!a_matriz.matriz[v_vertActual][24].equals("0")){
                                v_vertActual = 24;
                                v_vertFinal = "Y";
                            }
                            else
                                v_bandera = false;
                            break;
                        case "Z":
                            if (!a_matriz.matriz[v_vertActual][25].equals("0")){
                                v_vertActual = 25;
                                v_vertFinal = "Z";
                            }
                            else
                                v_bandera = false;
                            break;
                        default:
                            v_bandera = false;
                    }
                
            } catch (Exception e) {
                v_bandera = false;
            }
        }
        /*System.out.println("Vertice Inicial: " + v_vertInicial);
        System.out.println("Vertice final: " + v_vertFinal);
        System.out.println("");*/
        v_bandera = m_veriVertDiferentes(arreCamino, v_vertInicial, v_vertFinal, v_bandera);
        if (v_bandera)
            if (v_vertInicial.equals(v_vertFinal))
                System.out.println("CIRCUITO");
            else
                System.out.println("CAMINO");
        else
            System.out.println("NO SUBGRAFO");
    }
    boolean m_veriVertDiferentes(String[] p_arreCamino, String p_vertInicial, String p_vertFinal, boolean p_bandera){
        int v_cont, v_cont2;
        for (v_cont = 1; v_cont < p_arreCamino.length; v_cont++)
            for (v_cont2 = 0; v_cont2 < p_arreCamino.length; v_cont2++)
                if  (v_cont != v_cont2){
                    //System.out.println(p_arreCamino[v_cont] + "Comparando con" + p_arreCamino[v_cont2]);
                    if (p_arreCamino[v_cont].equals(p_arreCamino[v_cont2]))
                        if (p_arreCamino[v_cont].equals(p_vertInicial) && p_arreCamino[v_cont2].equals(p_vertFinal))
                            return p_bandera = true;
                        else
                            return p_bandera = false;
                }
        return p_bandera;
    }
}