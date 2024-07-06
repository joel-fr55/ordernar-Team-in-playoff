
//importar las librerias
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Clasificados extends JFrame implements ActionListener, ChangeListener {

    private JLabel Titulo, subTitulo1, subTitulo2, subTitulo3, subTitulo4, subTitulo5;
    private JTextField AreaTitulo; // agregar area de textos

    private JLabel Division1, Division2, Division3, Division4, Division5, Division6;
    private JLabel Clasificacion1, Clasificacion2, Clasificacion3, Clasificacion4, Clasificacion5, Clasificacion6,
            Clasificacion7, Clasificacion8, Clasificacion9, Clasificacion10;
    private JLabel[] Division = new JLabel[6];
    private JLabel[] Clasificacion = new JLabel[10];
    private JLabel[] Subtitulo = new JLabel[5];
    private JLabel[] Variables = new JLabel[18];
    private JLabel[] Elementos = new JLabel[18];

    private JLabel LiderD1, LiderD2;
    private JLabel BestClas1, BestClas2;

    // AQUI ABAJO AGREGAR OTRAS COSAS
    private JLabel Elemento1, Elemento2, Elemento3, Elemento4, Elemento5, Elemento6, Elemento7, Elemento8, Elemento9,
            Elemento10, Elemento11, Elemento12;
    private JLabel Variablea, Variableb, Variablec, Variabled, Variablee, Variablef, Variableg, Variableh, Variablei,
            Variablej, Variablek, Variablel, Variablem, Variablen, Variableo, Variablep;

    // Agregar el boton
    JButton Boton, Champion;

    private JRadioButton Oscuro, Claro, Windows; // agregar el radio para cambiar fondo de la ventanas
    private ButtonGroup bg;

    // agregar la variable estatica para hererar la otra clase
    static String[] Equipos = new String[16];

    // ************agregar las variables de los colores
    // *****************************************
    private int LAmarilloR = 255, LAmarilloG = 255, LAmarilloB = 0;
    private int LNaranjaR = 255, LNaranjaG = 192, LNaranjaB = 0;
    private int LBlancoR = 255, LBlancoG = 255, LBlancoB = 255;
    private int Areatexto = 242;
    private int LTituloR = 192, LTituloG = 0, LTituloB = 0;

    private int LRojoR = 192, LRojoG = 0, LRojoB = 0;
    private int LAzulOR = 0, LAzulOG = 32, LAzulOB = 96;
    private int LAzulR = 0, LAzulG = 0, LAzulB = 255;

    private int LVerdeOR = 0, LVerdeOG = 51, LVerdeOB = 0;
    private int LMoradoR = 112, LMoradoG = 48, LMoradoB = 160;

    private int FonOscR = 15, FonOscG = 36, FonOscB = 62;
    private int FonClaR = 255, FonClaG = 255, FonClaB = 255;
    private int FonWinR = 146, FonWinG = 208, FonWinB = 80;
    // ********************************************************************************************
    // */

    public Clasificados() {
        setLayout(null);
        setTitle("The Classifieds");
        getContentPane().setBackground(new Color(FonOscR, FonOscG, FonOscB));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /// AGREGAR LOS RADIOS BOTTON
        bg = new ButtonGroup();
        Oscuro = new JRadioButton("Oscuro");
        Oscuro.setBounds(18, 300, 70, 30);
        Oscuro.setBackground(new Color(FonOscR, FonOscG, FonOscB));
        Oscuro.setForeground(new Color(Areatexto, Areatexto, Areatexto));
        Oscuro.addChangeListener(this);
        add(Oscuro);
        bg.add(Oscuro);

        Claro = new JRadioButton("Claro");
        Claro.setBounds(85, 300, 60, 30);
        Claro.setBackground(new Color(FonOscR, FonOscG, FonOscB));
        Claro.setForeground(new Color(Areatexto, Areatexto, Areatexto));
        Claro.addChangeListener(this);
        add(Claro);
        bg.add(Claro);

        Windows = new JRadioButton("Windows");
        Windows.setBounds(140, 300, 80, 30);
        Windows.setBackground(new Color(FonOscR, FonOscG, FonOscB));
        Windows.setForeground(new Color(Areatexto, Areatexto, Areatexto));
        Windows.addChangeListener(this);
        add(Windows);
        bg.add(Windows);

        // **********************************************TITULO
        // *******************************
        Titulo = new JLabel("Posiciones");
        Titulo.setFont(new Font("Calibri", 1, 20));
        Titulo.setForeground(new Color(LTituloR, LTituloG, LTituloB));
        Titulo.setBounds(500, -90, 200, 300);
        add(Titulo);
        // agregar el area de textos
        AreaTitulo = new JTextField();
        AreaTitulo.setBounds(430, 45, 230, 25);
        AreaTitulo.setBackground(new Color(Areatexto, Areatexto, Areatexto));
        AreaTitulo.setEditable(false);// gracias bloquear la excritura del area de textos
        add(AreaTitulo);

        // ****************************** Agregar las otras
        // etiquertas*************************************************************
        // ********las etiquetas las diviciones
        Division[0] = new JLabel("Division 1");
        Division[0].setFont(new Font("Calibri", 4, 16));
        Division[0].setForeground(new Color(LAmarilloR, LAmarilloG, LAmarilloB));
        Division[0].setBounds(75, -70, 200, 300);
        add(Division[0]);

        Division[1] = new JLabel("Division 2");
        Division[1].setFont(new Font("Calibri", 4, 16));
        Division[1].setForeground(new Color(LAmarilloR, LAmarilloG, LAmarilloB));
        Division[1].setBounds(75, -30, 200, 300);
        add(Division[1]);

        Division[2] = new JLabel("Division 3");
        Division[2].setFont(new Font("Calibri", 4, 16));
        Division[2].setForeground(new Color(LAmarilloR, LAmarilloG, LAmarilloB));
        Division[2].setBounds(75, 10, 200, 300);
        add(Division[2]);

        Division[3] = new JLabel("Division 4");
        Division[3].setFont(new Font("Calibri", 4, 16));
        Division[3].setForeground(new Color(LAmarilloR, LAmarilloG, LAmarilloB));
        Division[3].setBounds(75, 50, 200, 300);
        add(Division[3]);

        Division[4] = new JLabel("Division 5");
        Division[4].setFont(new Font("Calibri", 4, 16));
        Division[4].setForeground(new Color(LAmarilloR, LAmarilloG, LAmarilloB));
        Division[4].setBounds(75, 90, 200, 300);
        add(Division[4]);

        Division[5] = new JLabel("Division 6");
        Division[5].setFont(new Font("Calibri", 4, 16));
        Division[5].setForeground(new Color(LAmarilloR, LAmarilloG, LAmarilloB));
        Division[5].setBounds(75, 130, 200, 300);
        add(Division[5]);

        // ********las etiquetas las clasificaiones
        Clasificacion[0] = new JLabel("Clasificacion 1");
        Clasificacion[0].setFont(new Font("Calibri", 4, 16));
        Clasificacion[0].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Clasificacion[0].setBounds(170, -70, 200, 300);
        add(Clasificacion[0]);

        Clasificacion[1] = new JLabel("Clasificacion 2");
        Clasificacion[1].setFont(new Font("Calibri", 4, 16));
        Clasificacion[1].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Clasificacion[1].setBounds(170, -50, 200, 300);
        add(Clasificacion[1]);

        Clasificacion[2] = new JLabel("Clasificacion 3");
        Clasificacion[2].setFont(new Font("Calibri", 4, 16));
        Clasificacion[2].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Clasificacion[2].setBounds(170, -30, 200, 300);
        add(Clasificacion[2]);

        Clasificacion[3] = new JLabel("Clasificacion 4");
        Clasificacion[3].setFont(new Font("Calibri", 4, 16));
        Clasificacion[3].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Clasificacion[3].setBounds(170, -10, 200, 300);
        add(Clasificacion[3]);

        Clasificacion[4] = new JLabel("Clasificacion 5");
        Clasificacion[4].setFont(new Font("Calibri", 4, 16));
        Clasificacion[4].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Clasificacion[4].setBounds(170, 10, 200, 300);
        add(Clasificacion[4]);

        Clasificacion[5] = new JLabel("Clasificacion 6");
        Clasificacion[5].setFont(new Font("Calibri", 4, 16));
        Clasificacion[5].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Clasificacion[5].setBounds(170, 30, 200, 300);
        add(Clasificacion[5]);

        Clasificacion[6] = new JLabel("Clasificacion 7");
        Clasificacion[6].setFont(new Font("Calibri", 4, 16));
        Clasificacion[6].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Clasificacion[6].setBounds(170, 50, 200, 300);
        add(Clasificacion[6]);

        Clasificacion[7] = new JLabel("Clasificacion 8");
        Clasificacion[7].setFont(new Font("Calibri", 4, 16));
        Clasificacion[7].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Clasificacion[7].setBounds(170, 70, 200, 300);
        add(Clasificacion[7]);

        Clasificacion[8] = new JLabel("Clasificacion 9");
        Clasificacion[8].setFont(new Font("Calibri", 4, 16));
        Clasificacion[8].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Clasificacion[8].setBounds(170, 90, 200, 300);
        add(Clasificacion[8]);

        Clasificacion[9] = new JLabel("Clasificacion 10");
        Clasificacion[9].setFont(new Font("Calibri", 4, 16));
        Clasificacion[9].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Clasificacion[9].setBounds(170, 110, 200, 300);
        add(Clasificacion[9]);

        // ********************las etiquetas PARA dividir los clasificados/BEST
        Subtitulo[0] = new JLabel("Best Division");
        Subtitulo[0].setFont(new Font("Calibri", 1, 16));
        Subtitulo[0].setForeground(new Color(LAmarilloR, LAmarilloG, LAmarilloB));
        Subtitulo[0].setBounds(340, -30, 200, 300);
        add(Subtitulo[0]);

        Elementos[0] = new JLabel("Lider Divis ");
        Elementos[0].setFont(new Font("Calibri", 4, 16));
        Elementos[0].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[0].setBounds(340, -10, 200, 300);
        add(Elementos[0]);

        Variables[0] = new JLabel(".A");
        Variables[0].setFont(new Font("Calibri", 4, 16));
        Variables[0].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[0].setBounds(410, -10, 200, 300);
        add(Variables[0]);

        Elementos[1] = new JLabel("Lider Divis ");
        Elementos[1].setFont(new Font("Calibri", 4, 16));
        Elementos[1].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[1].setBounds(340, 10, 200, 300);
        add(Elementos[1]);

        Variables[1] = new JLabel(".B");
        Variables[1].setFont(new Font("Calibri", 4, 16));
        Variables[1].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[1].setBounds(410, 10, 200, 300);
        add(Variables[1]);

        Subtitulo[2] = new JLabel("Best 2 Position");
        Subtitulo[2].setFont(new Font("Calibri", 1, 16));
        Subtitulo[2].setForeground(new Color(LAmarilloR, LAmarilloG, LAmarilloB));
        Subtitulo[2].setBounds(500, -30, 200, 300);
        add(Subtitulo[2]);

        Elementos[2] = new JLabel("Best Clasif");
        Elementos[2].setFont(new Font("Calibri", 4, 16));
        Elementos[2].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[2].setBounds(500, -10, 200, 300);
        add(Elementos[2]);

        Variables[2] = new JLabel(".G");
        Variables[2].setFont(new Font("Calibri", 4, 16));
        Variables[2].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[2].setBounds(573, -10, 200, 300);
        add(Variables[2]);

        Elementos[3] = new JLabel("Best Clasif");
        Elementos[3].setFont(new Font("Calibri", 4, 16));
        Elementos[3].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[3].setBounds(500, 10, 200, 300);
        add(Elementos[3]);

        Variables[3] = new JLabel(".H");
        Variables[3].setFont(new Font("Calibri", 4, 16));
        Variables[3].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[3].setBounds(573, 10, 200, 300);
        add(Variables[3]);

        /************************************************************** */

        Subtitulo[1] = new JLabel("DIVISION");
        Subtitulo[1].setFont(new Font("Calibri", 1, 16));
        Subtitulo[1].setForeground(new Color(LAmarilloR, LAmarilloG, LAmarilloB));
        Subtitulo[1].setBounds(340, 50, 200, 300);
        add(Subtitulo[1]);

        Elementos[4] = new JLabel("Division");
        Elementos[4].setFont(new Font("Calibri", 4, 16));
        Elementos[4].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[4].setBounds(340, 70, 200, 300);
        add(Elementos[4]);

        Elementos[5] = new JLabel("Division");
        Elementos[5].setFont(new Font("Calibri", 4, 16));
        Elementos[5].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[5].setBounds(340, 90, 200, 300);
        add(Elementos[5]);

        Elementos[6] = new JLabel("Division");
        Elementos[6].setFont(new Font("Calibri", 4, 16));
        Elementos[6].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[6].setBounds(340, 110, 200, 300);
        add(Elementos[6]);

        Elementos[7] = new JLabel("Division");
        Elementos[7].setFont(new Font("Calibri", 4, 16));
        Elementos[7].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[7].setBounds(340, 130, 200, 300);
        add(Elementos[7]);

        Variables[4] = new JLabel(".C");
        Variables[4].setFont(new Font("Calibri", 4, 16));
        Variables[4].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[4].setBounds(395, 70, 200, 300);
        add(Variables[4]);

        Variables[5] = new JLabel(".D");
        Variables[5].setFont(new Font("Calibri", 4, 16));
        Variables[5].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[5].setBounds(395, 90, 200, 300);
        add(Variables[5]);

        Variables[6] = new JLabel(".E");
        Variables[6].setFont(new Font("Calibri", 4, 16));
        Variables[6].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[6].setBounds(395, 110, 200, 300);
        add(Variables[6]);

        Variables[7] = new JLabel(".F");
        Variables[7].setFont(new Font("Calibri", 4, 16));
        Variables[7].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[7].setBounds(395, 130, 200, 300);
        add(Variables[7]);

        /********************************************************************************************************** */
        Subtitulo[3] = new JLabel("CLASIFICADOS");
        Subtitulo[3].setFont(new Font("Calibri", 1, 16));
        Subtitulo[3].setForeground(new Color(LAmarilloR, LAmarilloG, LAmarilloB));
        Subtitulo[3].setBounds(500, 50, 200, 300);
        add(Subtitulo[3]);

        Elementos[8] = new JLabel("Clasification");
        Elementos[8].setFont(new Font("Calibri", 4, 16));
        Elementos[8].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[8].setBounds(500, 70, 200, 300);
        add(Elementos[8]);

        Elementos[9] = new JLabel("Clasification");
        Elementos[9].setFont(new Font("Calibri", 4, 16));
        Elementos[9].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[9].setBounds(500, 90, 200, 300);
        add(Elementos[9]);

        Elementos[10] = new JLabel("Clasification");
        Elementos[10].setFont(new Font("Calibri", 4, 16));
        Elementos[10].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[10].setBounds(500, 110, 200, 300);
        add(Elementos[10]);

        Elementos[11] = new JLabel("Clasification");
        Elementos[11].setFont(new Font("Calibri", 4, 16));
        Elementos[11].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[11].setBounds(500, 130, 200, 300);
        add(Elementos[11]);

        Variables[8] = new JLabel(".I");
        Variables[8].setFont(new Font("Calibri", 4, 16));
        Variables[8].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[8].setBounds(583, 70, 200, 300);
        add(Variables[8]);

        Variables[9] = new JLabel(".J");
        Variables[9].setFont(new Font("Calibri", 4, 16));
        Variables[9].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[9].setBounds(583, 90, 200, 300);
        add(Variables[9]);

        Variables[10] = new JLabel(".K");
        Variables[10].setFont(new Font("Calibri", 4, 16));
        Variables[10].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[10].setBounds(583, 110, 200, 300);
        add(Variables[10]);

        Variables[11] = new JLabel(".L");
        Variables[11].setFont(new Font("Calibri", 4, 16));
        Variables[11].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[11].setBounds(583, 130, 200, 300);
        add(Variables[11]);

        /******************************************************************************************////////////////////// */
        Subtitulo[4] = new JLabel("WILL CARD");
        Subtitulo[4].setFont(new Font("Calibri", 1, 16));
        Subtitulo[4].setForeground(new Color(LAmarilloR, LAmarilloG, LAmarilloB));
        Subtitulo[4].setBounds(680, 50, 200, 300);
        add(Subtitulo[4]);

        Elementos[12] = new JLabel("Clasification");
        Elementos[12].setFont(new Font("Calibri", 4, 16));
        Elementos[12].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[12].setBounds(680, 70, 200, 300);
        add(Elementos[12]);

        Elementos[13] = new JLabel("Clasification");
        Elementos[13].setFont(new Font("Calibri", 4, 16));
        Elementos[13].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[13].setBounds(680, 90, 200, 300);
        add(Elementos[13]);

        Elementos[14] = new JLabel("Clasification");
        Elementos[14].setFont(new Font("Calibri", 4, 16));
        Elementos[14].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[14].setBounds(680, 110, 200, 300);
        add(Elementos[14]);

        Elementos[15] = new JLabel("Clasification");
        Elementos[15].setFont(new Font("Calibri", 4, 16));
        Elementos[15].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
        Elementos[15].setBounds(680, 130, 200, 300);
        add(Elementos[15]);

        Variables[12] = new JLabel(".M");
        Variables[12].setFont(new Font("Calibri", 4, 16));
        Variables[12].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[12].setBounds(763, 70, 200, 300);
        add(Variables[12]);

        Variables[13] = new JLabel(".N");
        Variables[13].setFont(new Font("Calibri", 4, 16));
        Variables[13].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[13].setBounds(763, 90, 200, 300);
        add(Variables[13]);

        Variables[14] = new JLabel(".O");
        Variables[14].setFont(new Font("Calibri", 4, 16));
        Variables[14].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[14].setBounds(763, 110, 200, 300);
        add(Variables[14]);

        Variables[15] = new JLabel(".P");
        Variables[15].setFont(new Font("Calibri", 4, 16));
        Variables[15].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
        Variables[15].setBounds(763, 130, 200, 300);
        add(Variables[15]);

        /*******************************************
         * Agregar boton ************************************************************
         */
        Boton = new JButton("Next");
        Boton.setFont(new Font("Calibri", 1, 23));
        Boton.setBounds(680, 300, 188, 40);
        Boton.setForeground(new Color(255, 0, 255));
        Boton.setBackground(new Color(255, 255, 0));
        add(Boton);
        Boton.addActionListener(this);

        Champion = new JButton("The Clasifield");
        Champion.setFont(new Font("Calibri", 1, 15));
        Champion.setBounds(745, 30, 125, 40);
        Champion.setForeground(new Color(15, 36, 62));
        Champion.setBackground(new Color(235, 241, 222));
        add(Champion);
        Champion.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Boton) { // AGREGAR EL EVENTO al cerrar la ventana

            Clasificar vamosClasificar = new Clasificar();
            vamosClasificar.Ordenar();
            vamosClasificar.Equipos();
            vamosClasificar.Clasificando();
            vamosClasificar.Divicion();

            Division[0].setText(vamosClasificar.Division[0]);
            Division[1].setText(vamosClasificar.Division[1]);
            Division[2].setText(vamosClasificar.Division[2]);
            Division[3].setText(vamosClasificar.Division[3]);
            Division[4].setText(vamosClasificar.Division[4]);
            Division[5].setText(vamosClasificar.Division[5]);

            Clasificacion[0].setText(vamosClasificar.cla1);
            Clasificacion[1].setText(vamosClasificar.cla2);
            Clasificacion[2].setText(vamosClasificar.cla3);
            Clasificacion[3].setText(vamosClasificar.cla4);
            Clasificacion[4].setText(vamosClasificar.cla5);
            Clasificacion[5].setText(vamosClasificar.cla6);
            Clasificacion[6].setText(vamosClasificar.cla7);
            Clasificacion[7].setText(vamosClasificar.cla8);
            Clasificacion[8].setText(vamosClasificar.cla9);
            Clasificacion[9].setText(vamosClasificar.cla10);

            Variables[0].setText(vamosClasificar.div1);
            Variables[1].setText(vamosClasificar.div2);
            Variables[4].setText(vamosClasificar.div3);
            Variables[5].setText(vamosClasificar.div4);
            Variables[6].setText(vamosClasificar.div5);
            Variables[7].setText(vamosClasificar.div6);

            Equipos[0] = vamosClasificar.div1;
            Equipos[1] = vamosClasificar.div2;
            Equipos[2] = vamosClasificar.div3;
            Equipos[3] = vamosClasificar.div4;
            Equipos[4] = vamosClasificar.div5;
            Equipos[5] = vamosClasificar.div6;

            Variables[2].setText(vamosClasificar.cla1);
            Variables[3].setText(vamosClasificar.cla2);
            Variables[8].setText(vamosClasificar.cla3);
            Variables[9].setText(vamosClasificar.cla4);
            Variables[10].setText(vamosClasificar.cla5);
            Variables[11].setText(vamosClasificar.cla6);
            Variables[12].setText(vamosClasificar.cla7);
            Variables[13].setText(vamosClasificar.cla8);
            Variables[14].setText(vamosClasificar.cla9);
            Variables[15].setText(vamosClasificar.cla10);

            Equipos[6] = vamosClasificar.cla1;
            Equipos[7] = vamosClasificar.cla2;
            Equipos[8] = vamosClasificar.cla3;
            Equipos[9] = vamosClasificar.cla4;
            Equipos[10] = vamosClasificar.cla5;
            Equipos[11] = vamosClasificar.cla6;
            Equipos[12] = vamosClasificar.cla7;
            Equipos[13] = vamosClasificar.cla8;
            Equipos[14] = vamosClasificar.cla9;
            Equipos[15] = vamosClasificar.cla10;
        }

        if (e.getSource() == Champion) {
            Championship myChampionship = new Championship();
            myChampionship.setBounds(0, 0, 700, 450);
            myChampionship.setVisible(true);
            myChampionship.setResizable(false);
            myChampionship.setLocationRelativeTo(null);

        }

    }

    public void stateChanged(ChangeEvent e) {
        if (Oscuro.isSelected()) {
            getContentPane().setBackground(new Color(FonOscR, FonOscG, FonOscB));
            Oscuro.setBackground(new Color(FonOscR, FonOscG, FonOscB));
            Oscuro.setForeground(new Color(Areatexto, Areatexto, Areatexto));
            Claro.setBackground(new Color(FonOscR, FonOscG, FonOscB));
            Claro.setForeground(new Color(Areatexto, Areatexto, Areatexto));
            Windows.setBackground(new Color(FonOscR, FonOscG, FonOscB));
            Windows.setForeground(new Color(Areatexto, Areatexto, Areatexto));

            // Division[0].setForeground(new Color(LAmarilloR,LAmarilloG,LAmarilloB));
            for (int i = 0; i < 6; i++) {
                Division[i].setForeground(new Color(LAmarilloR, LAmarilloG, LAmarilloB));
            }
            for (int i = 0; i < 10; i++) {
                Clasificacion[i].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
            }
            for (int i = 0; i < 5; i++) {
                Subtitulo[i].setForeground(new Color(LAmarilloR, LAmarilloG, LAmarilloB));
            }
            for (int i = 0; i < 16; i++) {
                Elementos[i].setForeground(new Color(LNaranjaR, LNaranjaG, LNaranjaB));
            }
            for (int i = 0; i < 16; i++) {
                Variables[i].setForeground(new Color(LBlancoR, LBlancoG, LBlancoB));
            }

            Titulo.setForeground(new Color(LTituloR, LTituloG, LTituloB));
            AreaTitulo.setBackground(new Color(Areatexto, Areatexto, Areatexto));

            Boton.setForeground(new Color(255, 0, 255));
            Boton.setBackground(new Color(255, 255, 0));

            Champion.setForeground(new Color(15, 36, 62));
            Champion.setBackground(new Color(235, 241, 222));

        }

        if (Claro.isSelected()) {
            getContentPane().setBackground(new Color(FonClaR, FonClaG, FonClaB));
            Oscuro.setBackground(new Color(FonClaR, FonClaG, FonClaB));
            Oscuro.setForeground(new Color(0, 0, 255));
            Claro.setBackground(new Color(FonClaR, FonClaG, FonClaB));
            Claro.setForeground(new Color(0, 0, 255));
            Windows.setBackground(new Color(FonClaR, FonClaG, FonClaB));
            Windows.setForeground(new Color(0, 0, 255));
            // NO OLVIDES 0,0,255 CAMBIARLO por onombre variables
            for (int i = 0; i < 6; i++) {
                Division[i].setForeground(new Color(LRojoR, LRojoG, LRojoB));
            }
            for (int i = 0; i < 10; i++) {
                Clasificacion[i].setForeground(new Color(LAzulOR, LAzulOG, LAzulOB));
            }
            for (int i = 0; i < 5; i++) {
                Subtitulo[i].setForeground(new Color(LRojoR, LRojoG, LRojoB));
            }
            for (int i = 0; i < 16; i++) {
                Elementos[i].setForeground(new Color(LAzulOR, LAzulOG, LAzulOB));
            }
            for (int i = 0; i < 16; i++) {
                Variables[i].setForeground(new Color(LAzulR, LAzulG, LAzulB));
            }

            Titulo.setForeground(new Color(255, 255, 0));
            AreaTitulo.setBackground(new Color(36, 64, 95));

            Boton.setForeground(new Color(151, 71, 6));
            Boton.setBackground(new Color(255, 192, 0));

            Champion.setForeground(new Color(0, 0, 255));
            Champion.setBackground(new Color(235, 241, 222));
        }

        if (Windows.isSelected()) {
            getContentPane().setBackground(new Color(FonWinR, FonWinG, FonWinB));
            Oscuro.setBackground(new Color(FonWinR, FonWinG, FonWinB));
            Oscuro.setForeground(new Color(33, 89, 103));
            Claro.setBackground(new Color(FonWinR, FonWinG, FonWinB));
            Claro.setForeground(new Color(33, 89, 103));
            Windows.setBackground(new Color(FonWinR, FonWinG, FonWinB));
            Windows.setForeground(new Color(33, 89, 103));

            Titulo.setForeground(new Color(255, 255, 255));
            AreaTitulo.setBackground(new Color(33, 89, 103));

            for (int i = 0; i < 6; i++) {
                Division[i].setForeground(new Color(LVerdeOR, LVerdeOG, LVerdeOB));
            }
            for (int i = 0; i < 10; i++) {
                Clasificacion[i].setForeground(new Color(LAzulOR, LAzulOG, LAzulOB));
            }
            for (int i = 0; i < 5; i++) {
                Subtitulo[i].setForeground(new Color(LVerdeOR, LVerdeOG, LVerdeOB));
            }
            for (int i = 0; i < 16; i++) {
                Elementos[i].setForeground(new Color(LAzulOR, LAzulOG, LAzulOB));
            }
            for (int i = 0; i < 16; i++) {
                Variables[i].setForeground(new Color(LMoradoR, LMoradoG, LMoradoB));
            }

            Boton.setForeground(new Color(253, 253, 217));
            Boton.setBackground(new Color(192, 0, 0));

            Champion.setForeground(new Color(255, 255, 0));
            Champion.setBackground(new Color(255, 192, 0));

        }
    }

    public static void main(String args[]) {
        Clasificados losClasificados = new Clasificados();

        losClasificados.setBounds(0, 0, 885, 390);
        losClasificados.setVisible(true);
        losClasificados.setResizable(false);
        losClasificados.setLocationRelativeTo(null);

    }

}
