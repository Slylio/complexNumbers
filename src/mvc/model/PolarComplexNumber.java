package mvc.model;

public class PolarComplexNumber implements ComplexNumber {
    private double modulus;
    private double argument;
    private double real;
    private double imaginary;

    public PolarComplexNumber(double modulus, double argument){
        this.modulus=modulus;
        this.argument=argument;
        real =modulus*Math.cos(argument);
        imaginary=modulus*Math.sin(argument);
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
    public void setArgument(double argument) {
        this.argument=argument;
    }

    public void setImaginary(double imaginary) {
        System.out.println(this+" is a polar number, you can only modify the modulus and the argument");
    }

    public void setReal(double real) {
        System.out.println(this+" is a polar number, you can only modify the modulus and the argument");
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
        System.out.println(this.toString()+"+"+c.toString()+" = "+this.add(c).toString());
    }

    public ComplexNumber minus(ComplexNumber c){
        //on converti les polars en cartésiens qu'on re convert en polar
        return this.convert().minus(c.convert()).convert();
    }

    public void minusDisplay(ComplexNumber c){
        System.out.println(this.toString()+"-"+c.toString()+" = "+ this.minus(c).toString());
    }

    public ComplexNumber convert(){
        return new CartesianComplexNumber(real,imaginary);
    }

    public void convertDisplay(){
        System.out.println(this.toString()+" -> "+(CartesianComplexNumber) this.convert());
    }

    public String toString(){
        return "("+Round.toRound(getModulus())+";"+Round.toRound(getArgument())+")";
    }
}
