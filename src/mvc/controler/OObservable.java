package mvc.controler;

import java.util.Collection;

public class OObservable{
    Collection<OObserver> observables;

    public void addObserver(OObserver o){
        observables.add(o);
    }

    public void removeObserver(OObserver o){
        observables.add(o);
    }

    public void notifyObservers(){
        for (OObserver o : observables){
            o.notify();
        }
    }
}