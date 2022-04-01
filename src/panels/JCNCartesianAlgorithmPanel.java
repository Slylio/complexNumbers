package panels;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import complex.ComplexNumber;


public class JCNCartesianAlgorithmPanel extends JPanel{

    public JCNCartesianPanel cn1Panel, cn2Panel, cnSumPanel;

    public JCNCartesianAlgorithmPanel(){
        GridLayout gridLayout = new GridLayout(3, 2);
        setLayout(gridLayout);

        cn1Panel = new JCNCartesianPanel();
        cn2Panel = new JCNCartesianPanel();
        cnSumPanel = new JCNCartesianPanel();

        this.add(cn1Panel);
        this.add(cn2Panel);
        this.add(cnSumPanel);

        JFrame frame = new JFrame("JCNCartesianAlgorithmPanel");

    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(this);
        frame.getContentPane().add(cn1Panel,BorderLayout.CENTER);
        frame.getContentPane().add(cn2Panel,BorderLayout.CENTER);
        frame.getContentPane().add(cnSumPanel,BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JCNCartesianAlgorithmPanel();
    }

    public void setValues(ComplexNumber cn1, ComplexNumber cn2,ComplexNumber cnSum){

    }
}