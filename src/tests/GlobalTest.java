package tests;
import complex.CartesianComplexNumber;
import java.lang.Math;

public class GlobalTest {
    public static void main(String[] args) {
        System.out.println("Lancement des calculs et des conversions test :");
        
        //calculs
        new CartesianComplexNumber(2, 3).addDisplay(new CartesianComplexNumber(4, 5));
        new CartesianComplexNumber(-2, 5).addDisplay(new CartesianComplexNumber(1, -3));
        new CartesianComplexNumber(-2, 5).minusDisplay(new CartesianComplexNumber(1, -3));

        new CartesianComplexNumber(1, 1).convertDisplay();
        new CartesianComplexNumber(3, Math.sqrt(3)).convertDisplay();
        new CartesianComplexNumber(Math.sqrt(3), Math.sqrt(3)).convertDisplay();
        new CartesianComplexNumber(Math.sqrt(2), Math.sqrt(3)).convertDisplay();

    }
}
