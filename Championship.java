
//exportar LIBRERIAS
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Championship extends JFrame implements ActionListener, ChangeListener {

    // private JLabel Titulo;

    // agregar textos
    private JLabel A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, WIL1, WIL2, Fin1, Fin2;

    // AGREGAR area de Textos
    private JTextField WillC1, WillC2;
    private JTextField VERSUSA, VERSUSB, VERSUSC, VERSUSD, VERSUSE, VERSUSF;
    private JTextField ROUND2A, ROUND2B, ROUND2C, ROUND2D;
    private JTextField SEMIA, SEMIB, FINALS;

    // Los Elementos del Textos
    public String LiderDiv1 = "A", LiderDiv2 = "B", Divicion3 = "C", Divicion4 = "D", Divicion5 = "E", Divicion6 = "F";
    public String BestCla1 = "G", BestCla2 = "H", Clasificacion3 = "I", Clasificacion4 = "J", Clasificacion5 = "K",
            Clasificacion6 = "L", Clasificacion7 = "M", Clasificacion8 = "N", Clasificacion9 = "O",
            Clasificacion10 = "P";
    public String WillCard1 = "WILLCARD", WillCard2 = "WILLCARD";
    public String Final1 = "1 FINALS", Final2 = "2 FINALS";

    private JTextField[] Casillas = new JTextField[15];
    private JLabel[] Letras = new JLabel[20];

    private JRadioButton Oscuro, Claro, Figura, Windows; // agregar el radio para cambiar fondo de la ventanas
    private ButtonGroup bg;

    // Fondo de las pantallas
    public int fondoclaR = 218, fondoclaG = 238, fondoclaB = 243;
    public int fondoscR = 15, fondoscG = 36, fondoscB = 62;
    public int fondofiR = 184, fondofiG = 204, fondofiB = 228;
    public int fondoWinR = 0, fondoWinG = 0, fondoWinB = 255;

    public Championship() {
        setLayout(null);
        setTitle("THE CHAMPIONSHIP");
        getContentPane().setBackground(new Color(fondoclaR, fondoclaG, fondoclaG));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /*********************
         * Agrega radio button
         ***************************************/
        bg = new ButtonGroup();
        Oscuro = new JRadioButton("Oscuro");
        Oscuro.setBounds(600, 18, 100, 30);
        Oscuro.setBackground(new Color(fondoclaR, fondoclaG, fondoclaG));
        Oscuro.setForeground(new Color(fondoscR, fondoscG, fondoscB));
        Oscuro.addChangeListener(this);
        add(Oscuro);
        bg.add(Oscuro);

        Claro = new JRadioButton("Claro");
        Claro.setBounds(600, 40, 100, 30);
        Claro.setBackground(new Color(fondoclaR, fondoclaG, fondoclaG));
        Claro.setForeground(new Color(fondoscR, fondoscG, fondoscB));
        Claro.addChangeListener(this);
        add(Claro);
        bg.add(Claro);

        Figura = new JRadioButton("Figura");
        Figura.setBounds(600, 62, 100, 30);
        Figura.setBackground(new Color(fondoclaR, fondoclaG, fondoclaG));
        Figura.setForeground(new Color(fondoscR, fondoscG, fondoscB));
        Figura.addChangeListener(this);
        add(Figura);
        bg.add(Figura);

        Windows = new JRadioButton("Windows");
        Windows.setBounds(600, 84, 100, 30);
        Windows.setBackground(new Color(fondoclaR, fondoclaG, fondoclaG));
        Windows.setForeground(new Color(fondoscR, fondoscG, fondoscB));
        Windows.addChangeListener(this);
        add(Windows);
        bg.add(Windows);

        // LOS TExtos
        // agragar las variables hereradas
        Clasificados myclasificar = new Clasificados();
        LiderDiv1 = myclasificar.Equipos[0];
        LiderDiv2 = myclasificar.Equipos[1];
        Divicion3 = myclasificar.Equipos[2];
        Divicion4 = myclasificar.Equipos[3];
        Divicion5 = myclasificar.Equipos[4];
        Divicion6 = myclasificar.Equipos[5];

        BestCla1 = myclasificar.Equipos[6];
        BestCla2 = myclasificar.Equipos[7];
        Clasificacion3 = myclasificar.Equipos[8];
        Clasificacion4 = myclasificar.Equipos[9];
        Clasificacion5 = myclasificar.Equipos[10];
        Clasificacion6 = myclasificar.Equipos[11];
        Clasificacion7 = myclasificar.Equipos[12];
        Clasificacion8 = myclasificar.Equipos[13];
        Clasificacion9 = myclasificar.Equipos[14];
        Clasificacion10 = myclasificar.Equipos[15];

        Letras[0] = new JLabel(Clasificacion10);
        Letras[0].setFont(new Font("Calibri mono", 4, 14));
        Letras[0].setBounds(87, -107, 200, 300);
        Letras[0].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[0]);

        Letras[1] = new JLabel(Clasificacion7);
        Letras[1].setFont(new Font("Calibri mono", 4, 14));
        Letras[1].setBounds(87, -85, 200, 300);
        Letras[1].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[1]);

        Letras[2] = new JLabel(Clasificacion8);
        Letras[2].setFont(new Font("Calibri mono", 4, 14));
        Letras[2].setBounds(87, -37, 200, 300);
        Letras[2].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[2]);

        Letras[3] = new JLabel(Clasificacion9);
        Letras[3].setFont(new Font("Calibri mono", 4, 14));
        Letras[3].setBounds(87, -15, 200, 300);
        Letras[3].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[3]);

        Letras[4] = new JLabel(BestCla1);
        Letras[4].setFont(new Font("Calibri mono", 4, 14));
        Letras[4].setBounds(187, -107, 200, 300);
        Letras[4].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[4]);

        Letras[5] = new JLabel(WillCard1);
        Letras[5].setFont(new Font("Calibri mono", 4, 14));
        Letras[5].setBounds(187, -85, 200, 300);
        Letras[5].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[5]);

        Letras[6] = new JLabel(BestCla2);
        Letras[6].setFont(new Font("Calibri mono", 4, 14));
        Letras[6].setBounds(187, -37, 200, 300);
        Letras[6].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[6]);

        Letras[7] = new JLabel(WillCard2);
        Letras[7].setFont(new Font("Calibri mono", 4, 14));
        Letras[7].setBounds(187, -15, 200, 300);
        Letras[7].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[7]);

        Letras[8] = new JLabel(Divicion3);
        Letras[8].setFont(new Font("Calibri mono", 4, 14));
        Letras[8].setBounds(187, 33, 200, 300);
        Letras[8].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[8]);

        Letras[9] = new JLabel(Clasificacion3);
        Letras[9].setFont(new Font("Calibri mono", 4, 14));
        Letras[9].setBounds(187, 55, 200, 300);
        Letras[9].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[9]);

        Letras[10] = new JLabel(Divicion4);
        Letras[10].setFont(new Font("Calibri mono", 4, 14));
        Letras[10].setBounds(187, 82, 200, 300);
        Letras[10].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[10]);

        Letras[11] = new JLabel(Clasificacion4);
        Letras[11].setFont(new Font("Calibri mono", 4, 14));
        Letras[11].setBounds(187, 104, 200, 300);
        Letras[11].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[11]);

        Letras[12] = new JLabel(Divicion5);
        Letras[12].setFont(new Font("Calibri mono", 4, 14));
        Letras[12].setBounds(187, 152, 200, 300);
        Letras[12].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[12]);

        Letras[13] = new JLabel(Clasificacion5);
        Letras[13].setFont(new Font("Calibri mono", 4, 14));
        Letras[13].setBounds(187, 174, 200, 300);
        Letras[13].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[13]);

        Letras[14] = new JLabel(Divicion6);
        Letras[14].setFont(new Font("Calibri mono", 4, 14));
        Letras[14].setBounds(187, 202, 200, 300);
        Letras[14].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[14]);

        Letras[15] = new JLabel(Clasificacion6);
        Letras[15].setFont(new Font("Calibri mono", 4, 14));
        Letras[15].setBounds(187, 224, 200, 300);
        Letras[15].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[15]);

        Letras[16] = new JLabel(LiderDiv1);
        Letras[16].setFont(new Font("Calibri mono", 4, 14));
        Letras[16].setBounds(287, -81, 200, 300);
        Letras[16].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[16]);

        Letras[17] = new JLabel(LiderDiv2);
        Letras[17].setFont(new Font("Calibri mono", 4, 14));
        Letras[17].setBounds(287, -11, 200, 300);
        Letras[17].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[17]);

        Letras[18] = new JLabel(Final1);
        Letras[18].setFont(new Font("Calibri mono", 4, 14));
        Letras[18].setBounds(487, 19, 200, 300);
        Letras[18].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[18]);

        Letras[19] = new JLabel(Final2);
        Letras[19].setFont(new Font("Calibri mono", 4, 14));
        Letras[19].setBounds(487, 41, 200, 300);
        Letras[19].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
        add(Letras[19]);

        // area textos
        Casillas[0] = new JTextField();
        Casillas[0].setBounds(80, 30, 100, 50);
        Casillas[0].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[0]);

        Casillas[1] = new JTextField();
        Casillas[1].setBounds(80, 100, 100, 50);
        Casillas[1].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[1]);

        Casillas[2] = new JTextField();
        Casillas[2].setBounds(180, 30, 100, 50);
        Casillas[2].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[2]);

        Casillas[3] = new JTextField();
        Casillas[3].setBounds(180, 100, 100, 50);
        Casillas[3].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[3]);

        Casillas[4] = new JTextField();
        Casillas[4].setBounds(180, 170, 100, 50);
        Casillas[4].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[4]);

        Casillas[5] = new JTextField();
        Casillas[5].setBounds(180, 220, 100, 50);
        Casillas[5].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[5]);

        Casillas[6] = new JTextField();
        Casillas[6].setBounds(180, 290, 100, 50);
        Casillas[6].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[6]);

        Casillas[7] = new JTextField();
        Casillas[7].setBounds(180, 340, 100, 50);
        Casillas[7].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[7]);

        Casillas[8] = new JTextField();
        Casillas[8].setBounds(280, 55, 100, 50);
        Casillas[8].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[8]);

        Casillas[9] = new JTextField();
        Casillas[9].setBounds(280, 125, 100, 50);
        Casillas[9].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[9]);

        Casillas[10] = new JTextField();
        Casillas[10].setBounds(280, 220, 100, 50);
        Casillas[10].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[10]);

        Casillas[11] = new JTextField();
        Casillas[11].setBounds(280, 290, 100, 50);
        Casillas[11].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[11]);

        Casillas[12] = new JTextField();
        Casillas[12].setBounds(380, 125, 100, 50);
        Casillas[12].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[12]);

        Casillas[13] = new JTextField();
        Casillas[13].setBounds(380, 195, 100, 50);
        Casillas[13].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[13]);

        Casillas[14] = new JTextField();
        Casillas[14].setBounds(480, 155, 100, 50);
        Casillas[14].setBackground(new Color(fondoscR, fondoscG, fondoscB));
        add(Casillas[14]);

    }

    public void actionPerformed(ActionEvent e) {
        /*
         * if(e.getSource() == btncerrar){ //AGREGAR EL EVENTO al cerrar la ventana
         * System.exit(0);
         * }
         */
    }

    public void stateChanged(ChangeEvent e) {
        if (Oscuro.isSelected()) {
            getContentPane().setBackground(new Color(fondoscR, fondoscG, fondoscB));
            Oscuro.setBackground(new Color(fondoscR, fondoscG, fondoscB));
            Claro.setBackground(new Color(fondoscR, fondoscG, fondoscB));
            Figura.setBackground(new Color(fondoscR, fondoscG, fondoscB));
            Windows.setBackground(new Color(fondoscR, fondoscG, fondoscB));

            for (int i = 0; i < 15; i++) {
                Casillas[i].setBackground(new Color(fondoclaR, fondoclaG, fondoclaB));
            }

            Oscuro.setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
            Claro.setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
            Figura.setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
            Windows.setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));

            for (int i = 0; i < 20; i++) {
                Letras[i].setForeground(new Color(fondoscR, fondoscG, fondoscB));
            }
        }

        if (Claro.isSelected()) {
            getContentPane().setBackground(new Color(fondoclaR, fondoclaG, fondoclaB));
            Oscuro.setBackground(new Color(fondoclaR, fondoclaG, fondoclaB));
            Claro.setBackground(new Color(fondoclaR, fondoclaG, fondoclaB));
            Figura.setBackground(new Color(fondoclaR, fondoclaG, fondoclaB));
            Windows.setBackground(new Color(fondoclaR, fondoclaG, fondoclaB));

            for (int i = 0; i < 15; i++) {
                Casillas[i].setBackground(new Color(fondoscR, fondoscG, fondoscB));
            }

            Oscuro.setForeground(new Color(fondoscR, fondoscG, fondoscB));
            Claro.setForeground(new Color(fondoscR, fondoscG, fondoscB));
            Figura.setForeground(new Color(fondoscR, fondoscG, fondoscB));
            Windows.setForeground(new Color(fondoscR, fondoscG, fondoscB));

            for (int i = 0; i < 20; i++) {
                Letras[i].setForeground(new Color(fondoclaR, fondoclaG, fondoclaB));
            }

        }

        if (Figura.isSelected()) {
            getContentPane().setBackground(new Color(fondofiR, fondofiG, fondofiB));
            Oscuro.setBackground(new Color(fondofiR, fondofiG, fondofiB));
            Claro.setBackground(new Color(fondofiR, fondofiG, fondofiB));
            Figura.setBackground(new Color(fondofiR, fondofiG, fondofiB));
            Windows.setBackground(new Color(fondofiR, fondofiG, fondofiB));

            for (int i = 0; i < 15; i++) {
                if (i == 0 || i == 1) {
                    Casillas[i].setBackground(new Color(15, 36, 62));
                }
                if (i == 2 || i == 3) {
                    Casillas[i].setBackground(new Color(64, 49, 81));
                }
                if (i >= 4 && i <= 7) {
                    Casillas[i].setBackground(new Color(33, 89, 103));
                }
                if (i >= 8 && i <= 11) {
                    Casillas[i].setBackground(new Color(36, 64, 98));
                }
                if (i == 12 || i == 13) {
                    Casillas[i].setBackground(new Color(0, 32, 96));
                }
                if (i == 14) {
                    Casillas[i].setBackground(new Color(99, 37, 35));
                }
            }

            for (int a = 0; a < 20; a++) {
                if (a >= 0 && a <= 3) {
                    Letras[a].setForeground(new Color(204, 255, 255));
                }
                if (a >= 4 && a <= 7) {
                    Letras[a].setForeground(new Color(255, 255, 0));
                }
                if (a >= 8 && a <= 15) {
                    Letras[a].setForeground(new Color(255, 255, 204));
                }
                if (a == 16 || a == 17) {
                    Letras[a].setForeground(new Color(0, 255, 255));
                }
                if (a == 18 || a == 19) {
                    Letras[a].setForeground(new Color(253, 253, 217));
                }
            }

            Oscuro.setForeground(new Color(36, 64, 98));
            Claro.setForeground(new Color(36, 64, 98));
            Figura.setForeground(new Color(36, 64, 98));
            Windows.setForeground(new Color(36, 64, 98));

        }

        if (Windows.isSelected()) {
            getContentPane().setBackground(new Color(fondoWinR, fondoWinG, fondoWinB));
            Oscuro.setBackground(new Color(fondoWinR, fondoWinG, fondoWinB));
            Claro.setBackground(new Color(fondoWinR, fondoWinG, fondoWinB));
            Figura.setBackground(new Color(fondoWinR, fondoWinG, fondoWinB));
            Windows.setBackground(new Color(fondoWinR, fondoWinG, fondoWinB));

            for (int i = 0; i < 15; i++) {
                Casillas[i].setBackground(new Color(255, 255, 204));
            }

            Oscuro.setForeground(new Color(255, 255, 0));
            Claro.setForeground(new Color(255, 255, 0));
            Figura.setForeground(new Color(255, 255, 0));
            Windows.setForeground(new Color(255, 255, 0));

            for (int i = 0; i < 20; i++) {
                Letras[i].setForeground(new Color(255, 0, 102));
            }
        }

    }

    public static void main(String args[]) {

        Championship myChampionship = new Championship();
        myChampionship.setBounds(0, 0, 700, 450);
        myChampionship.setVisible(true);
        myChampionship.setResizable(false);
        myChampionship.setLocationRelativeTo(null);

        // ajustar para enlazar a la otra ventana

    }

}
