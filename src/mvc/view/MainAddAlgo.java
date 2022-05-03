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
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel globalCartPanel = new JPanel();
        JLabel plus = new JLabel("+");
        JLabel equal = new JLabel("=");

        ComplexPanel cartPanel1 = new ComplexPanel("real", "imaginary", "", "");
        ComplexPanel cartPanel2 = new ComplexPanel("real", "imaginary", "", "");
        ComplexPanel cartPanel3 = new ComplexPanel("real", "imaginary", "", "");

        globalCartPanel.add(cartPanel1);
        globalCartPanel.add(plus);
        globalCartPanel.add(cartPanel2);
        globalCartPanel.add(equal);
        globalCartPanel.add(cartPanel3);


        //add listPanel


        JPanel globalPolarCart = new JPanel();
    
        ComplexPanel polarCart1 = new ComplexPanel("Module", "Argument", "", "");
        ComplexPanel polarCart2 = new ComplexPanel("Module", "Argument", "", "");
        ComplexPanel polarCart3 = new ComplexPanel("Module", "Argument", "", "");

        globalPolarCart.add(polarCart1);
        globalPolarCart.add(plus);
        globalPolarCart.add(polarCart2);
        globalPolarCart.add(equal);
        globalPolarCart.add(polarCart3);
        
        
        frame.add(globalCartPanel);

        //add listPanel

        frame.add(globalPolarCart);
        frame.pack();
        frame.setVisible(true);
    }
}