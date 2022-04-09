package panels;
import javax.swing.*;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

import complex.CartesianComplexNumber;
import complex.ComplexNumber;


public class JCNCartesianAlgorithmPanel extends JPanel{
    private ComplexNumber cn1, cn2, cnSum; 
    private JCNCartesianPanel cn1Panel, cn2Panel, cnSumPanel;
    private JLabel plus, empty;
    private JButton egal;

    Action updateComplexNumberAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            setValues(cn1, cn2, cnSum);
            System.out.println("test action");
            
        }
    };

    public JCNCartesianAlgorithmPanel(){
        //set complexs
        cn1 = new CartesianComplexNumber(1, 1);
        cn2 = new CartesianComplexNumber(1, 1);
        cnSum = cn1.add(cn2);

        //creating the layout and components
        setLayout(new GridLayout(3, 2));
        empty = new JLabel();
        plus = new JLabel("+");
        egal = new JButton("=");
        
        cn1Panel = new JCNCartesianPanel();
        cn2Panel = new JCNCartesianPanel();
        cnSumPanel = new JCNCartesianPanel();

        cn1Panel.setEditedComplexNumber(cn1);
        cn2Panel.setEditedComplexNumber(cn2);
        cnSumPanel.setEditedComplexNumber(cnSum);

        this.add(empty);
        this.add(cn1Panel);

        this.add(plus);
        this.add(cn2Panel);

        this.add(egal);
        this.add(cnSumPanel);

        JFrame frame = new JFrame("JCNCartesianAlgorithmPanel");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(this);
        frame.pack();
        frame.setVisible(true);

        egal.addActionListener(updateComplexNumberAction);
    }

    public void setValues(ComplexNumber cn1, ComplexNumber cn2, ComplexNumber cnSum){
        this.cn1=cn1;
        this.cn2=cn2;
        this.cnSum=cnSum;

        cn1Panel.setEditedComplexNumber(cn1);
        cn2Panel.setEditedComplexNumber(cn2);
        cnSumPanel.setEditedComplexNumber(cnSum);

    }
    public static void main(String[] args) {
        JCNCartesianAlgorithmPanel panel =new JCNCartesianAlgorithmPanel();
        while (true){
            System.out.println(panel.cn1);
            System.out.println(panel.cn2);
            System.out.println(panel.cnSum);
        }     
    }
}