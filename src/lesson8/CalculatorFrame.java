package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {

    JTextField inputArea;
    public CalculatorFrame(){
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200,200,300,500);

        setJMenuBar(menu());
        setLayout(new BorderLayout());

        add(createTopPanel(),BorderLayout.NORTH);
        add(createBottomPanel(),BorderLayout.CENTER);


        setVisible(true);
    }

    private JPanel createBottomPanel() {
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(5,4));

        DigitButtonActionListener digitButtonActionListener = new DigitButtonActionListener(inputArea);

        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(digitButtonActionListener);
            bottom.add(btn);
        }

        JButton clear = new JButton("C");
        bottom.add(clear);
        clear.addActionListener(actionEvent -> inputArea.setText(""));

        JButton calc = new JButton("=");
        calc.addActionListener(new CalcButtonActionListener(inputArea));
        bottom.add(calc);

        JButton plus = new JButton("+");
        plus.addActionListener(actionEvent -> inputArea.setText(inputArea.getText() + "+"));
        bottom.add(plus);

        JButton minus = new JButton("-");
        minus.addActionListener(actionEvent -> inputArea.setText(inputArea.getText() + "-"));
        bottom.add(minus);

        JButton multiply = new JButton("*");
        multiply.addActionListener(actionEvent -> inputArea.setText(inputArea.getText() + "*"));
        bottom.add(multiply);

        JButton divide = new JButton("/");
        divide.addActionListener(actionEvent -> inputArea.setText(inputArea.getText() + "/"));
        bottom.add(divide);

        JButton square = new JButton("√");
        square.addActionListener(actionEvent -> inputArea.setText(inputArea.getText() + "√"));
        bottom.add(square);

        return bottom;
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputArea = new JTextField();
        inputArea.setEditable(false);
        top.add(inputArea,BorderLayout.CENTER);
        return top;
    }


    private JMenuBar menu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenu("Open");
        fileMenu.add(openItem);
        JMenuItem exitItem = new JMenu("Exit");
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        return menuBar;
    }
}
