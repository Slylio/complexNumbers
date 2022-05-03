package tests;
import java.lang.Math;

import mvc.model.CartesianComplexNumber;

public class GlobalTest {
    public static void main(String[] args) {
        System.out.println("Lancement des calculs et des conversions test :");
        
        //calculs
        System.out.println("--------------------GLOBAL OPERATIONS TEST---------------------");
        new CartesianComplexNumber(2, 3).addDisplay(new CartesianComplexNumber(4, 5));
        new CartesianComplexNumber(-2, 5).addDisplay(new CartesianComplexNumber(1, -3));
        new CartesianComplexNumber(-2, 5).minusDisplay(new CartesianComplexNumber(1, -3));

        new CartesianComplexNumber(1, 1).convertDisplay();
        new CartesianComplexNumber(3, Math.sqrt(3)).convertDisplay();
        new CartesianComplexNumber(Math.sqrt(3), Math.sqrt(3)).convertDisplay();
        new CartesianComplexNumber(Math.sqrt(2), Math.sqrt(3)).convertDisplay();

        TestComplexNumber.main(args);
        
        TestFactory.main(args);
    }
}
