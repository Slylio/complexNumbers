package mvc.controler;
import mvc.model.CartesianComplexNumber;
import mvc.model.ComplexNumber;
import mvc.view.MainAddAlgo;
public class OEngine implements OObserver{
    ComplexNumber c1,c2,c3;
    MainAddAlgo main;

    public OEngine(){
        main= new MainAddAlgo(this);
        c1=new CartesianComplexNumber(0, 0);
        c2=new CartesianComplexNumber(0, 0);
    }

    public static void main(String[] args) {
        new OEngine();
    }
    
    @Override
    public void Oupdate() {
        System.out.println("Changement.");
        
        //on va chercher les données
        Double fieldReal1=main.getPanel(0).getFieldLeft();
        Double fieldIm1=main.getPanel(0).getFieldRight();
        Double fieldReal2=main.getPanel(0).getFieldLeft();
        Double fieldIm2=main.getPanel(0).getFieldRight();

        //on modifie en conséquences
        c1.setReal(fieldReal1);
        c1.setImaginary(fieldIm1);

        c2.setReal(fieldReal2);
        c2.setImaginary(fieldIm2);

        c3=c1.add(c2);        
    }
}
