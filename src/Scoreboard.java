import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scoreboard
{
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;

    public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }
    public String getScore()
    {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }
    public void recordPlay(int score)
    {
        if(teamOne.equals(activeTeam))
        {
            teamOneScore += score;
        }
        else teamTwoScore += score;
        if(score == 0)
        {
            if(activeTeam.equals(teamOne)) activeTeam = teamTwo;
            else if(activeTeam.equals(teamTwo)) activeTeam = teamOne;
        }
    }
    public void play() throws FileNotFoundException
    {
        Scanner s = new Scanner(new File("Scoreboard.txt"));
        while (s.hasNext())
        {
            String teamOne = s.next();
            String teamTwo = s.next();
            Scoreboard sb = new Scoreboard(teamOne, teamTwo);
            while (s.hasNextInt())
            {
                sb.recordPlay(s.nextInt());
            }
        }
    }
    public String win()
    {
        if (scoreOne > scoreTwo) return teamOne;
        if (scoreTwo > scoreeOne) return teamTwo;
        return "DRAW";
    }
}

