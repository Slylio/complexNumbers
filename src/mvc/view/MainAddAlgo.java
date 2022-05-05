package mvc.view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import mvc.controler.OObserver;

public class MainAddAlgo extends JFrame {
    /**
     * Main
     * 
     * @param args arguments.
     */

    private String moduleString,argumentString,realString,imaString;
    private ComplexPanel cartPanel1,cartPanel2,cartPanel3,polarPanel1,polarPanel2,polarPanel3;
    public MainAddAlgo(OObserver o){
        //operandes
        JLabel plus = new JLabel("+");
        JLabel equal = new JLabel("=");


        this.setLayout(new GridLayout(6,1));
        
        //cart part
        ComplexPanel cartPanel1 = new ComplexPanel(" real ", " imaginary ", "0","0");
        ComplexPanel cartPanel2 = new ComplexPanel(" real ", " imaginary ", "0","0");
        ComplexPanel cartPanel3 = new ComplexPanel(" real ", " imaginary ", "0","0");
        
        //build cart
        //this.add(new JLabel(""));
        this.add(cartPanel1.getPanel());
        //this.add(plus);
        this.add(cartPanel2.getPanel());
        //this.add(equal);
        this.add(cartPanel3.getPanel());


        //add listPanel      

        //

        //polar part
        ComplexPanel polarPanel1 = new ComplexPanel(" Module ", " Argument ", "0","0");
        ComplexPanel polarPanel2 = new ComplexPanel(" Module ", " Argument ", "0","0");
        ComplexPanel polarPanel3 = new ComplexPanel(" Module ", " Argument ", "0","0");
        
        //build polar
        //this.add(new JLabel(""));
        this.add(polarPanel1.getPanel());
        //this.add(plus);
        this.add(polarPanel2.getPanel());
        //this.add(equal);
        this.add(polarPanel3.getPanel());
        
        
        cartPanel1.addObserver(o);
        polarPanel3.addObserver(o);
        cartPanel2.addObserver(o);
        cartPanel3.addObserver(o);
        polarPanel1.addObserver(o);
        polarPanel2.addObserver(o);

        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getImaString(){
        return this.imaString;
    }

    public String getRealString(){
        return realString;
    }

    public String getArgumentString() {
        return argumentString;
    }

    public String getModuleString() {
        return moduleString;
    }

    public void setArgumentString(String argumentString) {
        this.argumentString = argumentString;
    }

    public void setImaString(String imaString) {
        this.imaString = imaString;
    }

    public void setModuleString(String moduleString) {
        this.moduleString = moduleString;
    }
    public void setRealString(String realString) {
        this.realString = realString;
    }
    
    public ComplexPanel getPanel(int i){
        switch (i){
            case 0:
                return cartPanel1;
            case 1:
                return cartPanel2;
            case 2:
                return cartPanel3;
            case 3: 
                return polarPanel1;
            case 4: 
                return polarPanel2;
            case 5: 
                return polarPanel3;
            default:
                return null;
        }
    }
}