package one.digitalinnovation.soccermatchnewsletter.info;

public class SoccerMatchInfo {
    private String team1;
    private int scoreTeam1;

    private String team2;
    private int scoreTeam2;

    private int matchTime;

    public SoccerMatchInfo(String team1, int scoreTeam1, String team2, int scoreTeam2, int matchTime) {
        this.team1 = team1;
        this.scoreTeam1 = scoreTeam1;
        this.team2 = team2;
        this.scoreTeam2 = scoreTeam2;
        this.matchTime = matchTime;
    }

    @Override
    public String toString() {
        return "The match is currently " + team1 + ": " + scoreTeam1 + " x "
                + team2 + ": " + scoreTeam2 + " (" + matchTime + "min)";
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public int getScoreTeam1() {
        return scoreTeam1;
    }

    public void setScoreTeam1(int scoreTeam1) {
        this.scoreTeam1 = scoreTeam1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int getScoreTeam2() {
        return scoreTeam2;
    }

    public void setScoreTeam2(int scoreTeam2) {
        this.scoreTeam2 = scoreTeam2;
    }

    public int getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(int matchTime) {
        this.matchTime = matchTime;
    }
}
