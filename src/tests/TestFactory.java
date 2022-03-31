package tests;

import complex.CartesianComplexNumber;
import complex.PolarComplexNumber;
import factory.CartesianComplexNumberFactory;
import factory.PolarComplexNumberFactory;

public class TestFactory {
    public static void main(String[] args) {
        System.out.println("--------------------FACTORY TEST---------------------");
        System.out.println("Every parameters are 1");

        CartesianComplexNumberFactory cartesian = new CartesianComplexNumberFactory();
        CartesianComplexNumber cart1=cartesian.createComplexNumberFromCartesian(1,1);
        CartesianComplexNumber cart2=cartesian.createComplexNumberFromPolar(1,1);


        PolarComplexNumberFactory polar = new PolarComplexNumberFactory();
        PolarComplexNumber polar1=polar.createComplexNumberFromCartesian(1, 1);
        PolarComplexNumber polar2=polar.createComplexNumberFromPolar(1, 1);

        System.out.println("Cartesian from cartesian : "+cart1);
        System.out.println("Cartesian from polar : "+cart2);
        System.out.println("Polar from cartesian : "+polar1);
        System.out.println("Polar from polar : "+polar2);
    }
}
