package one.digitalinnovation.soccermatchnewsletter.observer;

import one.digitalinnovation.soccermatchnewsletter.info.SoccerMatchInfo;

import java.util.ArrayList;
import java.util.List;

public class SoccerMatchNewsletter implements Subject{

    private List<Observer> observers;
    public static final SoccerMatchNewsletter INSTANCE = new SoccerMatchNewsletter();

    private SoccerMatchInfo currentInfo;

    private SoccerMatchNewsletter()
    {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    public void updateSoccerMatchInfo(SoccerMatchInfo info){
        this.currentInfo = info;
        this.nofityObservers();
    }

    @Override
    public void nofityObservers() {
        for (Observer o:observers) {
            o.update(this.currentInfo);
        }
    }
}
