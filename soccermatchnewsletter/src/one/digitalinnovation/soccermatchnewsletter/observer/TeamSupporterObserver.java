package one.digitalinnovation.soccermatchnewsletter.observer;

import one.digitalinnovation.soccermatchnewsletter.info.SoccerMatchInfo;

public class TeamSupporterObserver implements Observer{

    public void update(SoccerMatchInfo info){
        System.out.println("Team supporter received: " + info.toString());
    }

}
