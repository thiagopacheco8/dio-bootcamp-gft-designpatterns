package one.digitalinnovation.soccermatchnewsletter.observer;

import one.digitalinnovation.soccermatchnewsletter.info.SoccerMatchInfo;

public class JournalistObserver implements Observer{

    public void update(SoccerMatchInfo info){
        System.out.println("Journalist received info: " + info.toString());
    }

}
