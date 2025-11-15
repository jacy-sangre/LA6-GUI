package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JPanel ContentPanel;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel ret;
    private JButton computeResultButton;

    public SimpleCalculator() {
        computeResultButton.addActionListener(this);
        add(ContentPanel);
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setResizable(false);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == computeResultButton) {
            if(textField1.getText().equals("") || textField2.getText().equals("")
            || !(textField1.getText().matches("\\d")) || !(textField2.getText().matches("\\d"))) {
                return;
            }

            double x = Integer.parseInt(textField1.getText());
            double y = Integer.parseInt(textField2.getText());

            switch(comboBox1.getSelectedItem().toString()) {
                case "+":
                    ret.setText(String.valueOf(x + y));
                    break;
                case "-":
                    ret.setText(String.valueOf(x - y));
                    break;
                case "*":
                    ret.setText(String.valueOf(x * y));
                    break;
                case "/":
                    if(y == 0){
                        ret.setText(String.valueOf("Error"));
                        break;
                    }
                    ret.setText(String.valueOf(x / y));
                    break;

            }
        }
    }
}
