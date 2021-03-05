package ea5_1;

import java.awt.*;
import java.awt.event.*;

import static java.awt.Color.*;



public class Rechner extends Frame {
    private BorderLayout borderLayout1 = new BorderLayout();

    //private FlowLayout flowLayout1 = new FlowLayout();
    /*
     * AWT-Komponenten fuer Eingabetextfeld, Zifferntasten, Operatortasten sowie
     * Ziffernpanel und Operatorpanel deklarieren und soweit moeglich bereits
     * zugehoerige Objekte erzeugen
     */

    //Eingabetextfeld wird erqeugt:
    TextField newTextField = new TextField();

    // Ziffertasten sind erzeugt:
    Button zifButton0 = new Button("0");
    Button zifButton1 = new Button("1");
    Button zifButton2 = new Button("2");
    Button zifButton3 = new Button("3");
    Button zifButton4 = new Button("4");
    Button zifButton5 = new Button("5");
    Button zifButton6 = new Button("6");
    Button zifButton7 = new Button("7");
    Button zifButton8 = new Button("8");
    Button zifButton9 = new Button("9");


    // Operatortasten sind erzeugt:
    Button opButtonPlus = new Button("+");
    Button opButtonMinus = new Button("-");
    Button opButtonMult = new Button("*");
    Button opButtonEqual = new Button("=");


    // Panelen erzeugen:
    Panel ziffernPanel = new Panel();
    Panel operatorenPanel = new Panel();


    public Rechner() {
        /* Ggf. lokale Variablen deklarieren */

        /* Layout fuer Frame festlegen */
        this.setLayout(borderLayout1);
        this.setSize(150, 200);
        this.setLocation(100, 100);
        this.setBackground(gray);

        /* FlowLayout fuer Ziffern- und Operatorpanel setzen */


        ziffernPanel.setLayout(new FlowLayout());
        operatorenPanel.setLayout(new FlowLayout());


        /* Zifferntasten ggf. erzeugen und in Ziffernpanel einfuegen */
        zifButton0.setForeground(green);
        zifButton1.setForeground(green);
        zifButton2.setForeground(green);
        zifButton3.setForeground(green);
        zifButton4.setForeground(green);
        zifButton5.setForeground(green);
        zifButton6.setForeground(green);
        zifButton7.setForeground(green);
        zifButton8.setForeground(green);
        zifButton9.setForeground(green);

        ziffernPanel.add(zifButton0);
        ziffernPanel.add(zifButton1);
        ziffernPanel.add(zifButton2);
        ziffernPanel.add(zifButton3);
        ziffernPanel.add(zifButton4);
        ziffernPanel.add(zifButton5);
        ziffernPanel.add(zifButton6);
        ziffernPanel.add(zifButton7);
        ziffernPanel.add(zifButton8);
        ziffernPanel.add(zifButton9);


        /* Operatortasten ggf. erzeugen und in Operatorpanel einfuegen */
        opButtonPlus.setForeground(red);
        opButtonMinus.setForeground(red);
        opButtonMult.setForeground(red);
        opButtonEqual.setForeground(red);

        operatorenPanel.add(opButtonPlus);
        operatorenPanel.add(opButtonMinus);
        operatorenPanel.add(opButtonMult);
        operatorenPanel.add(opButtonEqual);


        /* Objekte in Frame plazieren */
        newTextField.setBackground(white);

        this.add(newTextField, BorderLayout.NORTH);
        this.add(ziffernPanel, BorderLayout.CENTER);
        this.add(operatorenPanel, BorderLayout.SOUTH);


        //event listener for digit buttons / es geht um EventListener fuer Zifferntasten
        class ziffernPanelEventListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                newTextField.setText(newTextField.getText()+((Button) e.getSource()).getLabel());
            }
        };

        //add event listeners to digit buttons / EventListener zu Zifferntasten hinzufuegen
        zifButton0.addActionListener(new ziffernPanelEventListener());
        zifButton1.addActionListener(new ziffernPanelEventListener());
        zifButton2.addActionListener(new ziffernPanelEventListener());
        zifButton3.addActionListener(new ziffernPanelEventListener());
        zifButton4.addActionListener(new ziffernPanelEventListener());
        zifButton5.addActionListener(new ziffernPanelEventListener());
        zifButton6.addActionListener(new ziffernPanelEventListener());
        zifButton7.addActionListener(new ziffernPanelEventListener());
        zifButton8.addActionListener(new ziffernPanelEventListener());
        zifButton9.addActionListener(new ziffernPanelEventListener());


        //text field is made uneditable / Eingabefeld wird nicht editierbar gemacht
        this.newTextField.setEditable(false);

        //Event-Handling für Operatortasten
        




        /* ... */
    }
    /* ... */
    public static void main(String argv[]) {
        Rechner rechner = new Rechner();

        rechner.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        rechner.setVisible(true);
    }
}
