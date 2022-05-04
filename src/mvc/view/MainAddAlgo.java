package mvc.view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Algorithm d'ajout
 */
public class MainAddAlgo {
    /**
     * Main
     * 
     * @param args arguments.
     */

    private static String moduleString,argumentString,realString,imaString;

    public MainAddAlgo(){
        moduleString="0";
        argumentString="0";
        realString="0";
        imaString="0";
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel globalCartPanel = new JPanel();
        JLabel plus = new JLabel("+");
        JLabel equal = new JLabel("=");

        

        ComplexPanel cartPanel1 = new ComplexPanel("real", "imaginary", realString,imaString);
        ComplexPanel cartPanel2 = new ComplexPanel("real", "imaginary", realString,imaString);
        ComplexPanel cartPanel3 = new ComplexPanel("real", "imaginary", realString,imaString);

        globalCartPanel.add(cartPanel1.getPanel());
        globalCartPanel.add(plus);
        globalCartPanel.add(cartPanel2.getPanel());
        globalCartPanel.add(equal);
        globalCartPanel.add(cartPanel3.getPanel());


        //add listPanel


        JPanel globalPolarCart = new JPanel();
        
        

        ComplexPanel polarCart1 = new ComplexPanel("Module", "Argument", moduleString,argumentString);
        ComplexPanel polarCart2 = new ComplexPanel("Module", "Argument", moduleString,argumentString);
        ComplexPanel polarCart3 = new ComplexPanel("Module", "Argument", moduleString,argumentString);

        globalPolarCart.add(polarCart1.getPanel());
        globalPolarCart.add(plus);
        globalPolarCart.add(polarCart2.getPanel());
        globalPolarCart.add(equal);
        globalPolarCart.add(polarCart3.getPanel());
        
        
        frame.add(globalCartPanel);

        //add listPanel

        frame.add(globalPolarCart);
        frame.pack();
        frame.setVisible(true);
    }

    public String getImaString(){
        return imaString;
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
        MainAddAlgo.argumentString = argumentString;
    }

    public void setImaString(String imaString) {
        MainAddAlgo.imaString = imaString;
    }

    public void setModuleString(String moduleString) {
        MainAddAlgo.moduleString = moduleString;
    }
    public void setRealString(String realString) {
        MainAddAlgo.realString = realString;
    }
}