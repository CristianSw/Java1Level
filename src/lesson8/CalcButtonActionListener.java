package lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {
    private final JTextField inputField;

    public CalcButtonActionListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String textValue = inputField.getText();
        String[] plus = textValue.split("\\+");
        String[] multiply = textValue.split("\\*");
        String[] divide = textValue.split("/");
        String[] minus = textValue.split("-");
        String[] square = textValue.split("\\√");
        String sqrt = square[0];
        if (plus.length >=2){
            int sum =0;
            for (String s : plus) {
                sum += Integer.parseInt(s);
            }
            inputField.setText(String.valueOf(sum));
        } else if (multiply.length >=2){
            int multiplyResult = 1;
            for (String s : multiply) {
                multiplyResult *= Integer.parseInt(s);
            }
            inputField.setText(String.valueOf(multiplyResult));
        } else if (divide.length >=2) {
            float divideResult = Float.parseFloat(divide[0]);
            for (int i = 1; i < divide.length; i++) {
                divideResult /= Float.parseFloat(divide[i]);
            }
            inputField.setText(String.valueOf(divideResult));
        }else if (minus.length >= 2){
            int minusResult = Integer.parseInt(minus[0]);
            for (int i = 1; i < minus.length; i++) {
                minusResult -= Integer.parseInt(minus[i]);
            }
            inputField.setText(String.valueOf(minusResult));
        }else if (sqrt.equalsIgnoreCase(square[0])){
            inputField.setText(String.valueOf(calcSquare(square)));
        }
    }

    private double calcSquare(final String[] square){
    return  Math.sqrt(Double.parseDouble(square[0]));
    }
}
