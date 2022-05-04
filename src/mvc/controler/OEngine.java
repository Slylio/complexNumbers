package mvc.controler;

import javax.swing.JPanel;

import mvc.model.ComplexNumber;
import mvc.view.MainAddAlgo;
public class OEngine implements OObserver{
    ComplexNumber c1,c2,c3;
    MainAddAlgo main;

    public OEngine(){
        main= new MainAddAlgo();
        c1=setComplex(c1, main);
        c2=setComplex(c2, main);
        c3=c1.add(c2);
    }
    
    @Override
    public void Onotify() {
        refreshStrings(main);
    }

    public ComplexNumber setComplex(ComplexNumber c,MainAddAlgo main){
        c.setReal(Integer.parseInt(main.getRealString()));
        c.setImaginary(Integer.parseInt(main.getImaString()));
        c.setModulus(Integer.parseInt(main.getModuleString()));
        c.setArgument(Integer.parseInt(main.getArgumentString()));
        return c;
    }

    public void refreshStrings(MainAddAlgo main){
        JPanel globalCartPanel=main.getPanel(0);
        JPanel globalPolarPanel=main.getPanel(1);

        JPanel c1Panel=(JPanel) globalCartPanel.getComponent(0);
        JPanel c2Panel=(JPanel) globalCartPanel.getComponent(1);
        JPanel c3Panel=(JPanel) globalCartPanel.getComponent(2);

        

        main.setRealString(realString);

    }
}
