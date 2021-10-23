package one.digitalinnovation.soccermatchnewsletter.observer;

import one.digitalinnovation.soccermatchnewsletter.info.SoccerMatchInfo;

public interface Observer {
    public void update(SoccerMatchInfo info);
}
