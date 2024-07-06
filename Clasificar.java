//La clase para poder clasificar los 18 EQUIPOS
public class Clasificar {
    public int A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P;         //contar los 18 equipos
    public int ld1,ld2,ld3,ld4,ld5,ld6;                 //Contar los lider diviciones
    String[] Equipo = new String[26];                   //nombrar los 26 equipos
    String[] Division = new String[6];                  //nombrar los 6 equipos
    public String div1, div2, div3, div4, div5, div6;       //ordenar las diviciones
    public String cla1, cla2, cla3, cla4, cla5, cla6, cla7, cla8, cla9, cla10;          //ordenar los clasificados

    //ordenar las diviciones y los clasificados
    public void Ordenar(){
        A = (int)(Math.random() * 4) + 1;  
        B = (int)(Math.random() * 4) + 1;  B = B + 4;
        C = (int)(Math.random() * 4) + 1;  C = C + 8;
        D = (int)(Math.random() * 5) + 1;  D = D + 12;
        E = (int)(Math.random() * 5) + 1;  E = E + 17;
        F = (int)(Math.random() * 4) + 1;  F = F + 22;
        do{            G = (int)(Math.random() * 26) + 1;         }while (G==A || G==B || G==C || G==D || G==E || G==F);
        do{            H = (int)(Math.random() * 26) + 1;         }while (H==A || H==B || H==C || H==D || H==E || H==F || H==G);
        do{            I = (int)(Math.random() * 26) + 1;         }while (I==A || I==B || I==C || I==D || I==E || I==F || I==G || I==H);
        do{            J = (int)(Math.random() * 26) + 1;         }while (J==A || J==B || J==C || J==D || J==E || J==F || J==G || J==H || J==I);
        do{            K = (int)(Math.random() * 26) + 1;         }while (K==A || K==B || K==C || K==D || K==E || K==F || K==G || K==H || K==I || K==J);
        do{            L = (int)(Math.random() * 26) + 1;         }while (L==A || L==B || L==C || L==D || L==E || L==F || L==G || L==H || L==I || L==J || L==K);
        do{            M = (int)(Math.random() * 26) + 1;         }while (M==A || M==B || M==C || M==D || M==E || M==F || M==G || M==H || M==I || M==J || M==K || M==L);
        do{            N = (int)(Math.random() * 26) + 1;         }while (N==A || N==B || N==C || N==D || N==E || N==F || N==G || N==H || N==I || N==J || N==K || N==L || N==M);
        do{            O = (int)(Math.random() * 26) + 1;         }while (O==A || O==B || O==C || O==D || O==E || O==F || O==G || O==H || O==I || O==J || O==K || O==L || O==M || O==N);
        do{            P = (int)(Math.random() * 26) + 1;         }while (P==A || P==B || P==C || P==D || P==E || P==F || P==G || P==H || P==I || P==J || P==K || P==L || P==M || P==N || P==O);
     }


    //Nombrar los equipos
    public void Equipos(){
        Equipo[0] = "Anahen";            Equipo[1] = "Baltimore";           Equipo[2] = "Colorado";            Equipo[3] = "Dallas";        
        Equipo[4] = "Eugene";            Equipo[5] = "Georgia";             Equipo[6] = "Florida";             Equipo[7] = "Houston";        
        Equipo[8] = "Iguana";            Equipo[9] = "Jefferson";           Equipo[10] = "Kansas";             Equipo[11] = "Los Angeles";
        Equipo[12] = "Miami";            Equipo[13] = "New Orleand";        Equipo[14] = "Oaklan";             Equipo[15] = "Pistbull";        Equipo[16] = "Queen";
        Equipo[17] = "Richmond";         Equipo[18] = "Sacramento";         Equipo[19] = "Toronto";            Equipo[20] = "Utah";            Equipo[21] = "Vancouver";
        Equipo[22] = "Washinton";        Equipo[23] = "Xian";               Equipo[24] = "Yankee";             Equipo[25] = "Zap canon";
    }

    //ordenar y clasificar los equipos
    public void Clasificando(){
        A = A - 1;          Division[0] = Equipo[A];     B = B - 1;          Division[1] = Equipo[B];       C = C - 1;          Division[2] = Equipo[C];      
        D = D - 1;          Division[3] = Equipo[D];     E = E - 1;          Division[4] = Equipo[E];       F = F - 1;          Division[5] = Equipo[F];     
        
        G = G - 1;          cla1 = Equipo[G];       H = H - 1;          cla2 = Equipo[H]; 
        I = I - 1;          cla3 = Equipo[I];       J = J - 1;          cla4 = Equipo[J];       K = K - 1;          cla5 = Equipo[K];    
        L = L - 1;          cla6 = Equipo[L];       M = M - 1;          cla7 = Equipo[M];       N = N - 1;          cla8 = Equipo[N];   
        O = O - 1;          cla9 = Equipo[O];       P = P - 1;          cla10 = Equipo[P];
    }

    public void Divicion(){
        ld1 = (int)(Math.random() * 6) + 1;  ld1 = ld1 - 1;
        do{            ld2 = (int)(Math.random() * 6) + 1;     ld2 = ld2 - 1;          }while (ld2==ld1);       
        do{            ld3 = (int)(Math.random() * 6) + 1;     ld3 = ld3 - 1;    }while (ld3==ld1 || ld3==ld2);
        do{            ld4 = (int)(Math.random() * 6) + 1;     ld4 = ld4 - 1;    }while (ld4==ld1 || ld4==ld2 || ld4==ld3);
        do{            ld5 = (int)(Math.random() * 6) + 1;     ld5 = ld5 - 1;    }while (ld5==ld1 || ld5==ld2 || ld5==ld3 || ld5==ld4);
        do{            ld6 = (int)(Math.random() * 6) + 1;     ld6 = ld6 - 1;    }while (ld6==ld1 || ld6==ld2 || ld6==ld3 || ld6==ld4 || ld6==ld5);

        for (int i=0; i<6; i++){      if (ld1 == i){   div1 = Division[i];            }        }
        for (int i=0; i<6; i++){       if (ld2 == i){   div2 = Division[i];            }        }
        for (int i=0; i<6; i++){       if (ld3 == i){   div3 = Division[i];            }        }
        for (int i=0; i<6; i++){       if (ld4 == i){   div4 = Division[i];            }        }
        for (int i=0; i<6; i++){       if (ld5 == i){   div5 = Division[i];            }        }
        for (int i=0; i<6; i++){       if (ld6 == i){   div6 = Division[i];            }        }
    }

    //Mostrar los Resultados
    public void MostarClasificados(){
        Ordenar();            Equipos();            Clasificando();         Divicion();

        System.out.print("Lider divicion: " + div1);
        System.out.println("\t\t2 Lider divicion: " + div2);
        System.out.print("3 divicion: " + div3);
        System.out.println("\t\t4 divicion: " + div4);    
        System.out.print("5 divicion: " + div5);
        System.out.println("\t\t6 divicion: " + div6);    
        System.out.println("");
        System.out.println("\tBest Clasif 1: " + cla1);
        System.out.println("\tBest Clasif 2: " + cla2);
        System.out.print("3 Clasificado:" + cla3);
        System.out.println("\t\t\t7 Clasificado: " + cla7);
        System.out.print("4 Clasificado:"+ cla4);
        System.out.println("\t\t\t8 Clasificado: " + cla8);
        System.out.print("5 Clasificado:" + cla5);
        System.out.println("\t\t\t9 Clasificado: " + cla9);
        System.out.print("6 Clasificado:" + cla6);
        System.out.println("\t\t\t10 Clasificado:" + cla10);

}


public static void main(String args[]){
            Clasificar vamosClasificar = new Clasificar();
            vamosClasificar.MostarClasificados();
    
    }
    
}