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
    private TextField newTextField = new TextField();

    // Ziffertasten sind erzeugt:
    private boolean neueBerechnung = false;
    private Button zifButton0 = new Button("0");
    private Button zifButton1 = new Button("1");
    private Button zifButton2 = new Button("2");
    private Button zifButton3 = new Button("3");
    private Button zifButton4 = new Button("4");
    private Button zifButton5 = new Button("5");
    private Button zifButton6 = new Button("6");
    private Button zifButton7 = new Button("7");
    private Button zifButton8 = new Button("8");
    private Button zifButton9 = new Button("9");


    // Operatortasten sind erzeugt:
    private Button opButtonPlus = new Button("+");
    private Button opButtonMinus = new Button("-");
    private Button opButtonMult = new Button("*");
    private Button opButtonEqual = new Button("=");


    // Panelen erzeugen:
    private Panel ziffernPanel = new Panel();
    private Panel operatorenPanel = new Panel();

    ///special variables for processing of the operations
    private int operand1 = 0;
    private int operand2 = 0;
    private int result = 0;
    private float resultfloat = 0;
    private String operator = "";


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
                //we check if we need to start new calculation and make the text field empty;
                if (neueBerechnung){
                    newTextField.setText("");
                    neueBerechnung = false;
                    neueBerechnungStarten();
                }
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
        opButtonPlus.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            operand1 = Integer.parseInt(newTextField.getText());
                            operator = ((Button) e.getSource()).getLabel();
                            //debugging
                            //System.out.println(operator);
                            newTextField.setText("");
                        } catch (NumberFormatException exception) {
                            System.out.println("Wrong format of 1st operand!");
                            newTextField.setText("");

                        }

                    }
                }
        );

        opButtonMinus.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            operand1 = Integer.parseInt(newTextField.getText());
                            operator = ((Button) e.getSource()).getLabel();
                            //debugging
                            //System.out.println(operator);
                            newTextField.setText("");
                        } catch (NumberFormatException exception) {
                            System.out.println("Wrong format of 1st operand!");
                            newTextField.setText("");
                        }
                    }
                }
        );

        opButtonMult.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            operand1 = Integer.parseInt(newTextField.getText());
                            operator = ((Button) e.getSource()).getLabel();
                            //debugging
                            //System.out.println(operator);
                            newTextField.setText("");
                        } catch (NumberFormatException exception) {
                            System.out.println("Wrong format of 1st operand!");
                            newTextField.setText("");
                        }
                    }
                }
        );

        opButtonEqual.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            operand2 = Integer.parseInt(newTextField.getText());

                            if (operator == "+") {
                                result = operand1 + operand2;
                                resultfloat = ((float) operand1 + (float) operand2);

                            } else if (operator == "-") {
                                result = operand1 - operand2;
                                resultfloat = ((float) operand1 - (float) operand2);

                            } else if (operator == "*") {
                                result = operand1 * operand2;
                                resultfloat = ((float) operand1 * (float) operand2);

                            }

                            if (resultfloat > Integer.MAX_VALUE || resultfloat < Integer.MIN_VALUE) {
                                System.out.println("Wrong format of result");
                                newTextField.setText("");
                                neueBerechnungStarten();
                            }

                            System.out.println("Correct format of result");

                            newTextField.setText(Integer.toString(result));

                            neueBerechnung = true;
                        } catch (NumberFormatException exception) {
                            System.out.println("Wrong format of 2nd operand!");
                            newTextField.setText("");
                        }
                    }
                }
        );
        /* ... */
    }


    public void neueBerechnungStarten () {
        operand1 = 0;
        operand2 = 0;
        result = 0;
        resultfloat = 0;
        operator = "";
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
