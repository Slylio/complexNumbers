package complex;
public class CartesianComplexNumber implements ComplexNumber {
    private double real;
    private double imaginary;
    private double modulus;
    private double argument;

    public CartesianComplexNumber(double real, double imaginary) {
        this.real=real;
        this.imaginary=imaginary;

        modulus=Math.sqrt(Math.pow(real,2)+Math.pow(imaginary,2));

        //cacul argument
        double pi=0;
        if (real<0){
            pi=Math.PI;
        }
        argument=pi-Math.asin(imaginary/modulus);
    }


    //getters
    public double getImaginary() {
        return this.imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getArgument() {
        return this.argument;
    }

    public double getModulus() {
        return this.modulus;
    }

    //setters
    public void setArgument(double argument){
        System.out.println(this+" is a cartesian number, you can only modify the real and imaginary part");
    }

    public void setImaginary(double imaginary) {
        this.imaginary=imaginary;
    }

    public void setReal(double real) {
        this.real=real;
    }

    public void setModulus(double modulus) {
        System.out.println(this+" is a cartesian number, you can only modify the real and imaginary part");
    }
    
    //calculs and display
    public ComplexNumber add(ComplexNumber c){
        return new CartesianComplexNumber(this.getReal()+c.getReal(),this.getImaginary()+c.getImaginary());
    }

    public void addDisplay(ComplexNumber c){
        System.out.println("("+this.toString()+")"+"+"+"("+c.toString()+")"+" = "+ "("+this.add(c).toString()+")");
    }

    public ComplexNumber minus(ComplexNumber c){
        return new CartesianComplexNumber(this.getReal()-c.getReal(),this.getImaginary()-c.getImaginary());
    }

    public void minusDisplay(ComplexNumber c){
        System.out.println("("+this.toString()+")"+"-"+"("+c.toString()+")"+" = "+ "("+this.minus(c).toString()+")");
    }

    public ComplexNumber convert(){
        return new PolarComplexNumber(modulus,argument);
    }

    public void convertDisplay(){
        System.out.println(this.toString()+" -> "+(PolarComplexNumber) this.convert());
    }

    //affichage du nombre
    public String toString(){
        String res="";
        res+=Round.toRound(this.getReal());
        if (this.getImaginary()>0){
            res+="+";
        }
        res+=Round.toRound(this.getImaginary())+"i";
        return res;
    }
}
