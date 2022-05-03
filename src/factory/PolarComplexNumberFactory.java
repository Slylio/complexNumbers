package factory;
import mvc.model.*;

public class PolarComplexNumberFactory implements ComplexNumberAbstractFactory{

    
    public PolarComplexNumber createComplexNumberFromCartesian(double real, double imaginary) {
        return (PolarComplexNumber) new CartesianComplexNumber(real, imaginary).convert(); 
    }

    public PolarComplexNumber createComplexNumberFromPolar(double modulus, double argument) {
        return new PolarComplexNumber(modulus,argument);
    }
    
}
