package lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitButtonActionListener implements ActionListener {


    private final JTextField inputField;

    public DigitButtonActionListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton btn = (JButton) actionEvent.getSource();

        StringBuilder stringBuilder = new StringBuilder(inputField.getText());
        stringBuilder.append(btn.getText());
        inputField.setText(stringBuilder.toString());

    }
}
