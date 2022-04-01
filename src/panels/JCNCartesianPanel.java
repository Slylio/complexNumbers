package panels;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.AbstractAction;

import complex.CartesianComplexNumber;
import complex.ComplexNumber;

import java.awt.event.ActionEvent;

/**
 * JCNCartesianPanel est un JPanel permettant
 * d'afficher et d'éditer
 * la forme cartésienne d'un nombre complexe.
 * 
 * <pre>
 * *--------------*--------------*--------------
*--------------*
 * | réel : | | Imaginaire : |
|
 * *--------------*--------------*--------------
*--------------*
 * </pre>
 * 
 * @author Erik MAZOYER
 * @version 1.0
 */
public class JCNCartesianPanel extends JPanel {
    /**
     * Zone d'édition de la partie réelle du nombre
     * complexe affiché.
     */
    private JTextField realTextField;
    /**
     * Zone d'édition de la partie imaginaire du nombre
     * complexe affiché.
     */
    private JTextField imaginaryTextField;
    /**
     * Nombre complexe édité.
     */
    private ComplexNumber complexNumber;
    /**
     * Action de mise à jour du nombre complexe
     * affiché.
     */
    Action updateComplexNumberAction = new AbstractAction() {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (complexNumber != null) {
                try {
                    double real = Double.parseDouble(realTextField.getText());
                    double imaginary = Double.parseDouble(imaginaryTextField.getText());
                    complexNumber.setReal(real);

                    complexNumber.setImaginary(imaginary);
                } catch (NumberFormatException nfex) {
                    nfex.printStackTrace();
                }
            }
        }
    };

    /**
     * Constructeur d'objets de classe
    JcartesianCNPanel
    */
    public JCNCartesianPanel() {
        complexNumber = null;
        GridLayout gridLayout = new GridLayout(1,4);
        setLayout(gridLayout);
        JLabel realLabel = new JLabel("Réel : ");
        realTextField = new JTextField();
        JLabel imaginaryLabel = new
        JLabel("Imaginaire : ");
        imaginaryTextField = new JTextField();
        this.add(realLabel);
        this.add(realTextField);
        this.add(imaginaryLabel);
        this.add(imaginaryTextField);


        realTextField.addActionListener(updateComplexNumberAction);

        imaginaryTextField.addActionListener(updateComplexNumberAction);
    }

    /**
     * Spécifie le nombre complexe édité.
     * 
     * @param complexNumber Le nombre complexe à éditer
     *                      ou {@code null}.
     */
    public void setEditedComplexNumber(ComplexNumber complexNumber) {
        this.complexNumber = complexNumber;
        updateDisplay();
    }

    /**
     * Mise à jour de l'affichage.
     */
    private void updateDisplay() {
        if(complexNumber == null) {
            realTextField.setText("");
            realTextField.setEnabled(false);
            imaginaryTextField.setText("");
            imaginaryTextField.setEnabled(false);
        } else {
            realTextField.setText(Double.toString(complexNumber.getReal()));
            realTextField.setEnabled(true);

            imaginaryTextField.setText(Double.toString(complexNumber.getImaginary()));
            imaginaryTextField.setEnabled(true);
        }
    }

    /**
     * Main de test.
     * 
     * @param args arguments.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("JCNcartesianPanel");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CartesianComplexNumber complexNumber = new CartesianComplexNumber(1, 1);
        JCNCartesianPanel cartesianPanel = new JCNCartesianPanel();

        cartesianPanel.setEditedComplexNumber(complexNumber);
        frame.getContentPane().add(cartesianPanel,
                BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}