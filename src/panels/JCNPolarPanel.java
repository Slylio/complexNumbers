package panels;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.AbstractAction;

import complex.PolarComplexNumber;
import complex.ComplexNumber;

import java.awt.event.ActionEvent;

/**
 * JCNPolarPanel est un JPanel permettant
 * d'afficher et d'éditer
 * la forme polaire d'un nombre complexe.
 * 
 * <pre>
 * *--------------*--------------*--------------
*--------------*
 * | Modulus : | | Argument : |
|
 * *--------------*--------------*--------------
*--------------*
 * </pre>
 * 
 * @author Erik MAZOYER (and Emilio)
 * @version 1.0
 */
public class JCNPolarPanel extends JPanel {
    /**
     * Zone d'édition de la partie réelle du nombre
     * complexe affiché.
     */
    private JTextField modulusTextField;
    /**
     * Zone d'édition de la partie imaginaire du nombre
     * complexe affiché.
     */
    private JTextField argumentTextField;
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
                    double modulus = Double.parseDouble(modulusTextField.getText());
                    double argument = Double.parseDouble(argumentTextField.getText());
                    complexNumber.setModulus(modulus);

                    complexNumber.setArgument(argument);
                } catch (NumberFormatException nfex) {
                    nfex.printStackTrace();
                }
            }
        }
    };

    /**
     * Constructeur d'objets de classe
     * JpolarCNPanel
     */
    public JCNPolarPanel() {
        complexNumber = null;
        GridLayout gridLayout = new GridLayout(1, 4);
        setLayout(gridLayout);
        JLabel modulusLabel = new JLabel("Réel : ");
        modulusTextField = new JTextField();
        JLabel argumentJLabel = new JLabel("Imaginaire : ");
        argumentTextField = new JTextField();
        this.add(modulusLabel);
        this.add(modulusTextField);
        this.add(argumentJLabel);
        this.add(argumentTextField);

        modulusTextField.addActionListener(updateComplexNumberAction);

        argumentTextField.addActionListener(updateComplexNumberAction);
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
        if (complexNumber == null) {
            modulusTextField.setText("");
            modulusTextField.setEnabled(false);
            argumentTextField.setText("");
            argumentTextField.setEnabled(false);
        } else {
            modulusTextField.setText(Double.toString(complexNumber.getModulus()));
            modulusTextField.setEnabled(true);

            argumentTextField.setText(Double.toString(complexNumber.getArgument()));
            argumentTextField.setEnabled(true);
        }
    }

    /**
     * Main de test.
     * 
     * @param args arguments.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("JCNPolarPanel");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PolarComplexNumber complexNumber = new PolarComplexNumber(1, 1);
        JCNPolarPanel polarPanel = new JCNPolarPanel();

        polarPanel.setEditedComplexNumber(complexNumber);
        frame.getContentPane().add(polarPanel,
                BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}