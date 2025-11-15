package NumberCounter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberCounter extends JFrame implements ActionListener {

    private JButton decreaseButton;
    private JButton increaseButton;
    private JLabel number;
    private JPanel ContentPanel;

    public NumberCounter() {
        decreaseButton.addActionListener(this);
        increaseButton.addActionListener(this);
        setTitle("Number Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setResizable(false);
        add(ContentPanel);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == decreaseButton) {
            int n = Integer.parseInt(number.getText());
            n--;
            number.setText(n + "");
        }

        if(e.getSource() == increaseButton) {
            int n = Integer.parseInt(number.getText());
            n++;
            number.setText(n + "");
        }
    }

    public static void main(String[] args) {
        new NumberCounter();
    }
}
