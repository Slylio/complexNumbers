package mvc.view;

import javax.swing.*;

import mvc.controler.OObservable;
import mvc.controler.OObserver;

public class ComplexPanel extends OObservable{
    JTextField fieldLeft,fieldRight;
    JLabel labelLeft,labelRight;
    JPanel panel;
    public ComplexPanel(String str1, String str2, String JText1, String JText2){
        fieldLeft.setText(JText1);
        fieldRight.setText(JText2);
        labelLeft.setText(str1);
        labelRight.setText(str2);
        panel.add(labelLeft);
        panel.add(fieldLeft);
        panel.add(labelRight);
        panel.add(fieldRight);
    }
}
