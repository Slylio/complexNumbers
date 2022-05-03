package mvc.view;

import javax.swing.*;

public class ComplexPanel extends JPanel{
    JTextField fieldLeft,fieldRight;
    JLabel labelLeft,labelRight;

    public ComplexPanel(String str1, String str2, String JText1, String JText2){
        fieldLeft.setText(JText1);
        fieldRight.setText(JText2);
        labelLeft.setText(str1);
        labelRight.setText(str2);
        this.add(labelLeft);
        this.add(fieldLeft);
        this.add(labelRight);
        this.add(fieldRight);
    }
}
