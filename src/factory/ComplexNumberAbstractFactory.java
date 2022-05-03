package factory;
import mvc.model.ComplexNumber;

public interface ComplexNumberAbstractFactory {
    ComplexNumber createComplexNumberFromCartesian(double real, double imaginary);
    ComplexNumber createComplexNumberFromPolar(double modulus, double argument);
}
