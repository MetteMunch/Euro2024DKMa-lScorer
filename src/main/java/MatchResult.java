import java.util.List;

public class MatchResult {
    private String teams;
    private List<String> goalScorers;

    public MatchResult(String teams, List<String> goalScorers){
        this.teams = teams;
        this.goalScorers = goalScorers;
    }


    public String getTeams(){
        return teams;
    }

    public List<String> getGoalScorers(){
        return goalScorers;
    }

    @Override
    public String toString(){
        return "Teams: " +teams+", goalScores:"+goalScorers;
    }
}
