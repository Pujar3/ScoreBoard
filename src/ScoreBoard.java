public class ScoreBoard {
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private string activeTeam;

    public Scoreboard(String t1, String t2) {
        teamOne = t1;
        teamTwo = t2;
        activeTeam = teamOne;
    }

    public String getScore()
    {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }
}
