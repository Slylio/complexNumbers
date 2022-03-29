package complex;

public class PolarComplexNumber implements ComplexNumber {
    private double modulus;
    private double argument;

    public PolarComplexNumber(double modulus, double argument){
        this.modulus=modulus;
        this.argument=argument;
    }

    //getters
    public double getImaginary() {
        return 0;
    }

    public double getReal() {
        return 0;
    }

    public double getArgument() {
        return -this.argument;
    }

    public double getModulus() {
        return this.modulus;
    }

    //setters
    public void setArgument(double argument) {
        this.argument=argument;
    }

    public void setImaginary(double imaginary) {
        ;
    }

    public void setReal(double real) {
        ;
    }

    public void setModulus(double modulus) {
        this.modulus=modulus;
    }
    
    //calculs and display
    public ComplexNumber add(ComplexNumber c){
        //on converti les polars en cartésiens qu'on re convert en polar
        return this.convert().add(c.convert()).convert();
    }

    public void addDisplay(ComplexNumber c){
        System.out.println("("+this.toString()+")"+"+"+"("+c.toString()+")"+" = "+ "("+this.add(c).toString()+")");
    }

    public ComplexNumber minus(ComplexNumber c){
        //on converti les polars en cartésiens qu'on re convert en polar
        return this.convert().minus(c.convert()).convert();
    }

    public void minusDisplay(ComplexNumber c){
        System.out.println("("+this.toString()+")"+"-"+"("+c.toString()+")"+" = "+ "("+this.minus(c).toString()+")");
    }

    public ComplexNumber convert(){
        return new CartesianComplexNumber(modulus*Math.cos(argument),modulus*Math.sin(argument));
    }

    public void convertDisplay(){
        System.out.println(this.toString()+" -> "+(CartesianComplexNumber) this.convert());
    }

    public String toString(){
        return "("+getModulus()+";"+getArgument()+")";
    }
}
