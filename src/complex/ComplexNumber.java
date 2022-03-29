package complex;
public interface ComplexNumber {
    //attributs
    double real=0;
    double imaginary=0;
    double modulus=0;
    double argument=0;
   
    //getters
    double getArgument();
    double getImaginary();
    double getReal();
    double getModulus();
    
    //setters
    void setArgument(double argument);
    void setImaginary(double imaginary);
    void setReal(double real);
    void setModulus(double modulus);

    //opérations
    ComplexNumber add(ComplexNumber c);
    ComplexNumber minus(ComplexNumber c);

    //petit bonus j'ai trouvé ça plus simple
    void addDisplay(ComplexNumber c);
    void minusDisplay(ComplexNumber c);
    ComplexNumber convert();
    void convertDisplay(); 
}
