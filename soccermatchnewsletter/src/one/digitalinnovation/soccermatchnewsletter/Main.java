package one.digitalinnovation.soccermatchnewsletter;

import one.digitalinnovation.soccermatchnewsletter.observer.JournalistObserver;
import one.digitalinnovation.soccermatchnewsletter.observer.SoccerMatchNewsletter;
import one.digitalinnovation.soccermatchnewsletter.observer.TeamSupporterObserver;
import one.digitalinnovation.soccermatchnewsletter.util.SoccerMatchUtil;

public class Main {
    public static void main(String[] args) {
        JournalistObserver journalist = new JournalistObserver();
        TeamSupporterObserver supporter = new TeamSupporterObserver();

        SoccerMatchNewsletter.INSTANCE.registerObserver(journalist);
        SoccerMatchNewsletter.INSTANCE.registerObserver(supporter);

        //Generate 10 random infos to test if both observers receive the info.
        for(int i = 0; i < 10;i++) {
            System.out.println("=========================New info======================");
            SoccerMatchNewsletter.INSTANCE.updateSoccerMatchInfo(SoccerMatchUtil.generateRandomInfo());
        }

        //Remove supporter
        SoccerMatchNewsletter.INSTANCE.removeObserver(supporter);

        //Generate more 5 random infos to check if only the journalist receives the info.
        for(int i = 0; i < 5;i++) {
            System.out.println("=========================New info======================");
            SoccerMatchNewsletter.INSTANCE.updateSoccerMatchInfo(SoccerMatchUtil.generateRandomInfo());
        }
    }
}
