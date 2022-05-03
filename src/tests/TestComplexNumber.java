package tests;
import mvc.model.CartesianComplexNumber;
import mvc.model.PolarComplexNumber;

public class TestComplexNumber {
    public static void main(String[] args) {
        

        //CARTESIAN PART


        System.out.println("--------------------CARTESIAN NUMBERS TEST---------------------");
        CartesianComplexNumber nb1=new CartesianComplexNumber(8, 7);
        CartesianComplexNumber nb2=new CartesianComplexNumber(1, 1);

        System.out.println("Cartesian number created : "+nb1+" "+nb2);
        System.out.println("Get real : "+nb1.getReal()+" Get imaginary : "+nb1.getImaginary()+" Get modulus : "+nb1.getModulus()+" Get argument : "+nb1.getArgument());
        System.out.println("nb1.setReal(1)");
        System.out.println("nb1.setImaginary(1)");

        nb1.setReal(1);
        nb1.setImaginary(1);
        System.out.println(nb1);

        System.out.print("Addition of both numbers : ");
        nb1.addDisplay(nb2);

        System.out.print("Minus of both numbers : ");
        nb1.minusDisplay(nb2);

        System.out.println("Conversion into a PolarComplexNumber : ");


        //POLAR PART


        System.out.println("--------------------POLAR NUMBERS TEST---------------------");
        PolarComplexNumber polarNb1 = (PolarComplexNumber) nb1.convert();
        nb1.convertDisplay();
        PolarComplexNumber polarNb2 = (PolarComplexNumber) nb1.convert();
        nb2.convertDisplay();

        System.out.println("Cartesian number created : "+nb1+" "+nb2);
        System.out.println("Get real : "+polarNb1.getReal()+" Get imaginary : "+polarNb1.getImaginary()+" Get modulus : "+polarNb1.getModulus()+" Get argument : "+polarNb1.getArgument());
        System.out.println("polarNb1.setReal(1)");
        System.out.println("polarNb1.setImaginary(1)");

        polarNb1.setReal(1);
        polarNb1.setImaginary(1);
        System.out.println(polarNb1);

        System.out.print("Addition of both polar numbers : ");
        polarNb1.addDisplay(polarNb2);

        System.out.print("Minus of both polar numbers : ");
        polarNb1.minusDisplay(polarNb2);
    }
}
