package mvc.view;

import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import mvc.controler.OObservable;

public class ComplexPanel extends OObservable{
    JTextField fieldLeft,fieldRight;
    JLabel labelLeft,labelRight;
    JPanel panel;
    public ComplexPanel(String str1, String str2, String JText1, String JText2){
        fieldLeft=new JTextField();
        fieldRight=new JTextField();
        labelLeft=new JLabel();
        labelRight=new JLabel();
        panel=new JPanel();
        
        panel.setLayout(new GridLayout(1,4));
        //panel.setSize(new Dimension(100,100));

        fieldLeft.setText(JText1);
        fieldRight.setText(JText2);
        labelLeft.setText(str1);
        labelRight.setText(str2);

        panel.setBackground(Color.green);
        panel.add(labelLeft);
        panel.add(fieldLeft);
        panel.add(labelRight);
        panel.add(fieldRight);

        panel.setVisible(true);
    }

    public JPanel getPanel(){
        return panel;
    }

    public double getFieldLeft() {
        return Double.parseDouble(fieldLeft.getText());
    }

    public double getFieldRight() {
        return Double.parseDouble(fieldRight.getText());
    }

    public void setFieldLeft(double num) {
        this.fieldLeft.setText(""+num);
    }

    public void setFieldRight(double num) {
        this.fieldRight.setText(""+num);
    }
    Action updateComplexNumberAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            notifyObservers();
        }
    };
}
