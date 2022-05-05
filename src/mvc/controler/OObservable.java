package mvc.controler;
import java.util.Vector;
public class OObservable{
    Vector<OObserver> observables;

    public OObservable(){
        observables=new Vector<OObserver>();
    }
    
    public void addObserver(OObserver o){
        observables.add(o);
    }

    public void removeObserver(OObserver o){
        observables.remove(o);
    }

    public void notifyObservers(){
        for (OObserver o : observables){
            o.Oupdate();
        }
    }
}