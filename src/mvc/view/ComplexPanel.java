package mvc.view;

import java.awt.event.ActionEvent;

import javax.swing.*;
import mvc.controler.OObservable;

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

    public JPanel getPanel(){
        return panel;
    }

    Action updateComplexNumberAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            notifyObservers();
        }
    };
}
