package mvc.view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mvc.controler.OObserver;

/**
 * Algorithm d'ajout
 */
public class MainAddAlgo extends JFrame {
    /**
     * Main
     * 
     * @param args arguments.
     */

    private String moduleString,argumentString,realString,imaString;
    private ComplexPanel cartPanel1,cartPanel2,cartPanel3,polarCart1,polarCart2,polarCart3;
    public MainAddAlgo(OObserver o){
        JLabel plus = new JLabel("+");
        JLabel equal = new JLabel("=");

        

        ComplexPanel cartPanel1 = new ComplexPanel("real", "imaginary", "0","0");
        ComplexPanel cartPanel2 = new ComplexPanel("real", "imaginary", "0","0");
        ComplexPanel cartPanel3 = new ComplexPanel("real", "imaginary", "0","0");

        this.add(cartPanel1.getPanel());
        this.add(plus);
        this.add(cartPanel2.getPanel());
        this.add(equal);
        this.add(cartPanel3.getPanel());


        //add listPanel      
        

        ComplexPanel polarCart1 = new ComplexPanel("Module", "Argument", "0","0");
        ComplexPanel polarCart2 = new ComplexPanel("Module", "Argument", "0","0");
        ComplexPanel polarCart3 = new ComplexPanel("Module", "Argument", "0","0");

        this.add(polarCart1.getPanel());
        this.add(plus);
        this.add(polarCart2.getPanel());
        this.add(equal);
        this.add(polarCart3.getPanel());
        
        
        cartPanel1.addObserver(o);
        polarCart3.addObserver(o);
        cartPanel2.addObserver(o);
        cartPanel3.addObserver(o);
        polarCart1.addObserver(o);
        polarCart2.addObserver(o);

        this.pack();
        this.setVisible(true);
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
                return polarCart1;
            case 4: 
                return polarCart2;
            case 5: 
                return polarCart3;
            default:
                return null;
        }
    }
}