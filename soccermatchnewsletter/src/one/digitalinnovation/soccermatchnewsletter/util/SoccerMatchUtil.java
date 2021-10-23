package one.digitalinnovation.soccermatchnewsletter.util;

import one.digitalinnovation.soccermatchnewsletter.info.SoccerMatchInfo;

public class SoccerMatchUtil {

    private static final String[] teamNames = {"Náutico", "Santa Cruz", "Sport", "CSA", "CRB", "ASA"};

    public static SoccerMatchInfo generateRandomInfo()
    {
        int team1index = generateRandomNumber(teamNames.length);
        int team2index = generateRandomNumber(teamNames.length);

        //Try another number if returns the same
        while(team1index == team2index){
            team2index = generateRandomNumber(teamNames.length);
        }

        return new SoccerMatchInfo(teamNames[team1index], generateRandomScore(),teamNames[team2index], generateRandomScore(),
                generateRandomTime());
    }

    private static int generateRandomTime(){
        return generateRandomNumber(90);
    }

    private static int generateRandomScore(){
        return generateRandomNumber(4);
    }

    private static int generateRandomNumber(int max){
        return (int)(Math.random() * max);
    }

}
