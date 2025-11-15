package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame implements ActionListener {
    private JPanel ContentPanel;
    private JCheckBox pizzaCheckBox;
    private JCheckBox burgerCheckBox;
    private JCheckBox friesCheckBox;
    private JCheckBox softdrinksCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox sundaeCheckBox;
    private JRadioButton noneRadioButton;
    private JRadioButton a5OffRadioButton;
    private JRadioButton a10OffRadioButton;
    private JRadioButton a15OffRadioButton;
    private JButton orderButton;
    private JCheckBox[] checkBoxes = {pizzaCheckBox, burgerCheckBox, friesCheckBox, softdrinksCheckBox,teaCheckBox, sundaeCheckBox};
    private JRadioButton[] radioButtons = {noneRadioButton, a5OffRadioButton, a10OffRadioButton, a15OffRadioButton};
    private int[] prices = {100, 80, 65, 55, 50, 40};
    private ButtonGroup buttonGroup = new ButtonGroup();

    public FoodOrderingSystem() {
        orderButton.addActionListener(this);
        setTitle("Food Ordering System");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(ContentPanel);
        setResizable(false);

        for(int i = 0; i < 4; i++){
            buttonGroup.add(radioButtons[i]);
        }

        setVisible(true);


    }

    public static void main(String[] args) {
        new FoodOrderingSystem();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Order")) {
            double total = 0;
            for(int i = 0; i < checkBoxes.length; i++){
                if(checkBoxes[i].isSelected()) {
                    total += prices[i];

                }
            }

            for(int i = 0; i < radioButtons.length; i++){
                if(radioButtons[i].isSelected()) {
                   if(radioButtons[i].getName().equals("none")){
                       break;
                   } else{
                       total *= Double.parseDouble(radioButtons[i].getName());
                   }
                }
            }
            JOptionPane.showMessageDialog(null, "Total Price: " + total);
        }


    }



}
