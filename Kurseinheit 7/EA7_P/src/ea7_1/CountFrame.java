package ea7_1;

import java.awt.*;
import java.awt.event.*;
public class CountFrame extends Frame {
    private Button decrementButton = new Button("<");
    private Button incrementButton = new Button(">");
    private Button resetButton = new Button("RESET");
    private TextField valueTextField = new TextField(3);
    private Counter counter = new Counter(50);
    public CountFrame() {
        valueTextField.setEditable(false);
        valueTextField.setText(counter.toString());
// geeignete Beobachter registrieren
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter.decrement();
                valueTextField.setText(counter.toString());
            }
        });
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter.increment();
                valueTextField.setText(counter.toString());

            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter.reset();
                valueTextField.setText(counter.toString());
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
// Komponenten in richtiger Reihenfolge in Panel einfügen
        Panel centerPanel = new Panel(new FlowLayout());
        centerPanel.add(decrementButton);
        centerPanel.add(valueTextField);
        centerPanel.add(incrementButton);
// Komponenten in Hauptfenster einfügen
        add(centerPanel, BorderLayout.CENTER);
        add(resetButton, BorderLayout.SOUTH);
// Fenstergröße festlegen
        setSize(200, 100);
    }
    public static void main(String[] args)  {
        String msq;
        CountFrame countFrame = new CountFrame();
        countFrame.setVisible(true);


    }
}
