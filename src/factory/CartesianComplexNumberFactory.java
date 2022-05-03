package factory;
import mvc.model.*;

public class CartesianComplexNumberFactory implements ComplexNumberAbstractFactory {

    public CartesianComplexNumber createComplexNumberFromCartesian(double real, double imaginary) {
        return new CartesianComplexNumber(real,imaginary);
    }

    public CartesianComplexNumber createComplexNumberFromPolar(double modulus, double argument) {
        return new CartesianComplexNumber(modulus*Math.cos(argument),modulus*Math.sin(argument));
    }
}
